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
@Table(name = "bloggerfeeds", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bloggerfeeds.findAll", query = "SELECT b FROM Bloggerfeeds b")})
public class Bloggerfeeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "FeedId")
    private String feedId;
    @Column(name = "BloggerId")
    private String bloggerId;
    @Lob
    @Column(name = "Title")
    private String title;
    @Lob
    @Column(name = "Content")
    private String content;
    @Lob
    @Column(name = "Url")
    private String url;
    @Column(name = "Publish")
    @Temporal(TemporalType.TIMESTAMP)
    private Date publish;
    @Column(name = "Comments")
    private String comments;
    @Lob
    @Column(name = "ImageUrl")
    private String imageUrl;

    public Bloggerfeeds() {
    }

    public Bloggerfeeds(byte[] id) {
        this.id = id;
    }

    public Bloggerfeeds(byte[] id, byte[] userId) {
        this.id = id;
        this.userId = userId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public String getBloggerId() {
        return bloggerId;
    }

    public void setBloggerId(String bloggerId) {
        this.bloggerId = bloggerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
        if (!(object instanceof Bloggerfeeds)) {
            return false;
        }
        Bloggerfeeds other = (Bloggerfeeds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Bloggerfeeds[ id=" + id + " ]";
    }
    
}
