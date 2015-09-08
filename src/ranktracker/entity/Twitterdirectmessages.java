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
@Table(name = "twitterdirectmessages", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Twitterdirectmessages.findAll", query = "SELECT t FROM Twitterdirectmessages t")})
public class Twitterdirectmessages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "RecipientId")
    private String recipientId;
    @Column(name = "RecipientProfileUrl")
    private String recipientProfileUrl;
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "Message")
    private String message;
    @Column(name = "RecipientScreenName")
    private String recipientScreenName;
    @Column(name = "SenderId")
    private String senderId;
    @Column(name = "SenderScreenName")
    private String senderScreenName;
    @Column(name = "SenderProfileUrl")
    private String senderProfileUrl;
    @Column(name = "Type")
    private String type;
    @Column(name = "MessageId")
    private String messageId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Image")
    private String image;

    public Twitterdirectmessages() {
    }

    public Twitterdirectmessages(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientProfileUrl() {
        return recipientProfileUrl;
    }

    public void setRecipientProfileUrl(String recipientProfileUrl) {
        this.recipientProfileUrl = recipientProfileUrl;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipientScreenName() {
        return recipientScreenName;
    }

    public void setRecipientScreenName(String recipientScreenName) {
        this.recipientScreenName = recipientScreenName;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderScreenName() {
        return senderScreenName;
    }

    public void setSenderScreenName(String senderScreenName) {
        this.senderScreenName = senderScreenName;
    }

    public String getSenderProfileUrl() {
        return senderProfileUrl;
    }

    public void setSenderProfileUrl(String senderProfileUrl) {
        this.senderProfileUrl = senderProfileUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
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
        if (!(object instanceof Twitterdirectmessages)) {
            return false;
        }
        Twitterdirectmessages other = (Twitterdirectmessages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Twitterdirectmessages[ id=" + id + " ]";
    }
    
}
