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
@Table(name = "boardtwitteraccount", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boardtwitteraccount.findAll", query = "SELECT b FROM Boardtwitteraccount b")})
public class Boardtwitteraccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Basic(optional = false)
    @Column(name = "ScreenName")
    private String screenName;
    @Basic(optional = false)
    @Column(name = "StatusCount")
    private String statusCount;
    @Basic(optional = false)
    @Column(name = "FriendsCount")
    private String friendsCount;
    @Basic(optional = false)
    @Column(name = "FollowersCount")
    private String followersCount;
    @Basic(optional = false)
    @Column(name = "FavouritesCount")
    private String favouritesCount;
    @Basic(optional = false)
    @Lob
    @Column(name = "BoardId")
    private byte[] boardId;
    @Basic(optional = false)
    @Column(name = "TwitterProfileId")
    private String twitterProfileId;
    @Basic(optional = false)
    @Column(name = "ProfileImageUrl")
    private String profileImageUrl;
    @Column(name = "Url")
    private String url;
    @Column(name = "Tweet")
    private String tweet;
    @Column(name = "PhotosVideos")
    private String photosVideos;
    @Column(name = "FollowingsCount")
    private String followingsCount;
    @Column(name = "EntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    public Boardtwitteraccount() {
    }

    public Boardtwitteraccount(byte[] id) {
        this.id = id;
    }

    public Boardtwitteraccount(byte[] id, String screenName, String statusCount, String friendsCount, String followersCount, String favouritesCount, byte[] boardId, String twitterProfileId, String profileImageUrl) {
        this.id = id;
        this.screenName = screenName;
        this.statusCount = statusCount;
        this.friendsCount = friendsCount;
        this.followersCount = followersCount;
        this.favouritesCount = favouritesCount;
        this.boardId = boardId;
        this.twitterProfileId = twitterProfileId;
        this.profileImageUrl = profileImageUrl;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getStatusCount() {
        return statusCount;
    }

    public void setStatusCount(String statusCount) {
        this.statusCount = statusCount;
    }

    public String getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(String friendsCount) {
        this.friendsCount = friendsCount;
    }

    public String getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(String followersCount) {
        this.followersCount = followersCount;
    }

    public String getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(String favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public byte[] getBoardId() {
        return boardId;
    }

    public void setBoardId(byte[] boardId) {
        this.boardId = boardId;
    }

    public String getTwitterProfileId() {
        return twitterProfileId;
    }

    public void setTwitterProfileId(String twitterProfileId) {
        this.twitterProfileId = twitterProfileId;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getPhotosVideos() {
        return photosVideos;
    }

    public void setPhotosVideos(String photosVideos) {
        this.photosVideos = photosVideos;
    }

    public String getFollowingsCount() {
        return followingsCount;
    }

    public void setFollowingsCount(String followingsCount) {
        this.followingsCount = followingsCount;
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
        if (!(object instanceof Boardtwitteraccount)) {
            return false;
        }
        Boardtwitteraccount other = (Boardtwitteraccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boardtwitteraccount[ id=" + id + " ]";
    }
    
}
