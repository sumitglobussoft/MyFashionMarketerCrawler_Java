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
@Table(name = "instagramaccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Instagramaccount.findAll", query = "SELECT i FROM Instagramaccount i")})
public class Instagramaccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "InstagramId")
    private String instagramId;
    @Column(name = "AccessToken")
    private String accessToken;
    @Column(name = "InsUserName")
    private String insUserName;
    @Column(name = "ProfileUrl")
    private String profileUrl;
    @Column(name = "Followers")
    private Integer followers;
    @Column(name = "FollowedBy")
    private Integer followedBy;
    @Column(name = "IsActive")
    private Boolean isActive;
    @Column(name = "TotalImages")
    private Integer totalImages;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;

    public Instagramaccount() {
    }

    public Instagramaccount(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getInstagramId() {
        return instagramId;
    }

    public void setInstagramId(String instagramId) {
        this.instagramId = instagramId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getInsUserName() {
        return insUserName;
    }

    public void setInsUserName(String insUserName) {
        this.insUserName = insUserName;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(Integer followedBy) {
        this.followedBy = followedBy;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getTotalImages() {
        return totalImages;
    }

    public void setTotalImages(Integer totalImages) {
        this.totalImages = totalImages;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
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
        if (!(object instanceof Instagramaccount)) {
            return false;
        }
        Instagramaccount other = (Instagramaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Instagramaccount[ id=" + id + " ]";
    }
    
}
