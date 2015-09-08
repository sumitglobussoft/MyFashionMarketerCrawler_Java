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
@Table(name = "facebookstats", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Facebookstats.findAll", query = "SELECT f FROM Facebookstats f")})
public class Facebookstats implements Serializable {
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
    @Column(name = "MaleCount")
    private Integer maleCount;
    @Column(name = "FemaleCount")
    private Integer femaleCount;
    @Column(name = "ReachCount")
    private Integer reachCount;
    @Column(name = "PeopleTalkingCount")
    private Integer peopleTalkingCount;
    @Column(name = "LikeCount")
    private Integer likeCount;
    @Column(name = "CommentCount")
    private Integer commentCount;
    @Column(name = "ShareCount")
    private Integer shareCount;
    @Column(name = "FanCount")
    private Integer fanCount;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Facebookstats() {
    }

    public Facebookstats(byte[] id) {
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

    public Integer getMaleCount() {
        return maleCount;
    }

    public void setMaleCount(Integer maleCount) {
        this.maleCount = maleCount;
    }

    public Integer getFemaleCount() {
        return femaleCount;
    }

    public void setFemaleCount(Integer femaleCount) {
        this.femaleCount = femaleCount;
    }

    public Integer getReachCount() {
        return reachCount;
    }

    public void setReachCount(Integer reachCount) {
        this.reachCount = reachCount;
    }

    public Integer getPeopleTalkingCount() {
        return peopleTalkingCount;
    }

    public void setPeopleTalkingCount(Integer peopleTalkingCount) {
        this.peopleTalkingCount = peopleTalkingCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getFanCount() {
        return fanCount;
    }

    public void setFanCount(Integer fanCount) {
        this.fanCount = fanCount;
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
        if (!(object instanceof Facebookstats)) {
            return false;
        }
        Facebookstats other = (Facebookstats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Facebookstats[ id=" + id + " ]";
    }
    
}
