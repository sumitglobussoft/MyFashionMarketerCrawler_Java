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
@Table(name = "bloggeraccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bloggeraccount.findAll", query = "SELECT b FROM Bloggeraccount b")})
public class Bloggeraccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "BloggerUserId")
    private String bloggerUserId;
    @Column(name = "BloggerUserName")
    private String bloggerUserName;
    @Column(name = "BloggerProfileImage")
    private String bloggerProfileImage;
    @Column(name = "Accesstoken")
    private String accesstoken;
    @Column(name = "Refreshtoken")
    private String refreshtoken;
    @Column(name = "Isactive")
    private Short isactive;
    @Column(name = "Emailid")
    private String emailid;
    @Column(name = "Entrydate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entrydate;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;

    public Bloggeraccount() {
    }

    public Bloggeraccount(byte[] id) {
        this.id = id;
    }

    public Bloggeraccount(byte[] id, byte[] userId) {
        this.id = id;
        this.userId = userId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getBloggerUserId() {
        return bloggerUserId;
    }

    public void setBloggerUserId(String bloggerUserId) {
        this.bloggerUserId = bloggerUserId;
    }

    public String getBloggerUserName() {
        return bloggerUserName;
    }

    public void setBloggerUserName(String bloggerUserName) {
        this.bloggerUserName = bloggerUserName;
    }

    public String getBloggerProfileImage() {
        return bloggerProfileImage;
    }

    public void setBloggerProfileImage(String bloggerProfileImage) {
        this.bloggerProfileImage = bloggerProfileImage;
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    public String getRefreshtoken() {
        return refreshtoken;
    }

    public void setRefreshtoken(String refreshtoken) {
        this.refreshtoken = refreshtoken;
    }

    public Short getIsactive() {
        return isactive;
    }

    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
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
        if (!(object instanceof Bloggeraccount)) {
            return false;
        }
        Bloggeraccount other = (Bloggeraccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Bloggeraccount[ id=" + id + " ]";
    }
    
}
