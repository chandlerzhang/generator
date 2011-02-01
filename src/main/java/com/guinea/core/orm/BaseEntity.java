package com.guinea.core.orm;

import java.io.Serializable;
import java.util.Date;

public interface BaseEntity extends Serializable {

	public Long getId() ;
	public void setId(Long id);
	public String getStatus() ;
	public void setStatus(String status) ;
	public Long getCreator() ;
	public void setCreator(Long creator) ;
	public Date getCreated() ;
	public void setCreated(Date created) ;
	public Long getModificator();
	public void setModificator(Long modificator);
	public Date getModified();
	public void setModified(Date modified);
    
}
