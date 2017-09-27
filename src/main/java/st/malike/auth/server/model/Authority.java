package st.malike.auth.server.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by JORGE-HP on 10/6/2017.
 */
@Table(name = "t_authority")
@Entity
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorityId;
    private String name;
    @ManyToMany(mappedBy = "authorities")
    private Collection<Role> roles;

    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
