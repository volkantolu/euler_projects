/**
 * Created by IntelliJ IDEA.
 * User: gokcen
 * Date: Apr 19, 2010
 * Time: 6:42:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestPegs {
	public static void main(String args[]) {
	RoundPeg roundPeg = new RoundPeg();
	SquarePeg squarePeg = new SquarePeg();
	squarePeg.insert("Inserting square peg...");
        PegAdapter adapter = new PegAdapter(roundPeg);
        adapter.insert("Inserting round peg...");
           }
        }
