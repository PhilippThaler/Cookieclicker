package com.philippthaler.cookieclicker.window;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.philippthaler.cookieclicker.buildings.BuildingHolder;

public class ContentPane extends JPanel {

	private static final long serialVersionUID = 3940794299380198095L;

	JLabel lblCookiesOwned;
	JLabel lblCps;

	JLabel lblPricemouse;
	JLabel lblPricegrandma;
	JLabel lblPricefarm;
	JLabel lblPricefactory;
	JLabel lblPricemine;
	JLabel lblPriceshipment;
	JLabel lblPricelab;
	JLabel lblPriceportal;
	JLabel lblPricetime;
	JLabel lblPriceac;

	JButton btnMouse;
	JButton btnGrandma;
	JButton btnFarm;
	JButton btnFactory;
	JButton btnMine;
	JButton btnShipment;
	JButton btnLab;
	JButton btnPortal;
	JButton btnTimeMachine;
	JButton btnAc;

	private static JLabel lblStatusbar;
	private JButton btnRestart;

	public ContentPane() {
		initialize();
	}

	private void initialize() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		this.setLayout(gridBagLayout);

		JLabel lblTitle = new JLabel("Cookie Clicker");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.ipady = 30;
		gbc_lblTitle.gridwidth = 3;
		gbc_lblTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTitle.weightx = 1;
		gbc_lblTitle.insets = new Insets(0, 5, 5, 0);
		gbc_lblTitle.gridx = 0;
		gbc_lblTitle.gridy = 0;
		this.add(lblTitle, gbc_lblTitle);

		lblCookiesOwned = new JLabel("Cookies: " + BuildingHolder.cookies);
		GridBagConstraints gbc_lblCookiesOwned = new GridBagConstraints();
		gbc_lblCookiesOwned.weighty = 1.0;
		gbc_lblCookiesOwned.weightx = 1.0;
		gbc_lblCookiesOwned.insets = new Insets(0, 5, 5, 5);
		gbc_lblCookiesOwned.gridx = 0;
		gbc_lblCookiesOwned.gridy = 1;
		this.add(lblCookiesOwned, gbc_lblCookiesOwned);

		JLabel lblPrice = new JLabel("Price in Cookies:");
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.weightx = 1.0;
		gbc_lblPrice.insets = new Insets(0, 5, 5, 0);
		gbc_lblPrice.gridx = 2;
		gbc_lblPrice.gridy = 1;
		this.add(lblPrice, gbc_lblPrice);

