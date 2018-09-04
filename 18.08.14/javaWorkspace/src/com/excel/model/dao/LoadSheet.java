package com.excel.model.dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class LoadSheet {

	JFileChooser fc = new JFileChooser();

	public void load(ActionEvent e, JTable tb) {

		fc.setDialogTitle("Open a File");
		fc.setCurrentDirectory(new File("C:/test"));
		fc.setFileSelectionMode(fc.FILES_AND_DIRECTORIES);
		fc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(".txt", "txt"));

		int result = fc.showSaveDialog(null);

		if (result == fc.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		} else if (result == fc.APPROVE_OPTION) {
			System.out.println("방금 선택한 파일: " + fc.getSelectedFile().getAbsolutePath());

		}

		Properties prop = new Properties();

		try (FileInputStream fi = new FileInputStream(fc.getSelectedFile())) {
			System.out.println("load");

			prop.load(new FileInputStream(fc.getSelectedFile()));
			fc.setFileSelectionMode(fc.FILES_AND_DIRECTORIES);
			System.out.println(prop.get("0,0"));
			System.out.println("Key" + prop.stringPropertyNames());
			for (int i = 0; i < tb.getRowCount(); i++) // 수정해야한다
			{
				for (int j = 0; j < tb.getColumnCount(); j++) {
					tb.setValueAt(" ", i, j);
				}
			}
			for (String keys : prop.stringPropertyNames()) {

				int selectedRow = Integer.parseInt(keys.split("\\.")[0]);
				int selectedCol = Integer.parseInt(keys.split("\\.")[1]);
				tb.setValueAt(prop.get(keys) + "", selectedRow, selectedCol);

			}

		} catch (Exception e1) {
			System.out.println("불러올 파일이 없습니다.");
			JOptionPane.showMessageDialog(null, "txt 파일이 아닙니다. \n다시 선택해주세요.", "Warning", JOptionPane.WARNING_MESSAGE);
		}
	}

}
