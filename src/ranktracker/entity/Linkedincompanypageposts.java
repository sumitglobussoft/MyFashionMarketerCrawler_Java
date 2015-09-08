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
@Table(name = "linkedincompanypageposts", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Linkedincompanypageposts.findAll", query = "SELECT l FROM Linkedincompanypageposts l")})
public class Linkedincompanypageposts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "Posts")
    private String posts;
    @Column(name = "PostDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postDate;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Type")
    private String type;
    @Column(name = "PostId")
    private String postId;
    @Column(name = "UpdateKey")
    private String updateKey;
    @Column(name = "PageId")
    private String pageId;
    @Column(name = "PostImageUrl")
    private String postImageUrl;
    @Column(name = "Likes")
    private Integer likes;
    @Column(name = "Comments")
    private Integer comments;
    @Column(name = "IsLiked")
    private Integer isLiked;

    public Linkedincompanypageposts() {
    }

    public Linkedincompanypageposts(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
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

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUpdateKey() {
        return updateKey;
    }

    public void setUpdateKey(String updateKey) {
        this.updateKey = updateKey;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPostImageUrl() {
        return postImageUrl;
    }

    public void setPostImageUrl(String postImageUrl) {
        this.postImageUrl = postImageUrl;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Integer isLiked) {
        this.isLiked = isLiked;
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
        if (!(object instanceof Linkedincompanypageposts)) {
            return false;
        }
        Linkedincompanypageposts other = (Linkedincompanypageposts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Linkedincompanypageposts[ id=" + id + " ]";
    }
    
}
