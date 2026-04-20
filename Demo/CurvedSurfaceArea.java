public class CurvedSurfaceArea {
    public static void main(String[] args) {
        // if(args.length<=0){
        //     System.out.println("invalid");
        // }

        // else if(args.length==1){
        //     int side =Integer.parseInt(args[0]);
        //     System.out.println(6*side);
        // }
         float pi =3.14f;
      System.out.println("input hieght and radius");
      int h =Integer.parseInt(args[0]);
      int r =Integer.parseInt(args[1]);
      
      double total =(2*pi*r*r)+2*pi*r*h;
      System.out.println(total);

    }
}




// Formula:

// CSA=6×side
// 2
// Input Format

// A single integer side representing the length of a cube side.

// Output Format

// Print the Curved Surface Area of the cube.

// Sample Input
//  Case -1 : 5


//  Case -2 : -4 
// Sample Output
//  Case -1 : Curved Surface Area = 150

//  Case -2 :Invalid Input
// Constraints:
// Constraints

// 1 <= side <= 1000