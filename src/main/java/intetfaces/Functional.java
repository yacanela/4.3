package intetfaces;

public interface Functional<T extends FunctionOnInterval> {
    double calculate(T function);
}