/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranktracker.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author GLB-214
 */
@Entity
@Table(name = "boards", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boards.findAll", query = "SELECT b FROM Boards b")})
public class Boards implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "BoardId")
    private byte[] boardId;
    @Column(name = "BoardName")
    private String boardName;
    @Column(name = "Instagramprofileid")
    private String instagramprofileid;
    @Column(name = "Fbprofileid")
    private String fbprofileid;
    @Column(name = "Twitterprofileid")
    private String twitterprofileid;
    @Column(name = "Linkedinprofileid")
    private String linkedinprofileid;
    @Column(name = "Youtubeprofileid")
    private String youtubeprofileid;
    @Column(name = "Gplusprofileid")
    private String gplusprofileid;
    @Column(name = "Tumblrprofileid")
    private String tumblrprofileid;
    @Basic(optional = false)
    @Lob
    @Column(name = "UserId")
    private byte[] userId;

    public Boards() {
    }

    public Boards(byte[] boardId) {
        this.boardId = boardId;
    }

    public Boards(byte[] boardId, byte[] userId) {
        this.boardId = boardId;
        this.userId = userId;
    }

    public byte[] getBoardId() {
        return boardId;
    }

    public void setBoardId(byte[] boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getInstagramprofileid() {
        return instagramprofileid;
    }

    public void setInstagramprofileid(String instagramprofileid) {
        this.instagramprofileid = instagramprofileid;
    }

    public String getFbprofileid() {
        return fbprofileid;
    }

    public void setFbprofileid(String fbprofileid) {
        this.fbprofileid = fbprofileid;
    }

    public String getTwitterprofileid() {
        return twitterprofileid;
    }

    public void setTwitterprofileid(String twitterprofileid) {
        this.twitterprofileid = twitterprofileid;
    }

    public String getLinkedinprofileid() {
        return linkedinprofileid;
    }

    public void setLinkedinprofileid(String linkedinprofileid) {
        this.linkedinprofileid = linkedinprofileid;
    }

    public String getYoutubeprofileid() {
        return youtubeprofileid;
    }

    public void setYoutubeprofileid(String youtubeprofileid) {
        this.youtubeprofileid = youtubeprofileid;
    }

    public String getGplusprofileid() {
        return gplusprofileid;
    }

    public void setGplusprofileid(String gplusprofileid) {
        this.gplusprofileid = gplusprofileid;
    }

    public String getTumblrprofileid() {
        return tumblrprofileid;
    }

    public void setTumblrprofileid(String tumblrprofileid) {
        this.tumblrprofileid = tumblrprofileid;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (boardId != null ? boardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boards)) {
            return false;
        }
        Boards other = (Boards) object;
        if ((this.boardId == null && other.boardId != null) || (this.boardId != null && !this.boardId.equals(other.boardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Boards[ boardId=" + boardId + " ]";
    }
    
}
