import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        System.out.println("Moi ban nhap so hoc sinh: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0 ; i < x; i ++){
            System.out.println("Moi ban nhap ten hoc sinh thu " + (i+1) + " :");
            String temp = scanner.nextLine();
            Student student = new Student(temp);
            studentList.add(student);
        }

        Collections.sort(studentList);
        System.out.println("Danh sach hoc sinh sau khi sap xep: ");
        for(Student s: studentList){
            System.out.println(s);
        }
    }
}
