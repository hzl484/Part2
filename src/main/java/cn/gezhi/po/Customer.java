package cn.gezhi.po;

public class Customer {
    private Integer id;

    private String number;

    private String idcardnum;

    private String mobile;

    private String level;

    private Double loanamount;

    private Double finalloan;

    private String status;

    private Double commission;

    private String focuslevel;

    private String note;

    private String socialsecurity;

    private String date;

    private Integer salesmanid;

    private Integer auditorid;

    private Integer bankid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getIdcardnum() {
        return idcardnum;
    }

    public void setIdcardnum(String idcardnum) {
        this.idcardnum = idcardnum == null ? null : idcardnum.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Double getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(Double loanamount) {
        this.loanamount = loanamount;
    }

    public Double getFinalloan() {
        return finalloan;
    }

    public void setFinalloan(Double finalloan) {
        this.finalloan = finalloan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getFocuslevel() {
        return focuslevel;
    }

    public void setFocuslevel(String focuslevel) {
        this.focuslevel = focuslevel == null ? null : focuslevel.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getSocialsecurity() {
        return socialsecurity;
    }

    public void setSocialsecurity(String socialsecurity) {
        this.socialsecurity = socialsecurity == null ? null : socialsecurity.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public Integer getSalesmanid() {
        return salesmanid;
    }

    public void setSalesmanid(Integer salesmanid) {
        this.salesmanid = salesmanid;
    }

    public Integer getAuditorid() {
        return auditorid;
    }

    public void setAuditorid(Integer auditorid) {
        this.auditorid = auditorid;
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }
}