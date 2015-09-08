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
@Table(name = "usergroup", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usergroup.findAll", query = "SELECT u FROM Usergroup u")})
public class Usergroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Basic(optional = false)
    @Column(name = "UserEmail")
    private String userEmail;
    @Basic(optional = false)
    @Column(name = "GroupName")
    private String groupName;
    @Basic(optional = false)
    @Lob
    @Column(name = "GroupId")
    private byte[] groupId;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Usergroup() {
    }

    public Usergroup(byte[] id) {
        this.id = id;
    }

    public Usergroup(byte[] id, byte[] userId, String userEmail, String groupName, byte[] groupId) {
        this.id = id;
        this.userId = userId;
        this.userEmail = userEmail;
        this.groupName = groupName;
        this.groupId = groupId;
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public byte[] getGroupId() {
        return groupId;
    }

    public void setGroupId(byte[] groupId) {
        this.groupId = groupId;
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
        if (!(object instanceof Usergroup)) {
            return false;
        }
        Usergroup other = (Usergroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Usergroup[ id=" + id + " ]";
    }
    
}
