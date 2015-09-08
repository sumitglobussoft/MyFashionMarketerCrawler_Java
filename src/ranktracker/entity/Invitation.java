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
@Table(name = "invitation", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Invitation.findAll", query = "SELECT i FROM Invitation i")})
public class Invitation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "SenderEmail")
    private String senderEmail;
    @Basic(optional = false)
    @Lob
    @Column(name = "SenderUserId")
    private byte[] senderUserId;
    @Column(name = "FriendEmail")
    private String friendEmail;
    @Basic(optional = false)
    @Lob
    @Column(name = "FriendUserId")
    private byte[] friendUserId;
    @Column(name = "InvitationCode")
    private String invitationCode;
    @Basic(optional = false)
    @Column(name = "Status")
    private short status;
    @Column(name = "SendInvitationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendInvitationDate;
    @Column(name = "AcceptInvitationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date acceptInvitationDate;

    public Invitation() {
    }

    public Invitation(byte[] id) {
        this.id = id;
    }

    public Invitation(byte[] id, byte[] senderUserId, byte[] friendUserId, short status) {
        this.id = id;
        this.senderUserId = senderUserId;
        this.friendUserId = friendUserId;
        this.status = status;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public byte[] getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(byte[] senderUserId) {
        this.senderUserId = senderUserId;
    }

    public String getFriendEmail() {
        return friendEmail;
    }

    public void setFriendEmail(String friendEmail) {
        this.friendEmail = friendEmail;
    }

    public byte[] getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(byte[] friendUserId) {
        this.friendUserId = friendUserId;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Date getSendInvitationDate() {
        return sendInvitationDate;
    }

    public void setSendInvitationDate(Date sendInvitationDate) {
        this.sendInvitationDate = sendInvitationDate;
    }

    public Date getAcceptInvitationDate() {
        return acceptInvitationDate;
    }

    public void setAcceptInvitationDate(Date acceptInvitationDate) {
        this.acceptInvitationDate = acceptInvitationDate;
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
        if (!(object instanceof Invitation)) {
            return false;
        }
        Invitation other = (Invitation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Invitation[ id=" + id + " ]";
    }
    
}
