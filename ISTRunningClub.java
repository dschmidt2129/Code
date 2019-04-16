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
public class ISTRunningClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RunningClub runClub = new RunningClub();
        
        runClub.addRunner("1", "David", "Schmidt", "Male", 21);    
        runClub.addRunner("2", "John", "Smith", "Male", 21);
        
        runClub.addRace("1", "State College", "12/15/19");
        runClub.addRace("2", "Altoona", "12/20/19");
        runClub.addRace("3", "Pittsburgh", "12/29/19");        
        
        
        runClub.recordCompletedRace(new Runner("1", "David", "Schmidt", "Male", 21), new Race("1", "State College", "12/15/19"), 2, 150);
        runClub.recordCompletedRace(new Runner("1", "David", "Schmidt", "Male", 21), new Race("2", "Altoona", "12/20/19"), 1, 90);
        runClub.recordCompletedRace(new Runner("2", "John", "Smith", "Male", 21), new Race("2", "Altoona", "12/20/19"), 2, 95);
        runClub.recordCompletedRace(new Runner("2", "John", "Smith", "Male", 21), new Race("3", "Pittsburgh", "12/29/19"), 6, 125);
        
        
        runClub.showAll();
    }
    
}
