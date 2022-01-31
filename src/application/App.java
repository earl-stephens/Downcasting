package application;

public class App {

	public static void main(String[] args) {
		//upcasting, subtype polymorphism
		Animal a1 = new Cat();
		
		/*
		 * This doesn't work
		* Cat a2 = a1;
		* May not always work because in some programs the class 
		* that a1 refers to (Animal, in this case) may not be decided
		* until run time (ie, based off of user input).  Have to
		* explicitly downcast
		*/
		
		Cat a2 = (Cat)a1;
		System.out.println(a2);
		a2.speak();
		a2.jump();
	}
}
