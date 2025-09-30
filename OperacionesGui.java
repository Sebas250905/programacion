import java.awt.*;
import java.awt.event.*;

public class OperacionesGui {

    private Frame f;
    private Panel pan1, pan2, pan3, pan4;
    private Label lblNum1, lblNum2, lblResultado, lblOperacion;
    private TextField tfNum1, tfNum2, tfResultado;
    private Button btCalcular, btSalir;

    // Grupo de operaciones
    private CheckboxGroup grupoOperaciones;
    private Checkbox cbSuma, cbResta, cbMulti, cbDiv;

    public OperacionesGui() {
        f = new Frame("Operaciones con dos números");

        // Paneles
        pan1 = new Panel();
        pan2 = new Panel();
        pan3 = new Panel();
        pan4 = new Panel();

        // Etiquetas y textos
        lblNum1 = new Label("Primer número: ");
        lblNum2 = new Label("Segundo número: ");
        lblResultado = new Label("Resultado: ");
        lblOperacion = new Label("Seleccione una operación: ");

        tfNum1 = new TextField(5);
        tfNum2 = new TextField(5);
        tfResultado = new TextField(8);
        tfResultado.setEditable(false);

        // Botones
        btCalcular = new Button("Calcular");
        btSalir = new Button("Salir");

        // CheckBox con grupo (solo uno seleccionado a la vez)
        grupoOperaciones = new CheckboxGroup();
        cbSuma = new Checkbox("Suma", grupoOperaciones, true);
        cbResta = new Checkbox("Resta", grupoOperaciones, false);
        cbMulti = new Checkbox("Multiplicación", grupoOperaciones, false);
        cbDiv = new Checkbox("División", grupoOperaciones, false);

        // Eventos
        btCalcular.addActionListener(new MnjBotonCalcular());
        btSalir.addActionListener(e -> System.exit(0));
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Panel superior con inputs
        pan1.setLayout(new GridLayout(3, 2));
        pan1.add(lblNum1);
        pan1.add(tfNum1);
        pan1.add(lblNum2);
        pan1.add(tfNum2);
        f.add(pan1,BorderLayout.NORTH);

        // Panel de operaciones
        pan4.add(lblOperacion);
        pan4.add(cbSuma);
        pan4.add(cbResta);
        pan4.add(cbMulti);
        pan4.add(cbDiv);
 f.add(pan4, BorderLayout.WEST);

        // Panel de resultado
        pan2.add(lblResultado);
        pan2.add(tfResultado);
        f.add(pan2, BorderLayout.CENTER);

        // Panel de botones
        pan3.setLayout(new GridLayout(1,2));
        pan3.add(btCalcular);
        pan3.add(btSalir);
         f.add(pan3, BorderLayout.SOUTH);  

        f.setSize(400, 250);
        f.setVisible(true);
    }

    class MnjBotonCalcular implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = 0;

                // Verificar qué checkbox está seleccionado
                if (cbSuma.getState()) res = n1 + n2;
                else if (cbResta.getState()) res = n1 - n2;
                else if (cbMulti.getState()) res = n1 * n2;
                else if (cbDiv.getState()) {
                    if (n2 != 0) res = n1 / n2;
                    else {
                        tfResultado.setText("Error: división entre 0");
                        return;
                    }
                }

                tfResultado.setText(Double.toString(res));

            } catch (NumberFormatException ex) {
                tfResultado.setText("Ingrese números válidos");
            }
        }
    }

    public static void main(String[] args) {
        new OperacionesGui();
    }
}
