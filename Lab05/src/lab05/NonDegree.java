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
public class NonDegree extends Student {
    private String college;

    public NonDegree(String firstName, String middleInitial, String lastName,
                     String puid,
                     String address,
                     String state,
                     String zip,
                     String country
                     ) {
        super(firstName, middleInitial, lastName, puid, address, state, zip, country);
        this.setCollege(college);
    }

    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

}

