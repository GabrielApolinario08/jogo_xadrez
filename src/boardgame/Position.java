package boardgame;

public class Position {
    private Integer row;
    private Integer column;

    public Position() {
        setRow(null);
        setColumn(null);
    }

    public Position(Integer row, Integer column) {
        setRow(row);
        setColumn(column);
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public void setValues(Integer row, Integer column) {
        setRow(row);
        setColumn(column);
    }

    @Override
    public String toString() {
        return getRow() + ", " + getColumn();
    }
}
