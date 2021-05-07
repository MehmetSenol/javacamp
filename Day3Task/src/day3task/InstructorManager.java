
package day3task;


public class InstructorManager extends UserManager{

    @Override
    public void add(User user) {
        System.out.println(user.getFirsName()+" adlı eğitmen eklendi");
        super.add(user); 
    }
    public void lessonStart(Instructor instructor){
        System.out.println(instructor.getFirsName()+" adlı öğretmen dersi başlatıyor");
    }

    
    
    
}
