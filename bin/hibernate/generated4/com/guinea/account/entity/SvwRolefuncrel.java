package com.guinea.account.entity;
// Generated 2010-12-20 19:06:36 by Hibernate Tools 3.4.0.Beta1


import java.math.BigDecimal;

/**
 * SvwRolefuncrel generated by hbm2java
 */
public class SvwRolefuncrel  implements java.io.Serializable {


     private SvwRolefuncrelId id;
     private SvwFuncmsg svwFuncmsg;
     private SvwRolemsg svwRolemsg;
     private BigDecimal modfuncid;
     private BigDecimal crtuser;
     private String crttime;
     private BigDecimal updtuser;
     private String updttime;

    public SvwRolefuncrel() {
    }

	
    public SvwRolefuncrel(SvwRolefuncrelId id, SvwFuncmsg svwFuncmsg, SvwRolemsg svwRolemsg, BigDecimal crtuser, String crttime) {
        this.id = id;
        this.svwFuncmsg = svwFuncmsg;
        this.svwRolemsg = svwRolemsg;
        this.crtuser = crtuser;
        this.crttime = crttime;
    }
    public SvwRolefuncrel(SvwRolefuncrelId id, SvwFuncmsg svwFuncmsg, SvwRolemsg svwRolemsg, BigDecimal modfuncid, BigDecimal crtuser, String crttime, BigDecimal updtuser, String updttime) {
       this.id = id;
       this.svwFuncmsg = svwFuncmsg;
       this.svwRolemsg = svwRolemsg;
       this.modfuncid = modfuncid;
       this.crtuser = crtuser;
       this.crttime = crttime;
       this.updtuser = updtuser;
       this.updttime = updttime;
    }
   
    public SvwRolefuncrelId getId() {
        return this.id;
    }
    
    public void setId(SvwRolefuncrelId id) {
        this.id = id;
    }
    public SvwFuncmsg getSvwFuncmsg() {
        return this.svwFuncmsg;
    }
    
    public void setSvwFuncmsg(SvwFuncmsg svwFuncmsg) {
        this.svwFuncmsg = svwFuncmsg;
    }
    public SvwRolemsg getSvwRolemsg() {
        return this.svwRolemsg;
    }
    
    public void setSvwRolemsg(SvwRolemsg svwRolemsg) {
        this.svwRolemsg = svwRolemsg;
    }
    public BigDecimal getModfuncid() {
        return this.modfuncid;
    }
    
    public void setModfuncid(BigDecimal modfuncid) {
        this.modfuncid = modfuncid;
    }
    public BigDecimal getCrtuser() {
        return this.crtuser;
    }
    
    public void setCrtuser(BigDecimal crtuser) {
        this.crtuser = crtuser;
    }
    public String getCrttime() {
        return this.crttime;
    }
    
    public void setCrttime(String crttime) {
        this.crttime = crttime;
    }
    public BigDecimal getUpdtuser() {
        return this.updtuser;
    }
    
    public void setUpdtuser(BigDecimal updtuser) {
        this.updtuser = updtuser;
    }
    public String getUpdttime() {
        return this.updttime;
    }
    
    public void setUpdttime(String updttime) {
        this.updttime = updttime;
    }




}


