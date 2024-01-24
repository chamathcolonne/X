class Parent {
	
}
class Child extends Parent {
	
}

class Main {
	public static void main(String args[]){
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(child instanceof Parent);	//?
		System.out.println(parent instanceof Parent);	//?
		System.out.println(parent instanceof Child);	//?
		System.out.println(parent instanceof Object);	//?
		System.out.println(child instanceof Object);	//?
	}
}

