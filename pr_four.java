abstract class Product {
    private String _name;
    private int _price;

    public Product(String name, int price) {
        _name = name;
        _price = price;
    }
    public String getName() {
        return _name;
    }
    public int getPrice() {
        return _price;
    }
    public abstract void work();
}
class PrinterProduct extends Product {
    public PrinterProduct(String name, int price) {
        super(name, price);
    }
    public void work() {
        System.out.println("印刷します。");
    }

     
}
class CameraProduct extends Product {
    public CameraProduct(String name, int price) {
        super( name, price);
    }
    public void work() {
        System.out.println("撮影します。");
    }
}
class Executer{
    public void doProduct(Product p) {
        p.work();
    }
}
class Test {
    public static void main(String[] args) {
        PrinterProduct p1 = new PrinterProduct("AAA", 15000);
        CameraProduct p2 = new CameraProduct("BBB", 30000);
        Executer e = new Executer();
        e.doProduct(p1);
        e.doProduct(p2);
    }
}

//Hello