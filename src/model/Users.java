package model;

import java.io.File;
import java.util.Calendar;

public class Users {
    private String emailId;
    private String password;
    private String userName;
    private String phoneNumber;
    private Gender gender;
    private Calendar dateOfBirth;
    private Calendar lastLoggedIn;
    private String imageUrl;
    private File image;
    private Character proVersion;

    public Users() {

    }

    public Users(String emailId, String password, String userName, String phoneNumber,
                 Gender gender, Calendar dateOfBirth, Calendar lastLoggedIn, String imageUrl, File image, Character proVersion) {
        this.emailId = emailId;
        this.password = password;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.lastLoggedIn = lastLoggedIn;
        this.imageUrl = imageUrl;
        this.image = image;
        this.proVersion = proVersion;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Calendar getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(Calendar lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public Character getProVersion() {
        return proVersion;
    }

    public void setProVersion(Character proVersion) {
        this.proVersion = proVersion;
    }
}
