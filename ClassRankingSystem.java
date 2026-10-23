class Student {
    String name;
    int[] quizzes;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }

    double getAverage() {
        int sum = 0;

        for (int score : quizzes) {
            sum += score;
        }

        return (double) sum / quizzes.length;
    }
}

public class ClassRankingSystem {
    public static void main(String[] args) {
        String[] names = {"Josh", "Benjamin", "Kian", "Jeric", "Albai"};

        int[][] data = {
            {85, 90, 88, 92},
            {95, 90, 93, 94},
            {80, 85, 82, 83},
            {95, 90, 93, 94},
            {88, 86, 90, 84}
        };

        Student[] students = new Student[names.length];

        // Create Student objects from the 2D quiz array
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], data[i]);
        }

        // Search for a student's rank by name
        String target = "Carlo";
        int rank = findRank(students, target);

        if (rank != -1) {
            System.out.println(target + "'s rank: " + rank);
        } else {
            System.out.println(target + " was not found.");
        }

        // Sort a copy of the student array using bubble sort
        Student[] ranked = new Student[students.length];

        for (int i = 0; i < students.length; i++) {
            ranked[i] = students[i];
        }

        for (int i = 0; i < ranked.length - 1; i++) {
            for (int j = 0; j < ranked.length - 1 - i; j++) {
                if (ranked[j].getAverage() < ranked[j + 1].getAverage()) {
                    Student temp = ranked[j];
                    ranked[j] = ranked[j + 1];
                    ranked[j + 1] = temp;
                }
            }
        }

        // Print leaderboard and handle tied averages
        System.out.println("\nLEADERBOARD");
        System.out.printf("%-8s %-10s %-10s%n", "Rank", "Name", "Average");

        int currentRank = 1;

        for (int i = 0; i < ranked.length; i++) {
            if (i > 0 &&
                ranked[i].getAverage() != ranked[i - 1].getAverage()) {
                currentRank = i + 1;
            }

            System.out.printf("%-8d %-10s %.2f%n",
                currentRank, ranked[i].name, ranked[i].getAverage());
        }
    }

    // Linear search that returns the student's rank
    static int findRank(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(name)) {
                return i + 1;
            }
        }

        return -1;
    }
}