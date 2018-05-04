package com.bolivarSoftware.sie.persist;

import org.hibernate.Session;

/**
 * Created by Damian Gallego on 3/5/2018.
 */
public class CloseableSession implements AutoCloseable{

    private final Session session;

    public CloseableSession(Session session) {
        this.session = session;
    }

    public Session delegate() {
        return session;
    }

    @Override
    public void close() {
        if(session != null && session.isOpen()){
            session.close();
        }
    }
}
