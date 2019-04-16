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
public class Runner {
    private final String runnerID;
    private final String firstName;
    private final String lastName;
    private final String gender;
    private final int age;

    public Runner(String runnerID, String firstName, String lastName, String gender, int age) {
        this.runnerID = runnerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getRunnerID() {
        return this.runnerID;
    }

    @Override
    public String toString() {
        return "RunnerID: " + runnerID + ", Name: " + firstName + " " + lastName + ", Gender: " + gender + ", Age: " + age;
    }

}
