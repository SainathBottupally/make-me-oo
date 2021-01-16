package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, origin);

        Assertions.assertEquals(0, distanceAndDirectionCalculator.distance());
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator1 = new DistanceAndDirectionCalculator(origin, point1);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator2 = new DistanceAndDirectionCalculator(origin, point2);

        Assertions.assertEquals(1, distanceAndDirectionCalculator1.distance());
        Assertions.assertEquals(1, distanceAndDirectionCalculator2.distance());
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(point1, point2);

        Assertions.assertEquals(2, distanceAndDirectionCalculator.distance());
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, point1);

        Assertions.assertEquals(0, distanceAndDirectionCalculator.direction());
        Assertions.assertEquals(0, distanceAndDirectionCalculator.direction());
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, point1);

        Assertions.assertEquals(Math.PI, distanceAndDirectionCalculator.direction());
        Assertions.assertEquals(Math.PI, distanceAndDirectionCalculator.direction());
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, point1);

        Assertions.assertEquals(Math.PI / 2, distanceAndDirectionCalculator.direction());
        Assertions.assertEquals(Math.PI / 2, distanceAndDirectionCalculator.direction());
    }
}
