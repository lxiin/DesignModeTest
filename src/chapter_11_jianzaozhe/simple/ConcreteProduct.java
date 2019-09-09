package chapter_11_jianzaozhe.simple;

public class ConcreteProduct extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return this.product;
    }
}
