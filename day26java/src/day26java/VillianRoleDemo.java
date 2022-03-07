package day26java;

public class VillianRoleDemo implements ActorRoleDemo{
	public void act()
	{
		System.out.println("I CAN ACT");
	}
	public void speak()
	{
		System.out.println("I CAN SPEAK");
	}
	public void rude ()
	{
		System.out.println("I CAN BE rude");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VillianRoleDemo vrd = new VillianRoleDemo();
		vrd.act();
		vrd.speak();
		vrd.rude();

	}


	}


