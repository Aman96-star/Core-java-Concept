public class AClass {

    static class A {
        static int a = 4;
    }

    static class B {
        static int a = 10;
    }

    public static void main(String[] args) {
        System.out.println(A.a);
        System.out.println(B.a);
                System.out.println(A.a);

    }
}