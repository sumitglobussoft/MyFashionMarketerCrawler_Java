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
@Table(name = "googleplusactivities", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Googleplusactivities.findAll", query = "SELECT g FROM Googleplusactivities g")})
public class Googleplusactivities implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "ActivityId")
    private String activityId;
    @Column(name = "GpUserId")
    private String gpUserId;
    @Column(name = "Title")
    private String title;
    @Column(name = "ActivityUrl")
    private String activityUrl;
    @Column(name = "FromId")
    private String fromId;
    @Column(name = "FromUserName")
    private String fromUserName;
    @Column(name = "FromProfileImage")
    private String fromProfileImage;
    @Column(name = "Content")
    private String content;
    @Column(name = "RepliesCount")
    private Integer repliesCount;
    @Column(name = "PlusonersCount")
    private Integer plusonersCount;
    @Column(name = "ResharersCount")
    private Integer resharersCount;
    @Column(name = "PublishedDate")
    private String publishedDate;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Googleplusactivities() {
    }

    public Googleplusactivities(byte[] id) {
        this.id = id;
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

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getGpUserId() {
        return gpUserId;
    }

    public void setGpUserId(String gpUserId) {
        this.gpUserId = gpUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getFromProfileImage() {
        return fromProfileImage;
    }

    public void setFromProfileImage(String fromProfileImage) {
        this.fromProfileImage = fromProfileImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRepliesCount() {
        return repliesCount;
    }

    public void setRepliesCount(Integer repliesCount) {
        this.repliesCount = repliesCount;
    }

    public Integer getPlusonersCount() {
        return plusonersCount;
    }

    public void setPlusonersCount(Integer plusonersCount) {
        this.plusonersCount = plusonersCount;
    }

    public Integer getResharersCount() {
        return resharersCount;
    }

    public void setResharersCount(Integer resharersCount) {
        this.resharersCount = resharersCount;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
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
        if (!(object instanceof Googleplusactivities)) {
            return false;
        }
        Googleplusactivities other = (Googleplusactivities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Googleplusactivities[ id=" + id + " ]";
    }
    
}
