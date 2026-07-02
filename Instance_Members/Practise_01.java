

public class Practise_01 {
    
    public static class  Student{
        int num=44;
        String name ="Radient";

        static void foolish(){
            // System.out.println(num);
            Student sv =new Student();
            System.out.println(sv.num);
        }
    }

    public static void main(String[] args) {
        System.out.println("Here we do practise of non static variable");
        Student stu =new Student();
        // this.num; error
        System.out.println("the number of comapny - "+stu.num +" & company name is - "+stu.name );
        Student.foolish();
    }
}
