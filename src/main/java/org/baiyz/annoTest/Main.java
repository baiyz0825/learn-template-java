package org.baiyz.annoTest;

/**
 * <p>
 * Description: 主函数
 * </p>
 * <p>PackageName: org.baiyz</p>
 * <p>ClassName: Main</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}:${SECOND}
 */
public class Main {
    public static void main(String[] args) {
        // 初始化反射工具
        ReflectClass reflectClassUtils = new ReflectClass();
        BeVerified beVerifiedOverLimit = new BeVerified("Name 1xxxxsssssa");
        BeVerified beVerifiedInsideLimit = new BeVerified("Name 2");

        // 执行检查没有超过限制的
        reflectClassUtils.CheckAnsOutStr(reflectClassUtils.Check(beVerifiedInsideLimit));

        // 执行检查超过限制的
        reflectClassUtils.CheckAnsOutStr(reflectClassUtils.Check(beVerifiedOverLimit));
    }
}
