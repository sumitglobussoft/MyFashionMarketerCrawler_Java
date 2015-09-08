/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranktracker.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author GLB-214
 */
@Entity
@Table(name = "replymessage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Replymessage.findAll", query = "SELECT r FROM Replymessage r")})
public class Replymessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "FromUserId")
    private String fromUserId;
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Basic(optional = false)
    @Lob
    @Column(name = "MessageId")
    private byte[] messageId;
    @Basic(optional = false)
    @Column(name = "Message")
    private String message;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;

    public Replymessage() {
    }

    public Replymessage(byte[] id) {
        this.id = id;
    }

    public Replymessage(byte[] id, String fromUserId, byte[] userId, byte[] messageId, String message, String type) {
        this.id = id;
        this.fromUserId = fromUserId;
        this.userId = userId;
        this.messageId = messageId;
        this.message = message;
        this.type = type;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public byte[] getMessageId() {
        return messageId;
    }

    public void setMessageId(byte[] messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if (!(object instanceof Replymessage)) {
            return false;
        }
        Replymessage other = (Replymessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Replymessage[ id=" + id + " ]";
    }
    
}
