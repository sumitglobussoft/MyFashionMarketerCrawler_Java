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
@Table(name = "drafts", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Drafts.findAll", query = "SELECT d FROM Drafts d")})
public class Drafts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "Message")
    private String message;
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Lob
    @Column(name = "GroupId")
    private byte[] groupId;

    public Drafts() {
    }

    public Drafts(byte[] id) {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public byte[] getGroupId() {
        return groupId;
    }

    public void setGroupId(byte[] groupId) {
        this.groupId = groupId;
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
        if (!(object instanceof Drafts)) {
            return false;
        }
        Drafts other = (Drafts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Drafts[ id=" + id + " ]";
    }
    
}
