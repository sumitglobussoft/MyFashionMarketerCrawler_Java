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
@Table(name = "tasks", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t")})
public class Tasks implements Serializable {
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
    @Column(name = "TaskMessage")
    private String taskMessage;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Lob
    @Column(name = "AssignTaskTo")
    private byte[] assignTaskTo;
    @Column(name = "TaskStatus")
    private Boolean taskStatus;
    @Column(name = "AssignDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assignDate;
    @Column(name = "CompletionDate")
    private String completionDate;
    @Column(name = "ReadStatus")
    private Boolean readStatus;
    @Column(name = "TaskMessageDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taskMessageDate;

    public Tasks() {
    }

    public Tasks(byte[] id) {
        this.id = id;
    }

    public Tasks(byte[] id, byte[] groupId) {
        this.id = id;
        this.groupId = groupId;
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

    public String getTaskMessage() {
        return taskMessage;
    }

    public void setTaskMessage(String taskMessage) {
        this.taskMessage = taskMessage;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public byte[] getAssignTaskTo() {
        return assignTaskTo;
    }

    public void setAssignTaskTo(byte[] assignTaskTo) {
        this.assignTaskTo = assignTaskTo;
    }

    public Boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public Boolean getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    }

    public Date getTaskMessageDate() {
        return taskMessageDate;
    }

    public void setTaskMessageDate(Date taskMessageDate) {
        this.taskMessageDate = taskMessageDate;
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
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Tasks[ id=" + id + " ]";
    }
    
}
