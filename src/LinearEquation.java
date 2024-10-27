public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double xValue;
    private double yIntercept;
    private double distance;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        yIntercept = (xValue*x1 - y1);
        distance = distance();
    }
    public double slope() {
        return roundedToHundredth((double)(y1-y2)/(x1-x2));
    }
    public double yIntercept() {
        return roundedToHundredth(y1-slope()*x1);
    }
    public String equation() {
        if (y1 == y2) {
            return "y = " + y1;
        } else if (x1 == x2) {
            return "x = " + x1;
        }


        if (slope() == 1 || slope() == -1) {
            if ((yIntercept() >0) && (slope() == 1)){
                return "y = " + "x + " + yIntercept();
            } else if ((yIntercept() <0) && (slope() == 1)) {
                return "y = " + "x - " + yIntercept()*-1;
            } else if (slope() == 1){
                return "y = " + "x";
            }
            if ((yIntercept() >0) && (slope() == -1)){
                return "y = " + "-x + " + yIntercept();
            } else if ((yIntercept() <0) && (slope() == 1)) {
                return "y = " + "-x - " + yIntercept()*-1;
            } else {
                return "y = " + "-x";
            }
        }
        if (slope() ==  ((int) slope()) *1.0) {
            if (yIntercept() > 0) {
                return "y = " + (int) slope() + "x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = " + (int) slope() + "x - " + yIntercept()*-1;
            } else {
                return "y = " + slope() + "x";
            }
        }  else if (slope() > 0 && (y2-y1) < 0 && (x2-x1) < 0) {
            if (yIntercept() > 0) {
                return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + yIntercept() * -1;
            } else {
                return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
            }
        } else if (slope() < 0 && (y2-y1) > 0 && (x2-x1) < 0) {
            if (yIntercept() > 0) {
                return "y = " + (y2 - y1)*-1 + "/" + Math.abs(x2 - x1) + "x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = " + (y2 - y1)*-1 + "/" + Math.abs(x2 - x1) + "x - " + yIntercept() * -1;
            } else {
                return "y = " + (y2 - y1)*-1 + "/" + Math.abs(x2 - x1) + "x";
            }
        } else {


            if (yIntercept() >0) {
                return "y = " + (y2-y1) + "/" + (x2-x1) + "x + " + yIntercept();
            } else if (yIntercept() <0) {
                return "y = " + (y2-y1) + "/" + (x2-x1) + "x - " + yIntercept()*-1;
            } else {
                return "y = " + (y2-y1) + "/" + (x2-x1) + "x";
            }
        }




    }
    public String coordinateForX(double x) {
        return "( " + x + ", " + roundedToHundredth(slope()*x + yIntercept()) + ")";
    }
    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2)));
    }
    private double roundedToHundredth(double toRound) {
        return Math.round(toRound*100)/100.0;
    }








    public String lineInfo() {
        if (x1 == x2) {
            return "These points are on a verticle line: "+ equation();
        }
        return "The two points are: (" +  x1 +", " +y1 +  ") and (" + x2 +", " +y2 + ")\nThe equation of the line between these points is: " + equation() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe slope of this line is: " + slope() + "\nThe distance between these points is: " + distance();
    }
    public Boolean isEqual() {
        return (x1 == x2);
    }
}




