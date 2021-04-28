package edu.realemj.Exercises18.Adapter;

public interface Tensor {
    int getRows();
    int getColumns();
    void setValue(int row, int col, double val);
    double getValue(int row, int col);
}
