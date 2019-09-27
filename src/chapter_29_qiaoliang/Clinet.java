package chapter_29_qiaoliang;

public class Clinet {

    public static void main(String[] args) {
        House house = new House();
        System.out.println("--------房地产公司是这样运行的--------");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
//        System.out.println("\n");
//        System.out.println("----------服装公司是这样运行的---------");
//
//        ClothesCorp clothesCorp = new ClothesCorp();
//        clothesCorp.makeMoney();
        System.out.println("\n");
        System.out.println("----------山寨公司是这样运行的---------");
        IPod iPod = new IPod();
        IPodCorp iPodCorp = new IPodCorp(iPod);
        iPodCorp.makeMoney();
    }

}
