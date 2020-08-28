package Game;

public class Warrior extends Enemies {
	String Name;
	Warrior(){
		this.Name="A warrior";
	}
	void AttackEnemy() {
		EnemyHealth-=50;
		System.out.println("You attack enemy");
		System.out.println("Enemy Health is "+EnemyHealth);
	}

}
