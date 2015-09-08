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
@Table(name = "facebookaccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Facebookaccount.findAll", query = "SELECT f FROM Facebookaccount f")})
public class Facebookaccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "FbUserId")
    private String fbUserId;
    @Column(name = "FbUserName")
    private String fbUserName;
    @Column(name = "AccessToken")
    private String accessToken;
    @Column(name = "Friends")
    private Integer friends;
    @Column(name = "EmailId")
    private String emailId;
    @Column(name = "Type")
    private String type;
    @Column(name = "IsActive")
    private Integer isActive;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "ProfileUrl")
    private String profileUrl;

    public Facebookaccount() {
    }

    public Facebookaccount(byte[] id) {
        this.id = id;
    }

    public Facebookaccount(byte[] id, String fbUserId) {
        this.id = id;
        this.fbUserId = fbUserId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFbUserId() {
        return fbUserId;
    }

    public void setFbUserId(String fbUserId) {
        this.fbUserId = fbUserId;
    }

    public String getFbUserName() {
        return fbUserName;
    }

    public void setFbUserName(String fbUserName) {
        this.fbUserName = fbUserName;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getFriends() {
        return friends;
    }

    public void setFriends(Integer friends) {
        this.friends = friends;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
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
        if (!(object instanceof Facebookaccount)) {
            return false;
        }
        Facebookaccount other = (Facebookaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Facebookaccount[ id=" + id + " ]";
    }
    
}
