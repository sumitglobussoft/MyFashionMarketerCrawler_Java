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
@Table(name = "boardgplusaccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardgplusaccount.findAll", query = "SELECT b FROM Boardgplusaccount b")})
public class Boardgplusaccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "PageId")
    private String pageId;
    @Column(name = "CircledByCount")
    private String circledByCount;
    @Column(name = "PlusOneCount")
    private String plusOneCount;
    @Column(name = "DisplayName")
    private String displayName;
    @Basic(optional = false)
    @Lob
    @Column(name = "BoardId")
    private byte[] boardId;
    @Column(name = "Nickname")
    private String nickname;
    @Column(name = "AboutMe")
    private String aboutMe;
    @Column(name = "PageUrl")
    private String pageUrl;
    @Column(name = "ProfileImageUrl")
    private String profileImageUrl;
    @Column(name = "Tagline")
    private String tagline;
    @Column(name = "CoverPhotoUrl")
    private String coverPhotoUrl;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Boardgplusaccount() {
    }

    public Boardgplusaccount(byte[] id) {
        this.id = id;
    }

    public Boardgplusaccount(byte[] id, String pageId, byte[] boardId) {
        this.id = id;
        this.pageId = pageId;
        this.boardId = boardId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getCircledByCount() {
        return circledByCount;
    }

    public void setCircledByCount(String circledByCount) {
        this.circledByCount = circledByCount;
    }

    public String getPlusOneCount() {
        return plusOneCount;
    }

    public void setPlusOneCount(String plusOneCount) {
        this.plusOneCount = plusOneCount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public byte[] getBoardId() {
        return boardId;
    }

    public void setBoardId(byte[] boardId) {
        this.boardId = boardId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
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
        if (!(object instanceof Boardgplusaccount)) {
            return false;
        }
        Boardgplusaccount other = (Boardgplusaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardgplusaccount[ id=" + id + " ]";
    }
    
}
