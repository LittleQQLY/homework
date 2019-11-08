package homework;

public class Animal implements AnimalShouter{
    private String name;
    private int numOfLegs;
    public void shout() {
    	System.out.println("Animal shout");
    }
    public Animal() {
    	this.name="QQLY";
    	this.numOfLegs=1;
    	System.out.println("Animal Constructor1");
    }
    public Animal(String s,int num) {
    	this.name=s;
    	this.numOfLegs=num;
    	System.out.println("Animal Constructot2");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	} 
	public static void main(String[] args) {
		
		Animal a=new Animal();
		Animal b=new Animal("°¡",15);
		System.out.println(a.getName());
		System.out.println(a.getNumOfLegs());
	}
}
