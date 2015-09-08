/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranktracker.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author GLB-214
 */
@Entity
@Table(name = "user", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "Company_id")
    private byte[] companyid;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "EmailId")
    private String emailId;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "ProfileUrl")
    private String profileUrl;
    @Column(name = "AccountType")
    private String accountType;
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "ExpiryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "Title")
    private String title;
    @Column(name = "Company")
    private String company;
    @Column(name = "UserStatus")
    private Boolean userStatus;
    @Column(name = "Password")
    private String password;
    @Column(name = "PuId")
    private String puId;
    @Column(name = "TimeZone")
    private String timeZone;
    @Column(name = "PaymentStatus")
    private String paymentStatus;
    @Column(name = "ActivationStatus")
    private String activationStatus;
    @Column(name = "UserType")
    private String userType;
    @Column(name = "ChangePasswordKey")
    private String changePasswordKey;
    @Column(name = "IsKeyUsed")
    private Boolean isKeyUsed;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Postal")
    private Integer postal;

    public User() {
    }

    public User(byte[] id) {
        this.id = id;
    }

    public User(byte[] id, byte[] companyid) {
        this.id = id;
        this.companyid = companyid;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getCompanyid() {
        return companyid;
    }

    public void setCompanyid(byte[] companyid) {
        this.companyid = companyid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPuId() {
        return puId;
    }

    public void setPuId(String puId) {
        this.puId = puId;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getChangePasswordKey() {
        return changePasswordKey;
    }

    public void setChangePasswordKey(String changePasswordKey) {
        this.changePasswordKey = changePasswordKey;
    }

    public Boolean getIsKeyUsed() {
        return isKeyUsed;
    }

    public void setIsKeyUsed(Boolean isKeyUsed) {
        this.isKeyUsed = isKeyUsed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPostal() {
        return postal;
    }

    public void setPostal(Integer postal) {
        this.postal = postal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.User[ id=" + id + " ]";
    }
    
}
