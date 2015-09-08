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
@Table(name = "bloggersites", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bloggersites.findAll", query = "SELECT b FROM Bloggersites b")})
public class Bloggersites implements Serializable {
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
    @Column(name = "BloggerUserId")
    private String bloggerUserId;
    @Column(name = "BloggerId")
    private String bloggerId;
    @Column(name = "BloggerName")
    private String bloggerName;
    @Column(name = "Description")
    private String description;
    @Column(name = "Published")
    @Temporal(TemporalType.TIMESTAMP)
    private Date published;
    @Column(name = "Url")
    private String url;
    @Column(name = "PostCount")
    private String postCount;
    @Column(name = "PageCount")
    private String pageCount;

    public Bloggersites() {
    }

    public Bloggersites(byte[] id) {
        this.id = id;
    }

    public Bloggersites(byte[] id, byte[] userId) {
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

    public String getBloggerUserId() {
        return bloggerUserId;
    }

    public void setBloggerUserId(String bloggerUserId) {
        this.bloggerUserId = bloggerUserId;
    }

    public String getBloggerId() {
        return bloggerId;
    }

    public void setBloggerId(String bloggerId) {
        this.bloggerId = bloggerId;
    }

    public String getBloggerName() {
        return bloggerName;
    }

    public void setBloggerName(String bloggerName) {
        this.bloggerName = bloggerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPostCount() {
        return postCount;
    }

    public void setPostCount(String postCount) {
        this.postCount = postCount;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
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
        if (!(object instanceof Bloggersites)) {
            return false;
        }
        Bloggersites other = (Bloggersites) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Bloggersites[ id=" + id + " ]";
    }
    
}
