package st.malike.auth.server.repository;


import javax.persistence.Query;
import java.util.List;

/**
 * Created by user on 3/21/2017.
 */
public interface GenericDAO<T, K> {
    void save(T t);
    void update(T t);
    void remove(T t);
    T find(K key);
    List<T> findAll();
    Query getNamedQuery(String name);
    //List<T> findByCriteria(Criterion... criterions);
    //public T findByCriteriauniqueResult(Criterion... criterions);
}

