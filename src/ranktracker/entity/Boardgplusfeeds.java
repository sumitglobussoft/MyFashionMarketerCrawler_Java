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
@Table(name = "boardgplusfeeds", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardgplusfeeds.findAll", query = "SELECT b FROM Boardgplusfeeds b")})
public class Boardgplusfeeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "FeedLink")
    private String feedLink;
    @Basic(optional = false)
    @Lob
    @Column(name = "gplusboardaccProfileId")
    private byte[] gplusboardaccProfileId;
    @Column(name = "PublishedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishedTime;
    @Column(name = "ImageUrl")
    private String imageUrl;
    @Column(name = "Title")
    private String title;
    @Column(name = "FeedId")
    private String feedId;

    public Boardgplusfeeds() {
    }

    public Boardgplusfeeds(byte[] id) {
        this.id = id;
    }

    public Boardgplusfeeds(byte[] id, byte[] gplusboardaccProfileId) {
        this.id = id;
        this.gplusboardaccProfileId = gplusboardaccProfileId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFeedLink() {
        return feedLink;
    }

    public void setFeedLink(String feedLink) {
        this.feedLink = feedLink;
    }

    public byte[] getGplusboardaccProfileId() {
        return gplusboardaccProfileId;
    }

    public void setGplusboardaccProfileId(byte[] gplusboardaccProfileId) {
        this.gplusboardaccProfileId = gplusboardaccProfileId;
    }

    public Date getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
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
        if (!(object instanceof Boardgplusfeeds)) {
            return false;
        }
        Boardgplusfeeds other = (Boardgplusfeeds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardgplusfeeds[ id=" + id + " ]";
    }
    
}
