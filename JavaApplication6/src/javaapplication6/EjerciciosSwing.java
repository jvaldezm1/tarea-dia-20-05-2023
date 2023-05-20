
package javaapplication6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjerciciosSwing extends JFrame {

  public EjerciciosSwing() {
        // Configuración de la ventana principal
        setTitle("Ejercicios de Swing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Ejercicio 1: Etiqueta
        JLabel label = new JLabel("Ejercicio 1: Etiqueta");
        add(label);

        // Ejercicio 2: Botón
        JButton button = new JButton("Ejercicio 2: Botón");
        add(button);

        // Ejercicio 3: Campo de texto
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100, 30));
        add(textField);

        // Ejercicio 4: Cuadro de lista
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        add(comboBox);

        // Ejercicio 5: Casillas de verificación
        JCheckBox checkBox1 = new JCheckBox("Opción 1");
        add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox("Opción 2");
        add(checkBox2);

        // Ejercicio 6: Botones de opción
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        add(radioButton1);

        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        add(radioButton2);

        // Agrupar los botones de opción para que solo uno pueda ser seleccionado
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);

        // Ejercicio 7: Área de texto
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Ejercicio 8: Panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        add(panel);

        // Ejercicio 9: Diálogo de mensaje
        JButton messageButton = new JButton("Mostrar mensaje");
        messageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(EjerciciosSwing.this, "¡Hola!");
            }
        });
        add(messageButton);

        // Ejercicio 10: Diálogo de entrada
        JButton inputButton = new JButton("Mostrar entrada");
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(EjerciciosSwing.this, "Ingrese un valor:");
                System.out.println("El valor ingresado es: " + input);
            }
        });
        add(inputButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EjerciciosSwing().setVisible(true);
            }
        });
    }
}
