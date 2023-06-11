import javax.swing.*;
import java.awt.event.*;

class kiloConverter extends JFrame
{
  private JPanel pnl_converter;
  private JLabel lbl_message;
  private JTextField txt_km;
  private JButton btn_calc;
  
  public kiloConverter(){
    setTitle("Kilometer Converter");
    setSize(400, 165);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    buildPanel();
    add(pnl_converter);

  }
  private void buildPanel()
  {
    lbl_message= new JLabel("Enter a number: ");
    txt_km = new JTextField(10);
    btn_calc = new JButton ("Calculate");
    btn_calc.addActionListener(new ListenerForCalcButton());
    pnl_converter= new JPanel();

    pnl_converter.add(lbl_message);
    pnl_converter.add(txt_km);
    pnl_converter.add(btn_calc);

  }
  public static int factorial(int n)
  {
    if(n==0)
      return 1;
    else
      return n * factorial(n-1);
  }
  private class ListenerForCalcButton implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
      int userInput = Integer.parseInt(txt_km.getText());
      int result = factorial(userInput);
      JOptionPane.showMessageDialog(null, "The result: "+ result);
    }
  }
}