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
@Table(name = "wordpresssites", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Wordpresssites.findAll", query = "SELECT w FROM Wordpresssites w")})
public class Wordpresssites implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "SiteId")
    private String siteId;
    @Column(name = "SiteName")
    private String siteName;
    @Column(name = "Description")
    private String description;
    @Column(name = "SiteURL")
    private String siteURL;
    @Column(name = "Post_Count")
    private Integer postCount;
    @Column(name = "Subscribers_Count")
    private Integer subscribersCount;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "WPUserId")
    private String wPUserId;
    @Column(name = "CreatedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "EntryTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTime;

    public Wordpresssites() {
    }

    public Wordpresssites(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSiteURL() {
        return siteURL;
    }

    public void setSiteURL(String siteURL) {
        this.siteURL = siteURL;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public Integer getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(Integer subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getWPUserId() {
        return wPUserId;
    }

    public void setWPUserId(String wPUserId) {
        this.wPUserId = wPUserId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
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
        if (!(object instanceof Wordpresssites)) {
            return false;
        }
        Wordpresssites other = (Wordpresssites) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Wordpresssites[ id=" + id + " ]";
    }
    
}
