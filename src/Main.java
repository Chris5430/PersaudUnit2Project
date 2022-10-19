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
        int x1 = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(" ") + 1, coord1.indexOf(")")));
        int x2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(" ") + 1, coord2.indexOf(")")));
        if((x2-x1)==0){
            System.out.println("The coordinates entered result in a vertical line along x = " + x2 + " for points " + coord1 + " and " + coord2);

        }else {
            LinearEquation line = new LinearEquation(x1, y1, x2, y2);
            System.out.println(line.lineInfo());
        }
    }
}
