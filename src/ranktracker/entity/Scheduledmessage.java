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
@Table(name = "scheduledmessage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Scheduledmessage.findAll", query = "SELECT s FROM Scheduledmessage s")})
public class Scheduledmessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "ShareMessage")
    private String shareMessage;
    @Column(name = "ClientTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clientTime;
    @Column(name = "ScheduleTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduleTime;
    @Column(name = "CreateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "Status")
    private Boolean status;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "ProfileType")
    private String profileType;
    @Column(name = "PicUrl")
    private String picUrl;
    @Column(name = "ProfileId")
    private String profileId;

    public Scheduledmessage() {
    }

    public Scheduledmessage(byte[] id) {
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

    public Date getClientTime() {
        return clientTime;
    }

    public void setClientTime(Date clientTime) {
        this.clientTime = clientTime;
    }

    public Date getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getProfileType() {
        return profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
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
        if (!(object instanceof Scheduledmessage)) {
            return false;
        }
        Scheduledmessage other = (Scheduledmessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Scheduledmessage[ id=" + id + " ]";
    }
    
}
