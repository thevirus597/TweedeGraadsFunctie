import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.text.DecimalFormat;
import java.awt.Font;


public class Paneel extends JPanel{
    private JTextField txtawaarde, txtbwaarde, txtcwaarde;
    private JButton btnbereken, btnwissen;
    private JLabel lbltitel,lblregel,lbla,lblb,lblc, lblfunctie, lbl1, lbl2, lbl3, lbl4, lbltop, lbldiscriminant;

    public Paneel()
    {   
        setLayout(null);
        txtawaarde = new JTextField();
        txtbwaarde = new JTextField();
        txtcwaarde = new JTextField();
        btnbereken = new JButton("Bereken");
        btnwissen = new JButton("Wissen");
        
        
        
        lblregel = new JLabel("Vul een waarde in voor A, B en C (Ax\u00B2+Bx+C)");
        lbla = new JLabel("A");
        lblb = new JLabel("B");
        lblc = new JLabel("C");
        lblfunctie = new JLabel("f(x)");
        lbl1 = new JLabel("Dalparabool of Bergparabool");
        lbldiscriminant = new JLabel("Discriminant");
        lbl2 = new JLabel("Aantal nulpunten");
        lbl3 = new JLabel("Nulpunten");
        lbltop = new JLabel("Top");
        lbl4 = new JLabel("Snijpunt met y-as");

        lblregel.setFont(new Font("Courier New",Font.BOLD,20));
        lblregel.setForeground(Color.WHITE);
        
        lbla.setFont(new Font("Courier New",Font.BOLD,20));
        lbla.setForeground(Color.WHITE);
        
        lblb.setFont(new Font("Courier New",Font.BOLD,20));
        lblb.setForeground(Color.WHITE);
        
        lblc.setFont(new Font("Courier New",Font.BOLD,20));
        lblc.setForeground(Color.WHITE);
        
        lblfunctie.setFont(new Font("Courier New",Font.BOLD,20));
        lblfunctie.setForeground(Color.WHITE);
        
        lbl1.setFont(new Font("Courier New",Font.BOLD,20));
        lbl1.setForeground(Color.WHITE);
        
        lbldiscriminant.setFont(new Font("Courier New",Font.BOLD,20));
        lbldiscriminant.setForeground(Color.WHITE);
        
        lbl2.setFont(new Font("Courier New",Font.BOLD,20));
        lbl2.setForeground(Color.WHITE);
        
        lbl3.setFont(new Font("Courier New",Font.BOLD,20));
        lbl3.setForeground(Color.WHITE);
        
        lbltop.setFont(new Font("Courier New",Font.BOLD,20));
        lbltop.setForeground(Color.WHITE);
        
        lbl4.setFont(new Font("Courier New",Font.BOLD,20));
        lbl4.setForeground(Color.WHITE);
        
        txtawaarde.setFont(new Font("Courier New",Font.BOLD,20));
        txtbwaarde.setFont(new Font("Courier New",Font.BOLD,20));
        txtcwaarde.setFont(new Font("Courier New",Font.BOLD,20));
        
        btnbereken.setFont(new Font("Courier New",Font.BOLD,20));
        btnwissen.setFont(new Font("Courier New",Font.BOLD,20));
        
        lblregel.setBounds(250, 10, 1000, 15);
        
        lbla.setBounds(205, 30, 50, 50);
        txtawaarde.setBounds(135, 75, 150, 25);
        
        lblb.setBounds(485, 30, 50, 50);
        txtbwaarde.setBounds(420, 75, 150, 25);
        
        lblc.setBounds(775, 30, 50, 50);
        txtcwaarde.setBounds(705, 75, 150, 25);
        
        lblfunctie.setBounds(50, 250, 1000, 20);
        lbl1.setBounds(50, 275, 1000, 20);
        lbldiscriminant.setBounds(50, 300, 1000, 20);
        lbl2.setBounds(50, 325, 1000, 20);
        lbl3.setBounds(50, 350, 1000, 20);
        lbltop.setBounds(50, 375, 1000, 20);
        lbl4.setBounds(50, 400, 1000, 20);
        
        btnbereken.setBounds(350, 125, 150, 50);
        btnwissen.setBounds(500, 125, 150, 50);
        
        
        
       
 
       add(lblregel);
       add(lbla);
       add(lblb);
       add(lblc);
       add(txtawaarde);
       add(txtbwaarde);
       add(txtcwaarde);
       add(btnbereken);
       add(btnwissen);
       add(lblfunctie);
       add(lbl1);
       add(lbldiscriminant);
       add(lbl2);
       add(lbl3);
       add(lbltop);
       add(lbl4);
       
       //decimalen achter komma
       DecimalFormat kformat = new DecimalFormat("###.#");
       
       btnbereken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a,b,c;
                
                
                
                //textfield check
                if (txtawaarde.getText().isEmpty())  {
                 txtawaarde.setText("0");
                a = Double.parseDouble(txtawaarde.getText());
                }else{
                a = Double.parseDouble(txtawaarde.getText());
                }
                if (txtbwaarde.getText().isEmpty())  {
                 txtbwaarde.setText("0");
                b = Double.parseDouble(txtbwaarde.getText());
                }else{
                b = Double.parseDouble(txtbwaarde.getText());}
                if (txtcwaarde.getText().isEmpty())  {
                 txtcwaarde.setText("0");
                c = Double.parseDouble(txtcwaarde.getText());
                }else{
                c = Double.parseDouble(txtcwaarde.getText());
                }
               
                
                
                //a=0, functie bestaat niet
                if(a==0){
                lblfunctie.setText("f(x) = "+a+"x\u00B2 + "+b+"x + "+c);
                lbl1.setText("Dit is geen kwadratische functie, omdat de A waarde gelijk is aan 0");
                lbldiscriminant.setText("");
                lbl2.setText("");
                lbl3.setText("");
                lbltop.setText("");
                lbl4.setText("");
                }else{                
                lblfunctie.setText("f(x) = "+a+"x\u00B2 + "+b+"x + "+c);
                
                //bergparabool of dalparabool
                if (a>0){
                lbl1.setText("Dit is een dalparabool, omdat de waarde van A positief is.");
                }else if(a<0){
                lbl1.setText("Dit is een bergparabool, omdat de waarde van B negatief is.");
                }
                
                //discriminant
                double d = Math.pow(b,2)-4*a*c;
                String D = Double.toString(d);
                lbldiscriminant.setText("De discriminant is "+D);
                
                //aantal nulpunten
                if(d<0){ //geen nulpunten
                    lbl2.setText("Er zijn geen nulpunten, omdat de discriminant negatief is");
                    lbl4.setText("");
                    //snijpunt y-as
                lbl3.setText("Snijpunt met de y-as: (0 , "+c+")");
                //top
                double topx=(-b)/(2*a);
                double topy= a*Math.pow(topx, 2)+b*topx+c;
                lbltop.setText("De top is ("+kformat.format(topx)+","+kformat.format(topy)+")");
                
                }
                
                else if(d>0){ //2nulpunten
                    double n1=(-b+Math.sqrt(d))/(2*a);  
                    double n2=(-b-Math.sqrt(d))/(2*a);
                    lbl2.setText("Er zijn twee nulpunten, omdat de discriminant positief is. ");
                    lbl3.setText("De nulpunten zijn: ("+kformat.format(n1)+" , 0) en ("+kformat.format(n2)+" , 0)");
                    //snijpunt y-as
                lbl4.setText("Snijpunt met de y-as: (0 , "+c+")");
                //top
                double topx=(-b)/(2*a);
                double topy= a*Math.pow(topx, 2)+b*topx+c;
                lbltop.setText("De top is ("+kformat.format(topx)+","+kformat.format(topy)+")");
                
                }
                
                else if(d==0){ //1nulpunt
                    double n = (-b)/(2*a);
                    lbl2.setText("Er is maar een nulpunt, omdat de discriminant gelijk is aan 0. ");
                    lbl3.setText("De nulpunt is: ("+n+" , 0)");
                    //snijpunt y-as
                lbl4.setText("Snijpunt met de y-as: (0 , "+c+")");
                //top
                double topx=(-b)/(2*a);
                double topy= a*Math.pow(topx, 2)+b*topx+c;
                lbltop.setText("De top is ("+kformat.format(topx)+","+kformat.format(topy)+")");
                }
                

                }}});
       
       btnwissen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                

                
                txtawaarde.setText("");
                txtbwaarde.setText("");
                txtcwaarde.setText("");
                lblfunctie.setText("f(x)");
                lbl1.setText("Dalparabool of Bergparabool");
                lbldiscriminant.setText("Discriminant");
                lbl2.setText("Aantal nulpunten");
                lbl3.setText("Nulpunten");
                lbltop.setText("Top");
                lbl4.setText("Snijpunt met y-as");
            }
        });
    }
}