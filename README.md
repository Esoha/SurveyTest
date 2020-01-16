# SurveyTest
Java application 
Problem
•	Design and implement an application file that does the following:
•	uses a 2 dimensional array to store the exam data (see sample data and output below).  This has already been created for you.  See TFexam.txt.
•	uses 1 dimensional arrays for the following:
o	hold the names of the students (you create this)
o	hold the correct answers to the exam (you create this)
o	hold the number correct for each student  (see method 2 below)
o	hold the number correct for each question on the exam  (see method 3 below)
•	it would be easiest to declare all arrays as class variables, before the main method.  They would need to be static
•	creates and calls (from main()) 4 methods that perform the following tasks.  All of these methods must also be static.  Each bullet describes one of the methods
o	initializes these arrays using initialization lists: 2D array with all the exam data (but not the totals), the student names array, and the correct answers array
o	calculates the number correct for each student (and declares the size of this array)
o	calculates the number correct for each question (and declares the size of this array)
o	prints out the results (see the sample output below).  Use printf to line up the output:

https://alvinalexander.com/programming/printf-format-cheat-sheet

NOTE: you will need this syntax to initialize an array in the method:
	names = new String[] { the names go here};

Sample Data:
This is a sample data set.  The code you write must work for ANY data set.  (except for the heading for the columns which are trickier to line up for different data sets)
FTFFTFFTFT		← the correct answers to the test (in a separate 1D array)
Audrey FTTFTFTTFT	← the first student’s name and answers to the test
Brian FTFTFTTTFF	← the second student’s name and answers to the test
Elizabeth FTTFTTTTTT
Ellen   TTFFTFFTTT
Gregory   TTFTTTFFTF
Harold   TTTTTTTTTT
Lewis   FTFFFTFTFT
Kevin   TFTFTFTFTF
Kieran   TTTFFTTFTF
Michael   FFFFFFFFFF
Peter   TFTTFTTFTF
Wayne FTFFTTFFFT
Yang   FTFTFTFTFT
Zachary TFTFTTFTFT
