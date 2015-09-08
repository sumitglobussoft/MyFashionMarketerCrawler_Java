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
@Table(name = "newsletter", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Newsletter.findAll", query = "SELECT n FROM Newsletter n")})
public class Newsletter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Lob
    @Column(name = "NewsLetterBody")
    private String newsLetterBody;
    @Basic(optional = false)
    @Column(name = "Subject")
    private String subject;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Column(name = "SendStatus")
    private Boolean sendStatus;
    @Basic(optional = false)
    @Column(name = "SendDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Newsletter() {
    }

    public Newsletter(byte[] id) {
        this.id = id;
    }

    public Newsletter(byte[] id, String newsLetterBody, String subject, byte[] userId, Date sendDate) {
        this.id = id;
        this.newsLetterBody = newsLetterBody;
        this.subject = subject;
        this.userId = userId;
        this.sendDate = sendDate;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getNewsLetterBody() {
        return newsLetterBody;
    }

    public void setNewsLetterBody(String newsLetterBody) {
        this.newsLetterBody = newsLetterBody;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public Boolean getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Boolean sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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
        if (!(object instanceof Newsletter)) {
            return false;
        }
        Newsletter other = (Newsletter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Newsletter[ id=" + id + " ]";
    }
    
}
