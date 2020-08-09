package com.enit.authentication.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String username;

    @NotBlank
    @Size(min = 6, max = 100)
    private String password;

    @Email
    @Size(max = 50)
    @NotBlank
    private String email;

    @ManyToMany
    @JoinTable(name="user_roles" , joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles =new HashSet<>();

    @NotBlank
    @Size(min = 3, max = 50)
    private String firstName;

    @NotBlank
    @Size(min = 3, max = 50)
    private String lastName;

    private Date signupDate;

    private String photoUrl;

    private String photoDirectory;

    private String dateOfBirth;

    private String phoneNumber;

    private String country;

    private String state;

    private String city;

    private String zipCode;

    private String address;

    private String gender;

    //	@ElementCollection
   // private List<String> preferences = new ArrayList<String>();

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhotoDirectory() {
        return photoDirectory;
    }

    public void setPhotoDirectory(String photoDirectory) {
        this.photoDirectory = photoDirectory;
    }

    private String latitude;

    private String longitude;

    private String company;

    private String blogPageUrl;

    private String facebookPageUrl;

    private String twitterAccountUrl;

    private String googlePlusAccountUrl;

    private String linkeninAccountUrl;

    private String pinterestAccountUrl;

//    //	@ElementCollection
//    private List<String> likedAds = new ArrayList<String>();
//
//    //	@ElementCollection
//    private List<String> archivedAds = new ArrayList<String>();
//
//    //	@ElementCollection
//    private List<String> ratedAds = new ArrayList<String>();
//
//    //	@ElementCollection
//    private List<String> publishedAds = new ArrayList<String>();
//
//    private List<String> viewedAds = new ArrayList<String>();

//    public List<String> getPreferences() {
//        return preferences;
//    }

//    public void setPreferences(List<String> preferences) {
//        this.preferences = preferences;
//    }

//    public List<String> getViewedAds() {
//        return viewedAds;
//    }
//
//    public void setViewedAds(List<String> viewedAds) {
//        this.viewedAds = viewedAds;
//    }
//
//    public List<String> getLikedAds() {
//        return likedAds;
//    }
//
//    public void setLikedAds(List<String> likedAds) {
//        this.likedAds = likedAds;
//    }
//
//    public List<String> getArchivedAds() {
//        return archivedAds;
//    }
//
//    public void setArchivedAds(List<String> archivedAds) {
//        this.archivedAds = archivedAds;
//    }
//
//    public List<String> getRatedAds() {
//        return ratedAds;
//    }
//
//    public void setRatedAds(List<String> ratedAds) {
//        this.ratedAds = ratedAds;
//    }
//
//    public List<String> getPublishedAds() {
//        return publishedAds;
//    }
//
//    public void setPublishedAds(List<String> publishedAds) {
//        this.publishedAds = publishedAds;
//    }

    public User() {
    }

    public User(String firstName, String lastName, String gender, String username, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.username = username;
        this.email = email;
        this.password = password;
        this.signupDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getBlogPageUrl() {
        return blogPageUrl;
    }

    public void setBlogPageUrl(String blogPageUrl) {
        this.blogPageUrl = blogPageUrl;
    }

    public String getFacebookPageUrl() {
        return facebookPageUrl;
    }

    public void setFacebookPageUrl(String facebookPageUrl) {
        this.facebookPageUrl = facebookPageUrl;
    }

    public String getTwitterAccountUrl() {
        return twitterAccountUrl;
    }

    public void setTwitterAccountUrl(String twitterAccountUrl) {
        this.twitterAccountUrl = twitterAccountUrl;
    }

    public String getGooglePlusAccountUrl() {
        return googlePlusAccountUrl;
    }

    public void setGooglePlusAccountUrl(String googlePlusAccountUrl) {
        this.googlePlusAccountUrl = googlePlusAccountUrl;
    }

    public String getLinkeninAccountUrl() {
        return linkeninAccountUrl;
    }

    public void setLinkeninAccountUrl(String linkeninAccountUrl) {
        this.linkeninAccountUrl = linkeninAccountUrl;
    }

    public String getPinterestAccountUrl() {
        return pinterestAccountUrl;
    }

    public void setPinterestAccountUrl(String pinterestAccountUrl) {
        this.pinterestAccountUrl = pinterestAccountUrl;
    }

//	public List<String> getLikedAds() {
//		return likedAds;
//	}
//
//	public void setLikedAds(List<String> likedAds) {
//		this.likedAds = likedAds;
//	}

//	public List<String> getArchivedAds() {
//		return archivedAds;
//	}
//
//	public void setArchivedAds(List<String> archivedAds) {
//		this.archivedAds = archivedAds;
//	}

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
                + ", username=" + username + ", email=" + email + ", password=" + password + ", roles=" + roles
                + ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + "]";
    }






}
