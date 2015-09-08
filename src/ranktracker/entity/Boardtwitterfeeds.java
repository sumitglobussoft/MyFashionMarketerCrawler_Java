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
@Table(name = "boardtwitterfeeds", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardtwitterfeeds.findAll", query = "SELECT b FROM Boardtwitterfeeds b")})
public class Boardtwitterfeeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "CreatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "FeedId")
    private String feedId;
    @Column(name = "FeedUrl")
    private String feedUrl;
    @Column(name = "ImageUrl")
    private String imageUrl;
    @Column(name = "Text")
    private String text;
    @Column(name = "HashTags")
    private String hashTags;
    @Basic(optional = false)
    @Lob
    @Column(name = "TwitterProfileId")
    private byte[] twitterProfileId;
    @Basic(optional = false)
    @Column(name = "IsVisible")
    private boolean isVisible;

    public Boardtwitterfeeds() {
    }

    public Boardtwitterfeeds(byte[] id) {
        this.id = id;
    }

    public Boardtwitterfeeds(byte[] id, String feedId, byte[] twitterProfileId, boolean isVisible) {
        this.id = id;
        this.feedId = feedId;
        this.twitterProfileId = twitterProfileId;
        this.isVisible = isVisible;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHashTags() {
        return hashTags;
    }

    public void setHashTags(String hashTags) {
        this.hashTags = hashTags;
    }

    public byte[] getTwitterProfileId() {
        return twitterProfileId;
    }

    public void setTwitterProfileId(byte[] twitterProfileId) {
        this.twitterProfileId = twitterProfileId;
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
        if (!(object instanceof Boardtwitterfeeds)) {
            return false;
        }
        Boardtwitterfeeds other = (Boardtwitterfeeds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardtwitterfeeds[ id=" + id + " ]";
    }
    
}
