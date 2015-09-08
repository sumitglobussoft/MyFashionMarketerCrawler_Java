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
@Table(name = "facebookinboxmessage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Facebookinboxmessage.findAll", query = "SELECT f FROM Facebookinboxmessage f")})
public class Facebookinboxmessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "Message")
    private String message;
    @Column(name = "MessageId")
    private String messageId;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "FromId")
    private String fromId;
    @Column(name = "FromName")
    private String fromName;
    @Column(name = "FromImageUrl")
    private String fromImageUrl;
    @Column(name = "RecipientId")
    private String recipientId;
    @Column(name = "RecipientName")
    private String recipientName;
    @Column(name = "RecipientImageUrl")
    private String recipientImageUrl;
    @Column(name = "CreatedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "EntryTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTime;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Image")
    private String image;

    public Facebookinboxmessage() {
    }

    public Facebookinboxmessage(byte[] id) {
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

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
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

    public String getFromImageUrl() {
        return fromImageUrl;
    }

    public void setFromImageUrl(String fromImageUrl) {
        this.fromImageUrl = fromImageUrl;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientImageUrl() {
        return recipientImageUrl;
    }

    public void setRecipientImageUrl(String recipientImageUrl) {
        this.recipientImageUrl = recipientImageUrl;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        if (!(object instanceof Facebookinboxmessage)) {
            return false;
        }
        Facebookinboxmessage other = (Facebookinboxmessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Facebookinboxmessage[ id=" + id + " ]";
    }
    
}
