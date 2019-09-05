package chapter_6_kaibiyuanze;

public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int selftPrice = super.getPrice();
        int offPrice = 0;
        if (selftPrice > 4000){
            offPrice = selftPrice * 90 / 100;
        }else{
            offPrice = selftPrice * 80 /100;
        }
        return offPrice;

    }
}
