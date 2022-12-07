//********************************************************************************* Line Intersection ******************************************************************************

package com.epam.rd.autotasks.intersection;

public class Line {
    private final int k;
    private final int b;


    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        int denom = (this.k - other.k); // Checking if denominator is ZERO
        if (denom != 0) {
            int x = (other.b - this.b) / (this.k - other.k);
            int y = this.k * x + this.b;
            return new Point(x, y);
        }
        else return null; // If denominator is ZERO, return NULL
    }

}
