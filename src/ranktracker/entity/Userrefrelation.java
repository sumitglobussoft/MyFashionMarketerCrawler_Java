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
@Table(name = "userrefrelation", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Userrefrelation.findAll", query = "SELECT u FROM Userrefrelation u")})
public class Userrefrelation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "ReferenceUserId")
    private byte[] referenceUserId;
    @Basic(optional = false)
    @Lob
    @Column(name = "RefereeUserId")
    private byte[] refereeUserId;
    @Column(name = "ReferenceUserEmail")
    private String referenceUserEmail;
    @Column(name = "RefereeUserEmail")
    private String refereeUserEmail;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "Status")
    private String status;

    public Userrefrelation() {
    }

    public Userrefrelation(byte[] id) {
        this.id = id;
    }

    public Userrefrelation(byte[] id, byte[] referenceUserId, byte[] refereeUserId) {
        this.id = id;
        this.referenceUserId = referenceUserId;
        this.refereeUserId = refereeUserId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getReferenceUserId() {
        return referenceUserId;
    }

    public void setReferenceUserId(byte[] referenceUserId) {
        this.referenceUserId = referenceUserId;
    }

    public byte[] getRefereeUserId() {
        return refereeUserId;
    }

    public void setRefereeUserId(byte[] refereeUserId) {
        this.refereeUserId = refereeUserId;
    }

    public String getReferenceUserEmail() {
        return referenceUserEmail;
    }

    public void setReferenceUserEmail(String referenceUserEmail) {
        this.referenceUserEmail = referenceUserEmail;
    }

    public String getRefereeUserEmail() {
        return refereeUserEmail;
    }

    public void setRefereeUserEmail(String refereeUserEmail) {
        this.refereeUserEmail = refereeUserEmail;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof Userrefrelation)) {
            return false;
        }
        Userrefrelation other = (Userrefrelation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Userrefrelation[ id=" + id + " ]";
    }
    
}
