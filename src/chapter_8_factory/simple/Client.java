package chapter_8_factory.simple;

public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreatore();
        Product product = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);
    }

}
