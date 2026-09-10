public class function {
    static void greet(){
        System.out.println("Hello");
    }
    static void greetuser(String name){
        System.out.println("Hello, "+name);
    }
    static int multiply(int a, int b){
        return a*b;
    }
    public static  void main(String[]args){
        greet();
        greetuser("Krishnakumar");
        int result=multiply(5,4);
        System.out.println("Multiplication: "+result);
    }
}
