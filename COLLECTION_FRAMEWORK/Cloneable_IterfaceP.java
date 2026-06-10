package COLLECTION_FRAMEWORK;

public class Cloneable_IterfaceP {
    public static class Student implements Cloneable{
        int id;
        Student(int id){
            this.id=id;
        }
        // ------------------------------
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException {
         Student s1 = new Student(101);

        Student s2 = (Student) s1.clone();

        System.out.println(s1.id);
        System.out.println(s2.id);
    }
}
