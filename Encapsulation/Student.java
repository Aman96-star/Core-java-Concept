package Encapsulation;

public class Student {
    private String name;
    private int marks;

    //getter

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    public void setName(String name){
            if(name==null || name.isBlank()){
                throw new IllegalArgumentException("it is blanc k filed");
            }
            this.name=name;
        }
    public void setMarks(int marks){
            if(marks<0 || marks>100){
                throw new IllegalArgumentException("it is blanc k filed");
            }
            this.marks=marks;
    }


}
