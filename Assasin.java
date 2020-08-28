package Game;

public class Assasin extends Enemies{
	String Name;
	Assasin(){
		this.Name="Assasin";
	}
	
	void AttackEnemy() {
		EnemyHealth-=50;
		System.out.println("You attack enemy");
		System.out.println("Enemy Health is "+EnemyHealth);
	}
}
