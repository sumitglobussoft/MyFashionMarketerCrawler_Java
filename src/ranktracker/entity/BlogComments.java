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
@Table(name = "blog_comments", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "BlogComments.findAll", query = "SELECT b FROM BlogComments b")})
public class BlogComments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "CommentPostId")
    private byte[] commentPostId;
    @Column(name = "CommentAuthor")
    private String commentAuthor;
    @Column(name = "CommentAuthorEmail")
    private String commentAuthorEmail;
    @Column(name = "CommentAuthorUrl")
    private String commentAuthorUrl;
    @Column(name = "CommentAuthorIp")
    private String commentAuthorIp;
    @Basic(optional = false)
    @Column(name = "CommentDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;
    @Lob
    @Column(name = "CommentContent")
    private String commentContent;
    @Lob
    @Column(name = "CommentApproved")
    private String commentApproved;

    public BlogComments() {
    }

    public BlogComments(byte[] id) {
        this.id = id;
    }

    public BlogComments(byte[] id, byte[] commentPostId, Date commentDate) {
        this.id = id;
        this.commentPostId = commentPostId;
        this.commentDate = commentDate;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(byte[] commentPostId) {
        this.commentPostId = commentPostId;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl;
    }

    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }

    public void setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentApproved() {
        return commentApproved;
    }

    public void setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved;
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
        if (!(object instanceof BlogComments)) {
            return false;
        }
        BlogComments other = (BlogComments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.BlogComments[ id=" + id + " ]";
    }
    
}
