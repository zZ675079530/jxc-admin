package cn.toesbieya.jxc.model.vo;

import cn.toesbieya.jxc.model.entity.SysUser;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class LoginSuccessInfo {
    private Integer id;
    private String name;
    private String roleName;
    private String deptName;
    private String avatar;
    private boolean admin = false;
    private String token;
    private Map<String, Integer> resources;

    public LoginSuccessInfo(SysUser user) {
        this.id = user.getId();
        this.name = user.getNickName();
        this.avatar = user.getAvatar();
        this.admin = user.isAdmin();
    }
}
