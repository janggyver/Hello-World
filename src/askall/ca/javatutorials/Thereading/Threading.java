package askall.ca.javatutorials.Thereading;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class TimerThread extends Thread{
	JLabel timerLabel; 
	
	public TimerThread(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}
	
	//Code for Thread
	public void run(){
		int n = 0;
		while(true){
			timerLabel.setText(Integer.toString(n));
			n++;
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				return ;
			}
		}
	}
}



public class Threading extends JFrame{
	
	Threading(){
		this.setTitle("Thread Write");
		this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
       
        TimerThread th = new TimerThread(timerLabel);        // Ÿ�̸� ������� ����� ��ü ����
       
        this.add(timerLabel);
       
        setSize(300,150);
        setVisible(true);
       
        th.start();                // Ÿ�̸� �������� ������ ��
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Threading();
		
	}

}
