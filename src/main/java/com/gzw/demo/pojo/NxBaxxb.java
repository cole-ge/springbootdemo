package com.gzw.demo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "NX_BAXXB")
public class NxBaxxb {
    @Id
    @Column(name = "REGISTNO")
    private String registno;

    @Column(name = "BUSINESSID")
    private Short businessid;

    @Column(name = "REPORTDATE")
    private Date reportdate;

    @Column(name = "REPORTHOUR")
    private String reporthour;

    @Column(name = "REPORTORNAME")
    private String reportorname;

    @Column(name = "REPORTORNUMBER")
    private String reportornumber;

    @Column(name = "REPORTORMOBILE")
    private String reportormobile;

    @Column(name = "LINKERNAME")
    private String linkername;

    @Column(name = "PHONENUMBER")
    private String phonenumber;

    @Column(name = "LINKERMOBILE")
    private String linkermobile;

    @Column(name = "RELATIONSHIP")
    private String relationship;

    @Column(name = "MERCYFLAG")
    private String mercyflag;

    @Column(name = "DAMAGEDATE")
    private Date damagedate;

    @Column(name = "DAMAGEHOUR")
    private String damagehour;

    @Column(name = "DAMAGETYPECODE")
    private String damagetypecode;

    @Column(name = "DAMAGENAME")
    private String damagename;

    @Column(name = "DAMAGEADDRESS")
    private String damageaddress;

    @Column(name = "OPERATORCODE")
    private String operatorcode;

    @Column(name = "OPERATORCOMCODE")
    private String operatorcomcode;

    @Column(name = "FIRSTREGCODE")
    private String firstregcode;

    @Column(name = "FIRSTREGCOMCODE")
    private String firstregcomcode;

    @Column(name = "MAKECOM")
    private String makecom;

    @Column(name = "CLAIMSTATUS")
    private String claimstatus;

    @Column(name = "CANCELFLAG")
    private String cancelflag;

    @Column(name = "SUBMITNUMBER")
    private Short submitnumber;

