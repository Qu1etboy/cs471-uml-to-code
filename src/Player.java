public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private Die[] dice;

    public Player(String name, Board board, Die[] dice) {
        this.name = name;
        this.dice = dice;
        this.board = board;
        this.piece = new Piece(board.getSquare(0));
    }

    public void takeTurn() {
        int fvTotal = 0;
        for (Die die : dice) {
            die.roll();
            fvTotal += die.getFaceValue();
        }
        // Get old piece location
        Square oldLoc = piece.getLocation();
        // Get square of the new location
        Square newLoc = board.getSquare((board.getSquareIndex(oldLoc) + fvTotal ) % 40);
        // Set piece to the new location
        piece.setLocation(newLoc);
    }
}
