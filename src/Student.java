public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    void addExamNotes(int note1, int note2, int note3) {
        c1.note = note1;
        c2.note = note2;
        c3.note = note3;
    }

    void isPass(){
        this.average = (this.c1.note + this.c2.note + this.c3.note)/3.0;
        if(this.average > 55){
            System.out.println("geçtiniz " + average);
        }else{
            System.out.println("kaldınız " + average );
        }
    }


    public void printStu() {
        System.out.println("Student{" +
                "c1=" + c1.name + " :" + c1.note +
                ", c2=" + c2.name +
                ", c3=" + c3.name +
                ", name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", classes='" + classes + '\'' +
                ", average=" + average +
                ", isPass=" + isPass +
                '}');
    }
}
