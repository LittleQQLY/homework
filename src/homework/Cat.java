package homework;

public class Cat extends Animal implements AnimalShouter{

	public void shout() {
		System.out.println("������һֻ����");
	}
	public Cat() {
		super();
		System.out.println("Cat Constructor1");
	}
	public Cat(String s,int num) {
		super();
		this.setName("˼�ܴ�");
		this.setNumOfLegs(666);
		System.out.println("Cat Constructor2");
	}
	public String toString(){
		return "����:"+this.getName()+"����:"+this.getNumOfLegs();
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		Cat b=new Cat("xiaohu",1);
		System.out.println(b.toString());
	}
}
