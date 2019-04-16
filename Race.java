/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrunningclub;

/**
 *
 * @author david
 */
public class Race {
    private final String raceID;
    private final String raceLocation;
    private final String raceDate;

    public Race(String raceID, String raceLocation, String raceDate) {
        this.raceID = raceID;
        this.raceLocation = raceLocation;
        this.raceDate = raceDate;
    }

    public String getRaceID() {
        return raceID;
    }

    @Override
    public String toString() {
        return "Race ID: " + raceID + ", Race Location: " + raceLocation + ", Race Date: " + raceDate;
    }
    
    
}
