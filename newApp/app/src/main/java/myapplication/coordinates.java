package myapplication;
/*
  coordinates is an object that contains 2 vectors
  x is the x coordinate of the points in the given cluster
  y is the y coordinate of the points in the given cluster
*/
// Headers:
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unchecked")

public class coordinates implements Serializable {
    public Vector<Double> x;
    public Vector<Double> y;
    public Vector<Double> topRCornerX;
    public Vector<Double> botLCornerX;
    public Vector<Double> topRCornerY;
    public Vector<Double> botLCornerY;
    public int index;
    public int sizeOf;

    public coordinates(Vector<Double> x, Vector<Double> y, Vector<Double> topRCornerX,
        Vector<Double> botLCornerX, Vector<Double> topRCornerY, Vector<Double> botLCornerY,
        int index, int sizeOf) {
        this.x = x;
        this.y = y;
        this.topRCornerX = topRCornerX;
        this.botLCornerX = botLCornerX;
        this.topRCornerY = topRCornerY;
        this.botLCornerY = botLCornerY;
        this.index = index;
        this.sizeOf = sizeOf;
    }
    // Default Constructor
    public coordinates() {}
}
