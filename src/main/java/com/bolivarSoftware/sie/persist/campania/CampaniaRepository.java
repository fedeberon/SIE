package com.bolivarSoftware.sie.persist.campania;

import com.bolivarSoftware.sie.domain.Campania;
import com.bolivarSoftware.sie.domain.Encuesta;
import com.bolivarSoftware.sie.persist.CloseableSession;
import com.bolivarSoftware.sie.persist.interfaces.ICampaniaRepository;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CampaniaRepository implements ICampaniaRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Campania save(Campania campania) {
        Transaction tx = null;
        try(CloseableSession session = new CloseableSession(sessionFactory.openSession())){
            tx = session.delegate().beginTransaction();
            session.delegate().saveOrUpdate(campania);
            tx.commit();

            return campania;
        }
        catch (HibernateException e){
            tx.rollback();
            throw e;
        }
    }
}
