package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Alexandre");
		list.add("Maira");
		list.add("Helena");
		
		list.add(1, "Laura");
		list.add(3, "Marco");
		
		System.out.println(list.size());
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list.size());
		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println("----------------");
		System.out.println(list.indexOf("Alexandre"));
		
		System.out.println("----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());
		for (String obj : result) {
			System.out.println(obj);
		}
		System.out.println("----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
	}

}
