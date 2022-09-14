# MilesPerGallonRevisited

Write unit tests to verify the calculations in the class for Miles Per Gallon in this project. Include at least 5 data sets. Take screenshots of the successful unit tests.

![unit test output](https://github.com/bell-kevin/MilesPerGallonRevisited/blob/main/all%20test%20units%20passed.PNG)

In Ch 7 in the previous course, you created a project for calculating miles per gallon for a single trip and for cumulative trips. In this project, you will use the same class named MPG. It has instance variables for miles and gallons for a trip, total miles and total gallons for the cumulative calculation, and methods to instantiate a trip, display current MPG, and display total MPG. (Hint: after creating a new project here, create the new class, and copy all of the code from the Ch 7 MPG class into the Ch 15 MPG class.)

In this project, use an Array List of the MPG objects. Ask the user for the input of miles and gallons, and validate the input, handling any exceptions that might be thrown. Do not accept a value of zero or a negative number for either input. When the data is valid, perform the various calculations and display the MPG for that specific trip. Ask the user if they want to add another trip or see the total MPG for all trips or quit. If the user asks to see the total MPG, display it, then repeat the prompt about adding new trips, seeing total MPG, or quitting.

In the driver class, use anonymous objects for each trip to add to the Array List.

Because there are class variables and a class method for the cumulative or total miles per gallon, you can access them using any of the elements in the Array List. It might be logical to use element 0 to access that method when the user requests the total MPG display. There is one concern – could the user ask for the total MPG display before any objects have been instantiated and added to the Array list? While it’s not probable, it is possible, and in that case, there would be an exception thrown about the index being out of bounds. You need to include a try-catch for that. There is another option – create one instantiated MPG object in the driver class to be able to access that class method. Add a zero-parameter constructor for an MPG object so you can instantiate this “totals” object. Then you can call the class method from this object without any concern about whether objects have been instantiated and added to the Array List. You may choose either of these algorithms to make sure there is no exception thrown for index out of bounds. Test it by starting the project, then asking to display the total MPG. Since there are no trips, there is no total to display -- make sure it is handled.

## Good Output

![good output](https://github.com/bell-kevin/MilesPerGallonRevisited/blob/main/goodOutput.PNG)

Take screenshots of the execution that matches the sample session, and then run the program again with different values and errors, and take screenshots of the results. Run the program again and ask for the total as the first entry, and take a screenshot.

Submission: the specified screenshots (of execution of the code and successful unit tests) and the root folder for the project

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
