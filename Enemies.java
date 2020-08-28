package Game;

public class Enemies {
	int EnemyHealth=100;
	
	void EnemyAttack(int Charlife) {
		Charlife-=20;
		System.out.println("Enemy Attack you");
		System.out.println("Your Life remain "+Charlife);
	}
	void AttackEnemy() {
		EnemyHealth-=50;
		System.out.println("You attack enemy");
		System.out.println("Enemy Health is "+EnemyHealth);
	}

}
