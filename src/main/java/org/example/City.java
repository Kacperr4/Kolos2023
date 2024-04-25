package org.example;

import java.util.List;

public class City extends Polygon{
    public City(List<Point> pointList, Point center, String nameOfCity, double lengthOfWall) {
        super(pointList);
        this.center = center;
        this.nameOfCity = nameOfCity;
        this.lengthOfWall = lengthOfWall;
    }

    private boolean port;
    public final Point center;
    private String nameOfCity;
    double lengthOfWall;

    public Point getCenter() {
        return center;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public double getLengthOfWall() {
        return lengthOfWall;
    }
}
