package day26java;

public interface ActorRoleDemo {
	void act();
	void speak();
	 default void comedy()
	{
		System.out.println("I CAN DO ACTING");
	}
 
}
