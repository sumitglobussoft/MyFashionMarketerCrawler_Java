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
@Table(name = "twitterfeed", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Twitterfeed.findAll", query = "SELECT t FROM Twitterfeed t")})
public class Twitterfeed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "TwitterFeed")
    private String twitterFeed;
    @Column(name = "FeedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feedDate;
    @Column(name = "FromId")
    private String fromId;
    @Column(name = "FromName")
    private String fromName;
    @Column(name = "FromProfileUrl")
    private String fromProfileUrl;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "ProfileId")
    private String profileId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Type")
    private String type;
    @Column(name = "ScreenName")
    private String screenName;
    @Column(name = "MessageId")
    private String messageId;
    @Column(name = "SourceUrl")
    private String sourceUrl;
    @Column(name = "InReplyToStatusUserId")
    private String inReplyToStatusUserId;
    @Column(name = "FromScreenName")
    private String fromScreenName;

    public Twitterfeed() {
    }

    public Twitterfeed(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getTwitterFeed() {
        return twitterFeed;
    }

    public void setTwitterFeed(String twitterFeed) {
        this.twitterFeed = twitterFeed;
    }

    public Date getFeedDate() {
        return feedDate;
    }

    public void setFeedDate(Date feedDate) {
        this.feedDate = feedDate;
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

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Twitterfeed)) {
            return false;
        }
        Twitterfeed other = (Twitterfeed) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Twitterfeed[ id=" + id + " ]";
    }
    
}
