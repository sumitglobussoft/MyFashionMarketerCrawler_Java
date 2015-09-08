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
@Table(name = "groupprofile", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Groupprofile.findAll", query = "SELECT g FROM Groupprofile g")})
public class Groupprofile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "GroupId")
    private byte[] groupId;
    @Column(name = "ProfileId")
    private String profileId;
    @Lob
    @Column(name = "GroupOwnerId")
    private byte[] groupOwnerId;
    @Column(name = "ProfileType")
    private String profileType;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Groupprofile() {
    }

    public Groupprofile(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getGroupId() {
        return groupId;
    }

    public void setGroupId(byte[] groupId) {
        this.groupId = groupId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public byte[] getGroupOwnerId() {
        return groupOwnerId;
    }

    public void setGroupOwnerId(byte[] groupOwnerId) {
        this.groupOwnerId = groupOwnerId;
    }

    public String getProfileType() {
        return profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
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
        if (!(object instanceof Groupprofile)) {
            return false;
        }
        Groupprofile other = (Groupprofile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Groupprofile[ id=" + id + " ]";
    }
    
}
