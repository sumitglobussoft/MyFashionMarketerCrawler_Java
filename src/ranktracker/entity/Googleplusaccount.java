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
@Table(name = "googleplusaccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Googleplusaccount.findAll", query = "SELECT g FROM Googleplusaccount g")})
public class Googleplusaccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "GpUserId")
    private String gpUserId;
    @Column(name = "GpUserName")
    private String gpUserName;
    @Column(name = "GpProfileImage")
    private String gpProfileImage;
    @Column(name = "PeopleCount")
    private Integer peopleCount;
    @Column(name = "AccessToken")
    private String accessToken;
    @Column(name = "RefreshToken")
    private String refreshToken;
    @Column(name = "IsActive")
    private Integer isActive;
    @Column(name = "EmailId")
    private String emailId;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Googleplusaccount() {
    }

    public Googleplusaccount(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getGpUserId() {
        return gpUserId;
    }

    public void setGpUserId(String gpUserId) {
        this.gpUserId = gpUserId;
    }

    public String getGpUserName() {
        return gpUserName;
    }

    public void setGpUserName(String gpUserName) {
        this.gpUserName = gpUserName;
    }

    public String getGpProfileImage() {
        return gpProfileImage;
    }

    public void setGpProfileImage(String gpProfileImage) {
        this.gpProfileImage = gpProfileImage;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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
        if (!(object instanceof Googleplusaccount)) {
            return false;
        }
        Googleplusaccount other = (Googleplusaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Googleplusaccount[ id=" + id + " ]";
    }
    
}
