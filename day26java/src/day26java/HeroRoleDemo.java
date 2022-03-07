package day26java;

public class HeroRoleDemo implements ActorRoleDemo{
	public void act()
	{
		System.out.println("I CAN ACT");
	}
	public void speak()
	{
		System.out.println("I CAN SPEAK");
	}
	public void comedy ()
	{
		System.out.println("I CAN DO COMEDY");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroRoleDemo hrd = new HeroRoleDemo();
		hrd.act();
		hrd.speak();
		hrd.comedy();

	}

}
