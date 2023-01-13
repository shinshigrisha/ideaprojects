package practice;

public class main {
    public static void main(String[] args) {
        System.out.println(GeometryCalculator.getCircleSquare(15));
        System.out.println(GeometryCalculator.getCircleSquare(-5));
        System.out.println(GeometryCalculator.getTriangleSquare(5,5,5));
        System.out.println(GeometryCalculator.getTriangleSquare(6,7,15));
        System.out.println(GeometryCalculator.getSphereVolume(5));
        System.out.println(GeometryCalculator.getSphereVolume(- 1));
        System.out.println(GeometryCalculator.isTrianglePossible(2, 3, 4));
        System.out.println(GeometryCalculator.isTrianglePossible(2,3,6));
        System.out.println(Math.PI);
    }
}
