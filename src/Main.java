import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Input data by using scanner
      System.out.println("====== Enter Your Information ======");
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your ID: ");
      int id = scanner.nextInt();
      System.out.print("Enter your Name: ");
      String name = scanner.next();
      System.out.print("Enter Gender: ");
      String gender = scanner.next();
      System.out.print("Enter Your Class: ");
      String classes = scanner.next();
      System.out.print("Enter Your Course: ");
      String course = scanner.next();
      System.out.print("Enter Your Score: ");
      float score = scanner.nextFloat();

      // Show data
      System.out.println("====== Show Information ======");
      System.out.println("    ID: " +id);
      System.out.println("  Name: " +name);
      System.out.println("Gender: " +gender);
      System.out.println(" Class: " +classes);
      System.out.println("Course: " +course);
      System.out.println(" Score: " +score);

   }
}