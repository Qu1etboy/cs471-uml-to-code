import java.util.ArrayList;
import java.util.List;

public class MGame {
    private final int NUM_OF_DICE = 2;
    private final int MAX_PLAYER = 8;
    private final int MIN_PLAYER = 2;
    private int roundCount;
    private int numberOfRound;
    private List<Player> players = new ArrayList<>();
    private Die[] dice = new Die[NUM_OF_DICE];
    private Board board;

    public MGame(int numberOfRound, int numberOfPlayer) {
        this.numberOfRound = numberOfRound;
        this.board = new Board();

        for (int i = 0; i < NUM_OF_DICE; i++) {
            dice[i] = new Die();
        }

        for (int i = 0; i < numberOfPlayer; i++) {
            this.players.add(new Player("Name " + i, board, dice));
        }
    }

    public void playGame() {
        if (players.size() < MIN_PLAYER || players.size() > MAX_PLAYER) {
            return;
        }
        while (roundCount < numberOfRound) {
            playRound();
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
        roundCount++;
    }
}
