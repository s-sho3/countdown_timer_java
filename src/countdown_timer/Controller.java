package countdown_timer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class Controller extends JPanel implements MouseListener{
	private static final long serialVersionUID = -1638596616737043229L;
	private final String version = "V0.0";
	private Model model = null;
	private Boolean started = false;
	JPopupMenu popup = new JPopupMenu();

	public Controller(View view, Model model){
		this.model = model;
		addMouseListener(this);
/*
		addPopupMenuItem("setTime:"+"25:00", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getModel().setTime(25*60);
				stop();
			}
		});
		addPopupMenuItem("setTime:"+"00:01", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getModel().setTime(1);
				stop();
			}
		});
		addPopupMenuItem("version", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("gui_countdown_timer:"+version);
			}
		});
		*/
	}

	private void addPopupMenuItem(String name, ActionListener al){
		JCheckBoxMenuItem item = new JCheckBoxMenuItem(name);
		item.addActionListener(al);
		popup.add(item);
	}
	public void mouseClicked(MouseEvent e){
		if(SwingUtilities.isRightMouseButton(e)){
			popup.show(e.getComponent(), e.getX(), e.getY());
		}else if(e.getClickCount() >= 2){
			reset();
		}else if(started){
			stop();
		}else{
			start();
		}
	}
	
	public void mousePressed(MouseEvent e){
	}
	public void mouseReleased(MouseEvent e){
	}
	public void mouseEntered(MouseEvent e){
	}
	public void mouseExited(MouseEvent e){
	}

	private void start(){
		started = true;
		model.start();
	}
	private void stop(){
		started = false;
		getModel().stopTimer();
	}
	private void reset(){
		started = true;
		model.resetTimer();
	}
	private Model getModel(){
		return model;
	}

	public void toggleColor(){
		if(getBackground().getRGB() != new Color(219, 0, 29).getRGB()){
			setBackground(new Color(219, 0, 29));
		}else{
			Color color = new Color(50 , 0, 110);
			setBackground(color);			
		}
	}
}
