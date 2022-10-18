import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coord1 = input.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coord2 = input.nextLine();
        System.out.println();
        System.out.println("The two points are: " + coord1 + " and " + coord2);
        int x1 = Integer.parseInt(coord1,1);
        int y1 = Integer.parseInt(coord1, coord1.indexOf(x1) + (x1 + "").length());
        int x2 = Integer.parseInt(coord2, 1);
        int y2 = Integer.parseInt(coord2, coord2.indexOf(x2) + (x2 + "").length());
        if((x2-x1)==0){
            System.out.println("The coordinates entered result in a vertical line along x = " + x2 + " for points " + coord1 + " and " + coord2);

        }else {
            LinearEquation line = new LinearEquation(x1, y1, x2, y2);
        }
    }
}
