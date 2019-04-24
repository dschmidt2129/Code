# IST Running Club

Requirements:

Your program must:

Store information about each Runner.
Store information about each Race.
Store information about the performance of each runner in each race that they compete in.  Note that each race may have many runners, and each runner may compete in many races.
-----------------

All of your classes should be properly encapsulated, follow all proper coding conventions discussed in class, and be logically constructed following good Object Oriented design.  Your submitted code should compile and run without errors.  Please be sure to export your project to ZIP using NetBeans. 

-----------------

Step 1: Your Runner class.

- Create a Runner class that stores runner ID, first name, last name, gender, and age.

- Override toString() to properly display all attributes.

- Create all constructors, getters, and setters as necessary

-----------------

Step 2: Your Race class.

- Create a Race class that stores race ID, race location, and race date.

- Override toString() to properly display all attributes.

- Create all constructors, getters, and setters as necessary

-----------------

Step 3: Connecting Runners and Races

- In addition to simply storing information about runners and races as described above, we must store the following data:

The list of runners participating in each race
The list of races participated in by each runner
The finishing time of each runner in each race
The finishing position of each runner in each race
Note that there are a few ways to accomplish this.  You should have some discussions with your partner on the best approach.  Guidance will be given in class, and you will be graded (in part) on the quality of your design choices.  This may include the creation of another class/classes or the use of other data structures.  NOTE: You may not use a Map data structure for this assignment.

-----------------

Step 4: Your RunningClub class.

- Create a RunningClub class that leverages the classes we created earlier in order to provide the following methods:

addRunner() : Adds a runner to the club. It should take the runner ID, first name, last name, gender, and age as parameters.  It should succeed (and return true) if the runner ID parameter doesn't already exist, and fail (and return false) otherwise.
addRace(): Adds a race.  It should take the race ID, race location, and race date as parameters. It should succeed (and return true) if the race ID parameter doesn't already exist, and fail (and return false) otherwise.
recordCompletedRace(): Records information about the completion of a race.  The parameters will vary depending on your implementation choices, but it should record the runner, the race, the finishing time of that runner in that race, and the finishing position of that runner in that race.
showAll(): Displays all runners, all races, and all information about completed races.
-----------------

Step 5: Your main() method

In your main method:

Create an instance of your RunningClub class
Use the addRunner() method (repeatedly) to add 2 runners.
Use the addRace() method (repeatedly) to add 3 races.
Use the recordCompletedRace() method (repeatedly) to record each runner completing at least 2 races.
Use the showAll() method to display all information in the system.
