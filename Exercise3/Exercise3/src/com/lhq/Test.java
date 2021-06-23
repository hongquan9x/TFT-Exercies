/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author redar
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        //Add 10 students
        List<Student> listStudents = new ArrayList<>();
        
        System.out.println("Input 10 students: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Input information of student #" + (i + 1) + ":");
            Student student = new Student();
            student.input();
            
            listStudents.add(student);
        }
        
        //Ascending sorting by grade
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade().compareTo(o2.getGrade());
            }            
        });
        
        //Show list of student after sorting
        System.out.println("Information of students: ");
        for (Student student : listStudents){
            System.out.println(student.toString());
        }
        
        //Add 10 workers
        List<Worker> listWorkers = new ArrayList<>();
        
        System.out.println("Input 10 wokers: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Input information of worker #" + (i + 1) + ":");
            Worker worker = new Worker();
            worker.input();
            
            listWorkers.add(worker);
        }
        
        //Descending sorting by money per hour
        Collections.sort(listWorkers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                //return (int) (o2.moneyPerHour() - o1.moneyPerHour());
                return Float.compare(o2.moneyPerHour(), o1.moneyPerHour());
            }
            
        });
        
        //Show list of worker after sorting
        System.out.println("Information of worker: ");
        for (Worker worker : listWorkers) {
            System.out.println(worker.toString());
        }
        
        //Merge 2 lists
        List<Object> mergeList = new ArrayList<>();
        mergeList.addAll(listStudents);
        mergeList.addAll(listWorkers);
        
        //Sorting merged list by first name and last name
        Collections.sort(mergeList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                String firstName1 = "", lastName1 = "", firstName2 = "", lastName2 = "";
                
                if (o1 instanceof Student){
                    firstName1 = ((Student) o1).getFirstName();
                    lastName1 = ((Student) o1).getFirstName();
                }   else if (o1 instanceof Worker) {
                    firstName1 = ((Worker) o1).getFirstName();
                    lastName1 = ((Worker) o1).getFirstName();
                }
                
                if (o2 instanceof Student){
                    firstName2 = ((Student) o2).getFirstName();
                    lastName2 = ((Student) o2).getFirstName();
                    
                }   else if (o2 instanceof Worker) {
                    firstName2 = ((Worker) o2).getFirstName();
                    lastName2 = ((Worker) o2).getFirstName();
                }
                
                int compareByFirstName = firstName1.compareTo(firstName2);
                if (compareByFirstName != 0){
                    return compareByFirstName;
                } 
                int compareByLastName = lastName1.compareTo(lastName2);
                    
                return compareByLastName;                                 
            }
            
        });
        
        //Show the list after sorting
        System.out.println("-----------------------------------");
        System.out.println("-------List sorted by name---------");
        for (Object element : mergeList) {
            if (element instanceof Student)
                System.out.println(element.toString());
            else if (element instanceof Worker)
                System.out.println(element.toString());
        }
    }
    
}
