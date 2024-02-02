public class ClockAngle {
    public double calculateAngle(int hours, int minutes) {
        if (hours < 0 || hours > 24 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Некорректно указано время");
        }
        if (hours > 12) {
            hours -= 12;
        }
        double hourAngle = 30 * hours;
        double minuteAngle = 6 * minutes;
        double angle = Math.abs(hourAngle - minuteAngle);

        angle = Math.min(angle, 360 - angle);

        return angle;
    }
}