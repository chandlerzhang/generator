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
 * Home object for domain model class SvwRolefuncrel.
 * @see com.guinea.account.SvwRolefuncrel
 * @author Hibernate Tools
 */
public class SvwRolefuncrelHome {

    private static final Log log = LogFactory.getLog(SvwRolefuncrelHome.class);

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
    
    public void persist(SvwRolefuncrel transientInstance) {
        log.debug("persisting SvwRolefuncrel instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(SvwRolefuncrel instance) {
        log.debug("attaching dirty SvwRolefuncrel instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(SvwRolefuncrel instance) {
        log.debug("attaching clean SvwRolefuncrel instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(SvwRolefuncrel persistentInstance) {
        log.debug("deleting SvwRolefuncrel instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public SvwRolefuncrel merge(SvwRolefuncrel detachedInstance) {
        log.debug("merging SvwRolefuncrel instance");
        try {
            SvwRolefuncrel result = (SvwRolefuncrel) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public SvwRolefuncrel findById( com.guinea.account.SvwRolefuncrelId id) {
        log.debug("getting SvwRolefuncrel instance with id: " + id);
        try {
            SvwRolefuncrel instance = (SvwRolefuncrel) sessionFactory.getCurrentSession()
                    .get("com.guinea.account.SvwRolefuncrel", id);
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
    
    public List findByExample(SvwRolefuncrel instance) {
        log.debug("finding SvwRolefuncrel instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.guinea.account.SvwRolefuncrel")
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

