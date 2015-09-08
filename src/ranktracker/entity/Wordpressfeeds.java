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
@Table(name = "wordpressfeeds", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Wordpressfeeds.findAll", query = "SELECT w FROM Wordpressfeeds w")})
public class Wordpressfeeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "PostId")
    private String postId;
    @Column(name = "Title")
    private String title;
    @Column(name = "PostUrl")
    private String postUrl;
    @Lob
    @Column(name = "PostContent")
    private String postContent;
    @Column(name = "CommentCount")
    private String commentCount;
    @Column(name = "LikeCount")
    private String likeCount;
    @Column(name = "ILike")
    private String iLike;
    @Column(name = "SiteId")
    private String siteId;
    @Column(name = "WPUserId")
    private String wPUserId;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Basic(optional = false)
    @Column(name = "ModifiedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTime;
    @Basic(optional = false)
    @Column(name = "CreatedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Basic(optional = false)
    @Column(name = "EntryTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTime;

    public Wordpressfeeds() {
    }

    public Wordpressfeeds(byte[] id) {
        this.id = id;
    }

    public Wordpressfeeds(byte[] id, byte[] userId, Date modifiedTime, Date createdTime, Date entryTime) {
        this.id = id;
        this.userId = userId;
        this.modifiedTime = modifiedTime;
        this.createdTime = createdTime;
        this.entryTime = entryTime;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getILike() {
        return iLike;
    }

    public void setILike(String iLike) {
        this.iLike = iLike;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getWPUserId() {
        return wPUserId;
    }

    public void setWPUserId(String wPUserId) {
        this.wPUserId = wPUserId;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
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
        if (!(object instanceof Wordpressfeeds)) {
            return false;
        }
        Wordpressfeeds other = (Wordpressfeeds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Wordpressfeeds[ id=" + id + " ]";
    }
    
}
