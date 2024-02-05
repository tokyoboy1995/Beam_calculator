import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double load;
        double length;
        double b;
        double h;
        Calculate calculate = new Calculate();
        checkBeam checkBeam = new checkBeam();



  /*
         System.out.print("Введите значение равномерно-распределенной нагрузки (кН): ");
        load = scanner.nextDouble();

        System.out.print("Введите значение длины (м): ");
        length = scanner.nextDouble();

        System.out.print("Введите значение ширины сечения b (м): ");
        b = scanner.nextDouble();

        System.out.print("Введите значение высоты сечения h (м): ");
        h = scanner.nextDouble();

        System.out.println("\nРезультаты расчета:\n");

        System.out.println("Реализация прочности сечения на: " + checkBeam.checkBeam(calculate.getMoment(load, length), b, h) + " %");

        System.out.println("Момент силы: " + calculate.getMoment(load, length) + " кН");
        System.out.println("Прогиб балки: " + calculate.getBend(load, length, b, h) + " мм");
*/


        Interface form = new Interface();
        form.setVisible(true);

    }
}