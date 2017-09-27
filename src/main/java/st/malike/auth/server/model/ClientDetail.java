/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.model;

import st.malike.auth.server.model.additionals.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author malike_st
 */
//@Document(collection = "oauth2_client")
@Table(name = "t_client_detail")
@Entity
public class ClientDetail {
    @Id
    private String clientDetailId;
//    @Indexed
    private String clientId;
    private boolean secretRequired;
//    @Indexed
    private String clientSecret;
    private boolean scoped;
    private Integer accessTokenValiditySeconds;
    private Integer refreshTokenValiditySeconds;
    private boolean autoApprove;

    @OneToMany
    @JoinColumn(name = "client_detail_id")
    private List<Resource> resource;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "client_detail_id")
    private List<Scope> scopes;
    @OneToMany
    @JoinColumn(name = "client_detail_id")
    private List<AuthorizedGrantType> authorizedGrantTypes;
    @OneToMany
    @JoinColumn(name = "client_detail_id")
    private List<RegisteredRedirectUri> registeredRedirectUris;
    @OneToMany
    @JoinColumn(name = "client_detail_id")
    private List<Authority> authorities;


    //private Map<String, Object> additionalInformation;
    @OneToMany(mappedBy = "clientDetail")
    @MapKey(name = "mapKey")
    private Map<String, AdditionalInformation> additionalInformation;


    public ClientDetail() {
    }

    public String getClientDetailId() {
        return clientDetailId;
    }

    public void setClientDetailId(String clientDetailId) {
        this.clientDetailId = clientDetailId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }



    public boolean isSecretRequired() {
        return secretRequired;
    }

    public void setSecretRequired(boolean secretRequired) {
        this.secretRequired = secretRequired;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public boolean isScoped() {
        return scoped;
    }

    public void setScoped(boolean scoped) {
        this.scoped = scoped;
    }

    public Integer getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    public Integer getRefreshTokenValiditySeconds() {
        return refreshTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    public boolean isAutoApprove() {
        return autoApprove;
    }

    public void setAutoApprove(boolean autoApprove) {
        this.autoApprove = autoApprove;
    }

    public Map<String, AdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(Map<String, AdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public List<Resource> getResource() {
        return resource;
    }

    public void setResource(List<Resource> resource) {
        this.resource = resource;
    }

    public List<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
    }

    public List<AuthorizedGrantType> getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(List<AuthorizedGrantType> authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public List<RegisteredRedirectUri> getRegisteredRedirectUris() {
        return registeredRedirectUris;
    }

    public void setRegisteredRedirectUris(List<RegisteredRedirectUri> registeredRedirectUris) {
        this.registeredRedirectUris = registeredRedirectUris;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
