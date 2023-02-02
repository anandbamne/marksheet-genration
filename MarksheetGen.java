import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MarksheetGen extends Applet implements ActionListener
{
    Label lTitle,lEnrollNo,lName,lJPR,lSEN,lDCN,lMIC;
    TextField tEnrollNo,tName,tJPR,tSEN,tDCN,tMIC;
      Button cmdReport;
      int total;
      float avg;
  
      public void init()
      {
            setLayout(null);
            lTitle=new Label("Enter Student’s Details For GENERATE MARKSHEET");
            lEnrollNo=new Label("Enrollment No:");
            lName=new Label("Name:");
            lJPR=new Label("JPR:");
            lSEN=new Label("SEN:");
            lDCN=new Label("DCN:");
            lMIC=new Label("MIC:");

           tName=new TextField(25);
           tEnrollNo=new TextField(10);
            tJPR=new TextField(3);
            tSEN=new TextField(3);
            tDCN=new TextField(3);
            tMIC=new TextField(3);

        cmdReport=new Button("GENERATE MARKSHEET");

        lTitle.setBounds(100,0,350,20);
        lName.setBounds(2,75,100,20);
         tName.setBounds(120,75,250,20);
        lEnrollNo.setBounds(2,50,100,20);
            tEnrollNo.setBounds(120,50,100,20);
        lJPR.setBounds(2,100,100,20);
            tJPR.setBounds(120,100,40,20);
        lSEN.setBounds(2,125,100,20);
            tSEN.setBounds(120,125,40,20);
        lDCN.setBounds(2,150,100,20);
        tDCN.setBounds(120,150,40,20);
        lMIC.setBounds(2,175,100,20);
        tMIC.setBounds(120,175,40,20);
        cmdReport.setBounds(100,225,150,30);

        add(lTitle);
            add(lName);add(tName);
            add(lEnrollNo);add(tEnrollNo);
            add(lJPR);add(tJPR);
            add(lSEN);add(tSEN);
            add(lDCN);add(tDCN);
            add(lMIC);add(tMIC);
            add(cmdReport);
        cmdReport.addActionListener(this);
    }
public void actionPerformed(ActionEvent ae)
{
        try
        {
               int jpr=Integer.parseInt(tJPR.getText());
               int sen=Integer.parseInt(tSEN.getText());
               int dcn=Integer.parseInt(tDCN.getText());
               int mic=Integer.parseInt(tMIC.getText());
        total=(jpr+sen+dcn+mic);
        avg=total/4;
        }
        catch(NumberFormatException e)
        {
        }
        repaint();
}
public void paint(Graphics g)
    {
            g.drawString("Gramin Polytechnic Vishnupuri Nanded",80,275);
            g.drawString("Name : "+tName.getText(),2,325);
            g.drawString("Enrollment No.: "+tEnrollNo.getText(),2,300);
            g.drawString("Java Programming:  "+tJPR.getText(),2,350);
            g.drawString("Software Engineering : "+tSEN.getText(),2,375);
            g.drawString("Data Communication and Computer Networks : "+tDCN.getText(),2,400);
            g.drawString("Microprocessor : "+tMIC.getText(),2,425);
            g.drawString("Total: "+total,2,475);
            g.drawString("Average: "+avg,2,500);
      }
}


/*
<Applet code="MarksheetGen" height=600 width=800></applet>
*/