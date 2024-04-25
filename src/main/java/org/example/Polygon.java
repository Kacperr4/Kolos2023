package org.example;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private List<Point>  pointList = new ArrayList<>();
    public Polygon(List<Point> pointList) {
        this.pointList = pointList;
    }

    public boolean inside(Point point){
        int counter = 0;

        for(int i = 0; i <= pointList.size(); i++){
            Point pa = pointList.get(i);
            Point pb = pointList.get((i+1)%pointList.size());

            if(pa.y>pb.y){
            Point tmp = pa;
            pa = pb;
            pb = tmp;

            }
            double d,x,a,b;
            if(pa.y < point.y && point.y < pb.y){
                d = pb.x - pa.x;
                if(d==0){
                    x=pa.x;
                }else{
                    a = (pb.y - pa.y)/d;
                    b = pa.y - a * pa.x;
                    x = (point.y-b)/a;
                }
                if(x< point.x){
                    counter++;
                }
            }
        }

        if(counter%2!=0){
            return true;
        }else{
            return false;
        }

    }
}












/*import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private List<Point> points = new ArrayList<Point>();


    public Polygon(List<Point> points) {
        this.points = points;
    }

    public boolean inside(Point point) {
        int counter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point pa = points.get(i);
            Point pb = points.get((i + 1) % points.size());
            double d, x, a, b;

            if (pa.getY() > pb.getY()) {
                Point tmp;
                tmp = pa;
                pa = pb;
                pb = tmp;
            }
            if (pa.getY() < point.getY() && point.getY() < pb.getY()) {
                d = pb.getX() - pa.getX();
                if (d == 0) {
                    x = pa.getX();
                } else {
                    a = (pb.getY() - pa.getY()) / d;
                    b = pa.getY() - a * pa.getX();
                    x = (point.y - b) / a;
                }
                if (x < point.x) {
                    counter++;
                }
            }
        }
        return (counter % 2 != 0) ? true : false;
    }

    public List<Point> getPoints() {
        return points;
    }
}

*/
