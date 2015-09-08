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
@Table(name = "teammemberprofile", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Teammemberprofile.findAll", query = "SELECT t FROM Teammemberprofile t")})
public class Teammemberprofile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "TeamId")
    private byte[] teamId;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "ProfileType")
    private String profileType;
    @Column(name = "Status")
    private Boolean status;
    @Column(name = "StatusUpdateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusUpdateDate;
    @Column(name = "ProfilePicUrl")
    private String profilePicUrl;
    @Column(name = "ProfileName")
    private String profileName;

    public Teammemberprofile() {
    }

    public Teammemberprofile(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getTeamId() {
        return teamId;
    }

    public void setTeamId(byte[] teamId) {
        this.teamId = teamId;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Date statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
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
        if (!(object instanceof Teammemberprofile)) {
            return false;
        }
        Teammemberprofile other = (Teammemberprofile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Teammemberprofile[ id=" + id + " ]";
    }
    
}
