package edu.realemj.Exercises12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OBJModel {
    private ArrayList<Vertex> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public void save(String filename) throws IOException {
        try (
                PrintWriter writer = new PrintWriter(filename);
                )
        {
            for(Vertex v : vertices) {
                writer.println("v " + v);
            }

            for(int i = 0; i < indices.size(); i += 3) {
                writer.printf("f %d %d %d\n",
                        indices.get(i),
                        indices.get(i+1),
                        indices.get(i+2));
            }
        }
    }

    public void load(String filename) throws IOException {
        try (
                Scanner inFile = new Scanner(new File(filename));
                )
        {
            vertices.clear();
            indices.clear();

            while(inFile.hasNextLine()) {
                String line = inFile.nextLine();
                // "v 3 6 3"
                // "f 1 2 3"
                // ""
                // "?????"
                if(line.length() > 0) {
                    Scanner lineScan = new Scanner(line);
                    String first = lineScan.next();

                    if(first.equals("v")) {
                        double x = lineScan.nextDouble();
                        double y = lineScan.nextDouble();
                        double z = lineScan.nextDouble();
                        Vertex v = new Vertex(x,y,z);
                        vertices.add(v);
                    }
                    else if(first.equals("f")) {
                        for(int i = 0; i < 3; i++) {
                            indices.add(lineScan.nextInt());
                        }
                    }
                }
            }
        }
    }

    public void scaleY(double s) {
        for(Vertex v : vertices) {
            double y = v.getY();
            y *= s;
            v.setY(y);
        }
    }

    public static void main(String [] args) {
        try {
            OBJModel model = new OBJModel();
            model.load("bunny.obj");
            model.scaleY(2.0);
            model.save("bunnyStretched.obj");
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }
}
