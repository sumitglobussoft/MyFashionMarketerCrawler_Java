/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranktracker.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "blog_posts", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "BlogPosts.findAll", query = "SELECT b FROM BlogPosts b")})
public class BlogPosts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "PostAuthor")
    private byte[] postAuthor;
    @Column(name = "PostDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postDate;
    @Lob
    @Column(name = "PostContent")
    private String postContent;
    @Lob
    @Column(name = "PostTitle")
    private String postTitle;
    @Column(name = "PostStatus")
    private String postStatus;
    @Column(name = "CommentStatus")
    private String commentStatus;
    @Column(name = "PostName")
    private String postName;
    @Basic(optional = false)
    @Column(name = "PostModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postModifiedDate;
    @Column(name = "CommentCount")
    private BigInteger commentCount;

    public BlogPosts() {
    }

    public BlogPosts(byte[] id) {
        this.id = id;
    }

    public BlogPosts(byte[] id, byte[] postAuthor, Date postModifiedDate) {
        this.id = id;
        this.postAuthor = postAuthor;
        this.postModifiedDate = postModifiedDate;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(byte[] postAuthor) {
        this.postAuthor = postAuthor;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Date getPostModifiedDate() {
        return postModifiedDate;
    }

    public void setPostModifiedDate(Date postModifiedDate) {
        this.postModifiedDate = postModifiedDate;
    }

    public BigInteger getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(BigInteger commentCount) {
        this.commentCount = commentCount;
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
        if (!(object instanceof BlogPosts)) {
            return false;
        }
        BlogPosts other = (BlogPosts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.BlogPosts[ id=" + id + " ]";
    }
    
}
