/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranktracker.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author GLB-214
 */
@Entity
@Table(name = "instagramcomment", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Instagramcomment.findAll", query = "SELECT i FROM Instagramcomment i")})
public class Instagramcomment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "ID")
    private byte[] id;
    @Column(name = "FeedId")
    private String feedId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "InstagramId")
    private String instagramId;
    @Column(name = "Comment")
    private String comment;
    @Column(name = "CommentDate")
    private String commentDate;
    @Column(name = "CommentId")
    private String commentId;
    @Column(name = "FromName")
    private String fromName;
    @Column(name = "FromProfilePic")
    private String fromProfilePic;
    @Column(name = "EntryDate")
    private String entryDate;

    public Instagramcomment() {
    }

    public Instagramcomment(byte[] id) {
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromProfilePic() {
        return fromProfilePic;
    }

    public void setFromProfilePic(String fromProfilePic) {
        this.fromProfilePic = fromProfilePic;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
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
        if (!(object instanceof Instagramcomment)) {
            return false;
        }
        Instagramcomment other = (Instagramcomment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Instagramcomment[ id=" + id + " ]";
    }
    
}
