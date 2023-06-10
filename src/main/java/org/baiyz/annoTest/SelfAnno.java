package org.baiyz.annoTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Description: 自定义长度校验
 * </p>
 * <p>PackageName: org.baiyz</p>
 * <p>ClassName: SelfAnno</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since 2023-06-10 13:47:52
 */
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SelfAnno {

    // 检查属性name的长度
    int length();
}
