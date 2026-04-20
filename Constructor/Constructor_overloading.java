public class Constructor_overloading {
    public static class Car{
        String carName;
        String companyName;

        Car(){
            this.carName="tes-s4";
            this.companyName="Tesla";
        }

        Car(String parentCom){
             this.carName=parentCom;
            this.companyName="Audi";
        }

        Car(String parentCom,String oldCompany){
           this.carName=parentCom;
            this.companyName=oldCompany;
        }
        void display(){
            System.out.println("CAR -----: "+carName+ "       CN------ : "+companyName);
        }

    }
    public static void main(String[] args){
        Car cc =new Car();
        Car cc2 =new Car("AudiRss-24");
        Car cc3 =new Car("creata","Hundai");

        cc.display();
        cc2.display();
        cc3.display();

    }
}
