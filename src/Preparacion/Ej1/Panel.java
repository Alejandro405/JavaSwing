package Preparacion.Ej1;

import javax.swing.*;

public class Panel extends JPanel {//Hay más contenedores para crear ventanas
    private JLabel celsiusLabel;//Tipo de conversion
    private JButton converterButton;//Botón de convertir
    private JLabel fahrenheitLabel;//Tipo de conversion
    protected JTextField tempTextField;//Lo que se rellena

    public static final String COMANDO = "convertir";

    public Panel()
    {
        tempTextField = new JTextField(5);
        celsiusLabel = new JLabel();
        celsiusLabel.setText("Celsius");

        converterButton = new JButton();
            converterButton.setText("Convertir");
        fahrenheitLabel = new JLabel();
            fahrenheitLabel.setText("Fahrenheit");
        //No hay dentro del panel
        JPanel sup = new JPanel();
        sup.add(celsiusLabel);
        sup.add(tempTextField);
        //Ahora tenemos un panel nuevo con la etiqueta y el texto
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));//Al añadir las cosas en 1 línea

    }
}
