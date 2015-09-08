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
@Table(name = "affiliates", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Affiliates.findAll", query = "SELECT a FROM Affiliates a")})
public class Affiliates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Basic(optional = false)
    @Lob
    @Column(name = "FriendUserId")
    private byte[] friendUserId;
    @Basic(optional = false)
    @Column(name = "AffiliateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date affiliateDate;
    @Column(name = "Amount")
    private String amount;

    public Affiliates() {
    }

    public Affiliates(byte[] id) {
        this.id = id;
    }

    public Affiliates(byte[] id, byte[] userId, byte[] friendUserId, Date affiliateDate) {
        this.id = id;
        this.userId = userId;
        this.friendUserId = friendUserId;
        this.affiliateDate = affiliateDate;
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

    public byte[] getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(byte[] friendUserId) {
        this.friendUserId = friendUserId;
    }

    public Date getAffiliateDate() {
        return affiliateDate;
    }

    public void setAffiliateDate(Date affiliateDate) {
        this.affiliateDate = affiliateDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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
        if (!(object instanceof Affiliates)) {
            return false;
        }
        Affiliates other = (Affiliates) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Affiliates[ id=" + id + " ]";
    }
    
}
