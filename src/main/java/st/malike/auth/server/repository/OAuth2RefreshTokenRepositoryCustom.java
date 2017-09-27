/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.repository;

import st.malike.auth.server.model.OAuth2AuthenticationRefreshToken;

/**
 *
 * @author malike_st
 */

public interface OAuth2RefreshTokenRepositoryCustom {
    OAuth2AuthenticationRefreshToken save(OAuth2AuthenticationRefreshToken token);
    void delete(OAuth2AuthenticationRefreshToken token);
}