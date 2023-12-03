package org.example.DAO;

import org.example.config.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public abstract class AbstractJpaDAO< T, tipoID> {
    private Class< T > clase;

    EntityManager entityManager = DBConfig.getEntityManager();

    public final void setClase( Class< T > clase ){
        this.clase = clase;
    }

    public T findOne( tipoID id ){
        return entityManager.find( clase, id );
    }
    public List< T > findAll(){
        return entityManager.createQuery( "from " + clase.getName() )
                .getResultList();
    }

    public void create( T entity ){
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist( entity );
        tx.commit();
    }

    public T update( T entity ){
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        T entityMerged = entityManager.merge( entity );
        tx.commit();
        return entityMerged;
    }

    public void delete( T entity ){
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove( entity );
        tx.commit();
    }
}
