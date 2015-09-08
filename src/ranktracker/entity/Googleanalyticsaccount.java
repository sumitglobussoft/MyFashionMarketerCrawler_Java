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
@Table(name = "googleanalyticsaccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Googleanalyticsaccount.findAll", query = "SELECT g FROM Googleanalyticsaccount g")})
public class Googleanalyticsaccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "EmailId")
    private String emailId;
    @Basic(optional = false)
    @Column(name = "GaAccountId")
    private String gaAccountId;
    @Column(name = "GaAccountName")
    private String gaAccountName;
    @Basic(optional = false)
    @Column(name = "AccessToken")
    private String accessToken;
    @Basic(optional = false)
    @Column(name = "RefreshToken")
    private String refreshToken;
    @Basic(optional = false)
    @Column(name = "GaProfileId")
    private String gaProfileId;
    @Basic(optional = false)
    @Column(name = "GaProfileName")
    private String gaProfileName;
    @Basic(optional = false)
    @Column(name = "Visits")
    private int visits;
    @Basic(optional = false)
    @Column(name = "AvgVisits")
    private double avgVisits;
    @Basic(optional = false)
    @Column(name = "NewVisits")
    private int newVisits;
    @Column(name = "IsActive")
    private Boolean isActive;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Googleanalyticsaccount() {
    }

    public Googleanalyticsaccount(byte[] id) {
        this.id = id;
    }

    public Googleanalyticsaccount(byte[] id, byte[] userId, String gaAccountId, String accessToken, String refreshToken, String gaProfileId, String gaProfileName, int visits, double avgVisits, int newVisits) {
        this.id = id;
        this.userId = userId;
        this.gaAccountId = gaAccountId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.gaProfileId = gaProfileId;
        this.gaProfileName = gaProfileName;
        this.visits = visits;
        this.avgVisits = avgVisits;
        this.newVisits = newVisits;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGaAccountId() {
        return gaAccountId;
    }

    public void setGaAccountId(String gaAccountId) {
        this.gaAccountId = gaAccountId;
    }

    public String getGaAccountName() {
        return gaAccountName;
    }

    public void setGaAccountName(String gaAccountName) {
        this.gaAccountName = gaAccountName;
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

    public String getGaProfileId() {
        return gaProfileId;
    }

    public void setGaProfileId(String gaProfileId) {
        this.gaProfileId = gaProfileId;
    }

    public String getGaProfileName() {
        return gaProfileName;
    }

    public void setGaProfileName(String gaProfileName) {
        this.gaProfileName = gaProfileName;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public double getAvgVisits() {
        return avgVisits;
    }

    public void setAvgVisits(double avgVisits) {
        this.avgVisits = avgVisits;
    }

    public int getNewVisits() {
        return newVisits;
    }

    public void setNewVisits(int newVisits) {
        this.newVisits = newVisits;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
        if (!(object instanceof Googleanalyticsaccount)) {
            return false;
        }
        Googleanalyticsaccount other = (Googleanalyticsaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Googleanalyticsaccount[ id=" + id + " ]";
    }
    
}
