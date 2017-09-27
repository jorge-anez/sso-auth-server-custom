/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package st.malike.auth.server.repository;

import st.malike.auth.server.model.OAuth2AuthenticationAccessToken;

import java.io.Serializable;

/**
 *
 * @author malike_st
 */
public interface OAuth2AccessTokenRepositoryCustom{
    OAuth2AuthenticationAccessToken save(OAuth2AuthenticationAccessToken token);
    void delete(OAuth2AuthenticationAccessToken token);
}
