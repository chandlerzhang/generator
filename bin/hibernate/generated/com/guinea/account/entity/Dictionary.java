package com.guinea.account.entity;
// Generated 2011-1-1 21:16:04 by Hibernate Tools 3.4.0.Beta1


import java.util.Date;

import com.guinea.core.orm.BaseEntity;

/**
 * Dictionary generated by hbm2java
 */
public class Dictionary  implements BaseEntity {


     /**
	 * 
	 */
	private static final long serialVersionUID = -2136569137126487493L;
	private Long id;
     private Integer code;
     private Integer serial;
     private String name;
     private Long parent;
     private String status;
     private Long creator;
     private Date created;
     private Long modificator;
     private Date modified;

    public Dictionary() {
    }

	
    public Dictionary(Integer code, String name, Long parent, String status, Long creator, Date created) {
        this.code = code;
        this.name = name;
        this.parent = parent;
        this.status = status;
        this.creator = creator;
        this.created = created;
    }
    public Dictionary(Integer code, Integer serial, String name, Long parent, String status, Long creator, Date created, Long modificator, Date modified) {
       this.code = code;
       this.serial = serial;
       this.name = name;
       this.parent = parent;
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
 
    public Integer getSerial() {
        return this.serial;
    }
    
    public void setSerial(Integer serial) {
        this.serial = serial;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public Long getParent() {
		return parent;
	}


	public void setParent(Long parent) {
		this.parent = parent;
	}


	public Long getCreator() {
		return creator;
	}


	public void setCreator(Long creator) {
		this.creator = creator;
	}




}


