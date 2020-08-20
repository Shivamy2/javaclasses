package src.com.getter;
 /**
  * USing Getter and Setter i.e To use a variable present in another class while making it abstractes
  */
 public class AreaOfCircle {
     double radius; //stores radius od circle
    // getter for radius
    public double getRadius() {
        return radius;
    }
    // setter for radius
    public double setRadius(double rad) {
        radius = rad;
        return radius;
    }
    double AreaCalculation(double radius) {
        double area = 2.14 * radius * radius;
        return area;
    }
 }