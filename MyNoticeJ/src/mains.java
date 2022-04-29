import java.util.Scanner;

public class mains {
     public static void main(String[] args) {

         var notices = new Notices();
         Scanner scanner = new Scanner(System.in);
         int i;
         do {  // Repeat
             System.out.println("Welcome to the Menu");
             System.out.println("1. Save the School Block");
             System.out.println("2. Save the School Task");
             System.out.println("3. Output from storage");
             System.out.print("Please choice, what are you want with a number: ");
             i = scanner.nextInt();
             switch (i) {
                 case 1:
                     System.out.print("Please enter your School Block that you want to save :");
                     notices.SetBlocks(scanner.next());
                     System.out.println(notices.GetBlocks());
                     System.out.println("Successful" + "\n" + "Enter 1 for back to the menu :");
                     scanner.nextInt();
                     break;
                 case 2:
                     System.out.print("Please enter your School task that you want to save :");
                     notices.SetTasks(scanner.next());
                     notices.GetTasks();
                     System.out.println("Successful" + "\n" + "Enter 1 for back to the menu :");
                     scanner.nextInt();
                     break;
                 case 3:
                     System.out.println("Output from storage");
                     notices.GetBlocks();
                     break;
                 case 4:
                 default:
                     System.out.println("Ciao");
                     break;
             }
         } while (i <= 4); // Until like Pascal

     }
}
