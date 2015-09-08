/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranktracker.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author GLB-214
 */
@Entity
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "User_id")
    private byte[] userid;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Company_id")
    private byte[] companyid;
    @Column(name = "Business_name")
    private String businessname;
    @Column(name = "EmailId")
    private String emailId;
    @Column(name = "Tags")
    private String tags;
    @Column(name = "Indusrties")
    private String indusrties;
    @Column(name = "Block_status")
    private String blockstatus;
    @Column(name = "Default_no")
    private String defaultno;
    @Column(name = "Company_url")
    private String companyurl;
    @Column(name = "Address")
    private String address;
    @Lob
    @Column(name = "Country_name")
    private String countryname;
    @Lob
    @Column(name = "City")
    private String city;
    @Column(name = "Zip")
    private Integer zip;
    @Column(name = "Spam_url")
    private String spamurl;
    @Lob
    @Column(name = "Api_key")
    private byte[] apikey;
    @Column(name = "Blocked_url")
    private String blockedurl;
    @Column(name = "Google_analytics_acc_id")
    private String googleanalyticsaccid;
    @Column(name = "Page_domain")
    private String pagedomain;
    @Column(name = "Adwords_custId")
    private String adwordscustId;
    @Column(name = "Link_replace_domain")
    private String linkreplacedomain;
    @Column(name = "Google_captcha_key")
    private String googlecaptchakey;
    @Column(name = "Google_captcha_secret")
    private String googlecaptchasecret;
    @Column(name = "Billing_email")
    private String billingemail;

    public Account() {
    }

    public Account(byte[] companyid) {
        this.companyid = companyid;
    }

    public Account(byte[] companyid, byte[] userid) {
        this.companyid = companyid;
        this.userid = userid;
    }

    public byte[] getUserid() {
        return userid;
    }

    public void setUserid(byte[] userid) {
        this.userid = userid;
    }

    public byte[] getCompanyid() {
        return companyid;
    }

    public void setCompanyid(byte[] companyid) {
        this.companyid = companyid;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getIndusrties() {
        return indusrties;
    }

    public void setIndusrties(String indusrties) {
        this.indusrties = indusrties;
    }

    public String getBlockstatus() {
        return blockstatus;
    }

    public void setBlockstatus(String blockstatus) {
        this.blockstatus = blockstatus;
    }

    public String getDefaultno() {
        return defaultno;
    }

    public void setDefaultno(String defaultno) {
        this.defaultno = defaultno;
    }

    public String getCompanyurl() {
        return companyurl;
    }

    public void setCompanyurl(String companyurl) {
        this.companyurl = companyurl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getSpamurl() {
        return spamurl;
    }

    public void setSpamurl(String spamurl) {
        this.spamurl = spamurl;
    }

    public byte[] getApikey() {
        return apikey;
    }

    public void setApikey(byte[] apikey) {
        this.apikey = apikey;
    }

    public String getBlockedurl() {
        return blockedurl;
    }

    public void setBlockedurl(String blockedurl) {
        this.blockedurl = blockedurl;
    }

    public String getGoogleanalyticsaccid() {
        return googleanalyticsaccid;
    }

    public void setGoogleanalyticsaccid(String googleanalyticsaccid) {
        this.googleanalyticsaccid = googleanalyticsaccid;
    }

    public String getPagedomain() {
        return pagedomain;
    }

    public void setPagedomain(String pagedomain) {
        this.pagedomain = pagedomain;
    }

    public String getAdwordscustId() {
        return adwordscustId;
    }

    public void setAdwordscustId(String adwordscustId) {
        this.adwordscustId = adwordscustId;
    }

    public String getLinkreplacedomain() {
        return linkreplacedomain;
    }

    public void setLinkreplacedomain(String linkreplacedomain) {
        this.linkreplacedomain = linkreplacedomain;
    }

    public String getGooglecaptchakey() {
        return googlecaptchakey;
    }

    public void setGooglecaptchakey(String googlecaptchakey) {
        this.googlecaptchakey = googlecaptchakey;
    }

    public String getGooglecaptchasecret() {
        return googlecaptchasecret;
    }

    public void setGooglecaptchasecret(String googlecaptchasecret) {
        this.googlecaptchasecret = googlecaptchasecret;
    }

    public String getBillingemail() {
        return billingemail;
    }

    public void setBillingemail(String billingemail) {
        this.billingemail = billingemail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyid != null ? companyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.companyid == null && other.companyid != null) || (this.companyid != null && !this.companyid.equals(other.companyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Account[ companyid=" + companyid + " ]";
    }
    
}
