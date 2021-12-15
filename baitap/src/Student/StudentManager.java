package Student;

import Student.Student;

public class StudentManager {

    public void displayStudent(Student[] students) {
        System.out.println(" Tất cả các sinh viên");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("---------------------");
    }

    public void  maxStudenMedium(Student[] students){
        System.out.println("sinh viên số điểm cao nhất là");
         double maxMedium = students[0].getMedium();
         for (int i = 0 ; i < students.length; i++){
             if (students[i].getMedium() > maxMedium){
                 maxMedium = students[i].getMedium();
             }
         }
        System.out.print(maxMedium);
        System.out.println();
        System.out.println("-----------------------");
    }

    public void  minStudenMedium(Student[] students){
        System.out.println("học sinh có điểm thấp nhất là");
        double minMedium = students[0].getMedium();
        for(int i = 0 ; i < students.length ; i++){
            if (students[i].getMedium() < minMedium){
                minMedium = students[i].getMedium();
            }
        }
        System.out.println(minMedium);
    }



}
