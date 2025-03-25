public class AverageMarks {

    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};
        int totalMarks = 0;
        int numberOfStudents = marks.length;

        for (int i = 0; i < numberOfStudents; i++) {
            totalMarks += marks[i];
        }

        double averageMarks = (double) totalMarks / numberOfStudents;

        System.out.println("The average marks are: " + averageMarks);
    }
}
