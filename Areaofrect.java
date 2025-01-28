import java.util.Scanner;
public class Areaofrect {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length: ");
    int length= sc.nextInt();
    System.out.println("Enter breadth: ");
    float breadth=sc.nextFloat();
    sc.close();
    System.out.println("Area of Rectangle is:"+ length*breadth);
  }  
}

