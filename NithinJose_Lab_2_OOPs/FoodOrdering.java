import java.util.*; 

public class FoodOrdering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Boolean ch = true;
        while(ch){
            System.out.println("\n1.Order Food\n2.Kitchen\n3.Exit");
            int choice = in2.nextInt();
            switch(choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    ch = false;
                    break;
            }
            if(ch){
                
            }
        }
        in.close();
        in2.close();
    }
}