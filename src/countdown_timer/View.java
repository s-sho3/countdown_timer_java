package countdown_timer;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class View extends JFrame{
	private static final long serialVersionUID = 950073717377966425L;
	private final int width = 150;
	private final int height = 50;
	private Controller controller = null;
	private Model model = null;
	//private JComboBox<String> countDownTimeBox = null;
	private JLabel nowTime = new JLabel("0");
	private JTextField nextTime = new JTextField("25:00");

	public View(){
		setupWindow();

		model = new Model(this);
		//new Controller(this, model);
		
		/*
		String[] countDownTime = {"25:00", "00:01"};
		countDownTimeBox = new JComboBox<String>(countDownTime);
		*/
	
		controller = new Controller(this, model);
		//controller.add(countDownTimeBox);
		controller.add(nowTime);
		controller.add(nextTime);
		getContentPane().add(controller);
	}
	
	private void setupWindow(){
		//String version = "V0.0";
		//setTitle("gui_timer "+version);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, height);
		setAlwaysOnTop(true);
		//setLayout(new GridLayout(2, 1));
		setMinimumSize(new Dimension(150, 50));
		setMaximumSize(new Dimension(250, 200));
	}
	public void setTime(int time){
		String min = Integer.toString(time/60);
		String sec = Integer.toString(time%60);
		nowTime.setText(min+":"+sec);
	}
	public void setTime(String message){
		nowTime.setText(message);
	}
	/*
	public int getTimeSec(){
		 String timeStr = (String)(countDownTimeBox.getSelectedItem());
		 String[] timeStrs = timeStr.split(":");
		 return Integer.parseInt(timeStrs[0])*60 + Integer.parseInt(timeStrs[1]);
	}*/
	public String getNextTime(){
		return nextTime.getText();
	}
	public void toggleColor(){
		controller.toggleColor();
	}

	public static void main(String[] args) {
		View view = new View();
		view.setVisible(true);
	}

}
