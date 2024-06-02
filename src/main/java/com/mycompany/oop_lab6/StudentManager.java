/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_lab6;
import java.util.ArrayList;

/**
 *
 * @author GIA HUY
 */
public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();

    public StudentManager() {
    }
    
    public Student findStudentById(String studentID){
        for (Student stu : list){
            if (stu.getStudentID().equals(studentID)){
                return stu;
            }
        }
        return null;
    }
    public boolean addStudent(Student stu){
        if (findStudentById(stu.getStudentID()) == null){
            list.add(stu);
            return true;
        }
        return false;
    }
    public void removeStudent(String id){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getStudentID().equals(id)){
                list.remove(i);
                break;
            }
        }
    }
    public ArrayList<Student> getListStudent() {
        return list;
    }
    public StudentTableModel getStudentTableModel(){
        StudentTableModel model = new StudentTableModel();

        return model;
    }
}
