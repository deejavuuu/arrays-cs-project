package samplearrays;

public class CourseNumbersArray {
    public static int[] addNewCourse(int[] registeredCourses, int newCourse){

        int[] updatedCourses = new int[registeredCourses.length + 1];
        for(int i = 0; i < registeredCourses.length;i++){
            if(registeredCourses[i] == newCourse){return registeredCourses;}
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[registeredCourses.length] = newCourse;
        return updatedCourses;
    }
    public static void printCourses(int[] registeredCourses){
        for(int i:registeredCourses){
            System.out.println("Course : "+i);
        }
    }
    public static boolean containsCourse(int[] registeredCourses, int course){
        for(int i:registeredCourses){
            if(i == course){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int[] updatedCourses = CourseNumbersArray.addNewCourse(registeredCourses, 2250);
        CourseNumbersArray.printCourses(updatedCourses);
        System.out.println("Updated Courses contain course 2250: "+CourseNumbersArray.containsCourse(updatedCourses,2250));
        System.out.println("Updated Courses contain course 3000: "+CourseNumbersArray.containsCourse(updatedCourses,3000));


    }
}
