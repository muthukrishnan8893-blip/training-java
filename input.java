import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name:");
        String name=sc.nextLine();
        System.out.println("name:"+name);
        System.out.println("Enter a age:");
        int age=sc.nextInt();
        System.out.println("age:"+age);
        sc.close();
    }
}
