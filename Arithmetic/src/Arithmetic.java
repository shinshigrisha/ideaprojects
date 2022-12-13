public class Arithmetic {
   private int a,b = 0;

   public Arithmetic(int a, int b) {
       this.a = a;
       this.b = b;
   }

   public int sum() {
       return a + b;
   }
   public int multiply() {
       return a * b;
   }

   public int max() {
       return a > b ? a : b;
   }

    public int min() {
        return  a < b ? a : b;
    }

}


