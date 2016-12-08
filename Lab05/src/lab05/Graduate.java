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
public class Graduate extends Student{
    private String major;
    private Boolean thesis;
    private Boolean masterPhD;

    public Graduate(String firstName, String middleInitial, String lastName, String puid, String address,
                    String state, String zip, String country, String major,
                    Boolean thesis, Boolean PhD) {
        super(firstName, middleInitial, lastName, puid, address, state, zip, country);
        this.setMajor(major);
        this.setThesis(thesis);
        this.setMasterPhD(PhD);
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

    /**
     * @return the thesis
     */
    public Boolean getThesis() {
        return thesis;
    }

    /**
     * @param thesis the thesis to set
     */
    public void setThesis(Boolean thesis) {
        this.thesis = thesis;
    }

    /**
     * @return the mS
     */

    /**
     * @return the phD
     */
    public Boolean getMasterPhD() {
        return masterPhD;
    }

    /**
     * @param phD the phD to set
     */
    public void setMasterPhD(Boolean phD) {
        masterPhD = phD;
    }
}

