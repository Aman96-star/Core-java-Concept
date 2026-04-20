public class Super_Keyword {
    public static class Car{
        String carName="ScorpioN";
    }

    public static class Model extends Car{
        void Show(){
            System.out.println("use of super call parent variable: "+super.carName);
        }
    }

    public static void main(String[] args){
        Model mm= new Model();
        mm.Show();

    }
}
