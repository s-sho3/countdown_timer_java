package countdown_timer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model {
	private View view = null;
	private Thread timerThread = null;
	private int time = 25*60;
	private int settingTime = 25*60;
	
	public Model(View view){
		this.view = view;
		/*
		try{
			FileReader fileReader = new FileReader("./time_list.txt");
			BufferedReader b = new BufferedReader(fileReader);
			String s;
			while((s = b.readLine()) != null){
				System.out.println(s);
			}
		}catch(FileNotFoundException e){
			  System.out.println(e);
			  System.out.println(System.getProperty("user.dir"));
		}catch(IOException e){
			  System.out.println(e);
		}
		*/
	}
	
	public void start() {
		System.out.println("aa");
		if(timerThread != null) return; //do nothing in running. prevent from multiple requests in very short time.
		this.timerThread = new Thread() {
			@Override
			public void run() {
				try {
					while (time > 0){
						Thread.sleep(1000);
						countDown();
					}
					timeUp();
				}catch(InterruptedException e){
				}
			}
		};
		timerThread.start();
	}
	
	private void countDown(){
		time--;
		setTime(time);
	}
	
	private void timeUp(){
		view.setTime("END");
	}
	
	public void resetTimer(){
		if(timerThread != null) timerThread.interrupt();
		timerThread = null;
		String[] timeStrs = view.getNextTime().split(":");
		setTime(Integer.parseInt(timeStrs[0])*60 + Integer.parseInt(timeStrs[1]));
//		setTime(settingTime);
		start();
	}
	
	public void stopTimer(){
		if(timerThread != null) timerThread.interrupt();
		timerThread = null;
	}
	
	public void setTime(int time){
		this.time = time;
		view.setTime(time);
	}
}
