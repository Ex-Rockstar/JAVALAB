import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class StudentReport extends Applet implements ActionListener {
    Label lblTitle, lblRegNo, lblName, lblJava, lblSE, lblCA, lblBI, lblSSPD;
    TextField txtRegNo, txtName, txtJava, txtSE, txtCA, txtBI, txtSSPD;
    Button cmdReport;
    int total;
    float avg;

    public void init() {
        setLayout(null);
        lblTitle = new Label("Enter Student’s Details");
        lblRegNo = new Label("Reg. No:");
        lblName = new Label("Name:");
        lblJava = new Label("Java:");
        lblSE = new Label("SE:");
        lblCA = new Label("CA:");
        lblBI = new Label("BI:");
        lblSSPD = new Label("SSPD:");
        txtRegNo = new TextField(10);
        txtName = new TextField(25);
        txtJava = new TextField(3);
        txtSE = new TextField(3);
        txtCA = new TextField(3);
        txtBI = new TextField(3);
        txtSSPD = new TextField(3);
        cmdReport = new Button("View Student Result");

        lblTitle.setBounds(100, 0, 200, 20);
        lblRegNo.setBounds(0, 50, 100, 20);
        txtRegNo.setBounds(120, 50, 100, 20);
        lblName.setBounds(0, 75, 100, 20);
        txtName.setBounds(120, 75, 250, 20);
        lblJava.setBounds(0, 100, 100, 20);
        txtJava.setBounds(120, 100, 40, 20);
        lblSE.setBounds(0, 125, 100, 20);
        txtSE.setBounds(120, 125, 40, 20);
        lblCA.setBounds(0, 150, 100, 20);
        txtCA.setBounds(120, 150, 40, 20);
        lblBI.setBounds(0, 175, 100, 20);
        txtBI.setBounds(120, 175, 40, 20);
        lblSSPD.setBounds(0, 200, 100, 20);
        txtSSPD.setBounds(120, 200, 40, 20);
        cmdReport.setBounds(100, 225, 150, 30);

        add(lblTitle);
        add(lblRegNo);
        add(txtRegNo);
        add(lblName);
        add(txtName);
        add(lblJava);
        add(txtJava);
        add(lblSE);
        add(txtSE);
        add(lblCA);
        add(txtCA);
        add(lblBI);
        add(txtBI);
        add(lblSSPD);
        add(txtSSPD);
        add(cmdReport);

        cmdReport.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int java = Integer.parseInt(txtJava.getText());
            int se = Integer.parseInt(txtSE.getText());
            int ca = Integer.parseInt(txtCA.getText());
            int bi = Integer.parseInt(txtBI.getText());
            int sspd = Integer.parseInt(txtSSPD.getText());
            total = java + se + ca + bi + sspd;
            avg = total / 5;
        } catch (NumberFormatException e) {
            repaint();
        }
    }

    public void paint(Graphics g) {
	super.paint(g);
        g.drawString("STUDENT REPORT", 100, 275);
        g.drawString("Reg. No.: " + txtRegNo.getText(), 0, 300);
        g.drawString("Name: " + txtName.getText(), 0, 325);
        g.drawString("Java: " + txtJava.getText(), 0, 350);
        g.drawString("Software Engineering: " + txtSE.getText(), 0, 375);
        g.drawString("Computer Architecture: " + txtCA.getText(), 0, 400);
        g.drawString("Banking & Insurance: " + txtBI.getText(), 0, 425);
        g.drawString("SSPD: " + txtSSPD.getText(), 0, 450);
        g.drawString("Total: " + total, 0, 475);
        g.drawString("Average: " + avg, 0, 500);
    }
}
