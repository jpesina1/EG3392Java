
public class Dog extends Animal {

	public Dog(String breed, String name, int age) {
		super(breed, name, age);
		toString();
		makeNoise();
		location();
		// TODO Auto-generated constructor stub
	}
	
	public void makeNoise(){
		System.out.println("Bark");
		
	}
	public void location(){
		System.out.println("Outside");
	}

	@Override
	public String toString() {
		return "Dog [getBreed()=" + getBreed() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
}
