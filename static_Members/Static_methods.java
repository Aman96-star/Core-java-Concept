public class Static_methods {
    static class Js{
        static String vue="js_framework";
        
         static void Js_method(){
                    System.out.println(vue);

        } 
    }

    public static void main(String[] args) {
        
        Js javascript =new Js();
        // System.out.println(javascript.vue);
        javascript.Js_method();
        
    }
}
