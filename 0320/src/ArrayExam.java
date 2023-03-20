import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] arr = new String[2];
//		arr[0] = "one";
//		arr[1] = "two";
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		array list
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("th");
		al.add(1,"1");
		al.remove(3);
		al.remove("1");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----------------------------");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(2);
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------");
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("b","ww","g","r"));
		colors.set(3, "blue");
		System.out.println(colors.contains("r"));
		System.out.println(colors.indexOf("ww"));
		colors.clear();
		for(int i=0; i<colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		
		
	}

}
