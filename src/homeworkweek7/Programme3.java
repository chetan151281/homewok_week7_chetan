package homeworkweek7;

import java.util.Scanner;

public class Programme3 {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
     * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
     * Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A,
     * %> = 50 B, %> = 35 C And print Mark Sheet in following format
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student Roll No: ");
        int rollNo = scanner.nextInt();
        // Input marks for three subjects : math ,science,english
        System.out.println("Enter marks for Math , Sceince and English");
        int mathMarks = scanner.nextInt();
        int scienceMarks = scanner.nextInt();
        int englishMarks = scanner.nextInt();


        //validate marks
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input , Marks should be between 0 to 100");
            return;
            //Calculate total marks
        }
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        //calculate percentage
        double percentage = (double) totalMarks / 3;
        //Determine result and grade
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "c";
            }
        } else {
            result = "Fail";
            grade = "N/A"; // Not applicable for failed students
        }
        System.out.println("---------------------------------");
        System.out.println("|                                 |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.println("| Name     : " + name + "     |");
        System.out.println("| Roll No  : " + rollNo + "                    |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks             |");
        System.out.println("|_______________________________|");
        System.out.println("| Math     : " + mathMarks + "      |");
        System.out.println("| Science  : " + scienceMarks + "                   |");
        System.out.println("| English  : " + englishMarks + "                   |");
        System.out.println("|_______________________________|");
        System.out.println("| Total    : " + totalMarks + "       |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage : " + percentage + "    |");
        System.out.println("| Result   : " + result + "         |");
        System.out.println("| Grade    : " + grade + "          |");
        System.out.println("|_______________________________|");
        scanner.close();


    }
}
