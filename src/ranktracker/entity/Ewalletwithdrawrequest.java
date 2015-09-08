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
@Table(name = "ewalletwithdrawrequest", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ewalletwithdrawrequest.findAll", query = "SELECT e FROM Ewalletwithdrawrequest e")})
public class Ewalletwithdrawrequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "UserEmail")
    private String userEmail;
    @Basic(optional = false)
    @Column(name = "WithdrawAmount")
    private String withdrawAmount;
    @Basic(optional = false)
    @Column(name = "PaymentMethod")
    private String paymentMethod;
    @Basic(optional = false)
    @Column(name = "PaypalEmail")
    private String paypalEmail;
    @Basic(optional = false)
    @Column(name = "IbanCode")
    private String ibanCode;
    @Basic(optional = false)
    @Column(name = "SwiftCode")
    private String swiftCode;
    @Basic(optional = false)
    @Column(name = "Other")
    private String other;
    @Basic(optional = false)
    @Column(name = "Status")
    private int status;
    @Basic(optional = false)
    @Column(name = "RequestDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserID")
    private byte[] userID;

    public Ewalletwithdrawrequest() {
    }

    public Ewalletwithdrawrequest(byte[] id) {
        this.id = id;
    }

    public Ewalletwithdrawrequest(byte[] id, String userName, String userEmail, String withdrawAmount, String paymentMethod, String paypalEmail, String ibanCode, String swiftCode, String other, int status, Date requestDate, byte[] userID) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.withdrawAmount = withdrawAmount;
        this.paymentMethod = paymentMethod;
        this.paypalEmail = paypalEmail;
        this.ibanCode = ibanCode;
        this.swiftCode = swiftCode;
        this.other = other;
        this.status = status;
        this.requestDate = requestDate;
        this.userID = userID;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(String withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaypalEmail() {
        return paypalEmail;
    }

    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    public String getIbanCode() {
        return ibanCode;
    }

    public void setIbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public byte[] getUserID() {
        return userID;
    }

    public void setUserID(byte[] userID) {
        this.userID = userID;
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
        if (!(object instanceof Ewalletwithdrawrequest)) {
            return false;
        }
        Ewalletwithdrawrequest other = (Ewalletwithdrawrequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Ewalletwithdrawrequest[ id=" + id + " ]";
    }
    
}
