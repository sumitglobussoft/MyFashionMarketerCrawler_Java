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
@Table(name = "boardfbfeeds", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardfbfeeds.findAll", query = "SELECT b FROM Boardfbfeeds b")})
public class Boardfbfeeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Column(name = "Link")
    private String link;
    @Column(name = "Message")
    private String message;
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @Column(name = "FeedId")
    private String feedId;
    @Basic(optional = false)
    @Column(name = "IsVisible")
    private boolean isVisible;
    @Column(name = "VideoLink")
    private String videoLink;
    @Column(name = "Story")
    private String story;
    @Basic(optional = false)
    @Lob
    @Column(name = "FbPageProfileId")
    private byte[] fbPageProfileId;
    @Column(name = "CoverPhoto")
    private String coverPhoto;
    @Column(name = "Image")
    private String image;
    @Column(name = "Likes")
    private String likes;

    public Boardfbfeeds() {
    }

    public Boardfbfeeds(byte[] id) {
        this.id = id;
    }

    public Boardfbfeeds(byte[] id, String type, String feedId, boolean isVisible, byte[] fbPageProfileId) {
        this.id = id;
        this.type = type;
        this.feedId = feedId;
        this.isVisible = isVisible;
        this.fbPageProfileId = fbPageProfileId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public byte[] getFbPageProfileId() {
        return fbPageProfileId;
    }

    public void setFbPageProfileId(byte[] fbPageProfileId) {
        this.fbPageProfileId = fbPageProfileId;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
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
        if (!(object instanceof Boardfbfeeds)) {
            return false;
        }
        Boardfbfeeds other = (Boardfbfeeds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardfbfeeds[ id=" + id + " ]";
    }
    
}
