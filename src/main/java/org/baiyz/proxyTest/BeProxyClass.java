package org.baiyz.proxyTest;

/**
 * <p>
 * Description: 实际业务类
 * </p>
 * <p>PackageName: org.baiyz.proxyTest</p>
 * <p>ClassName: BeProxyClass</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since 2023-06-10 14:55:20
 */
public class BeProxyClass implements BeProxyClassInterface {
    @Override
    public void RealDoBus() {
        System.out.println("处理实际业务方法！");
    }

    @Override
    @ProxyAnno
    public void RealDoBusWithAnno() {
        System.out.println("处理实际业务方法！");
    }
}