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
public class RaceCompleted {
    private final Runner runner;
    private final Race race;
    private final int finishPos;
    private final int finishTime;

    public RaceCompleted(Runner runner, Race race, int finishPos, int finishTime) {
        this.runner = runner;
        this.race = race;
        this.finishPos = finishPos;
        this.finishTime = finishTime;
    }
    
    public String getRunnerID(Runner runner){
        return runner.getRunnerID();
    }
    
    public String getRaceID(Race race){
        return race.getRaceID();
    }

    @Override
    public String toString() {
        return "Runner: " + runner + " completed race: " + race + " and finished in place " + finishPos + " with a time of " + finishTime + " minutes";
    }
    
    
    
}
