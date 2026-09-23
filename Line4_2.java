public class Line4_2 {
    private Point4_1 start;
    private Point4_1 end;

    // Конструктор 1: через объекты Point4_1
    public Line4_2(Point4_1 start, Point4_1 end) {
        this.start = start;
        this.end = end;
    }

    // Конструктор 2: через 4 числа
    public Line4_2(int x1, int y1, int x2, int y2) {
        this.start = new Point4_1(x1, y1);
        this.end = new Point4_1(x2, y2);
    }

    public Point4_1 getStart() {
        return start;
    }

    public void setStart(Point4_1 start) {
        this.start = start;
    }

    public Point4_1 getEnd() {
        return end;
    }

    public void setEnd(Point4_1 end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}