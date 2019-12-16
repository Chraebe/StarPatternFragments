package dk.aau.cs.spf.util;

public class Tuple<X, Y> {
    public X x;
    public Y y;

    public Tuple() {}
    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}