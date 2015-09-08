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
@Table(name = "archivemessage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Archivemessage.findAll", query = "SELECT a FROM Archivemessage a")})
public class Archivemessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "SocialGroup")
    private String socialGroup;
    @Column(name = "ImgUrl")
    private String imgUrl;
    @Column(name = "ProfileId")
    private String profileId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "MessageId")
    private String messageId;
    @Lob
    @Column(name = "Message")
    private String message;
    @Column(name = "CreatedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    public Archivemessage() {
    }

    public Archivemessage(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getSocialGroup() {
        return socialGroup;
    }

    public void setSocialGroup(String socialGroup) {
        this.socialGroup = socialGroup;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
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
        if (!(object instanceof Archivemessage)) {
            return false;
        }
        Archivemessage other = (Archivemessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Archivemessage[ id=" + id + " ]";
    }
    
}
