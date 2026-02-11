import java.util.Scanner;

public class No1_DataTypes {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i=0; i<T; i++) {
            String n = input.next();

            try {
                long value = Long.parseLong(n);

                System.out.println(n + " can be fitted in:");

                if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(n + " can't be fitted anywhere.");
            }
            
        }

        input.close();
    }
}
