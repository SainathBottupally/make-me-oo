package org.oop;

public class DistanceAndDirectionCalculator {

    private final Point to;
    private final Point from;

    DistanceAndDirectionCalculator(Point from, Point to){
        this.from = from;
        this.to = to;
    }
    public double distance() {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction() {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
