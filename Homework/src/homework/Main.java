package homework;

public class Main {
       public static void main(String[] args) {
        Lessons lessons1 =new Lessons(1,"Yazılım Geliştirici Yetiştirme Kampı (C#+ANGULAR)", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.","Engin Demirog ");
        Lessons lessons2=new Lessons(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.","Engin Demirog");
        Lessons lessons3=new Lessons(3, "Programlamaya Giriş İçin Temel Kurs", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.","Engin Demirog");
        Lessons [] lessons={lessons1,lessons2,lessons3};
        for (Lessons lesson: lessons) {
            System.out.println("Kursun İsmi= "+lesson.name+" Öğretenin İsmi= "+lesson.teacher);
        }
        
        
        LessonsManager lessonsmanager=new LessonsManager("Mehmet", "Şenol");
        lessonsmanager.save(lessons2);

    }

   

}
