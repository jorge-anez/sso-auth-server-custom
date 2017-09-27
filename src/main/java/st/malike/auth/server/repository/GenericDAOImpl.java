package st.malike.auth.server.repository;

import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by user on 3/21/2017.
 */
@Repository
public class GenericDAOImpl<T, K extends Serializable> implements GenericDAO<T, K> {
    private EntityManager entityManager;
    private Class<T> classType;

    public GenericDAOImpl() {
    }

    public GenericDAOImpl(EntityManager entityManager, Class<T> classType) {
        this.entityManager = entityManager;
        this.classType = classType;
    }

    public void save(T t) {
        entityManager.persist(t);
    }

    public void update(T t) {
        entityManager.merge(t);
    }

    public void remove(T t) {
        entityManager.remove(t);
    }

    public T find(K key) {
        T t = entityManager.find(classType, key);
        return t;
    }

    public List<T> findAll() {
        return entityManager.createQuery("SELECT t FROM " + classType.getSimpleName() + " t").getResultList();
    }

    public Query getNamedQuery(String name) {
        return entityManager.createNamedQuery(name);
    }
    /*
    public List<T> findAll() {
        return findByCriteria(new Criterion[0]);
    }
    public List<T> findByCriteria(Criterion... criterions) {
        Criteria criteria = entityManager.createCriteria(classType);
        for(Criterion c: criterions)
            criteria.add(c);
        return criteria.list();
    }
    public T findByCriteriauniqueResult(Criterion... criterions) {//predicados
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(classType);
        for(Criterion c: criterions)
            criteria.add(c);
        return (T)criteria.uniqueResult();
    }
    */


    public Class<T> getClassType() {
        return classType;
    }

    public void setClassType(Class<T> classType) {
        this.classType = classType;
    }
}
