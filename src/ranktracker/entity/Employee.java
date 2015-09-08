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
@Table(name = "employee", catalog = "myfashion", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")})
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "Employee_id")
    private byte[] employeeid;
    @Basic(optional = false)
    @Lob
    @Column(name = "Company_id")
    private byte[] companyid;
    @Column(name = "First_name")
    private String firstname;
    @Column(name = "Last_name")
    private String lastname;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone_no")
    private String phoneno;
    @Column(name = "Address")
    private String address;
    @Column(name = "Country_name")
    private String countryname;
    @Column(name = "City_name")
    private String cityname;

    public Employee() {
    }

    public Employee(byte[] employeeid) {
        this.employeeid = employeeid;
    }

    public Employee(byte[] employeeid, byte[] companyid) {
        this.employeeid = employeeid;
        this.companyid = companyid;
    }

    public byte[] getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(byte[] employeeid) {
        this.employeeid = employeeid;
    }

    public byte[] getCompanyid() {
        return companyid;
    }

    public void setCompanyid(byte[] companyid) {
        this.companyid = companyid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeid != null ? employeeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ranktracker.entity.Employee[ employeeid=" + employeeid + " ]";
    }
    
}
