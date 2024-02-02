/**
 * Task4
 */
public class Task4 {
    
    public static void main(String[] args) {
        int hours = 9;
        int minutes = 30;

        ClockAngle clockAngle = new ClockAngle();
        double angle = clockAngle.calculateAngle(hours, minutes);
        System.out.println("Угол между часовой и минутной стрелками: " + angle + " градусов");
    }
}
