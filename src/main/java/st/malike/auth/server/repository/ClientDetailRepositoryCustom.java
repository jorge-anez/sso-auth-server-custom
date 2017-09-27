/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.repository;

import st.malike.auth.server.model.ClientDetail;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author malike_st
 */
public interface ClientDetailRepositoryCustom{
    ClientDetail findByClientId(String clientId);
    //void save(ClientDetail clientDetails);
    ClientDetail save(ClientDetail clientDetails);
    void delete (ClientDetail clientDetails);
    List<ClientDetail> findAll();
    void deleteAll();
}
