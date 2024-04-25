package org.example;

import java.util.ArrayList;
import java.util.List;


public class Land extends Polygon {
private List<City> cities = new ArrayList<>();
    public Land(List<Point> pointList) {
        super(pointList);
    }

    @Override
    public boolean inside(Point point) {
        return super.inside(point);
    }
    public void addCity(City city){

        if( ){
            cities.add(city);
        }throw new RuntimeException();

    }
}
