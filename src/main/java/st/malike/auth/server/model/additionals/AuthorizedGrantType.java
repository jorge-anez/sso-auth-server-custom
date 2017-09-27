package st.malike.auth.server.model.additionals;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_authorized_grant_type")
@Entity
public class AuthorizedGrantType {
    @Id
    private Long authorizedGrantTypeId;
    private  String authorizedGrantTypes;

    public Long getAuthorizedGrantTypeId() {
        return authorizedGrantTypeId;
    }

    public void setAuthorizedGrantTypeId(Long authorizedGrantTypeId) {
        this.authorizedGrantTypeId = authorizedGrantTypeId;
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }
}
