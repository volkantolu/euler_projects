import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;


/**
 * Created by IntelliJ IDEA.
 * User: Volkan Tolu
 * Date: 12.Ara.2009
 * Time: 21:27:36
 * To change this template use File | Settings | File Templates.
 */
public class BookTest extends TestCase {
    /**
     * setUp() method that initializes common objects
     */

    private Book book1;
    private Book book2;
    private Book book3;

    protected void setUp() throws Exception {
        super.setUp();
        book1 = new Book("ES", 12.99);
        book2 = new Book("The Gate", 11.99);
        book3 = new Book("ES", 12.99);
    }

    /**
     * tearDown() method that cleanup the common objects
     */
    protected void tearDown() throws Exception {
        super.tearDown();
        book1 = null;
        book2 = null;
        book3 = null;
    }

    /**
     * Constructor for BookTest.
     *
     * @param name
     */
    public BookTest(String name) {
        super(name);
    }

    public void testEquals() {
        assertFalse(book2.equals(book1));
        assertTrue(book1.equals(book3));
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new BookTest("testEquals"));
        return suite;
    }

}
