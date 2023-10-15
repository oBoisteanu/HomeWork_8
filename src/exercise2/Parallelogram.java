package exercise2;

public class Parallelogram {
    public int length;
    public double width;
    public int sideLength;
    public int degree;
    double sin_x = Math.sin(Math.toRadians(degree));

    public int height = 10;

    public int perimeter;

    public Parallelogram (){

    }
     public int calculatePerimeter(int length, int width) {
        return perimeter = 2*(length + width);

    }
    public double calculatePerimeter(int sideLength) {
        return  perimeter = 4 * sideLength;
    }

    public double calculateArea(int length, double width) {
        return length * width * sin_x;
    }
    public int calculateArea(int sideLength) {
        return sideLength * height;
    }

}
