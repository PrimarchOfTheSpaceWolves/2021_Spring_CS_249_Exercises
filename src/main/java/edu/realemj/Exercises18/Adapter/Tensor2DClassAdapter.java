package edu.realemj.Exercises18.Adapter;

public class Tensor2DClassAdapter
        extends Tensor2D implements Image {

    public Tensor2DClassAdapter(int width, int height) {
        super(height, width);
    }

    public int getWidth() {
        return colCnt;
    }

    public int getHeight() {
        return rowCnt;
    }

    public void setPixel(int x, int y, int value) {
        if(isValidPosition(y, x)) {
            data[y][x] = value;
        }
    }

    public int getPixel(int x, int y) {
        if(isValidPosition(y, x)) {
            return (int)data[y][x];
        }
        return 0;
    }
}
