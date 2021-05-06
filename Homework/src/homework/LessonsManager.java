
package homework;

public class LessonsManager {
    String name;
    String surname;

    
    

    public LessonsManager(String name, String surname) {
       
        this.name = name;
        this.surname = surname;
    }
    public void save(Lessons lessons){
        System.out.println("Kaydınız Gerçekleştiriliyor.."+lessons.name);
    }
}
