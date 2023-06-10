package org.baiyz.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>
 * Description: 主方法
 * </p>
 * <p>PackageName: org.baiyz.proxyTest</p>
 * <p>ClassName: Main</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since 2023-06-10 14:53:16
 */
public class Main {
    public static void main(String[] args) {
        // 创建代理对象 强制转化为实际被代理类
        BeProxyClassInterface proxy = (BeProxyClassInterface) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{BeProxyClassInterface.class}, new
                InvokeHandlerSelf(new BeProxyClass()));

        // 输出信息
//        System.out.println("Proxy Name:" + proxy.getClass().getName());
//        System.out.println("-----执行不带注解方法:RealDoBus-----");
//        // 执行目标方法不带注解
//        proxy.RealDoBus();
        System.out.println("-----执行带注解方法:RealDoBusWithAnno-----");
        proxy.RealDoBusWithAnno();

    }
}