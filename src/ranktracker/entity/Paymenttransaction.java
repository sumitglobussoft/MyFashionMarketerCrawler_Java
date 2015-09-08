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
@Table(name = "paymenttransaction", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paymenttransaction.findAll", query = "SELECT p FROM Paymenttransaction p")})
public class Paymenttransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "PayPalTransactionId")
    private String payPalTransactionId;
    @Column(name = "AmountPaid")
    private String amountPaid;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "PaymentDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;
    @Column(name = "PaymentStatus")
    private String paymentStatus;
    @Column(name = "PayerId")
    private String payerId;
    @Column(name = "ReceiverId")
    private String receiverId;
    @Column(name = "PayerEmail")
    private String payerEmail;
    @Column(name = "PaypalPaymentDate")
    private String paypalPaymentDate;
    @Column(name = "IPNTrackId")
    private String iPNTrackId;
    @Column(name = "VersionType")
    private String versionType;
    @Lob
    @Column(name = "DetailsInfo")
    private String detailsInfo;

    public Paymenttransaction() {
    }

    public Paymenttransaction(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getPayPalTransactionId() {
        return payPalTransactionId;
    }

    public void setPayPalTransactionId(String payPalTransactionId) {
        this.payPalTransactionId = payPalTransactionId;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    public String getPaypalPaymentDate() {
        return paypalPaymentDate;
    }

    public void setPaypalPaymentDate(String paypalPaymentDate) {
        this.paypalPaymentDate = paypalPaymentDate;
    }

    public String getIPNTrackId() {
        return iPNTrackId;
    }

    public void setIPNTrackId(String iPNTrackId) {
        this.iPNTrackId = iPNTrackId;
    }

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public String getDetailsInfo() {
        return detailsInfo;
    }

    public void setDetailsInfo(String detailsInfo) {
        this.detailsInfo = detailsInfo;
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
        if (!(object instanceof Paymenttransaction)) {
            return false;
        }
        Paymenttransaction other = (Paymenttransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Paymenttransaction[ id=" + id + " ]";
    }
    
}
