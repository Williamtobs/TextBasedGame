package Game;

public class Skeleton extends Enemies {
	String Name;
	Skeleton(){
		this.Name="Skeleton";
	}
	void AttackEnemy() {
		EnemyHealth-=50;
		System.out.println("You attack enemy");
		System.out.println("Enemy Health is "+EnemyHealth);
	}

}
