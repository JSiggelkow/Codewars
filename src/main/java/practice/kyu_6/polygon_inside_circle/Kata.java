package practice.kyu_6.polygon_inside_circle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kata {

	private static final double HALF_CIRCLE_DEGREES = 180.0;
	private static final double SIDE_LENGTH_MULTIPLIER = 2.0;
	private static final double AREA_FACTOR = 1.0 / 4.0;
	private static final double DEGREES_IN_SEMICIRCLE = 180.0;

	public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
		double sideLength = calculateSideLength(circleRadius, numberOfSides);
		double polygonArea = calculatePolygonArea(numberOfSides, sideLength);

		BigDecimal bd = new BigDecimal(Double.toString(polygonArea));
		bd = bd.setScale(3, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	private static double calculateSideLength(double circleRadius, int numberOfSides) {
		double degreeMeasure = HALF_CIRCLE_DEGREES / numberOfSides;
		double radianMeasure = Math.toRadians(degreeMeasure);
		return SIDE_LENGTH_MULTIPLIER * circleRadius * Math.sin(radianMeasure);
	}

	private static double calculatePolygonArea(int numberOfSides, double sideLength) {
		double degreeMeasure = DEGREES_IN_SEMICIRCLE / numberOfSides;
		double radianMeasure = Math.toRadians(degreeMeasure);
		return AREA_FACTOR * numberOfSides * Math.pow(sideLength, 2) * (1.0 / Math.tan(radianMeasure));
	}
}
