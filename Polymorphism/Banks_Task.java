package Polymorphism;

public class Banks_Task {
   
    static class Banks{
         void rateOfInterest(){
            System.out.println("parent 0.4% intrest ");
    }

    }

    static class SBI extends Banks{
       void rateOfInterest(){
        System.out.println("SBI  - 4%");

    } 
}
    static class HDFC extends Banks{
       void rateOfInterest(){
        System.out.println("HDFC - 7%");

    } 
}
    static class ICIC extends Banks{
       void rateOfInterest(){
        System.out.println("ICIC - 3%");
    } 
    }

    public static void main(String[] args) {
        SBI sb = new SBI();
        HDFC h =new HDFC();
        ICIC i =new ICIC();
        sb.rateOfInterest();
        h.rateOfInterest();
        i.rateOfInterest();

}
}