    @Column(name = "VALIDFLAG")
    private String validflag;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "MATCHFLAG")
    private String matchflag;

    @Column(name = "INSERTTIMEFORHIS")
    private Date inserttimeforhis;

    @Column(name = "OPERATETIMEFORHIS")
    private Date operatetimeforhis;

    @Column(name = "COMCODE")
    private String comcode;

    @Column(name = "TYPEFLAG")
    private String typeflag;

    @Column(name = "GSCODE")
    private String gscode;

    @Column(name = "FIRSTREGNAME")
    private String firstregname;

    @Column(name = "OPINIONTYPE")
    private String opiniontype;

    @Column(name = "OPERATORNAME")
    private String operatorname;

    @Column(name = "DAMAGEADDRESSDETAIL")
    private String damageaddressdetail;

    @Column(name = "VIRTUAL_COMCODE")
    private String virtualComcode;

    @Column(name = "POLICYNO")
    private String policyno;

    @Column(name = "REGISTBATCHNO")
    private String registbatchno;

    @Column(name = "DAMAGEDETAILITEM")
    private String damagedetailitem;

    /**
     * @return REGISTNO
     */
    public String getRegistno() {
        return registno;
    }

    /**
     * @param registno
     */
    public void setRegistno(String registno) {
        this.registno = registno;
    }

    /**
     * @return BUSINESSID
     */
    public Short getBusinessid() {
        return businessid;
    }

    /**
     * @param businessid
     */
    public void setBusinessid(Short businessid) {
        this.businessid = businessid;
    }

    /**
     * @return REPORTDATE
     */
    public Date getReportdate() {
        return reportdate;
    }

    /**
     * @param reportdate
     */
    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    /**
     * @return REPORTHOUR
     */
    public String getReporthour() {
        return reporthour;
    }

    /**
     * @param reporthour
     */
    public void setReporthour(String reporthour) {
        this.reporthour = reporthour;
    }

    /**
     * @return REPORTORNAME
     */
    public String getReportorname() {
        return reportorname;
    }

    /**
     * @param reportorname
     */
    public void setReportorname(String reportorname) {
        this.reportorname = reportorname;
    }

    /**
     * @return REPORTORNUMBER
     */
    public String getReportornumber() {
        return reportornumber;
    }

    /**
     * @param reportornumber
     */
    public void setReportornumber(String reportornumber) {
        this.reportornumber = reportornumber;
    }

    /**
     * @return REPORTORMOBILE
     */
    public String getReportormobile() {
        return reportormobile;
    }

    /**
     * @param reportormobile
     */
    public void setReportormobile(String reportormobile) {
        this.reportormobile = reportormobile;
    }

    /**
     * @return LINKERNAME
     */
    public String getLinkername() {
        return linkername;
    }

    /**
     * @param linkername
     */
    public void setLinkername(String linkername) {
        this.linkername = linkername;
    }

    /**
     * @return PHONENUMBER
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return LINKERMOBILE
     */
    public String getLinkermobile() {
        return linkermobile;
    }

    /**
     * @param linkermobile
     */
    public void setLinkermobile(String linkermobile) {
        this.linkermobile = linkermobile;
    }

    /**
     * @return RELATIONSHIP
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * @return MERCYFLAG
     */
    public String getMercyflag() {
        return mercyflag;
    }

    /**
     * @param mercyflag
     */
    public void setMercyflag(String mercyflag) {
        this.mercyflag = mercyflag;
    }

    /**
     * @return DAMAGEDATE
     */
    public Date getDamagedate() {
        return damagedate;
    }

    /**
     * @param damagedate
     */
    public void setDamagedate(Date damagedate) {
        this.damagedate = damagedate;
    }

    /**
     * @return DAMAGEHOUR
     */
    public String getDamagehour() {
        return damagehour;
    }

    /**
     * @param damagehour
     */
    public void setDamagehour(String damagehour) {
        this.damagehour = damagehour;
    }

    /**
     * @return DAMAGETYPECODE
     */
    public String getDamagetypecode() {
        return damagetypecode;
    }

    /**
     * @param damagetypecode
     */
    public void setDamagetypecode(String damagetypecode) {
        this.damagetypecode = damagetypecode;
    }

    /**
     * @return DAMAGENAME
     */
    public String getDamagename() {
        return damagename;
    }

    /**
     * @param damagename
     */
    public void setDamagename(String damagename) {
        this.damagename = damagename;
    }

    /**
     * @return DAMAGEADDRESS
     */
    public String getDamageaddress() {
        return damageaddress;
    }

    /**
     * @param damageaddress
     */
    public void setDamageaddress(String damageaddress) {
        this.damageaddress = damageaddress;
    }

    /**
     * @return OPERATORCODE
     */
    public String getOperatorcode() {
        return operatorcode;
    }

    /**
     * @param operatorcode
     */
    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode;
    }

    /**
     * @return OPERATORCOMCODE
     */
    public String getOperatorcomcode() {
        return operatorcomcode;
    }

    /**
     * @param operatorcomcode
     */
    public void setOperatorcomcode(String operatorcomcode) {
        this.operatorcomcode = operatorcomcode;
    }

    /**
     * @return FIRSTREGCODE
     */
    public String getFirstregcode() {
        return firstregcode;
    }

    /**
     * @param firstregcode
     */
    public void setFirstregcode(String firstregcode) {
        this.firstregcode = firstregcode;
    }

    /**
     * @return FIRSTREGCOMCODE
     */
    public String getFirstregcomcode() {
        return firstregcomcode;
    }

    /**
     * @param firstregcomcode
     */
    public void setFirstregcomcode(String firstregcomcode) {
        this.firstregcomcode = firstregcomcode;
    }

    /**
     * @return MAKECOM
     */
    public String getMakecom() {
        return makecom;
    }

    /**
     * @param makecom
     */
    public void setMakecom(String makecom) {
        this.makecom = makecom;
    }

    /**
     * @return CLAIMSTATUS
     */
    public String getClaimstatus() {
        return claimstatus;
    }

    /**
     * @param claimstatus
     */
    public void setClaimstatus(String claimstatus) {
        this.claimstatus = claimstatus;
    }

    /**
     * @return CANCELFLAG
     */
    public String getCancelflag() {
        return cancelflag;
    }

    /**
     * @param cancelflag
     */
    public void setCancelflag(String cancelflag) {
        this.cancelflag = cancelflag;
    }

    /**
     * @return SUBMITNUMBER
     */
    public Short getSubmitnumber() {
        return submitnumber;
    }

    /**
     * @param submitnumber
     */
    public void setSubmitnumber(Short submitnumber) {
        this.submitnumber = submitnumber;
    }

    /**
     * @return VALIDFLAG
     */
    public String getValidflag() {
        return validflag;
    }

    /**
     * @param validflag
     */
    public void setValidflag(String validflag) {
        this.validflag = validflag;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return MATCHFLAG
     */
    public String getMatchflag() {
        return matchflag;
    }

    /**
     * @param matchflag
     */
    public void setMatchflag(String matchflag) {
        this.matchflag = matchflag;
    }

    /**
     * @return INSERTTIMEFORHIS
     */
    public Date getInserttimeforhis() {
        return inserttimeforhis;
    }

    /**
     * @param inserttimeforhis
     */
    public void setInserttimeforhis(Date inserttimeforhis) {
        this.inserttimeforhis = inserttimeforhis;
    }

    /**
     * @return OPERATETIMEFORHIS
     */
    public Date getOperatetimeforhis() {
        return operatetimeforhis;
    }

    /**
     * @param operatetimeforhis
     */
    public void setOperatetimeforhis(Date operatetimeforhis) {
        this.operatetimeforhis = operatetimeforhis;
    }

    /**
     * @return COMCODE
     */
    public String getComcode() {
        return comcode;
    }

    /**
     * @param comcode
     */
    public void setComcode(String comcode) {
        this.comcode = comcode;
    }

    /**
     * @return TYPEFLAG
     */
    public String getTypeflag() {
        return typeflag;
    }

    /**
     * @param typeflag
     */
    public void setTypeflag(String typeflag) {
        this.typeflag = typeflag;
    }

    /**
     * @return GSCODE
     */
    public String getGscode() {
        return gscode;
    }

    /**
     * @param gscode
     */
    public void setGscode(String gscode) {
        this.gscode = gscode;
    }

    /**
     * @return FIRSTREGNAME
     */
    public String getFirstregname() {
        return firstregname;
    }

    /**
     * @param firstregname
     */
    public void setFirstregname(String firstregname) {
        this.firstregname = firstregname;
    }

    /**
     * @return OPINIONTYPE
     */
    public String getOpiniontype() {
        return opiniontype;
    }

    /**
     * @param opiniontype
     */
    public void setOpiniontype(String opiniontype) {
        this.opiniontype = opiniontype;
    }

    /**
     * @return OPERATORNAME
     */
    public String getOperatorname() {
        return operatorname;
    }

    /**
     * @param operatorname
     */
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    /**
     * @return DAMAGEADDRESSDETAIL
     */
    public String getDamageaddressdetail() {
        return damageaddressdetail;
    }

    /**
     * @param damageaddressdetail
     */
    public void setDamageaddressdetail(String damageaddressdetail) {
        this.damageaddressdetail = damageaddressdetail;
    }

    /**
     * @return VIRTUAL_COMCODE
     */
    public String getVirtualComcode() {
        return virtualComcode;
    }

    /**
     * @param virtualComcode
     */
    public void setVirtualComcode(String virtualComcode) {
        this.virtualComcode = virtualComcode;
    }

    /**
     * @return POLICYNO
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
     * @param policyno
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
     * @return REGISTBATCHNO
     */
    public String getRegistbatchno() {
        return registbatchno;
    }

    /**
     * @param registbatchno
     */
    public void setRegistbatchno(String registbatchno) {
        this.registbatchno = registbatchno;
    }

    /**
     * @return DAMAGEDETAILITEM
     */
    public String getDamagedetailitem() {
        return damagedetailitem;
    }

    /**
     * @param damagedetailitem
     */
    public void setDamagedetailitem(String damagedetailitem) {
        this.damagedetailitem = damagedetailitem;
    }
}