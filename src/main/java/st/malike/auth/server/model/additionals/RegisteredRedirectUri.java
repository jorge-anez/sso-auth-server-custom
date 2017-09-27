package st.malike.auth.server.model.additionals;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_registered_redirect_uri")
@Entity
public class RegisteredRedirectUri {
    @Id
    private Long registeredRedirectUriId;
    private String registeredRedirectUri;

    public Long getRegisteredRedirectUriId() {
        return registeredRedirectUriId;
    }

    public void setRegisteredRedirectUriId(Long registeredRedirectUriId) {
        this.registeredRedirectUriId = registeredRedirectUriId;
    }

    public String getRegisteredRedirectUri() {
        return registeredRedirectUri;
    }

    public void setRegisteredRedirectUri(String registeredRedirectUri) {
        this.registeredRedirectUri = registeredRedirectUri;
    }
}
