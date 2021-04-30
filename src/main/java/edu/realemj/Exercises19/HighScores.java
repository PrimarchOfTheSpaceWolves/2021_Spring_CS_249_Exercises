package edu.realemj.Exercises19;

import java.io.*;

public class HighScores {
    public static void main(String [] args) {
        String filename = "highscores.dat";

        try {
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream(filename));
            dos.writeInt(3);
            dos.writeUTF("Jan");
            dos.writeDouble(100.0);
            dos.writeUTF("Kyle");
            dos.writeDouble(95.0);
            dos.writeUTF("Desann");
            dos.writeDouble(84.0);
            dos.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        try {
            DataInputStream dis = new DataInputStream(
                    new FileInputStream(filename));

            int cnt = dis.readInt();
            for(int i = 0; i < cnt; i++) {
                String name = dis.readUTF();
                double score = dis.readDouble();
                System.out.println(name + " --> " + score);
            }

            dis.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
