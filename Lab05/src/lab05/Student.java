/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ming
 */
package lab05;

public abstract class Student {

    private String firstName;
    private String middleInitial;
    private String lastName;
    private String PUID;
    private String address;
    private String state;
    private String zip;
    private String country;

    // Constructor
    public Student(String firstName, String middleInitial, String lastName, String PUID, String address, String state, String zip, String country) {
        this.setFirstName(firstName);
        this.setMiddleInitial(middleInitial);
        this.setLastName(lastName);
        this.setPUID(PUID);
        this.setAddress(address);
        this.setState(state);
        this.setZip(zip);
        this.setCountry(country);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleInitial
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * @param middleInitial the middleInitial to set
     */
    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the PUID
     */
    public String getPUID() {
        return PUID;
    }

    /**
     * @param PUID the PUID to set
     */
    public void setPUID(String PUID) {
        this.PUID = PUID;
    }

    /**
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param Address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The state
     */
    public String getState() {
        return state;
    }

    /**
     * @param State the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return The zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param Zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param Country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
