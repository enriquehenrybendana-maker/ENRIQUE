public class GradeThresholdChecker {
    public static void main(String[] args) {
        double average = 74.5;
        int absences = 3;

        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);

        if (passed) {
            System.out.println("Result: PASS");
            System.out.println("Reason: The average is " + average +
                    " and the absences are " + absences + ".");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: The average is below 75 with more than 3 absences.");
        }
    }
}