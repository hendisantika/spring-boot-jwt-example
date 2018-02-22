package com.hendisantika.springbootjwtexample.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/02/18
 * Time: 07.44
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "app_role",
        catalog = "dboauth")
public class Role implements Serializable {
    @Id
    @Column(name = "idrole")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrole;

    @Column(name = "role_name", nullable = false)
    private String roleName;

    @Column(name = "description", nullable = false)
    private String description;

    public int getIdrole(){
        return idrole;
    }

    public void setIdrole(int idrole){
        this.idrole = idrole;
    }

    public String getRoleName(){
        return roleName;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
