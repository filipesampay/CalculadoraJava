import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface extends JFrame {
    public Interface(){
        setSize(350, 500);
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        setInterface();
        setVisible(true);
    }

public class Botoes extends JButton{
    public Botoes(){
        setLayout(new FlowLayout());
        setFont(new Font("Calibri", Font.BOLD, 12));
        setVisible(true);
        setAlignmentX(BOTTOM_ALIGNMENT);
        Dimension TamanhoBotao = new Dimension(35, 35);
        Insets Margens = new Insets(0, 10, 0, 10);
        setPreferredSize(TamanhoBotao);
        setMargin(Margens);
        }
    }

    public void setInterface(){
        Botoes Adicao = new Botoes();
        Botoes Subtracao = new Botoes();
        Botoes Multiplicacao = new Botoes();
        Botoes Divisao = new Botoes();
        Botoes Igual = new Botoes();

        Adicao.setText(" + ");
        Subtracao.setText("  - ");
        Multiplicacao.setText(" x ");
        Divisao.setText(" ÷ ");
        Igual.setText(" = ");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalGlue());


        getContentPane().add(panel);
        panel.add(Adicao);
        panel.add(Subtracao);
        panel.add(Multiplicacao);
        panel.add(Divisao);
        panel.add(Igual);
        

    }
}
