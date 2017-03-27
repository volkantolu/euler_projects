


public class PegAdapter extends SquarePeg {
	private RoundPeg roundPeg;
	public PegAdapter(RoundPeg peg)
    {
        this.roundPeg = peg;

    }
	public void insert(String str) {
        roundPeg.insertIntoHole(str);
    }
	}

/*
public class PegAdapter implements ISquarePeg, IRoundPeg {
private RoundPeg roundPeg;
private SquarePeg squarePeg;
public PegAdapter(RoundPeg peg) {this.roundPeg = peg;}
public PegAdapter(SquarePeg peg) {this.squarePeg = peg;}
public void insert(String str) {roundPeg.insertIntoHole(str);}
public void insertIntoHole(String msg){squarePeg.insert(msg);}
}
 */
