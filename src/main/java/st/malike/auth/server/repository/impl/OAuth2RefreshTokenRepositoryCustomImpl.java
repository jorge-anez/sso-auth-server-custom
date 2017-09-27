/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.repository.impl;

import org.springframework.stereotype.Repository;
import st.malike.auth.server.model.OAuth2AuthenticationRefreshToken;
import st.malike.auth.server.repository.OAuth2RefreshTokenRepositoryCustom;

/**
 *
 * @author malike_st
 */
@Repository
public class OAuth2RefreshTokenRepositoryCustomImpl implements OAuth2RefreshTokenRepositoryCustom {


    @Override
    public OAuth2AuthenticationRefreshToken save(OAuth2AuthenticationRefreshToken token) {
        return null;
    }

    @Override
    public void delete(OAuth2AuthenticationRefreshToken token) {

    }
}