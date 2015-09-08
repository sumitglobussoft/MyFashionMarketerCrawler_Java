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
@Table(name = "googleanalyticsstats", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Googleanalyticsstats.findAll", query = "SELECT g FROM Googleanalyticsstats g")})
public class Googleanalyticsstats implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "GaAccountId")
    private String gaAccountId;
    @Column(name = "GaProfileId")
    private String gaProfileId;
    @Column(name = "gaDate")
    private String gaDate;
    @Column(name = "gaMonth")
    private String gaMonth;
    @Column(name = "gaYear")
    private String gaYear;
    @Column(name = "gaCountry")
    private String gaCountry;
    @Column(name = "gaRegion")
    private String gaRegion;
    @Column(name = "gaVisits")
    private String gaVisits;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;

    public Googleanalyticsstats() {
    }

    public Googleanalyticsstats(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getGaAccountId() {
        return gaAccountId;
    }

    public void setGaAccountId(String gaAccountId) {
        this.gaAccountId = gaAccountId;
    }

    public String getGaProfileId() {
        return gaProfileId;
    }

    public void setGaProfileId(String gaProfileId) {
        this.gaProfileId = gaProfileId;
    }

    public String getGaDate() {
        return gaDate;
    }

    public void setGaDate(String gaDate) {
        this.gaDate = gaDate;
    }

    public String getGaMonth() {
        return gaMonth;
    }

    public void setGaMonth(String gaMonth) {
        this.gaMonth = gaMonth;
    }

    public String getGaYear() {
        return gaYear;
    }

    public void setGaYear(String gaYear) {
        this.gaYear = gaYear;
    }

    public String getGaCountry() {
        return gaCountry;
    }

    public void setGaCountry(String gaCountry) {
        this.gaCountry = gaCountry;
    }

    public String getGaRegion() {
        return gaRegion;
    }

    public void setGaRegion(String gaRegion) {
        this.gaRegion = gaRegion;
    }

    public String getGaVisits() {
        return gaVisits;
    }

    public void setGaVisits(String gaVisits) {
        this.gaVisits = gaVisits;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
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
        if (!(object instanceof Googleanalyticsstats)) {
            return false;
        }
        Googleanalyticsstats other = (Googleanalyticsstats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Googleanalyticsstats[ id=" + id + " ]";
    }
    
}
