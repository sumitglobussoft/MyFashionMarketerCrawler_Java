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
@Table(name = "boardinstagramaccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardinstagramaccount.findAll", query = "SELECT b FROM Boardinstagramaccount b")})
public class Boardinstagramaccount implements Serializable {
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
    @Column(name = "FollowedByCount")
    private String followedByCount;
    @Basic(optional = false)
    @Column(name = "FollowsCount")
    private String followsCount;
    @Basic(optional = false)
    @Lob
    @Column(name = "BoardId")
    private byte[] boardId;
    @Column(name = "ProfilePicUrl")
    private String profilePicUrl;
    @Column(name = "ProfileId")
    private String profileId;
    @Column(name = "Url")
    private String url;
    @Column(name = "Bio")
    private String bio;
    @Column(name = "Media")
    private String media;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Boardinstagramaccount() {
    }

    public Boardinstagramaccount(byte[] id) {
        this.id = id;
    }

    public Boardinstagramaccount(byte[] id, String userName, String followedByCount, String followsCount, byte[] boardId) {
        this.id = id;
        this.userName = userName;
        this.followedByCount = followedByCount;
        this.followsCount = followsCount;
        this.boardId = boardId;
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

    public String getFollowedByCount() {
        return followedByCount;
    }

    public void setFollowedByCount(String followedByCount) {
        this.followedByCount = followedByCount;
    }

    public String getFollowsCount() {
        return followsCount;
    }

    public void setFollowsCount(String followsCount) {
        this.followsCount = followsCount;
    }

    public byte[] getBoardId() {
        return boardId;
    }

    public void setBoardId(byte[] boardId) {
        this.boardId = boardId;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
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
        if (!(object instanceof Boardinstagramaccount)) {
            return false;
        }
        Boardinstagramaccount other = (Boardinstagramaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardinstagramaccount[ id=" + id + " ]";
    }
    
}
