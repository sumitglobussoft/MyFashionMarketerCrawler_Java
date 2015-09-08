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
@Table(name = "facebookmessage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Facebookmessage.findAll", query = "SELECT f FROM Facebookmessage f")})
public class Facebookmessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "Message")
    private String message;
    @Column(name = "MessageDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messageDate;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "FromId")
    private String fromId;
    @Column(name = "FromName")
    private String fromName;
    @Column(name = "FromProfileUrl")
    private String fromProfileUrl;
    @Column(name = "FbComment")
    private String fbComment;
    @Column(name = "FbLike")
    private String fbLike;
    @Column(name = "MessageId")
    private String messageId;
    @Column(name = "Type")
    private String type;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Picture")
    private String picture;
    @Column(name = "IsArchived")
    private Integer isArchived;

    public Facebookmessage() {
    }

    public Facebookmessage(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromProfileUrl() {
        return fromProfileUrl;
    }

    public void setFromProfileUrl(String fromProfileUrl) {
        this.fromProfileUrl = fromProfileUrl;
    }

    public String getFbComment() {
        return fbComment;
    }

    public void setFbComment(String fbComment) {
        this.fbComment = fbComment;
    }

    public String getFbLike() {
        return fbLike;
    }

    public void setFbLike(String fbLike) {
        this.fbLike = fbLike;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(Integer isArchived) {
        this.isArchived = isArchived;
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
        if (!(object instanceof Facebookmessage)) {
            return false;
        }
        Facebookmessage other = (Facebookmessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Facebookmessage[ id=" + id + " ]";
    }
    
}
