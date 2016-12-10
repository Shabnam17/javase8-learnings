package javaApi;

import java.util.ArrayList;
import java.util.List;

public class SampleAL {
	private static void operate() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean add0 = arr.add(1);
		boolean add1 = arr.add(2);
		boolean add2 = arr.add(3);
		boolean add3 = arr.add(4);
		boolean add4 = arr.add(5); // returns boolean
		arr.add(2, 7); // add(int index, E element) returns nothing (void)
		// arr.addAll(3,oldarr);

		ArrayList<Integer> oldarr = new ArrayList<Integer>();
		oldarr.add(30);
		oldarr.add(31);
		oldarr.add(32);

		boolean addAll = arr.addAll(3, oldarr); // returns boolean
		System.out.println(" did addAll occur? : " + addAll);

		System.out.println(arr);
	}

	private static void clearEveryone() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Boby");
		arr.add("heyy");
		arr.add("munni");
		System.out.println("String array : " + arr);
		arr.clear();// void method
		System.out.println("array after clear() method call : " + arr);
		System.out.println("================================");
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Candaloupe");
		fruits.add("Raspberry");
		fruits.add("Apple");
		System.out.println("fruits array : " + fruits);
		Object clone = fruits.clone();// Returns a shallow copy of this
										// ArrayList instance.
		System.out.println("clone fruits.clone() : " + clone);
		System.out.println("================================");
		boolean contains = fruits.contains("apple");
		System.out.println("fruits.contains(" + "apple" + ");  : " + contains);
		boolean contains2 = fruits.contains("Apple");// return boolean
		System.out.println(("fruits.contains(" + "Apple" + ");  : " + contains2));

		System.out.println("=================================");
		System.out.println(
				"EnsureCapacity -> Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.");
		fruits.ensureCapacity(90);

		try {
			String string = fruits.get(9);
			System.out.println(string);
		} catch (IndexOutOfBoundsException iob) {
			System.out.println(iob);
		}

		String string = fruits.get(2);// Returns the element at the specified
										// position in this list.
		System.out.println("The third element : " + string);
		System.out.println("=================================");
		System.out.println(
				"indexOf(Object o) ==>> Returns the index of the first occurrence of the specified element in this list, "
						+ "\nor -1 if this list does not contain the element.");
		int indexOfPen = fruits.indexOf("pen");
		System.out.println("index of pen is : " + indexOfPen);
		int apple = fruits.indexOf("Apple");
		System.out.println("index of Apple : " + apple);
		System.out.println("isEmpty()" + " -->  Returns true if this list contains no elements.");

		boolean empty = fruits.isEmpty();
		System.out.println("is fruits array empty ? : " + empty);
		System.out.println("is this array empty ? : " + arr.isEmpty());
		System.out.println("================================");
		System.out.println("	lastIndexOf(Object o) "
				+ "\nReturns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.");

		fruits.add("Candaloupe");
		System.out.println("lastIndexOf(" + "Candaloupe" + ")  : " + fruits.lastIndexOf("Candaloupe"));
		System.out.println("lastIndexOf when an invalid element is given : " + fruits.lastIndexOf("curd"));

		System.out.println("EXAMPLE FOR ILLEGALARGUMENT EXCEPTION : ");
		try {
			ArrayList huhi = new ArrayList(-8);
		} catch (Exception e) {
			System.out.println("Thrown when the specified initial capacity is negative");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
	/* 	List s1 = new ArrayList();
		try {
			while(true){
			s1.add("gello");
			}
		} catch (Error e) {
			e.printStackTrace();
		}
		System.out.println(s1.size()); */
		
		operate();
		System.out.println("================================");
		clearEveryone();
		System.out.println("================================");
		someExtras();
		
	}

	private static void someExtras() {
		ArrayList<Float> arraylist = new ArrayList<>();
		arraylist.add(1.0f);
		arraylist.add(1.1f);
		arraylist.add(1.2f);
		arraylist.add(1.3f);
		arraylist.add(1.4f);
		arraylist.add(1.5f);
		arraylist.add(1.6f);
		System.out.println(arraylist);
		Float remove = arraylist.remove(2);
		System.out.println("The element removed is : " + remove);
		ArrayList ryt = new ArrayList();
		ryt.add(1.4f);
		ryt.add(1.5f);
		System.out.println(
				"Remove all removes a specified collection... removeAll(Collection<?> c) is the only possible method argument");
		boolean removeAll = arraylist.removeAll(ryt);
		System.out.println("Did u removeAll ? : " + removeAll);

		arraylist.add(2, 8.0f);
		arraylist.add(3, 8.5f);
		arraylist.add(4, 7.5f);

		System.out.println("modified array : " + arraylist);
		System.out.println("Predicate usage in array list using removeIf");
		arraylist.removeIf(f -> (f > 5.0f));
		System.out.println("f -> (f>5.0f) ::::: arraylist now becomes : " + arraylist);
		arraylist.add(2, 8.0f);
		arraylist.add(3, 8.5f);
		arraylist.add(4, 7.5f);
		System.out.println(arraylist);
		int size = arraylist.size();
		System.out.println("current size of the arraylist : " + size);
		try {
			arraylist.subList(2, 89);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Float> subList = arraylist.subList(2, 5);

		System.out.println("subList extracted is : " + subList);
		arraylist.clear();
		System.out.println("To fully vacate the array  --- > arraylist.clear() : " + arraylist);

		System.out.println(
				"trimToSize() ::: " + "\nTrims the capacity of this ArrayList instance to be the list's current size.");
		arraylist.trimToSize();
		
	}
}
