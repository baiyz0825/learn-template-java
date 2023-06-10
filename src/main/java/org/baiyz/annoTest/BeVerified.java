package org.baiyz.annoTest;

/**
 * <p>
 * Description: 被校验的类
 * </p>
 * <p>PackageName: org.baiyz</p>
 * <p>ClassName: BeVerified</p>
 *
 * @author <a href="mail to: byz0825@outlook.com" rel="nofollow">BaiYZ</a>
 * @since 2023-06-10 14:11:44
 */
public class BeVerified {
    @SelfAnno(length = 10)
    private String Name;

    public BeVerified(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}