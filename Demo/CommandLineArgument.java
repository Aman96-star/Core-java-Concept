
class CommandLineArgument {
    public static void main(String[] args) {
        // System.out.println("class");
        // int num =Integer.parseInt(args[0]);

        if (args.length == 0) {
            System.out.println("invalid");
        } else if (args.length == 1) {
            int x = Integer.parseInt(args[0]);
            System.out.println(x * x);
        } else if (args.length == 2) {
            int y = Integer.parseInt(args[0]);
            int z = Integer.parseInt(args[1]);
            System.out.println(y * z);
        }
        else if(args.length == 4) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int d = Integer.parseInt(args[3]);
            System.out.println(a+b+c+d);
        }

    }
}

// cas1 -1
// java CommandLineOperations 1 2 3 4

// case-2 :java CommandLineOperations 4 6

// case-3 :
// java CommandLineOperations 5

// Sample Output
// case-1
// Sum of all numbers = 10
// case-2 :Sum = 10
// Product = 24

// case - 3: Square of 5 = 25