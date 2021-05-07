
package day3task;


public class Main {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setId(1);
        student1.setFirsName("Mehmet");
        student1.setLastName("Senol");
        student1.setLesson("Java");
        
        Student student2=new Student();
        student2.setId(3);
        student2.setFirsName("Samet");
        student2.setLastName("Tetik");
        student2.setLesson("C#");
        
        Instructor instructor1=new Instructor();
        instructor1.setId(2);
        instructor1.setFirsName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setJob("software developer");
        
        Instructor instructor2=new Instructor();
        instructor2.setId(4);
        instructor2.setFirsName("Yakup");
        instructor2.setLastName("Yılmaz");
        instructor2.setJob("programmer");
        
        StudentManager studentManager =new StudentManager();
        InstructorManager instructorManager=new InstructorManager();
        
        UserManager userManager=new UserManager();
        Instructor [] instructors={instructor1,instructor2};
        Student [] students={student1,student2};
        
        for (Student student: students) {
            studentManager.add(student);
            studentManager.lessonsLogin(student);
            
        }
        for (Instructor instructor:instructors) {
           instructorManager.add(instructor);
           instructorManager.lessonStart(instructor);
        }
        
        
        
        
        
        
        
    }
}
