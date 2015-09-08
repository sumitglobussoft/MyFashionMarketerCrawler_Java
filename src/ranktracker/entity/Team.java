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
@Table(name = "team", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Team.findAll", query = "SELECT t FROM Team t")})
public class Team implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "GroupId")
    private byte[] groupId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Basic(optional = false)
    @Column(name = "EmailId")
    private String emailId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "InviteDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inviteDate;
    @Column(name = "StatusUpdateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusUpdateDate;
    @Column(name = "InviteStatus")
    private Boolean inviteStatus;
    @Column(name = "AccessLevel")
    private String accessLevel;

    public Team() {
    }

    public Team(byte[] id) {
        this.id = id;
    }

    public Team(byte[] id, byte[] groupId, String emailId) {
        this.id = id;
        this.groupId = groupId;
        this.emailId = emailId;
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

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getInviteDate() {
        return inviteDate;
    }

    public void setInviteDate(Date inviteDate) {
        this.inviteDate = inviteDate;
    }

    public Date getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Date statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public Boolean getInviteStatus() {
        return inviteStatus;
    }

    public void setInviteStatus(Boolean inviteStatus) {
        this.inviteStatus = inviteStatus;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
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
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Team[ id=" + id + " ]";
    }
    
}
