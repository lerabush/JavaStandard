package fourth;

import java.util.Objects;

public class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
        this.x=1;
        this.y=1;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return getClass().getName() + "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
    @Run
    public void printInfo(){
        System.out.println(toString());
    }
}