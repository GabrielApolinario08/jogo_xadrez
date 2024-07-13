package chess;

import boardgame.Board;
import boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String msg) {
        super(msg);
    }
}
