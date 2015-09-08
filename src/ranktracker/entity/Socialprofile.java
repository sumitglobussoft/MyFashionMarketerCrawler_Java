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
@Table(name = "socialprofile", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Socialprofile.findAll", query = "SELECT s FROM Socialprofile s")})
public class Socialprofile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "ProfileType")
    private String profileType;
    @Column(name = "ProfileDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date profileDate;
    @Column(name = "ProfileStatus")
    private Boolean profileStatus;

    public Socialprofile() {
    }

    public Socialprofile(byte[] id) {
        this.id = id;
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

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getProfileType() {
        return profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    public Date getProfileDate() {
        return profileDate;
    }

    public void setProfileDate(Date profileDate) {
        this.profileDate = profileDate;
    }

    public Boolean getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(Boolean profileStatus) {
        this.profileStatus = profileStatus;
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
        if (!(object instanceof Socialprofile)) {
            return false;
        }
        Socialprofile other = (Socialprofile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Socialprofile[ id=" + id + " ]";
    }
    
}
