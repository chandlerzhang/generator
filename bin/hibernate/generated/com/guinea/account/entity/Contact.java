package com.guinea.account.entity;
// Generated 2011-1-1 21:16:04 by Hibernate Tools 3.4.0.Beta1


import java.util.Date;

import com.guinea.core.orm.BaseEntity;

/**
 * Contact generated by hbm2java
 */
public class Contact  implements BaseEntity {


     /**
	 * 
	 */
	private static final long serialVersionUID = 3415130181722285872L;
	private Long id;
     private User user;
     private String email;
     private String status;
     private Long creator;
     private Date created;
     private Long modificator;
     private Date modified;

    public Contact() {
    }

	
    public Contact(User user, String status, Long creator, Date created) {
        this.user = user;
        this.status = status;
        this.creator = creator;
        this.created = created;
    }
    public Contact(User user, String email, String status, Long creator, Date created, Long modificator, Date modified) {
       this.user = user;
       this.email = email;
       this.status = status;
       this.creator = creator;
       this.created = created;
       this.modificator = modificator;
       this.modified = modified;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreator() {
		return creator;
	}


	public void setCreator(Long creator) {
		this.creator = creator;
	}


	public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public Long getModificator() {
        return this.modificator;
    }
    
    public void setModificator(Long modificator) {
        this.modificator = modificator;
    }
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }




}


