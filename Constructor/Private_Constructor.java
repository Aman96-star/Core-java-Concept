public class Private_Constructor {
    public static class Limeted_Edition{
    private static Limeted_Edition val;
    public String carName;

    private Limeted_Edition(){
        this.carName="AUDI";
    }

    public static Limeted_Edition getCar(){
        if(val==null){
            val =new Limeted_Edition();
        }
        return val;
    }
    }

    public static void  main(String[] args){
     //Limeted_Edition le =new Limeted_Edition();  // not work bcz private 
     
Limeted_Edition car1= Limeted_Edition.getCar();
Limeted_Edition car2= Limeted_Edition.getCar();
System.out.println(car1.carName);
System.out.println(car1==car2);
    }

}
