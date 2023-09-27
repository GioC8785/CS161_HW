import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert Three Sides, Side A, Side B, Side C");
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if(X == Y && Y == Z )
                System.out.println(" This is an Equilateral Triangle");
            else if (X==Y||Y==Z||Z==X)
                System.out.println(" This is an Isosceles Triangle ");
            else
                System.out.println("This is an Scalene Triangle");
        }
    }

