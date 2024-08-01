package Ichart_Codes;


class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog_1 extends Animals {

    public Dog_1(String name) {
    	super(name);
    }

    public void sound(int volume) {
        System.out.println("Dog barks with volume: " + volume);
    }
}

class Cat extends Animals {
    public Cat(String name) {
    	super(name);
    }
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Demo_2 {
    public static void main(String[] args) {
    	Dog_1 dog = new Dog_1("Buddy");
        dog.sound(5); 

        Cat cat = new Cat("Whiskers");
        cat.sound();   
    }
}

//public class  {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
