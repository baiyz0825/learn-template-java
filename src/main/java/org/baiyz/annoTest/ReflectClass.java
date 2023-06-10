package org.baiyz.annoTest;

import java.lang.reflect.Field;

/**
 * <p>
 * Description: 反射校验方法
 * </p>
 * <p>PackageName: org.baiyz</p>
 * <p>ClassName: RefelctClass</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since 2023-06-10 14:16:23
 */
public class ReflectClass {
    /**
     * 检查方法
     * @param obj 任意Obj
     * @return boolean 是否检查成功
     */
    public boolean Check(Object obj) {
        try {
            // 空指针check
            if (obj == null) {
                return false;
            }
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field declaredField : declaredFields) {
                // 查看是否存在注解
                if (declaredField.isAnnotationPresent(SelfAnno.class)) {
                    SelfAnno annotation = declaredField.getAnnotation(SelfAnno.class);
                    int checkLength = annotation.length();
                    // 开始私有变量的访问
                    declaredField.setAccessible(true);
                    // 获取Name的值
                    String NameVar = (String) declaredField.get(obj);
                    // Name长度大于限制长度返回false
                    return NameVar.length() < checkLength;
                }
            }
        } catch (IllegalAccessException e) {
            System.out.println("出现异常:" + e);
            throw new RuntimeException(e);
        }

        return true;
    }

    /**
     * 输出检查结果信息
     * @param checkAns 检查是否成功
     */
    public void CheckAnsOutStr(boolean checkAns) {
        if (checkAns) {
            System.out.println("超过注解长度限制");
        } else {
            System.out.println("检查成功");
        }
    }
}