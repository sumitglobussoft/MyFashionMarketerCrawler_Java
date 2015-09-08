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
@Table(name = "twittermessage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Twittermessage.findAll", query = "SELECT t FROM Twittermessage t")})
public class Twittermessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "TwitterMessage")
    private String twitterMessage;
    @Column(name = "MessageDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messageDate;
    @Column(name = "MessageId")
    private String messageId;
    @Column(name = "FromName")
    private String fromName;
    @Column(name = "FromId")
    private String fromId;
    @Column(name = "FromProfileUrl")
    private String fromProfileUrl;
    @Column(name = "ProfileId")
    private String profileId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Type")
    private String type;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "ScreenName")
    private String screenName;
    @Column(name = "SourceUrl")
    private String sourceUrl;
    @Column(name = "InReplyToStatusUserId")
    private String inReplyToStatusUserId;
    @Column(name = "FromScreenName")
    private String fromScreenName;
    @Column(name = "IsArchived")
    private Integer isArchived;
    @Column(name = "ReadStatus")
    private Integer readStatus;

    public Twittermessage() {
    }

    public Twittermessage(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getTwitterMessage() {
        return twitterMessage;
    }

    public void setTwitterMessage(String twitterMessage) {
        this.twitterMessage = twitterMessage;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromProfileUrl() {
        return fromProfileUrl;
    }

    public void setFromProfileUrl(String fromProfileUrl) {
        this.fromProfileUrl = fromProfileUrl;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getInReplyToStatusUserId() {
        return inReplyToStatusUserId;
    }

    public void setInReplyToStatusUserId(String inReplyToStatusUserId) {
        this.inReplyToStatusUserId = inReplyToStatusUserId;
    }

    public String getFromScreenName() {
        return fromScreenName;
    }

    public void setFromScreenName(String fromScreenName) {
        this.fromScreenName = fromScreenName;
    }

    public Integer getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(Integer isArchived) {
        this.isArchived = isArchived;
    }

    public Integer getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
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
        if (!(object instanceof Twittermessage)) {
            return false;
        }
        Twittermessage other = (Twittermessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Twittermessage[ id=" + id + " ]";
    }
    
}
