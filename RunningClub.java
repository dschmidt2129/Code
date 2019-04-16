/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrunningclub;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author david
 */
public class RunningClub {

    private final HashSet<Runner> runners = new HashSet<>();
    private final HashSet<Race> races = new HashSet<>();
    private final ArrayList<RaceCompleted> raceResult = new ArrayList<>();

    public boolean addRunner(String runnerID, String firstName, String lastName, String gender, int age) {
        Runner runner = new Runner(runnerID, firstName, lastName, gender, age);
        if (runners.isEmpty()) {
            return runners.add(runner);
        } else {
            for (Runner run : runners) {
                if (run.getRunnerID().equals(runner.getRunnerID())) {
                    return false;
                } else {
                    return runners.add(runner);
                }
            }
            return true;
        }
    }//add Runner

    public boolean addRace(String raceID, String raceLocation, String raceDate) {
        Race race = new Race(raceID, raceLocation, raceDate);
        if (races.isEmpty()) {
            return races.add(race);
        } else {
            for (Race comp : races) {
                if (comp.getRaceID().equals(race.getRaceID())) {
                    return false;
                } else {
                    return races.add(race);
                }
            }
            return true;
        }
    }//add Race

    public ArrayList<RaceCompleted> recordCompletedRace(Runner runner, Race race, int finishPos, int finishTime) {
        RaceCompleted raceComp = new RaceCompleted(runner, race, finishPos, finishTime);
        if (raceResult.isEmpty()) {
            raceResult.add(raceComp);
        } else if(!raceResult.contains(raceComp)){
            raceResult.add(raceComp);
        }
        return raceResult;
    }

    public void showAll() {
        for (Runner runner : runners) {
            System.out.println(runner);
        }
        for (Race race : races) {
            System.out.println(race);
        }
        for (RaceCompleted raceComp : raceResult) {
            System.out.println(raceComp);
        }
    }
}
