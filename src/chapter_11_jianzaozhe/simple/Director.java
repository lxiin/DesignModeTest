package chapter_11_jianzaozhe.simple;

public class Director {

    private Builder builder = new ConcreteProduct();
    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }

}
