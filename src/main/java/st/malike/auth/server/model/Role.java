package st.malike.auth.server.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by JORGE-HP on 10/6/2017.
 */
@Table(name = "t_role")
@Entity
@NamedQueries({
        @NamedQuery(name="getAuthorities",
                    query="SELECT r FROM Role r INNER JOIN FETCH r.authorities WHERE r.name=:roleName"
        )
})
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "privilege_id")
    )
    private Collection<Authority> authorities;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public Collection<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<Authority> authorities) {
        this.authorities = authorities;
    }
}
