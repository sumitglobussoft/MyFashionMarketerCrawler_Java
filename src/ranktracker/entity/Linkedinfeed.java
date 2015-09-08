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
@Table(name = "linkedinfeed", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Linkedinfeed.findAll", query = "SELECT l FROM Linkedinfeed l")})
public class Linkedinfeed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "Feeds")
    private String feeds;
    @Column(name = "FeedsDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feedsDate;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Type")
    private String type;
    @Column(name = "FeedId")
    private String feedId;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "FromId")
    private String fromId;
    @Column(name = "FromName")
    private String fromName;
    @Column(name = "FromPicUrl")
    private String fromPicUrl;
    @Column(name = "ImageUrl")
    private String imageUrl;
    @Column(name = "FromUrl")
    private String fromUrl;

    public Linkedinfeed() {
    }

    public Linkedinfeed(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    public Date getFeedsDate() {
        return feedsDate;
    }

    public void setFeedsDate(Date feedsDate) {
        this.feedsDate = feedsDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromPicUrl() {
        return fromPicUrl;
    }

    public void setFromPicUrl(String fromPicUrl) {
        this.fromPicUrl = fromPicUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
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
        if (!(object instanceof Linkedinfeed)) {
            return false;
        }
        Linkedinfeed other = (Linkedinfeed) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Linkedinfeed[ id=" + id + " ]";
    }
    
}
