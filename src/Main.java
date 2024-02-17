public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Veli", "555", "TRH");
        Teacher t2 = new Teacher("Einstein","333","FZK");
        Teacher t3 = new Teacher("Ali","321","BIYO");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);


        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "321", "bıyo");
        biyoloji.addTeacher(t3);



        Student s1 = new Student("ekin","3","4",fizik,tarih,biyoloji);

        s1.addExamNotes(30,20,30);

        s1.isPass();



    }
}