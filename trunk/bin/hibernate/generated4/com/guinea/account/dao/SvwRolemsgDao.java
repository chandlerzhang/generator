package com.guinea.account;
// Generated 2010-12-20 12:25:49 by Hibernate Tools 3.4.0.Beta1


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class SvwRolemsg.
 * @see com.guinea.account.SvwRolemsg
 * @author Hibernate Tools
 */
public class SvwRolemsgHome {

    private static final Log log = LogFactory.getLog(SvwRolemsgHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("sessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(SvwRolemsg transientInstance) {
        log.debug("persisting SvwRolemsg instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(SvwRolemsg instance) {
        log.debug("attaching dirty SvwRolemsg instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(SvwRolemsg instance) {
        log.debug("attaching clean SvwRolemsg instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(SvwRolemsg persistentInstance) {
        log.debug("deleting SvwRolemsg instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public SvwRolemsg merge(SvwRolemsg detachedInstance) {
        log.debug("merging SvwRolemsg instance");
        try {
            SvwRolemsg result = (SvwRolemsg) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public SvwRolemsg findById( java.math.BigDecimal id) {
        log.debug("getting SvwRolemsg instance with id: " + id);
        try {
            SvwRolemsg instance = (SvwRolemsg) sessionFactory.getCurrentSession()
                    .get("com.guinea.account.SvwRolemsg", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(SvwRolemsg instance) {
        log.debug("finding SvwRolemsg instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.guinea.account.SvwRolemsg")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

