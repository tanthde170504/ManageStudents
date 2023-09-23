/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Manager;
import Controller.Validation;
import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Tran Huu Tan", "Spring", "java"));
        ls.add(new Student("2", "Tran Huu Tien", "Summer", ".net"));
        ls.add(new Student("3", "Nguyen Minh Hieu", "Spring", "c/c++"));
        int count = 3;
        Manager manager = new Manager();
        //loop until user want to exit program
        while (true) {
            //Show menu option
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    manager.createStudent(count, ls);
                    break;
                case 2:
                    manager.findAndSort(ls);
                    break;
                case 3:
                    manager.updateOrDelete(count, ls);
                    break;
                case 4:
                    manager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }

}
