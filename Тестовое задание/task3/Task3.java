/**
 * Task3
 */
public class Task3 {

    public static void main(String[] args) {
        BaseConverter converter = new BaseConverter();

        System.out.println("Введите градусы в цельсиях: ");
        converter.getDegreesCelcius(100);

        System.out.println("Градусы в Кельвинах:");
        converter.convertCK();
        System.out.println(converter.setDegrees());

        System.out.println("Из Кельвинов в Фаренгейты:");
        converter.convertKF();
        System.out.println(converter.setDegrees());

        System.out.println("Из Фаренгейтов в Цельсии:");
        converter.convertFC();
        System.out.println(converter.setDegrees());
    }
}