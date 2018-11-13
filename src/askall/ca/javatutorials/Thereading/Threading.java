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
       
        TimerThread th = new TimerThread(timerLabel);        // 타이머 스레드로 사용할 객체 생성
       
        this.add(timerLabel);
       
        setSize(300,150);
        setVisible(true);
       
        th.start();                // 타이머 스레드의 실행을 시
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Threading();
		
	}

}
