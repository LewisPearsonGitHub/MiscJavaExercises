package com.qa.runner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Runner {
	static ArrayList<Person> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person lewis = new Person("Lewis", 23, "Tech Specialist");
		Person muhammad = new Person("Muhammad", 23, "Tech Specialist");
		Person joe = new Person("Joe", 79, "President");

		list.add(lewis);
		list.add(muhammad);
		list.add(joe);

		list.stream().forEach(x -> System.out.println(x));

		search("Lewis");
		try (FileWriter fi = new FileWriter(
				"C:\\Users\\FiercePC\\Desktop\\QA\\Java\\StreamsInputOutput\\src\\com\\qa\\runner\\newTextFile.txt")) {

			Iterator<Person> itr = null;
			itr = list.listIterator();
			while (itr.hasNext()) {
				fi.write(itr.next() + "\n");
			}
			fi.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}

	}

	public static void search(String name) {
		System.out.println(list.stream().filter(str -> str.getName().equals(name)).collect(Collectors.toList()));
	}

}
