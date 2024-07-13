package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece() {

    }

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public boolean[][] possibleMoves() {
        return null;
    }

    public boolean possibleMove(Position position) {
        return false;
    }

    public boolean isThereAnyPossibleMove() {
        return false;
    }
}
