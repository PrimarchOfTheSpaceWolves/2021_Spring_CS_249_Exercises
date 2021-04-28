package edu.realemj.Exercises18.Adapter;

public class TensorAdapter implements Image {
    private Tensor tdata;

    public TensorAdapter(Tensor t) {
        tdata = t;
    }

    public TensorAdapter(int width, int height) {
        tdata = new Tensor2D(height, width);
    }

    public int getWidth() {
        return tdata.getColumns();
    }

    public int getHeight() {
        return tdata.getRows();
    }

    public void setPixel(int x, int y, int value) {
        tdata.setValue(y, x, value);
    }

    public int getPixel(int x, int y) {
        return (int)tdata.getValue(y, x);
    }
}
