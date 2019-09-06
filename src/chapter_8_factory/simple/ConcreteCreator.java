package chapter_8_factory.simple;

class ConcreteCreatore extends Creator{
    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {
        Product product = null;
        try {
            product = (Product) Class.forName(tClass.getName()).newInstance();
        }catch (Exception e){

        }
        return (T) product;
    }
}
