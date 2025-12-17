package func;

import intetfaces.FunctionOnInterval;

public class RationalFunction implements FunctionOnInterval {
    private final double a, b, c, d, start, end;
    public RationalFunction(double a, double b, double c, double d, double start, double end) {
        this.a = a; this.b = b; this.c = c; this.d = d; this.start = start; this.end = end;
    }
    public double calculate(double x) { return (a * x + b) / (c * x + d); }
    public double getStart() { return start; }
    public double getEnd() { return end; }
}