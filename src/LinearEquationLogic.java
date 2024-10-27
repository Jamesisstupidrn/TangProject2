import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);
    private String Coordinate = null;
    private int x1 = 0;
    private int y1 = 0;
    private String Coordinate2 = null;
    private int x2 = 0;
    private int y2 = 0;
    public LinearEquationLogic () {
    }




    public void Start() {
        getInfo();
        LinearEquation e = new LinearEquation(x1,y1,x2,y2);
        System.out.println(e.lineInfo());
        if (x1 == x2) {




        } else {
            System.out.println("Enter a value for x: ");
            System.out.println("The point on the line is " + e.coordinateForX(scan.nextDouble()));
            scan.nextLine();
        }


        String yOrN = "";
        while (!yOrN.equals("n")) {
            yOrN = "";
            System.out.println("Would you like to enter another pair of coordinates? y/n: ");
            yOrN = scan.nextLine();
            if (yOrN.equals("y")) {
                getInfo();
                LinearEquation f = new LinearEquation(x1,y1,x2,y2);
                System.out.println(f.lineInfo());
                if (f.isEqual()) {
                } else {
                    System.out.println("Enter a value for x: ");
                    System.out.println("The point on the line is " + f.coordinateForX(scan.nextDouble()));
                    scan.nextLine();
                }
            }




        }
        System.out.println("Thank you for using the slope calculator, goodbye!");


    }
    private void getInfo() {
        System.out.println("enter each coordinate point; both x and y values in a () :");
        Coordinate = scan.nextLine();
        x1 = Integer.parseInt(Coordinate.substring(1,Coordinate.indexOf(",")));
        y1 = Integer.parseInt(Coordinate.substring(Coordinate.indexOf(",")+2,Coordinate.indexOf(")")));
        System.out.println("enter each coordinate point; both x and y values in a () :");
        Coordinate2 = scan.nextLine();
        x2 = Integer.parseInt(Coordinate2.substring(1,Coordinate2.indexOf(",")));
        y2 = Integer.parseInt(Coordinate2.substring(Coordinate2.indexOf(",")+2,Coordinate2.indexOf(")")));
    }




}