		JButton btnClick = new JButton("Click!");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.cookies++;
			}
		});
		GridBagConstraints gbc_btnClick = new GridBagConstraints();
		gbc_btnClick.fill = GridBagConstraints.BOTH;
		gbc_btnClick.weighty = 1.0;
		gbc_btnClick.weightx = 1;
		gbc_btnClick.insets = new Insets(0, 5, 5, 5);
		gbc_btnClick.gridx = 0;
		gbc_btnClick.gridy = 2;
		this.add(btnClick, gbc_btnClick);

		btnMouse = new JButton("Mouse");
		btnMouse.setHorizontalAlignment(SwingConstants.LEFT);
		btnMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[0].buy();
			}
		});
		GridBagConstraints gbc_btnMouse = new GridBagConstraints();
		gbc_btnMouse.fill = GridBagConstraints.BOTH;
		gbc_btnMouse.weightx = 1.0;
		gbc_btnMouse.insets = new Insets(0, 5, 5, 5);
		gbc_btnMouse.gridx = 1;
		gbc_btnMouse.gridy = 2;
		this.add(btnMouse, gbc_btnMouse);

		lblPricemouse = new JLabel();
		GridBagConstraints gbc_lblPricemouse = new GridBagConstraints();
		gbc_lblPricemouse.weightx = 1.0;
		gbc_lblPricemouse.insets = new Insets(5, 5, 5, 0);
		gbc_lblPricemouse.gridx = 2;
		gbc_lblPricemouse.gridy = 2;
		this.add(lblPricemouse, gbc_lblPricemouse);

		JLabel lblCookiesPerSecond = new JLabel("Cookies per second:");
		GridBagConstraints gbc_lblCookiesPerSecond = new GridBagConstraints();
		gbc_lblCookiesPerSecond.weighty = 1.0;
		gbc_lblCookiesPerSecond.weightx = 1.0;
		gbc_lblCookiesPerSecond.insets = new Insets(0, 5, 5, 5);
		gbc_lblCookiesPerSecond.gridx = 0;
		gbc_lblCookiesPerSecond.gridy = 3;
		this.add(lblCookiesPerSecond, gbc_lblCookiesPerSecond);

		btnGrandma = new JButton("Grandma");
		btnGrandma.setHorizontalAlignment(SwingConstants.LEFT);
		btnGrandma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[1].buy();
			}
		});
		GridBagConstraints gbc_btnGrandma = new GridBagConstraints();
		gbc_btnGrandma.fill = GridBagConstraints.BOTH;
		gbc_btnGrandma.weightx = 1.0;
		gbc_btnGrandma.insets = new Insets(0, 5, 5, 5);
		gbc_btnGrandma.gridx = 1;
		gbc_btnGrandma.gridy = 3;
		this.add(btnGrandma, gbc_btnGrandma);

		lblPricegrandma = new JLabel();
		GridBagConstraints gbc_lblPricegrandma = new GridBagConstraints();
		gbc_lblPricegrandma.weightx = 1.0;
		gbc_lblPricegrandma.insets = new Insets(0, 5, 5, 0);
		gbc_lblPricegrandma.gridx = 2;
		gbc_lblPricegrandma.gridy = 3;
		this.add(lblPricegrandma, gbc_lblPricegrandma);

		lblCps = new JLabel();
		GridBagConstraints gbc_lblCps = new GridBagConstraints();
		gbc_lblCps.weighty = 1.0;
		gbc_lblCps.weightx = 1.0;
		gbc_lblCps.insets = new Insets(0, 5, 5, 5);
		gbc_lblCps.gridx = 0;
		gbc_lblCps.gridy = 4;
		this.add(lblCps, gbc_lblCps);

		btnFarm = new JButton("Farm");
		btnFarm.setHorizontalAlignment(SwingConstants.LEFT);
		btnFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[2].buy();
			}
		});
		GridBagConstraints gbc_btnFarm = new GridBagConstraints();
		gbc_btnFarm.fill = GridBagConstraints.BOTH;
		gbc_btnFarm.weightx = 1.0;
		gbc_btnFarm.insets = new Insets(0, 5, 5, 5);
		gbc_btnFarm.gridx = 1;
		gbc_btnFarm.gridy = 4;
		this.add(btnFarm, gbc_btnFarm);

		lblPricefarm = new JLabel();
		GridBagConstraints gbc_lblPricefarm = new GridBagConstraints();
		gbc_lblPricefarm.weightx = 1.0;
		gbc_lblPricefarm.insets = new Insets(0, 5, 5, 0);
		gbc_lblPricefarm.gridx = 2;
		gbc_lblPricefarm.gridy = 4;
		this.add(lblPricefarm, gbc_lblPricefarm);

		btnFactory = new JButton("Factory");
		btnFactory.setHorizontalAlignment(SwingConstants.LEFT);
		btnFactory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[3].buy();
			}
		});
		GridBagConstraints gbc_btnFactory = new GridBagConstraints();
		gbc_btnFactory.fill = GridBagConstraints.BOTH;
		gbc_btnFactory.weighty = 1.0;
		gbc_btnFactory.weightx = 1.0;
		gbc_btnFactory.insets = new Insets(0, 5, 5, 5);
		gbc_btnFactory.gridx = 1;
		gbc_btnFactory.gridy = 5;
		this.add(btnFactory, gbc_btnFactory);

		lblPricefactory = new JLabel();
		GridBagConstraints gbc_lblPricefactory = new GridBagConstraints();
		gbc_lblPricefactory.weightx = 1.0;
		gbc_lblPricefactory.insets = new Insets(0, 0, 5, 0);
		gbc_lblPricefactory.gridx = 2;
		gbc_lblPricefactory.gridy = 5;
		this.add(lblPricefactory, gbc_lblPricefactory);

		btnMine = new JButton("Mine");
		btnMine.setHorizontalAlignment(SwingConstants.LEFT);
		btnMine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[4].buy();
			}
		});
		GridBagConstraints gbc_btnMine = new GridBagConstraints();
		gbc_btnMine.fill = GridBagConstraints.BOTH;
		gbc_btnMine.weighty = 1.0;
		gbc_btnMine.weightx = 1.0;
		gbc_btnMine.insets = new Insets(0, 5, 5, 5);
		gbc_btnMine.gridx = 1;
		gbc_btnMine.gridy = 6;
		this.add(btnMine, gbc_btnMine);

		lblPricemine = new JLabel();
		GridBagConstraints gbc_lblPricemine = new GridBagConstraints();
		gbc_lblPricemine.weightx = 1.0;
		gbc_lblPricemine.insets = new Insets(0, 5, 5, 0);
		gbc_lblPricemine.gridx = 2;
		gbc_lblPricemine.gridy = 6;
		this.add(lblPricemine, gbc_lblPricemine);

		btnShipment = new JButton("Shipment");
		btnShipment.setHorizontalAlignment(SwingConstants.LEFT);
		btnShipment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[5].buy();
			}
		});
		GridBagConstraints gbc_btnShipment = new GridBagConstraints();
		gbc_btnShipment.weighty = 1.0;
		gbc_btnShipment.weightx = 1.0;
		gbc_btnShipment.fill = GridBagConstraints.BOTH;
		gbc_btnShipment.insets = new Insets(0, 5, 5, 5);
		gbc_btnShipment.gridx = 1;
		gbc_btnShipment.gridy = 7;
		add(btnShipment, gbc_btnShipment);

		lblPriceshipment = new JLabel();
		GridBagConstraints gbc_lblPriceshipment = new GridBagConstraints();
		gbc_lblPriceshipment.weighty = 1.0;
		gbc_lblPriceshipment.weightx = 1.0;
		gbc_lblPriceshipment.insets = new Insets(0, 5, 5, 0);
		gbc_lblPriceshipment.gridx = 2;
		gbc_lblPriceshipment.gridy = 7;
		add(lblPriceshipment, gbc_lblPriceshipment);

		btnLab = new JButton("Alchemy Lab");
		btnLab.setHorizontalAlignment(SwingConstants.LEFT);
		btnLab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[6].buy();
			}
		});
		GridBagConstraints gbc_btnLab = new GridBagConstraints();
		gbc_btnLab.fill = GridBagConstraints.BOTH;
		gbc_btnLab.weighty = 1.0;
		gbc_btnLab.weightx = 1.0;
		gbc_btnLab.insets = new Insets(0, 5, 5, 5);
		gbc_btnLab.gridx = 1;
		gbc_btnLab.gridy = 8;
		this.add(btnLab, gbc_btnLab);

		lblPricelab = new JLabel();
		GridBagConstraints gbc_lblPricelab = new GridBagConstraints();
		gbc_lblPricelab.weightx = 1.0;
		gbc_lblPricelab.insets = new Insets(0, 0, 5, 0);
		gbc_lblPricelab.gridx = 2;
		gbc_lblPricelab.gridy = 8;
		this.add(lblPricelab, gbc_lblPricelab);

		btnPortal = new JButton("Portal");
		btnPortal.setHorizontalAlignment(SwingConstants.LEFT);
		btnPortal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[7].buy();
			}
		});
		GridBagConstraints gbc_btnPortal = new GridBagConstraints();
		gbc_btnPortal.fill = GridBagConstraints.BOTH;
		gbc_btnPortal.weighty = 1.0;
		gbc_btnPortal.weightx = 1.0;
		gbc_btnPortal.insets = new Insets(0, 5, 5, 5);
		gbc_btnPortal.gridx = 1;
		gbc_btnPortal.gridy = 9;
		this.add(btnPortal, gbc_btnPortal);

		lblPriceportal = new JLabel();
		GridBagConstraints gbc_lblPriceportal = new GridBagConstraints();
		gbc_lblPriceportal.weightx = 1.0;
		gbc_lblPriceportal.insets = new Insets(0, 0, 5, 0);
		gbc_lblPriceportal.gridx = 2;
		gbc_lblPriceportal.gridy = 9;
		this.add(lblPriceportal, gbc_lblPriceportal);

		btnTimeMachine = new JButton("Time Machine");
		btnTimeMachine.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimeMachine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[8].buy();
			}
		});
		GridBagConstraints gbc_btnTimeMachine = new GridBagConstraints();
		gbc_btnTimeMachine.fill = GridBagConstraints.BOTH;
		gbc_btnTimeMachine.weighty = 1.0;
		gbc_btnTimeMachine.weightx = 1.0;
		gbc_btnTimeMachine.insets = new Insets(0, 5, 5, 5);
		gbc_btnTimeMachine.gridx = 1;
		gbc_btnTimeMachine.gridy = 10;
		this.add(btnTimeMachine, gbc_btnTimeMachine);

		lblPricetime = new JLabel();
		GridBagConstraints gbc_lblPricetime = new GridBagConstraints();
		gbc_lblPricetime.weightx = 1.0;
		gbc_lblPricetime.insets = new Insets(0, 0, 5, 0);
		gbc_lblPricetime.gridx = 2;
		gbc_lblPricetime.gridy = 10;
		this.add(lblPricetime, gbc_lblPricetime);

		btnAc = new JButton("Antimatter Condenser");
		btnAc.setHorizontalAlignment(SwingConstants.LEFT);
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuildingHolder.buildings[9].buy();
			}
		});

		btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int option = JOptionPane.showConfirmDialog(null,
						"You'll lose all your precious cookies!!!", "Reset?",
						JOptionPane.YES_NO_OPTION);
				if (option == 0)
					BuildingHolder.reset();
			}
		});
		GridBagConstraints gbc_btnRestart = new GridBagConstraints();
		gbc_btnRestart.fill = GridBagConstraints.BOTH;
		gbc_btnRestart.insets = new Insets(0, 0, 5, 5);
		gbc_btnRestart.gridx = 0;
		gbc_btnRestart.gridy = 11;
		add(btnRestart, gbc_btnRestart);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.weighty = 1.0;
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.insets = new Insets(0, 5, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 11;
		this.add(btnAc, gbc_btnNewButton);

		lblPriceac = new JLabel();
		GridBagConstraints gbc_lblPriceac = new GridBagConstraints();
		gbc_lblPriceac.insets = new Insets(0, 0, 5, 0);
		gbc_lblPriceac.weightx = 1.0;
		gbc_lblPriceac.gridx = 2;
		gbc_lblPriceac.gridy = 11;
		this.add(lblPriceac, gbc_lblPriceac);

		lblStatusbar = new JLabel("Statusbar");
		GridBagConstraints gbc_lblStatusbar = new GridBagConstraints();
		gbc_lblStatusbar.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStatusbar.gridwidth = 3;
		gbc_lblStatusbar.gridx = 0;
		gbc_lblStatusbar.gridy = 12;
		add(lblStatusbar, gbc_lblStatusbar);

		ScheduledExecutorService threadAddCookies = Executors
				.newSingleThreadScheduledExecutor();
		threadAddCookies.scheduleAtFixedRate(new Runnable() {
			public void run() {
				BuildingHolder.cookies += BuildingHolder.getCpsAll();
			}
		}, 0, 1, TimeUnit.SECONDS);

		ScheduledExecutorService threadUpdate = Executors
				.newSingleThreadScheduledExecutor();
		threadUpdate.scheduleAtFixedRate(new Runnable() {
			public void run() {
				update();
			}
		}, 0, 10, TimeUnit.MILLISECONDS);

	}

	public void update() {
		this.lblCookiesOwned.setText(String.format("%.1f",
				BuildingHolder.cookies));
		this.lblCps.setText(String.format("%.1f", BuildingHolder.getCpsAll()));

		this.lblPricemouse.setText("" + BuildingHolder.buildings[0].getPrice());
		this.lblPricegrandma.setText(""
				+ BuildingHolder.buildings[1].getPrice());
		this.lblPricefarm.setText("" + BuildingHolder.buildings[2].getPrice());
		this.lblPricefactory.setText(""
				+ BuildingHolder.buildings[3].getPrice());
		this.lblPricemine.setText("" + BuildingHolder.buildings[4].getPrice());
		this.lblPriceshipment.setText(""
				+ BuildingHolder.buildings[5].getPrice());
		this.lblPricelab.setText("" + BuildingHolder.buildings[6].getPrice());
		this.lblPriceportal
				.setText("" + BuildingHolder.buildings[7].getPrice());
		this.lblPricetime.setText("" + BuildingHolder.buildings[8].getPrice());
		this.lblPriceac.setText("" + BuildingHolder.buildings[9].getPrice());

		this.btnMouse.setToolTipText("Mouse: "
				+ BuildingHolder.buildings[0].getAmount());
		this.btnGrandma.setToolTipText("Grandma: "
				+ BuildingHolder.buildings[1].getAmount());
		this.btnFarm.setToolTipText("Farm: "
				+ BuildingHolder.buildings[2].getAmount());
		this.btnFactory.setToolTipText("Factory: "
				+ BuildingHolder.buildings[3].getAmount());
		this.btnMine.setToolTipText("Mine: "
				+ BuildingHolder.buildings[4].getAmount());
		this.btnShipment.setToolTipText("Shipment: "
				+ BuildingHolder.buildings[5].getAmount());
		this.btnLab.setToolTipText("Alchemy Lab: "
				+ BuildingHolder.buildings[6].getAmount());
		this.btnPortal.setToolTipText("Portal: "
				+ BuildingHolder.buildings[7].getAmount());
		this.btnTimeMachine.setToolTipText("Time Machine: "
				+ BuildingHolder.buildings[8].getAmount());
		this.btnAc.setToolTipText("Antimatter Condenser: "
				+ BuildingHolder.buildings[9].getAmount());

	}

	public static void setStatusbar(String s) {
		lblStatusbar.setText("Statusbar: " + s);
	}
}
