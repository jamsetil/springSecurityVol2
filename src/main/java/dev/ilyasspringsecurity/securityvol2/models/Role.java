package dev.ilyasspringsecurity.securityvol2.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "Roles")
public class Role implements GrantedAuthority {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_Id")
    private Integer roleId;

    private String authority;

    public Role(){

    }

    public Role(Integer roleId, String authority) {
        this.roleId = roleId;
        this.authority = authority;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Role(String authority) {
        this.authority = authority;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
