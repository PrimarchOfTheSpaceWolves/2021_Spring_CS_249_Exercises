package edu.realemj.Exercises18.Adapter;

public class Tensor2D implements Tensor {
    protected int rowCnt;
    protected int colCnt;
    protected double [][] data;

    public Tensor2D(int rowCnt, int colCnt) {
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.data = new double[rowCnt][colCnt];
    }

    public int getRows() {
        return rowCnt;
    }

    public int getColumns() {
        return colCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return (row >= 0 && col >= 0
                && row < rowCnt && col < colCnt);
    }

    public void setValue(int row, int col, double value) {
        if(isValidPosition(row, col)) {
            data[row][col] = value;
        }
    }

    public double getValue(int row, int col) {
        if(isValidPosition(row, col)) {
            return data[row][col];
        }
        return 0;
    }
}
