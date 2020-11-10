package Final_exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWrite implements Runnable {

	private static ArrayList<Dates> list;
	private static int lists;

	@Override
	public void run() {
			
			writeFile();
		
	}

	@SuppressWarnings("resource")
	public static ArrayList<Dates> writeFile() {
		list = DengLuClass.getList();
		File file = new File("员工系统数据库.txt");
		if (!file.exists()) {
			xieWngJiang();
			lists = 1;
		} else {
			try {

				FileReader reader = new FileReader("员工系统数据库.txt");
				BufferedReader br = new BufferedReader(reader);
				String str = null;

				while ((str = br.readLine()) != null) {
					String[] s = str.split(",");
					if (s[0] != null) {

						list.add(new Dates(s[0], s[1], s[2], s[3], s[4], s[5]));
					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lists = 1;

		}
		if (lists == 1) {
			return list;

		} else {
			return null;
		}

	}

	public static void inputFile() {
		xieWngJiang();
	}


	private static void xieWngJiang() {
		list = DengLuClass.getList();
		FileWriter xie;

		try {
			xie = new FileWriter("员工系统数据库.txt");

			for (int i = 0; i < list.size(); i++) {
				String string = list.get(i).getString1() + "," + list.get(i).getString2() + ","
						+ list.get(i).getString3() + "," + list.get(i).getString4() + "," + list.get(i).getString5()
						+ "," + list.get(i).getString6();
				if (i != 0 && i != list.size()) {
					xie.write("\n");
				}
				xie.write(string);
			}
			xie.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
