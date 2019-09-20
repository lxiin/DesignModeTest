package chapter_21_zuhe;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
//        IRoot ceo = new Root("王大麻子","CEO",100000);
//        IBranch developDep = new Branch("六大圈子","研发经理",10000);
//        IBranch salesDep = new Branch("马尔盖子","销售经理",20000);
//        IBranch financeDep = new Branch("赵三驼子","财务经理",15000);
//        IBranch firstDevGrop = new Branch("杨三也斜","开发一组组长",8000);
//        IBranch secondDevGrop = new Branch("杨四也斜","开发二组组长",8000);
//        ILeaf a = new Leaf("a","开发人员",2000);
//        ILeaf b = new Leaf("b","开发人员",2000);
//        ILeaf c = new Leaf("c","开发人员",2000);
//        ILeaf d = new Leaf("d","开发人员",2000);
//        ILeaf e = new Leaf("e","销售人员",2000);
//        ILeaf f = new Leaf("f","销售人员",2000);
//        ILeaf g = new Leaf("g","财务人员",2000);
//        ILeaf h = new Leaf("h","财务人员",2000);
//        ILeaf i = new Leaf("i","开发人员",2000);
//        ILeaf j = new Leaf("j","开发人员",2000);
//        ILeaf k = new Leaf("k","开发人员",2000);
//
//        ILeaf zhengLaoLiu = new Leaf("郑老六","研发部副总",20000);
//
//        ceo.add(developDep);
//        ceo.add(salesDep);
//        ceo.add(financeDep);
//        ceo.add(k);
//        developDep.add(firstDevGrop);
//        developDep.add(secondDevGrop);
//
//        developDep.add(zhengLaoLiu);
//        firstDevGrop.add(a);
//        firstDevGrop.add(b);
//        secondDevGrop.add(c);
//        secondDevGrop.add(d);
//        salesDep.add(e);
//        salesDep.add(f);
//        financeDep.add(g);
//        financeDep.add(h);
//        System.out.println(ceo.getInfo());
//        getAllSuboridateInfo(ceo.getSubordinateInfo());

        Branch ceo = compositeCorpTree();

        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));

    }

    private static String  getTreeInfo(Branch ceo) {
        ArrayList<Corp> subordinaList = ceo.getSubordinate();
        String info = "";
        for (Corp c : subordinaList){
            if (c instanceof Leaf){
                info = info + c.getInfo()+"\n";
            }else{
                info = info + c.getInfo() + "\n" + getTreeInfo((Branch) c);
            }
        }

        return info;
    }

    private static Branch compositeCorpTree() {
        Branch root = new Branch("王大麻子","CEO",100000);
        Branch developDep = new Branch("六大圈子","研发经理",10000);
        Branch salesDep = new Branch("马尔盖子","销售经理",20000);
        Branch financeDep = new Branch("赵三驼子","财务经理",15000);
        Branch firstDevGrop = new Branch("杨三也斜","开发一组组长",8000);
        Branch secondDevGrop = new Branch("杨四也斜","开发二组组长",8000);

        Leaf a = new Leaf("a","开发人员",2000);
        Leaf b = new Leaf("b","开发人员",2000);
        Leaf c = new Leaf("c","开发人员",2000);
        Leaf d = new Leaf("d","开发人员",2000);
        Leaf e = new Leaf("e","销售人员",2000);
        Leaf f = new Leaf("f","销售人员",2000);
        Leaf g = new Leaf("g","财务人员",2000);
        Leaf h = new Leaf("h","财务人员",2000);
        Leaf i = new Leaf("i","开发人员",2000);
        Leaf j = new Leaf("j","开发人员",2000);
        Leaf k = new Leaf("k","开发人员",2000);

        Leaf zhengLaoLiu = new Leaf("郑老六","研发部副总",20000);

        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGrop);
        developDep.addSubordinate(secondDevGrop);

        firstDevGrop.addSubordinate(a);
        firstDevGrop.addSubordinate(b);
        secondDevGrop.addSubordinate(c);
        secondDevGrop.addSubordinate(d);
        salesDep.addSubordinate(e);
        salesDep.addSubordinate(f);
        financeDep.addSubordinate(g);
        financeDep.addSubordinate(h);

        return root;
    }

    private static void getAllSuboridateInfo(ArrayList subordinateInfo) {
        int leght = subordinateInfo.size();
        for(int i = 0; i < leght; i++){
            Object s = subordinateInfo.get(i);
            if (s instanceof Leaf){
                ILeaf employee = (ILeaf) s;
                System.out.println(((Leaf) s).getInfo());
            }else{
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
//                getAllSuboridateInfo(branch.getSubordinateInfo());
            }

        }
    }

}
