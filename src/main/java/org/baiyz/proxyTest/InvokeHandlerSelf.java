package org.baiyz.proxyTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>
 * Description: 自定义Proxy代理类
 * </p>
 * <p>PackageName: org.baiyz.proxyTest</p>
 * <p>ClassName: InvokeHandlerSelf</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since 2023-06-10 14:53:54
 */
public class InvokeHandlerSelf implements InvocationHandler {
    private BeProxyClass realClass;

    public InvokeHandlerSelf(BeProxyClass realClass) {
        this.realClass = realClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        boolean needProxy = false;
        // 实际方法执行前 检查是否需要进行代理前置处理
        // 这里需要从实际对象中获取注解，否则注解需要在接口中标注才能生效
        Method targetMethod = realClass.getClass().getMethod(method.getName(), method.getParameterTypes());
        for (Annotation annotation : targetMethod.getAnnotations()) {
            if (annotation.annotationType() == ProxyAnno.class) {
                needProxy = true;
                break;
            }
        }
        if (needProxy) {
            System.out.println("[目标方法执行前]方法名称" + method.getName() + "被注解标注需要执行其他额外逻辑");
            Object invoke = method.invoke(realClass, args);
            System.out.println("[目标方法执行后]！");
            return invoke;
        }
        System.out.println("直接执行目标方法，不进行代理" + method.getName());
        // 反射调用目标方法
        return method.invoke(realClass, args);
    }
}