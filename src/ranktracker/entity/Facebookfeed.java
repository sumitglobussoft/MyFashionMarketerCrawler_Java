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
@Table(name = "facebookfeed", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Facebookfeed.findAll", query = "SELECT f FROM Facebookfeed f")})
public class Facebookfeed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "FeedDescription")
    private String feedDescription;
    @Column(name = "FeedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feedDate;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "FromId")
    private String fromId;
    @Column(name = "FromName")
    private String fromName;
    @Column(name = "FromProfileUrl")
    private String fromProfileUrl;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Type")
    private String type;
    @Column(name = "FbComment")
    private String fbComment;
    @Column(name = "FbLike")
    private String fbLike;
    @Column(name = "FeedId")
    private String feedId;
    @Column(name = "ReadStatus")
    private Integer readStatus;
    @Column(name = "Picture")
    private String picture;

    public Facebookfeed() {
    }

    public Facebookfeed(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFeedDescription() {
        return feedDescription;
    }

    public void setFeedDescription(String feedDescription) {
        this.feedDescription = feedDescription;
    }

    public Date getFeedDate() {
        return feedDate;
    }

    public void setFeedDate(Date feedDate) {
        this.feedDate = feedDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public String getFromProfileUrl() {
        return fromProfileUrl;
    }

    public void setFromProfileUrl(String fromProfileUrl) {
        this.fromProfileUrl = fromProfileUrl;
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

    public String getFbComment() {
        return fbComment;
    }

    public void setFbComment(String fbComment) {
        this.fbComment = fbComment;
    }

    public String getFbLike() {
        return fbLike;
    }

    public void setFbLike(String fbLike) {
        this.fbLike = fbLike;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public Integer getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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
        if (!(object instanceof Facebookfeed)) {
            return false;
        }
        Facebookfeed other = (Facebookfeed) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Facebookfeed[ id=" + id + " ]";
    }
    
}
