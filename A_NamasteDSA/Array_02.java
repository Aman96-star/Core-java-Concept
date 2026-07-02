package A_NamasteDSA;

public class Array_02 {
    static class Room{
        String name;

         Room(String name){
            this.name=name;
        }
    } 
    public static void main(String[] args) {
        // an array can store the primitive values and object reference both
        char cr[] ={'A','C','B','M'};
        for(int i=0;i<cr.length;i++){
            System.out.print(cr[i]+" ");
        }
        System.out.println(); 

        Room rm1 =new Room("Aman");
        Room rm2 =new Room("Rehan");

        Room[] roomvar = {rm1,rm2};
        for(int i=0;i<roomvar.length;i++){

            System.out.println(roomvar[i].name); 
        }

    }
}
