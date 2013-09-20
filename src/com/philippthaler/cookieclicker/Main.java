package com.philippthaler.cookieclicker;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.philippthaler.cookieclicker.buildings.BuildingHolder;
import com.philippthaler.cookieclicker.io.FileIO;
import com.philippthaler.cookieclicker.window.ContentPane;

public class Main extends JFrame {
	public Main() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						Main.class
								.getResource("/com/philippthaler/cookieclicker/window/cookie.png")));
	}

	private static final long serialVersionUID = 549508741433147158L;

	public void createWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(500, 500));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					FileIO.save(BuildingHolder.getIOString());
				} catch (Exception exc) {
					exc.printStackTrace();
				}
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.createWindow();
		FileIO.load();
		ContentPane cp = new ContentPane();

		main.getContentPane().add(cp);

	}

}
