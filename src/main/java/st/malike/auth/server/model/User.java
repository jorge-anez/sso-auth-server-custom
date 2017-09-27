/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.model;

import org.springframework.data.annotation.CreatedDate;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author malike_st
 */
//@Document(collection = "oauth2_user")
@Table(name = "t_user")
@Entity
public class User {

    @Id
    private String userId;
    private String username;
    private String email;
    private String password;
    private Boolean enabled;
//    private List<String> rights;
//    @CreatedDate
    private Date dateCreated;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id"))
    private Collection<Role> roles;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
