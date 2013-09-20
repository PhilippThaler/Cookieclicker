package com.philippthaler.cookieclicker.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

import com.philippthaler.cookieclicker.buildings.BuildingHolder;

public class FileIO {

	final static private String PATH = new JFileChooser().getFileSystemView()
			.getDefaultDirectory()
			+ "\\Cookieclicker\\savegames\\savegame.ccsav";

	public static void save(String output) {
		try {

			File file = new File(PATH);

			if (!file.exists()) {
				if (file.getParentFile().mkdirs())

					file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(BuildingHolder.cookies + ";" + output + "\n");
			bw.newLine();

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void load() {

		File file = new File(PATH);

		file.getParentFile().mkdirs();
		if (!file.exists()) {

			try {
				file.createNewFile();
				BuildingHolder.setBuildings(BuildingHolder.defaultValues);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;

		}

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String s = br.readLine();
			if (s == null)
				s = BuildingHolder.defaultValues;
			BuildingHolder.setBuildings(s);

			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
