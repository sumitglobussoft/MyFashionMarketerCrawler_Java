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
@Table(name = "linkedinaccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Linkedinaccount.findAll", query = "SELECT l FROM Linkedinaccount l")})
public class Linkedinaccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "LinkedinUserId")
    private String linkedinUserId;
    @Column(name = "LinkedinUserName")
    private String linkedinUserName;
    @Column(name = "OAuthToken")
    private String oAuthToken;
    @Column(name = "OAuthSecret")
    private String oAuthSecret;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "OAuthVerifier")
    private String oAuthVerifier;
    @Column(name = "ProfileUrl")
    private String profileUrl;
    @Column(name = "EmailId")
    private String emailId;
    @Column(name = "IsActive")
    private Boolean isActive;
    @Column(name = "Connections")
    private Integer connections;
    @Column(name = "ProfileImageUrl")
    private String profileImageUrl;

    public Linkedinaccount() {
    }

    public Linkedinaccount(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getLinkedinUserId() {
        return linkedinUserId;
    }

    public void setLinkedinUserId(String linkedinUserId) {
        this.linkedinUserId = linkedinUserId;
    }

    public String getLinkedinUserName() {
        return linkedinUserName;
    }

    public void setLinkedinUserName(String linkedinUserName) {
        this.linkedinUserName = linkedinUserName;
    }

    public String getOAuthToken() {
        return oAuthToken;
    }

    public void setOAuthToken(String oAuthToken) {
        this.oAuthToken = oAuthToken;
    }

    public String getOAuthSecret() {
        return oAuthSecret;
    }

    public void setOAuthSecret(String oAuthSecret) {
        this.oAuthSecret = oAuthSecret;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getOAuthVerifier() {
        return oAuthVerifier;
    }

    public void setOAuthVerifier(String oAuthVerifier) {
        this.oAuthVerifier = oAuthVerifier;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getConnections() {
        return connections;
    }

    public void setConnections(Integer connections) {
        this.connections = connections;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
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
        if (!(object instanceof Linkedinaccount)) {
            return false;
        }
        Linkedinaccount other = (Linkedinaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Linkedinaccount[ id=" + id + " ]";
    }
    
}
