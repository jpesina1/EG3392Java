
public abstract class Animal {
	private String breed;
	private String name;
	private int age;
	public Animal(String breed, String name, int age) {
		super();
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void makeNoise();
	public abstract void location();
	
	
}
