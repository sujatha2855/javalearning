public class Student {

    int rollnum;
        String name;
        int marks;
    public static void main(String[] args) {

        
        Student s1=new Student();
        s1.name= "tharak";
        s1.rollnum=2;
        s1.marks=10;
        Student s2=new Student();
        s2.name= "rishi";
        s2.rollnum=3;
        s2.marks=15;
        Student s3=new Student();
        s3.name= "thanvi";
        s3.rollnum=8;
        s3.marks=25;
        Student Students[]= new Student[3];
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;
        // for(int i=0;i<Students.length;i++)
        // {
        //     System.out.println(Students[i].name + "  " +":" +Students[i].rollnum+ ":" + Students[i].marks);
        // }
        for(Student stud:Students){
            System.out.println(stud.name+" "+":"+stud.rollnum+" "+stud.marks);

        }
        
    }
}
