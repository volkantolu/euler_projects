package mt2.flyweight.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: pc
 * Date: 06.Nis.2010
 * Time: 04:43:24
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {

        String firstRow = "This is first row";

        String secondRow = "This is second row";

        //String thirdRow = "abcdefghijklmnopqrstuvwxyz";

        CharManager.instance().addRow(firstRow, 1);
        CharManager.instance().addRow(secondRow, 2);
        //CharManager.instance().addRow(thirdRow, 3);
        CharManager.getDocument();
        System.out.println("Number of object :"+CharManager.n);

    }
}
