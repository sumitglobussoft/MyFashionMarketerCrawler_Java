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
@Table(name = "facebookinsightstats", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Facebookinsightstats.findAll", query = "SELECT f FROM Facebookinsightstats f")})
public class Facebookinsightstats implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "FbUserId")
    private String fbUserId;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "AgeDiff")
    private String ageDiff;
    @Column(name = "Location")
    private String location;
    @Column(name = "PeopleCount")
    private Integer peopleCount;
    @Column(name = "StoriesCount")
    private Integer storiesCount;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "PageImpressionCount")
    private Integer pageImpressionCount;
    @Column(name = "CountDate")
    private String countDate;

    public Facebookinsightstats() {
    }

    public Facebookinsightstats(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFbUserId() {
        return fbUserId;
    }

    public void setFbUserId(String fbUserId) {
        this.fbUserId = fbUserId;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeDiff() {
        return ageDiff;
    }

    public void setAgeDiff(String ageDiff) {
        this.ageDiff = ageDiff;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Integer getStoriesCount() {
        return storiesCount;
    }

    public void setStoriesCount(Integer storiesCount) {
        this.storiesCount = storiesCount;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Integer getPageImpressionCount() {
        return pageImpressionCount;
    }

    public void setPageImpressionCount(Integer pageImpressionCount) {
        this.pageImpressionCount = pageImpressionCount;
    }

    public String getCountDate() {
        return countDate;
    }

    public void setCountDate(String countDate) {
        this.countDate = countDate;
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
        if (!(object instanceof Facebookinsightstats)) {
            return false;
        }
        Facebookinsightstats other = (Facebookinsightstats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Facebookinsightstats[ id=" + id + " ]";
    }
    
}
