package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for(Student i: students){
            if(i.getAge() > oldest.getAge()){
                oldest = i;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int adult = 0 ;
        for(Student i: students){
            if(i.isAdult()){
                adult += 1;
            }
        }
        return adult;

    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        if (students.length == 0){return Double.NaN;}
        double sum = 0;
        for(Student i: students){
            sum += i.getGrade();
        }
        return sum / students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student i:students){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for(int i = 0; i< students.length;i++){
            for(int j = 0; j< students.length;j++){
                if(students[j].getAge() < students[i].getAge()){
                    Student temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student i:students){
            if(i.getGrade()>= 15){
                System.out.println("Name: "+i.getName()+" Age: "+i.getAge()+"Id: "+i.getId()+" Grade: "+i.getGrade()+"\n");
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student i:students){
            if(i.getId()==id){
                i.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for(int i = 0; i< students.length;i++){
            for(int j = 0; j< students.length;j++){
                if(students[j].getName().equals(students[i].getName())){
                    System.out.println("Duplicate Name found: "+ students[i].getName());
                    return true;

                }
            }
        }
        System.out.println("No Duplicate Name found. ");

        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] updatedStudents = new Student[students.length+1];
        for(int i = 0; i<students.length;i++){
            updatedStudents[i] = students[i];
        }
        updatedStudents[students.length] = newStudent;
        return  updatedStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr ={new Student(1,"Adnan",20,15),
                new Student(2,"Adnan",21,14),
                new Student(3,"Mehdi",19,16),
                new Student(4,"Sabir",20,13),
                new Student(5,"Dina",18,15)};

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println(ManageStudent.findOldest(arr));

        // 3) Count adults
        System.out.println(ManageStudent.countAdults(arr));

        // 4) Average grade
        System.out.println(ManageStudent.averageGrade(arr));

        // 5) Find by name
        System.out.println(ManageStudent.findStudentByName(arr,"Adnan"));


        // 6) Sort by grade desc
        // sort function
        ManageStudent.sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        boolean updated = ManageStudent.updateGrade(arr,4,16);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        hasDuplicateNames(arr);

        // 10) Append new student
        Student[] updatedStudents = appendStudent(arr,new Student(6,"Mahmoud",19,15));
        System.out.println("== All Students ==");
        for (Student s : updatedStudents) System.out.println(s);
    }
}

