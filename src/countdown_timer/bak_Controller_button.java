package countdown_timer;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class bak_Controller_button {
	private View view = null;
	private Model model = null;
	//private Boolean flag = false;

	public bak_Controller_button(View view, Model model){
		this.view = view;
		this.model = model;
		createButton();
	}

	private void createButton(){
		/*
		JButton startButton = new JButton("start");
		startButton.setPreferredSize(new Dimension(70, 30));
		startButton.setMargin(new Insets(0, 0, 0, 0));
		startButton.setMaximumSize(new Dimension(70, 30));
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(flag){
					model.start();
				}else{
					model.start(view.getTimeSec());
					flag = true;
				}
			}
		});
		*/
		/*
		JButton stopButton = new JButton("stop");
		stopButton.setPreferredSize(new Dimension(70, 30));
		stopButton.setMargin(new Insets(0, 0, 0, 0));
		stopButton.setMaximumSize(new Dimension(70, 30));
		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.stopTimer();
			}
		});
		*/
		/*
		JButton resetButton = new JButton("reset");
		resetButton.setPreferredSize(new Dimension(70, 30));
		resetButton.setMargin(new Insets(0, 0, 0, 0));
		resetButton.setMaximumSize(new Dimension(70, 30));
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.resetTimer(view.getTimeSec());
				//flag = true;
			}
		});
	*/
		//Panel buttonPanel = new JPanel();
		//buttonPanel.add(startButton);
		//buttonPanel.add(stopButton);
		//buttonPanel.add(resetButton);
		//view.getContentPane().add(buttonPanel);
	}
}
