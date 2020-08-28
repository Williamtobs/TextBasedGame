package Game;

public class Zombie extends Enemies {
	String Name;
	Zombie(){
		this.Name="Zombie";
	}

	void AttackEnemy() {
		EnemyHealth-=50;
		System.out.println("You attack enemy");
		System.out.println("Enemy Health is "+EnemyHealth);
	}
}
