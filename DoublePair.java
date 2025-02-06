public class DoublePair {
    private double first;
    private double second;
    public DoublePair(double first, double second) {
        this.first = first;
        this.second = second;
    }
    public double getFirst() {
        return first;
    }
    public double getSecond() {
        return second;
    }
    public void swap() {
        double temp = second;
        second = first;
        first = temp;
    }
    public String toString() {
        return String.format("(%f,%f)", first, second);
    }
}