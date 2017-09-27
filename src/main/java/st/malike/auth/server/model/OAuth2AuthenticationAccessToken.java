/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.model;

import java.io.Serializable;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import javax.persistence.*;

/**
 *
 * @author malike_st
 */
//@Document(collection = "oauth2_access_token")
public class OAuth2AuthenticationAccessToken implements Serializable {

//    @Indexed
    private String id;
    private String tokenId;
    private String authenticationId;
    private String userName;
    private String clientId;
    private String refreshToken;
//    private OAuth2AccessToken oAuth2AccessToken;
//    private OAuth2Authentication authentication;

    public OAuth2AuthenticationAccessToken() {
    }

    public OAuth2AuthenticationAccessToken(final OAuth2AccessToken oAuth2AccessToken, final OAuth2Authentication authentication, final String authenticationId) {
        this.tokenId = oAuth2AccessToken.getValue();
        //this.oAuth2AccessToken = oAuth2AccessToken;
        this.authenticationId = authenticationId;
        this.userName = authentication.getName();
        this.clientId = authentication.getOAuth2Request().getClientId();
        //this.authentication = authentication;
        this.refreshToken = oAuth2AccessToken.getRefreshToken().getValue();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }


}
