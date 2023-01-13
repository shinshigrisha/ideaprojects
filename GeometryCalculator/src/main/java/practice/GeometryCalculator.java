package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        if(radius < 0){
            return - 1;
        }
     return  (double) Math.PI  * (radius * radius) ;
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        if(radius < 0) {
            return - 1;
        }
        return 4 * Math.PI / 3 * (radius * radius * radius);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
       boolean possible = a + b <= c || a + c <= b || c + b <= a;
       if(possible) {
           return false;
       }
       return true;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if(!isTrianglePossible(a, b, c)) {
            return - 1.0;
        }
        return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }
}
