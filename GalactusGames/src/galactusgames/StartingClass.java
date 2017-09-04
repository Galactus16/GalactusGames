package galactusgames;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartingClass extends Applet implements Runnable, KeyListener {

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

	@Override
	public void keyPressed(KeyEvent e) {

		// Do based on key pressed
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP: System.out.println("Move up");
			break;
		case KeyEvent.VK_DOWN: System.out.println("Move down");
			break;
		case KeyEvent.VK_LEFT: System.out.println("Move left");
			break;
		case KeyEvent.VK_RIGHT: System.out.println("Move right");
			break;
		case KeyEvent.VK_SPACE: System.out.println("Jump");
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		// Do based on key released
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP: System.out.println("Stop moving up");
			break;
		case KeyEvent.VK_DOWN: System.out.println("Stop moving down");
			break;
		case KeyEvent.VK_LEFT: System.out.println("Stop moving left");
			break;
		case KeyEvent.VK_RIGHT:System.out.println("Stop moving right");
			break;
		case KeyEvent.VK_SPACE:System.out.println("Stop moving jump");
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
