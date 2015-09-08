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
@Table(name = "boardinstagramfeeds", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardinstagramfeeds.findAll", query = "SELECT b FROM Boardinstagramfeeds b")})
public class Boardinstagramfeeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "Link")
    private String link;
    @Column(name = "ImageUrl")
    private String imageUrl;
    @Column(name = "tags")
    private String tags;
    @Column(name = "CreatedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Basic(optional = false)
    @Lob
    @Column(name = "InstagramAccountId")
    private byte[] instagramAccountId;
    @Column(name = "FeedId")
    private String feedId;
    @Basic(optional = false)
    @Column(name = "IsVisible")
    private boolean isVisible;

    public Boardinstagramfeeds() {
    }

    public Boardinstagramfeeds(byte[] id) {
        this.id = id;
    }

    public Boardinstagramfeeds(byte[] id, byte[] instagramAccountId, boolean isVisible) {
        this.id = id;
        this.instagramAccountId = instagramAccountId;
        this.isVisible = isVisible;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public byte[] getInstagramAccountId() {
        return instagramAccountId;
    }

    public void setInstagramAccountId(byte[] instagramAccountId) {
        this.instagramAccountId = instagramAccountId;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
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
        if (!(object instanceof Boardinstagramfeeds)) {
            return false;
        }
        Boardinstagramfeeds other = (Boardinstagramfeeds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardinstagramfeeds[ id=" + id + " ]";
    }
    
}
