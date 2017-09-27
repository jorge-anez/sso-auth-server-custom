/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package st.malike.auth.server.repository.impl;

import org.springframework.stereotype.Repository;
import st.malike.auth.server.model.OAuth2AuthenticationAccessToken;
import st.malike.auth.server.repository.OAuth2AccessTokenRepositoryCustom;

/**
 *
 * @author malike_st
 */
@Repository
public class OAuth2AccessTokenRepositoryCustomImpl implements OAuth2AccessTokenRepositoryCustom {


    @Override
    public OAuth2AuthenticationAccessToken save(OAuth2AuthenticationAccessToken token) {
        return null;
    }

    @Override
    public void delete(OAuth2AuthenticationAccessToken token) {

    }
}
