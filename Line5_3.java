public class Line5_3 extends Line4_2 {

    public Line5_3(Point4_1 start, Point4_1 end) {
        super(start, end);
    }

    public Line5_3(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    // Добавление метода длины линии
    public int getLength() {
        double dx = getEnd().getX() - getStart().getX();
        double dy = getEnd().getY() - getStart().getY();
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }
}