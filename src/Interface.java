import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {

    private final JTextField length_field;
    private final JTextField load_field;
    private final JTextField height_field;
    private final JTextField width_field;
    public Interface() {
        super("Калькулятор однопролетной сосновой балки 1.0");
        super.setBounds(200, 100, 700, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(6, 2, 2, 2));

        JLabel length = new JLabel("Введите длину балки, м: ");
        length_field = new JTextField("",1);

        JLabel load = new JLabel("Введите величину распределенной нагрузки, кН: ");
        load_field = new JTextField("",1);

        JLabel height = new JLabel("Введите высоту сечения балки, м: ");
        height_field = new JTextField("",1);

        JLabel width = new JLabel("Введите ширину сечения балки, м: ");
        width_field = new JTextField("",1);

        container.add(length);
        container.add(length_field);
        container.add(load);
        container.add(load_field);
        container.add(height);
        container.add(height_field);
        container.add(width);
        container.add(width_field);


        JButton calcButton = new JButton("Рассчитать");

        container.add(calcButton);

        calcButton.addActionListener(new ButtonEventManager());


    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String length = length_field.getText();
            double Length = Double.parseDouble(length);

            String load = load_field.getText();
            double Load = Double.parseDouble(load);

            String height = height_field.getText();
            double Height = Double.parseDouble(height);

            String width = width_field.getText();
            double Width = Double.parseDouble(width);

            Calculate calculate = new Calculate();
            checkBeam checkBeam = new checkBeam();

            String message_1 = "Момент силы равен: " + calculate.getMoment(Load, Length) + " Кн * м";
            String message_2 = "\nПрогиб балки равен: " + calculate.getBend(Load, Length, Width, Height) + " мм";
            String message_3 = "\nРеализация прочности сечения на : "
                    + checkBeam.checkBeam(calculate.getMoment(Load, Length), Width, Height) + " %";
            String message_sum = message_1 + message_2 + message_3;

            if(checkBeam.checkBeam(calculate.getMoment(Load, Length), Width, Height) < 100)
                JOptionPane.showMessageDialog(null, message_sum, "Результаты расчета",
                        JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Сечение не проходит по первой группе ПС", "Результаты расчета",
                        JOptionPane.PLAIN_MESSAGE);

            }
        }
}

