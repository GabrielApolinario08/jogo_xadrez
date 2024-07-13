package boardgame;

public class Board {
    private Integer rows;
    private Integer columns;

    private Piece[][] pieces;
    public Board() {
        setRows(null);
        setColumns(null);
    }

    public Board(Integer rows, Integer columns) {
        setRows(rows);
        setColumns(columns);
        pieces = new Piece[rows][columns];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Piece piece(Integer row, Integer columns) {
        return pieces[row][columns];
    }
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
    public void placePiece(Piece piece, Position position) {

    }
    public Piece removePiece(Position position) {
        return null;
    }
    public boolean positionExists(Position position) {
        return false;
    }
    public boolean therelsAPiece(Position position) {
        return false;
    }
}
