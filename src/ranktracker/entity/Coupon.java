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
@Table(name = "coupon", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Coupon.findAll", query = "SELECT c FROM Coupon c")})
public class Coupon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "CouponCode")
    private String couponCode;
    @Column(name = "EntryCouponDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryCouponDate;
    @Column(name = "ExpCouponDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expCouponDate;
    @Column(name = "Status")
    private String status;

    public Coupon() {
    }

    public Coupon(byte[] id) {
        this.id = id;
    }

    public Coupon(byte[] id, String couponCode) {
        this.id = id;
        this.couponCode = couponCode;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Date getEntryCouponDate() {
        return entryCouponDate;
    }

    public void setEntryCouponDate(Date entryCouponDate) {
        this.entryCouponDate = entryCouponDate;
    }

    public Date getExpCouponDate() {
        return expCouponDate;
    }

    public void setExpCouponDate(Date expCouponDate) {
        this.expCouponDate = expCouponDate;
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
        if (!(object instanceof Coupon)) {
            return false;
        }
        Coupon other = (Coupon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Coupon[ id=" + id + " ]";
    }
    
}
