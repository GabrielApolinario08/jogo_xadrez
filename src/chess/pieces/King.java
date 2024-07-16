package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    private ChessMatch chessMatch;
    public King(Board board, Color color, ChessMatch chessMatch) {
        super(board, color);
        this.chessMatch = chessMatch;
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);
        //Above
        p.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Below
        p.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Left
        p.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Right
        p.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //NW
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //NE
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //SW
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //SE
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Special move castling
        if (getMoveCount() == 0 && !chessMatch.getCheck()) {
            // Specialmove castling kingside rook
            Position posT1 = new Position(position.getRow(), position.getColumn() + 3);
            if (testRookCastling(posT1)) {
                if (getBoard().piece(new Position(position.getRow(), position.getColumn() + 1)) == null
                && getBoard().piece(new Position(position.getRow(), position.getColumn() + 2)) == null) {
                    mat[position.getRow()][position.getColumn() + 2] = true;
                }
            }
            // Specialmove castling queenside rook
            Position posT2 = new Position(position.getRow(), position.getColumn() - 4);
            if (testRookCastling(posT2)) {
                if (getBoard().piece(new Position(position.getRow(), position.getColumn() - 3)) == null
                        && getBoard().piece(new Position(position.getRow(), position.getColumn() - 2)) == null
                        && getBoard().piece(new Position(position.getRow(), position.getColumn() - 1)) == null) {
                    mat[position.getRow()][position.getColumn() - 2] = true;
                }
            }
        }


        return mat;
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    private boolean testRookCastling(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
    }

    @Override
    public String toString() {
        return "K";
    }
}
