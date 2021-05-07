
package day3task;


public class StudentManager extends UserManager{

    @Override
    public void add(User user) {
        System.out.println(user.getFirsName()+" adlı öğrenci eklendi");
        super.add(user); 
        
    }
    public void lessonsLogin(Student student){
        System.out.println(student.getFirsName()+" adlı öğrenci derse giriyor");
    }

   
    
}
