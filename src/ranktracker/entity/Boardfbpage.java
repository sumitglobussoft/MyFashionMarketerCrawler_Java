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
@Table(name = "boardfbpage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardfbpage.findAll", query = "SELECT b FROM Boardfbpage b")})
public class Boardfbpage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "FbPageId")
    private String fbPageId;
    @Column(name = "TalkingAboutCount")
    private String talkingAboutCount;
    @Column(name = "Likes")
    private String likes;
    @Column(name = "Checkins")
    private String checkins;
    @Basic(optional = false)
    @Column(name = "fbPageName")
    private String fbPageName;
    @Column(name = "ProfileImageUrl")
    private String profileImageUrl;
    @Basic(optional = false)
    @Lob
    @Column(name = "BoardId")
    private byte[] boardId;
    @Column(name = "PageUrl")
    private String pageUrl;
    @Column(name = "Country")
    private String country;
    @Column(name = "City")
    private String city;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Website")
    private String website;
    @Column(name = "Founded")
    private String founded;
    @Column(name = "Mission")
    private String mission;
    @Column(name = "Description")
    private String description;
    @Column(name = "About")
    private String about;
    @Column(name = "Companyname")
    private String companyname;
    @Column(name = "Entrydate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entrydate;

    public Boardfbpage() {
    }

    public Boardfbpage(byte[] id) {
        this.id = id;
    }

    public Boardfbpage(byte[] id, String fbPageId, String fbPageName, byte[] boardId) {
        this.id = id;
        this.fbPageId = fbPageId;
        this.fbPageName = fbPageName;
        this.boardId = boardId;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getFbPageId() {
        return fbPageId;
    }

    public void setFbPageId(String fbPageId) {
        this.fbPageId = fbPageId;
    }

    public String getTalkingAboutCount() {
        return talkingAboutCount;
    }

    public void setTalkingAboutCount(String talkingAboutCount) {
        this.talkingAboutCount = talkingAboutCount;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getCheckins() {
        return checkins;
    }

    public void setCheckins(String checkins) {
        this.checkins = checkins;
    }

    public String getFbPageName() {
        return fbPageName;
    }

    public void setFbPageName(String fbPageName) {
        this.fbPageName = fbPageName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public byte[] getBoardId() {
        return boardId;
    }

    public void setBoardId(byte[] boardId) {
        this.boardId = boardId;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
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
        if (!(object instanceof Boardfbpage)) {
            return false;
        }
        Boardfbpage other = (Boardfbpage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardfbpage[ id=" + id + " ]";
    }
    
}
