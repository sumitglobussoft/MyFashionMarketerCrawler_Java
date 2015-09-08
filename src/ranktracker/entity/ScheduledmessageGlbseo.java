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
@Table(name = "scheduledmessage_glbseo", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "ScheduledmessageGlbseo.findAll", query = "SELECT s FROM ScheduledmessageGlbseo s")})
public class ScheduledmessageGlbseo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "ShareMessage")
    private String shareMessage;
    @Column(name = "Status")
    private Boolean status;
    @Column(name = "ProfileType")
    private String profileType;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "AccessToken")
    private String accessToken;

    public ScheduledmessageGlbseo() {
    }

    public ScheduledmessageGlbseo(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getShareMessage() {
        return shareMessage;
    }

    public void setShareMessage(String shareMessage) {
        this.shareMessage = shareMessage;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getProfileType() {
        return profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
        if (!(object instanceof ScheduledmessageGlbseo)) {
            return false;
        }
        ScheduledmessageGlbseo other = (ScheduledmessageGlbseo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.ScheduledmessageGlbseo[ id=" + id + " ]";
    }
    
}
