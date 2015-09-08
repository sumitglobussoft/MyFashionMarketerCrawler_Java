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
@Table(name = "feedsentimentalanalysis", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Feedsentimentalanalysis.findAll", query = "SELECT f FROM Feedsentimentalanalysis f")})
public class Feedsentimentalanalysis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Lob
    @Column(name = "AssigneUserId")
    private byte[] assigneUserId;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "FeedId")
    private String feedId;
    @Column(name = "Positive")
    private String positive;
    @Column(name = "Negative")
    private String negative;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "Network")
    private String network;
    @Basic(optional = false)
    @Column(name = "TicketNo")
    private int ticketNo;

    public Feedsentimentalanalysis() {
    }

    public Feedsentimentalanalysis(byte[] id) {
        this.id = id;
    }

    public Feedsentimentalanalysis(byte[] id, int ticketNo) {
        this.id = id;
        this.ticketNo = ticketNo;
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

    public byte[] getAssigneUserId() {
        return assigneUserId;
    }

    public void setAssigneUserId(byte[] assigneUserId) {
        this.assigneUserId = assigneUserId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public String getPositive() {
        return positive;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }

    public String getNegative() {
        return negative;
    }

    public void setNegative(String negative) {
        this.negative = negative;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
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
        if (!(object instanceof Feedsentimentalanalysis)) {
            return false;
        }
        Feedsentimentalanalysis other = (Feedsentimentalanalysis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Feedsentimentalanalysis[ id=" + id + " ]";
    }
    
}
