package org.baiyz.proxyTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Description: 标注注解
 * </p>
 * <p>PackageName: org.baiyz.proxyTest</p>
 * <p>ClassName: ProxyAnno</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since 2023-06-10 14:53:29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface ProxyAnno {
}