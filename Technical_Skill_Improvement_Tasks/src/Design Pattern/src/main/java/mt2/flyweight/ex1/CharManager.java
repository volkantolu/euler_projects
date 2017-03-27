package mt2.flyweight.ex1;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: pc
 * Date: 06.Nis.2010
 * Time: 04:40:27
 * To change this template use File | Settings | File Templates.
 */
public class CharManager {
    private static final CharManager manager = new CharManager();
    public static int n=0;
    /**
     * Harf nesnelerinin yeraldigi liste
     */
    private ArrayList<Character> characterList = new ArrayList<Character>();
    /**
     * Doküman satirlarinin ve satirlarda kullanilan
     * harf pozisyonlarinin tutuldugu iki boyutlu array.
     */
    private Character[][] document = new Character[50][50];

    /**
     * Singleton oldugu için konstrüktörü private
     * olarak deklare ediyoruz.
     */
    private CharManager() {
    }

    public static final CharManager instance() {
        return manager;
    }

    /**
     * Bir harf nesnesi olusturur.
     * Mevcut harf nesneleri harfList
     * degiskeninde tutulur. Bu listede
     * yeralmayan harfler new ile olusturularak
     * listeye dahil edilirler.
     * *
     *
     * @param h Harf
     * @return Harf harf nesnesi
     */
    public static Character getChar(String h) {
        Character character = null;
        for (int i = 0; i < manager.characterList.size(); i++) {
            Character temp = manager.characterList.get(i);
            if (temp.getChar().equals(h)) {
                character = temp;
                break;
            }
        }
// harf bulunamadi, listeye ekliyoruz.
        if (character == null) {
            n++;
            character = new Character(h);
            manager.characterList.add(character);
        }
        return character;
    }


    public void addRow(String row, int rowID) {
/**
 * Bir döngü içinde satirin tüm harflerini
 * ziyaret ederek, dokümanin satirini harf nesneleri
 * ile olusturuyoruz.
 */
        for (int i = 0; i < row.length(); i++) {
            String harf = row.substring(i, i + 1);
            document[rowID][i] = getChar(harf);
        }
    }

    /**
     * Doküman ekranda görüntülenir.
     */
    public static void getDocument() {
        for (int x = 0; x < 50; x++) {
            for (int y = 0; y < 50; y++) {
                if (manager.document[x][y] != null) {
                    System.out.print((manager.document[x][y]).getChar());
                } else break;
            }
            if (manager.document[x][0] != null) {
                System.out.println("");
            }
        }
    }
}
