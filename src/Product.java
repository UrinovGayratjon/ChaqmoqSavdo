public class Product {
    private String name;
    private int narx;
    private int shtrix;

    public Product(String name, int narx, int shtrix) {
        this.name = name;
        this.narx = narx;
        this.shtrix = shtrix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNarx() {
        return narx;
    }

    public void setNarx(int narx) {
        this.narx = narx;
    }

    public int getShtrix() {
        return shtrix;
    }

    public void setShtrix(int shtrix) {
        this.shtrix = shtrix;
    }
}
