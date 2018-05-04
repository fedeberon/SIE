package com.bolivarSoftware.sie.persist.encuesta;

import com.bolivarSoftware.sie.domain.Encuesta;
import com.bolivarSoftware.sie.persist.CloseableSession;
import com.bolivarSoftware.sie.persist.interfaces.IEncuestaRepository;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EncuestaRepository implements IEncuestaRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Encuesta save(Encuesta encuesta) {
        Transaction tx = null;
        try(CloseableSession session = new CloseableSession(sessionFactory.openSession())){
            tx = session.delegate().beginTransaction();
            session.delegate().saveOrUpdate(encuesta);
            tx.commit();

            return encuesta;
        }
        catch (HibernateException e){
            tx.rollback();
            throw e;
        }
    }
}
