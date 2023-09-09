package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter  {
    @Override
    public void processLogic()  {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("enter school name");
        String schoolName = sc4.nextLine();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("enter scholarship");
        Double scholarship = sc5.nextDouble();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setSchoolName(schoolName);
        s.setScholarship(scholarship);

        Config.instance().appendStudents(s);
        System.out.println("student added");
    }
}
