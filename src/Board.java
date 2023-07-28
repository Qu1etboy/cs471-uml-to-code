public class Board {
    private final int NUM_OF_SQUARE = 40;
    private final Square[] squares = new Square[NUM_OF_SQUARE];

    public Board() {
        for (int i = 0; i < NUM_OF_SQUARE; i++) {
            squares[i] = new Square(Integer.toString(i));
        }
    }

    public Square getSquare(int location) {
        return squares[location];
    }

    public int getSquareIndex(Square location) {
        for (int i = 0; i < NUM_OF_SQUARE; i++) {
            if (squares[i].getName().equals(location.getName())) {
                return i;
            }
        }
        return -1;
    }
}
