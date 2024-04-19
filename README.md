Description
What is Best App Winner?
Best App Winner is a software program that universities will utilize to automate 
their voting process for the best App. Students will be requested to create an app, 
and this app will be voted on by app users based on app categories such as [creativity, 
response speed, reliability, availability, and ease of use], as illustrated in figure 
1. The project's details are listed below.
As shown in Figure 1, you will need to create different arrays to hold all of the data 
utilized in the application; for example, you will need a one-dimension array to store 
the app category, more details later in the program specification.
CPCS203 Spring-2022 Page 3 of 11 
Best App. Winner program must store the following data:
✓ Saudi Arabian Universities name.
✓ Name of the students who participated in the Contest from different 
Universities. 
✓ Dates of the contest. 
✓ Days of the contest.
✓ Contest Categories.
✓ Participants score based on the contest categories.
This software also generates various results based on the above data saved in the 
system, for example it generates winner list from each university based on different 
Categories, it also, shows the contest details etc.
Basic Requirements:
▪ The program must read the data from a text file called “input.txt”
that follows a specific pattern. If the file doesn’t exist, print a 
message to let the user know what happened.– see Input file for 
more details. 
▪ The program must generate a text file as the output called 
“print.txt” that contains the results of the commands written in 
the input file – see print file for more details.
▪ The program must load data dynamically from the given text file 
“input.txt” and user is not involved in data entry.
The Initial Procedure of the Program
You will use File I/O concepts to read given file [input.txt]. Make sure the file 
exist or display a message that the file does not exist. The file consists of:
▪ 7 integers to determine array size for university names, days name, date 
of the contest, students name, Apps award criteria and App contestant 
result [see input.txt file]:
CPCS203 Spring-2022 Page 4 of 11 
✓ The first number (4) in the file refers to the number of universities to 
be stored in the System [means, system will accept ONLY FOUR 
universities name.
✓ The second number (4) refers to the number of days and dates to be 
stored in the system [ means system will accept ONLY 4 days and dates] 
✓ The third number (4) refers to the number of students participating in 
the contest from each university for example King AbdulAziz 
University. 
✓ The fourth number (3) refers to the number of students participating 
in the contest from King Saud University. 
✓ The fifth number (5) refers to the number of students participating in 
the contest from King Khalid University. 
✓ The sixth number (4) refers to the number of students participating in 
the contest from King Fahad University. 
✓ The seventh number (5) refers to the number of contest criteria. 
The Data Creation of the Program 
• Create a Single Dimension Array to store Universities name (See Table 1) and
create a method that read names of universities from given input.txt file and 
stored Universities name in an array.
Table 1. Universities' information
university_Name
King AbdulAziz University
King Saud University
King Khalid University
King Fahad University
// String array for the Universities name
• Create two Single Dimension Array to store Day and Date of the contest 
(See Table 2), and create two methods, one that read days and date of contest 
from given input.txt file and stored in respective arrays.
CPCS203 Spring-2022 Page 5 of 11 
Table 2. Day and Date of Contest information
// String array for the Day of Contest 
// String array for the Date of Contest 
• Create a Two Dimensional Array to store Students name participated in the 
contest from all the universities (See Table 3), and create a method, that 
read all names from given input.txt file and store in respective 2Darrray.
Table 3. Students name participated in the contest of all universities
// String Two Dimensional Rigid array to store students name who participated in 
the contest from each university.
Note: In table 3 each ROW represents name of students participated in the contest 
from every university, for example ROW ZERO represent all the students of King 
AbdulAziz University and ROW ONE represent all the students of King Saud 
University and so on, further concept is shown in Table 4. Data shown in the tables 
may be different from given data in the input.txt file.
day_Contest date_Contest
Sunday 9/21/2015
Monday 9/22/2015
Tuesday 9/23/2015
Wednesday 9/24/2015
CPCS203 Spring-2022 Page 6 of 11 
Table 4. Relationship between Universities and Students 
• Create a Single Dimension Array to store Contest_Criteria (See Table 5), and 
create a method that read data from given input.txt file and store in 
respective array.
Table 5. Contest_Criteria
Contest_Criteria
Usability and Accessibility
Platform Compatibility and Portability
Security
Functionality and Correctness
Performance and Efficiency
// String array for the Contest_Criteria
• Create a 3-Dimentional array to store points scored by each student in 
different category from each university (See Table 6). 
CPCS203 Spring-2022 Page 7 of 11 
Table 6. Students point stored in 3 Dimension Array
The 3-Dimensional array virtually link university array. Each University has 
number of students participated in the contest and they scored points based 
on the category, so this 3 Dimensional array have different rows and columns 
based on the total students participated of the university and contest 
category. Make sure when you create this array check how many students are 
participating of that university. Figure 1 and figure 2 illustrates the structure 
of the 3D array.
Figure 1 The structure of the 3D array
University [0] Cat. A Cat. B Cat. C Cat. D Cat. E
ANAS SHAKER BARAK
7 8 6 9 5
MOHAMMED ALI MOHAMMED 
ALGHAMDI
8 6 5 7 9
MAZEN MANSOUR HAMAD 
ALJEHANI
9 7 7 6 5
KHALID AUN ALARIANI
8 9 8 5 7
CPCS203 Spring-2022 Page 8 of 11 
Figure 2 The structure of the 3D array
// Three Dimensional Array 
The commands you will have to implement are as follows
addUniversity– Your program must read universities name and store in an 
array to be used in the system. [see input.txt]
addUniversity 
King_AbdulAziz_University King_Saud_University
In above line addUniversity is a command & King_AbdulAziz_University,
King_Saud_University are the universities name.
addDays – Your program must read contest days and store in an array to be 
used in the system. [see input.txt]
addDays 
Sunday Monday
In above line addDays is a command and Sunday Monday are name of days 
contest conducted.
addDates – Your program must read contest dates and store in an array to be 
used in the system. [see input.txt]
addDates 
09_22_2019 09_23_2019
CPCS203 Spring-2022 Page 9 of 11 
In above line addDates is a command and 09_22_2019 09_23_2019 are 
dates of contest.
addStudentsName– Your program must read participants data and store in an 
array to be used in the system. [see input.txt]
addStudentsName
ANAS_SHAKER_BARAK MOHAMMED_ALI_MOHAMMED_ALGHAMDI 
MARYAM_MANSOUR_HAMAD_ALJEHANI KHALID_AUN_ALARIANI
In above line addStudentsName is a command and 
ANAS_SHAKER_BARAK MOHAMMED_ALI_MOHAMMED_ALGHAMDI 
MARYAM_MANSOUR_HAMAD_ALJEHANI KHALID_AUN_ALARIANI are names 
of students of the King AbdulAziz University participating in the contest.
[see input.txt / Table 4] and think]
addAwardCriteria – Your program must read contest Categories and store in 
an array to be used in the system. [see input.txt]
addAwardCriteria 
Usability_Accessibility Platform_Compatibility_Portability
In above line addAwardCriteria is a command and Usability_Accessibility 
Platform_Compatibility_Portability are contest categories.
addScore– Your program must read participants score and store in an array 
to be used in the system. [see input.txt]
addScore
7 8 6 9 5
In above line addScore is a command and 7 8 6 9 5 scores of participants 
based on the contest categories.
[see input.txt / Figure 1 and 2] and Think]
CPCS203 Spring-2022 Page 10 of 11 
printcontestDetails– Your program must automatically generate report based 
on contest detail and save in the output file. [see print.txt]
// Method to Print Contest Details
printcontestdetailResults– Your program must automatically generate report 
based on contest score for each university and save in the output file. [see 
print.txt]
// Method to Print Contest Detail Results
printwinnerAwardByEachCriteria- Your program must automatically generate 
report based on winner of each university based on contest categories and 
save in the output file. [see print.txt]
// Methods to print winners from each university based on the contest 
categories.
Quit -This option will be used to Exit from the System. 
Very Important Note: [YOU MUST GENERATE EXACTLY SAME OUTPUT FILE AS 
GIVEN TO YOU (PRINT.TXT)]
Output File Pattern 
The output file should include all the results of the commands that have been 
read from the input file [input.txt]. Your program must generate output in a 
similar format to the given sample output file [print.txt].
Note: You must create a supporting method String textSplit(String text) to return 
a text by removing _ char from the given text.
For example, given text to the method is King_AbdulAziz_University and the 
method return King AbdulAziz University.
