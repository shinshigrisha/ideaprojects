public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    private static int count = 0;
    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 100000000;
    }
    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public static int getCount() {
        return count;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }


    public void add(String name, int price){
        if (contains(name)) {
            return;
        }
        if (totalPrice + price >= limit){
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice + price;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price >= limit){
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void  clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void  print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
