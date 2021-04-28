package edu.realemj.Exercises18.Adapter;

public interface Image {
    int getWidth();
    int getHeight();
    void setPixel(int x, int y, int val);
    int getPixel(int x, int y);
}
