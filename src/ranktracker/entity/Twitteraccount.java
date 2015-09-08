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
@Table(name = "twitteraccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Twitteraccount.findAll", query = "SELECT t FROM Twitteraccount t")})
public class Twitteraccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "TwitterUserId")
    private String twitterUserId;
    @Column(name = "TwitterScreenName")
    private String twitterScreenName;
    @Column(name = "OAuthToken")
    private String oAuthToken;
    @Column(name = "OAuthSecret")
    private String oAuthSecret;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "IsActive")
    private Boolean isActive;
    @Column(name = "FollowersCount")
    private Integer followersCount;
    @Column(name = "FollowingCount")
    private Integer followingCount;
    @Column(name = "ProfileUrl")
    private String profileUrl;
    @Column(name = "ProfileImageUrl")
    private String profileImageUrl;
    @Column(name = "TwitterName")
    private String twitterName;

    public Twitteraccount() {
    }

    public Twitteraccount(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getTwitterUserId() {
        return twitterUserId;
    }

    public void setTwitterUserId(String twitterUserId) {
        this.twitterUserId = twitterUserId;
    }

    public String getTwitterScreenName() {
        return twitterScreenName;
    }

    public void setTwitterScreenName(String twitterScreenName) {
        this.twitterScreenName = twitterScreenName;
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getTwitterName() {
        return twitterName;
    }

    public void setTwitterName(String twitterName) {
        this.twitterName = twitterName;
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
        if (!(object instanceof Twitteraccount)) {
            return false;
        }
        Twitteraccount other = (Twitteraccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Twitteraccount[ id=" + id + " ]";
    }
    
}
