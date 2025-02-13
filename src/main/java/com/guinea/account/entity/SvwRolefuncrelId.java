package com.guinea.account.entity;
// Generated 2010-12-20 19:06:36 by Hibernate Tools 3.4.0.Beta1


import java.math.BigDecimal;

/**
 * SvwRolefuncrelId generated by hbm2java
 */
public class SvwRolefuncrelId  implements java.io.Serializable {


     private BigDecimal roleid;
     private BigDecimal funcid;

    public SvwRolefuncrelId() {
    }

    public SvwRolefuncrelId(BigDecimal roleid, BigDecimal funcid) {
       this.roleid = roleid;
       this.funcid = funcid;
    }
   
    public BigDecimal getRoleid() {
        return this.roleid;
    }
    
    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }
    public BigDecimal getFuncid() {
        return this.funcid;
    }
    
    public void setFuncid(BigDecimal funcid) {
        this.funcid = funcid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SvwRolefuncrelId) ) return false;
		 SvwRolefuncrelId castOther = ( SvwRolefuncrelId ) other; 
         
		 return ( (this.getRoleid()==castOther.getRoleid()) || ( this.getRoleid()!=null && castOther.getRoleid()!=null && this.getRoleid().equals(castOther.getRoleid()) ) )
 && ( (this.getFuncid()==castOther.getFuncid()) || ( this.getFuncid()!=null && castOther.getFuncid()!=null && this.getFuncid().equals(castOther.getFuncid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRoleid() == null ? 0 : this.getRoleid().hashCode() );
         result = 37 * result + ( getFuncid() == null ? 0 : this.getFuncid().hashCode() );
         return result;
   }   


}


