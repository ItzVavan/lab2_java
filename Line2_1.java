public class Line2_1 {
    private Point1 start;
    private Point1 end;

    public Line2_1(Point1 start, Point1 end) {
        this.start = start;
        this.end = end;
    }

    public Point1 getStart() {
        return start;
    }

    public void setStart(Point1 start) {
        this.start = start;
    }

    public Point1 getEnd() {
        return end;
    }

    public void setEnd(Point1 end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}