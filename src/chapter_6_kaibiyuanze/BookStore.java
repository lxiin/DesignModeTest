package chapter_6_kaibiyuanze;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {

    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
        bookList.add(new OffNovelBook("AAA",3200,"金庸"));
        bookList.add(new OffNovelBook("BBB",5600,"雨果"));
        bookList.add(new OffNovelBook("CCC",4300,"兰陵笑笑生"));
        bookList.add(new ComputerBook("Think in java","编程语言","李阳",4300));

    }

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("-------------书店卖出去的书籍记录如下:============");
        for (IBook book : bookList){
            System.out.println("书籍名称:"+book.getName()+"\t书籍作者:"+book.getAuthor()+"\t书籍价格:"+format.format(book.getPrice()/100.0)+"元");
        }
    }

}
