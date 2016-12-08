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
public class Undergrad extends Student {
    // Variables
    private String major;
    /**
     * @param firstName - Student First Name
     * @param middleInitial - Students Middle Initial
     * @param lastName - Student Last Name
     * @param major - Student Major
     */
    public Undergrad(String firstName, String middleInitial, String lastName,
                     String puid, String address,
                     String state, String zip, String country, String major) {
        super(firstName, middleInitial, lastName, puid, address, state, zip, country); // Invoke superclass constructor
        this.setMajor(major);
    }
    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }
    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }
}
