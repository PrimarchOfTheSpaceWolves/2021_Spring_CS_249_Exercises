package edu.realemj.Exercises18.Adapter;

public class ImageProcessor {
    public static void main(String [] args) {
        int width = 100;
        int height = 200;
        Image image = new TensorAdapter(new Tensor2D(height, width));

        System.out.println("First image is "
                + image.getWidth() + " x " + image.getHeight());
    }
}
