package ooad.saurabh.assignment2.trailversion;

/**
 * A CheckersMove object represents a move in the game of Checkers.
 * It holds the row and column of the piece that is to be moved
 * and the row and column of the square to which it is to be moved.
 * (This class makes no guarantee that the move is legal.)   
 */

public class CheckersMove {
    private int fromRow, fromCol;  // Position of piece to be moved.
    private int toRow, toCol;      // Square it is to move to.
    
    public int getFromRow() {
		return fromRow;
	}

	public int getFromCol() {
		return fromCol;
	}

	public int getToRow() {
		return toRow;
	}

	public int getToCol() {
		return toCol;
	}

	CheckersMove(int fromRow, int fromCol, int toRow, int toCol) {
            // Constructor.  Just set the values of the instance variables.
       this.fromRow = fromRow;
       this.fromCol = fromCol;
       this.toRow = toRow;
       this.toCol = toCol;
    }
    
    protected boolean isJump() {
           // Test whether this move is a jump.  It is assumed that
           // the move is legal.  In a jump, the piece moves two
           // rows.  (In a regular move, it only moves one row.)
       return (fromRow - toRow == 2 || fromRow - toRow == -2);
    }
}//end class CheckersMove