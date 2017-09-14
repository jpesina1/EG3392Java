
public class Cat extends Animal {

	public Cat(String breed, String name, int age) {
		super(breed, name, age);
		toString();
		makeNoise();
		location();
		// TODO Auto-generated constructor stub
	}
	
	public void makeNoise(){
		System.out.println("Meow");
	}
	public void location(){
		System.out.println("Inside");
	}

	@Override
	public String toString() {
		return "Cat [getBreed()=" + getBreed() + ", getName()=" + getName() + ", getAge()=" + getAge() ;
	}
	

}
