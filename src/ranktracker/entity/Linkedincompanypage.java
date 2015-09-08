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
@Table(name = "linkedincompanypage", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Linkedincompanypage.findAll", query = "SELECT l FROM Linkedincompanypage l")})
public class Linkedincompanypage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Id")
    private byte[] id;
    @Column(name = "LinkedinPageId")
    private String linkedinPageId;
    @Column(name = "LinkedinPageName")
    private String linkedinPageName;
    @Column(name = "EmailDomains")
    private String emailDomains;
    @Column(name = "OAuthToken")
    private String oAuthToken;
    @Column(name = "OAuthSecret")
    private String oAuthSecret;
    @Column(name = "OAuthVerifier")
    private String oAuthVerifier;
    @Lob
    @Column(name = "UserId")
    private byte[] userId;
    @Lob
    @Column(name = "Description")
    private String description;
    @Column(name = "FoundedYear")
    private String foundedYear;
    @Column(name = "EndYear")
    private String endYear;
    @Column(name = "Locations")
    private String locations;
    @Column(name = "Specialties")
    private String specialties;
    @Column(name = "WebsiteUrl")
    private String websiteUrl;
    @Column(name = "Status")
    private String status;
    @Column(name = "EmployeeCountRange")
    private String employeeCountRange;
    @Column(name = "Industries")
    private String industries;
    @Column(name = "CompanyType")
    private String companyType;
    @Column(name = "LogoUrl")
    private String logoUrl;
    @Column(name = "SquareLogoUrl")
    private String squareLogoUrl;
    @Column(name = "BlogRssUrl")
    private String blogRssUrl;
    @Column(name = "UniversalName")
    private String universalName;
    @Column(name = "NumFollowers")
    private Integer numFollowers;

    public Linkedincompanypage() {
    }

    public Linkedincompanypage(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getLinkedinPageId() {
        return linkedinPageId;
    }

    public void setLinkedinPageId(String linkedinPageId) {
        this.linkedinPageId = linkedinPageId;
    }

    public String getLinkedinPageName() {
        return linkedinPageName;
    }

    public void setLinkedinPageName(String linkedinPageName) {
        this.linkedinPageName = linkedinPageName;
    }

    public String getEmailDomains() {
        return emailDomains;
    }

    public void setEmailDomains(String emailDomains) {
        this.emailDomains = emailDomains;
    }

    public String getOAuthToken() {
        return oAuthToken;
    }

    public void setOAuthToken(String oAuthToken) {
        this.oAuthToken = oAuthToken;
    }

    public String getOAuthSecret() {
        return oAuthSecret;
    }

    public void setOAuthSecret(String oAuthSecret) {
        this.oAuthSecret = oAuthSecret;
    }

    public String getOAuthVerifier() {
        return oAuthVerifier;
    }

    public void setOAuthVerifier(String oAuthVerifier) {
        this.oAuthVerifier = oAuthVerifier;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployeeCountRange() {
        return employeeCountRange;
    }

    public void setEmployeeCountRange(String employeeCountRange) {
        this.employeeCountRange = employeeCountRange;
    }

    public String getIndustries() {
        return industries;
    }

    public void setIndustries(String industries) {
        this.industries = industries;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getSquareLogoUrl() {
        return squareLogoUrl;
    }

    public void setSquareLogoUrl(String squareLogoUrl) {
        this.squareLogoUrl = squareLogoUrl;
    }

    public String getBlogRssUrl() {
        return blogRssUrl;
    }

    public void setBlogRssUrl(String blogRssUrl) {
        this.blogRssUrl = blogRssUrl;
    }

    public String getUniversalName() {
        return universalName;
    }

    public void setUniversalName(String universalName) {
        this.universalName = universalName;
    }

    public Integer getNumFollowers() {
        return numFollowers;
    }

    public void setNumFollowers(Integer numFollowers) {
        this.numFollowers = numFollowers;
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
        if (!(object instanceof Linkedincompanypage)) {
            return false;
        }
        Linkedincompanypage other = (Linkedincompanypage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Linkedincompanypage[ id=" + id + " ]";
    }
    
}
