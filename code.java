/*
Name: Mahmued Ahmed Alardawi
ID: 21352089
Section: ZJ
Course name: Programming II
Course code: CPCS 203
Assignment number: Assignment #1 (Best App Winner)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ZJ_2135209
{
    public static void main (String[] args) throws IOException
    {
        File file = new File ("input.txt");

        if (!file.exists())
        {
            System.out.println("File not found");
        }

        PrintWriter output = new PrintWriter("print.txt");

        output.println("\n\n***** Welcome to Best App Winner System *****\n");

        printContestDetails(file, output);
        printContestDetailResults(file, output);
        printWinnerAwardByEachCriteria(file, output);
        quit(output);

        output.close();
    }

    //

    public static String[] addUniversity (File file) throws FileNotFoundException
    {

        Scanner input = new Scanner (file);

        int uni_number = input.nextInt();

        String[] universities = new String[uni_number];

        while (input.hasNext())
        {
            String index = input.next();

            if(index.equalsIgnoreCase("addUniversity"))
            {
                for (int uni = 0; uni < uni_number; uni++)
                {
                    universities[uni] = input.next();
                }
            }
        }
        input.close();
        return universities;
    }

    //

    public static String[] addDays (File file) throws FileNotFoundException
    {
        Scanner input = new Scanner (file);

        int d_number = 0;

        for (int token = 0; token < 2; token++)
        {
            d_number = input.nextInt();
        }

        String[] days = new String[d_number];

        while (input.hasNext())
        {
            String index = input.next();

            if (index.equalsIgnoreCase("addDays"))
            {
                for (int d = 0; d < d_number; d++)
                {
                    days[d] = input.next();
                }
            }
        }
        input.close();
        return days;
    }

    //

    public static String[] addDates (File file) throws FileNotFoundException
    {
        Scanner input = new Scanner (file);

        int d_number = 0;

        for (int token = 0; token < 2; token++)
        {
            d_number = input.nextInt();
        }

        String[] dates = new String[d_number];

        while (input.hasNext())
        {
            String index = input.next();

            if (index.equalsIgnoreCase("addDates"))
            {
                for (int d = 0; d < d_number; d++)
                {
                    dates[d] = input.next();
                }
            }
        }
        input.close();
        return dates;
    }

    //

    public static String[][] addStudentsName (File file) throws FileNotFoundException
    {
        Scanner input = new Scanner (file);

        int uni_number = input.nextInt();
        int s_number;

        int[] s_number_array = new int[uni_number];
        String[][] students = new String[uni_number][];

        for (int token = 1; token < 6; token++)
        {
            s_number = input.nextInt();

            if (token == 2 || token == 3 || token == 4 || token == 5)
            {
                s_number_array[token - 2] = s_number;
            }
        }

        while (input.hasNext())
        {
            String index = input.next();

            if (index.equalsIgnoreCase("addStudentsName"))
            {
                for (int row = 0; row < uni_number; row++)
                {
                    students[row] = new String[s_number_array[row]];

                    for (int column = 0; column < students[row].length; column++)
                    {
                        students[row][column] = input.next();
                    }
                }
            }
        }
        input.close();
        return students;
    }

    //

    public static String[] addAwardCriteria (File file) throws FileNotFoundException
    {
        Scanner input = new Scanner (file);

        int c_number = 0;

        for (int token = 0; token < 7; token++)
        {
            c_number = input.nextInt();
        }

        String[] criteria = new String[c_number];

        while (input.hasNext())
        {
            String index = input.next();

            if (index.equalsIgnoreCase("addAwardCriteria"))
            {
                for (int c = 0; c < c_number; c++)
                {
                    criteria[c] = input.next();
                }
            }
        }
        input.close();
        return criteria;
    }

    //

    public static int[][][] addScore (File file) throws FileNotFoundException
    {
        Scanner input = new Scanner (file);

        int uni_number = input.nextInt();
        int c_number = 0;

        int[] s_number_array = new int[uni_number];

        for (int token = 1; token < 7; token++)
        {
            int number = input.nextInt();
            c_number = number;

            if (token == 2 || token == 3 || token == 4 || token == 5)
            {
                s_number_array[token - 2] = number;
            }

        }

        int[][][] students_points = new int[uni_number][][];

        while (input.hasNext())
        {
            String index = input.next();

            if (index.equalsIgnoreCase("addScore"))
            {
                for (int uni = 0; uni < uni_number; uni++)
                {
                    students_points[uni] = new int[c_number][s_number_array[uni]];

                    for (int s = 0; s < s_number_array[uni]; s++)
                    {
                        for (int c = 0; c < c_number; c++)
                        {
                            students_points[uni][c][s] = input.nextInt();
                        }
                    }
                }
            }
        }
        input.close();
        return  students_points;
    }

    //

    public static String split (String s)
    {
        return s.replaceAll("_", " ");
    }

    public static String splitDate (String s)
    {
        return s.replaceAll("_", "/");
    }

    //

    public static void printContestDetails (File file, PrintWriter output) throws FileNotFoundException
    {
        output.println("------------  Contest App details are as follows ------");
        output.println("University Name                Contest Day                    Contest Date                   ");
        output.println("------------------------------------------------------------------------------");

        String[] universities = addUniversity(file);
        String[] days = addDays(file);
        String[] dates = addDates(file);

        for (int index = 0; index < universities.length; index++)
        {
            output.printf(" %-29s", split(universities[index]));
            output.printf(" %-30s", split(days[index]));
            output.printf(" %-31s", splitDate(dates[index]));
            output.println();
        }

        output.println();
    }

    //

    public static void printContestDetailResults (File file, PrintWriter output) throws FileNotFoundException
    {
        String[] universities = addUniversity(file);
        String[][] students = addStudentsName(file);
        String[] criteria = addAwardCriteria(file);
        int[][][] scores = addScore(file);

        for (int uni = 0; uni < universities.length; uni++) {
            output.println("---Contest Results of  " + split(universities[uni]) + " is as Follows ---\n");

            for (int s = 0; s < students[uni].length; s++)
            {
                output.println("---Student Name   " + split(students[uni][s]) + " points  are as Follows ---");

                for (int c = 0; c < criteria.length; c++)
                {
                    output.println(" " + split(criteria[c]) + " : " + scores[uni][c][s]);
                }

                output.println();
            }
        }
    }

    //

    public static void printWinnerAwardByEachCriteria (File file, PrintWriter output) throws FileNotFoundException
    {
        String[] universities = addUniversity(file);
        String[][] students = addStudentsName(file);
        String[] criteria = addAwardCriteria(file);
        int[][][] scores = addScore(file);


        for (int c = 0; c < criteria.length; c++)
        {
            for ( int uni = 0; uni < universities.length; uni++)
            {
                int max = -1;
                int index = 0;

                output.println("--- Results of  " + split(universities[uni]) + " is as Follows ---");
                output.println(" Contest Winner name in Category:   " + split(criteria[c]) + " : ");

                for (int s = 0; s < scores[uni][c].length; s++)

                {
                    if (max < scores[uni][c][s])
                    {
                        max = scores[uni][c][s];
                        index = s;
                    }
                }

                output.println(" " + split(students[uni][index]) + "\n");
            }
        }
    }

    //

    public static void quit (PrintWriter output)
    {
        output.println("\tThank you for using Best App Winner System, Good Bye!\n");
    }
}