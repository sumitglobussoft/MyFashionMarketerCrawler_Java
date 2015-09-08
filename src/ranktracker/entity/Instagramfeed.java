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
@Table(name = "instagramfeed", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Instagramfeed.findAll", query = "SELECT i FROM Instagramfeed i")})
public class Instagramfeed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "FeedId")
    private String feedId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "InstagramId")
    private String instagramId;
    @Column(name = "FeedImageUrl")
    private String feedImageUrl;
    @Column(name = "LikeCount")
    private Integer likeCount;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "FeedDate")
    private String feedDate;
    @Column(name = "CommentCount")
    private Integer commentCount;
    @Column(name = "IsLike")
    private Integer isLike;
    @Lob
    @Column(name = "AdminUser")
    private String adminUser;

    public Instagramfeed() {
    }

    public Instagramfeed(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getInstagramId() {
        return instagramId;
    }

    public void setInstagramId(String instagramId) {
        this.instagramId = instagramId;
    }

    public String getFeedImageUrl() {
        return feedImageUrl;
    }

    public void setFeedImageUrl(String feedImageUrl) {
        this.feedImageUrl = feedImageUrl;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getFeedDate() {
        return feedDate;
    }

    public void setFeedDate(String feedDate) {
        this.feedDate = feedDate;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getIsLike() {
        return isLike;
    }

    public void setIsLike(Integer isLike) {
        this.isLike = isLike;
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
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
        if (!(object instanceof Instagramfeed)) {
            return false;
        }
        Instagramfeed other = (Instagramfeed) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Instagramfeed[ id=" + id + " ]";
    }
    
}
