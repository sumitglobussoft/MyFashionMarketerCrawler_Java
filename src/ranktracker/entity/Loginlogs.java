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
@Table(name = "loginlogs", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Loginlogs.findAll", query = "SELECT l FROM Loginlogs l")})
public class Loginlogs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "LoginTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime;

    public Loginlogs() {
    }

    public Loginlogs(byte[] id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
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
        if (!(object instanceof Loginlogs)) {
            return false;
        }
        Loginlogs other = (Loginlogs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Loginlogs[ id=" + id + " ]";
    }
    
}
