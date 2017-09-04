package galactusgames;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;

public class StartingClass extends Applet implements Runnable {

	// This is like main for Applet program
	@Override
	public void init() {
		super.init();

		// Initialize the Applet size, background color and title
		setSize(800, 480); // 800 pixel * 480 pixel
		setBackground(Color.BLACK);

		setFocusable(true); // Make sure at Start applet is in Focus to take
							// user Inputs , else you need to first click

		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("Q-Bot Alpha");
	}

	@Override
	public void start() {
		super.start();

		// Create a new thread of the same class and start it - this runs the
		// run method of this class
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void run() {

		// Do repaint every 17 milliseconds to get 60 FPS game
		while (true) {
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
