package st.malike.auth.server.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_oauth_autorization_code")
@Entity
public class OAuthAutorizationCode {
    @Id
    private String autorizationCode;
    private String clientId;
    private String userId;
    private String redirectUri;
    private Date expire;
    private String scope;

    public String getAutorizationCode() {
        return autorizationCode;
    }

    public void setAutorizationCode(String autorizationCode) {
        this.autorizationCode = autorizationCode;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
