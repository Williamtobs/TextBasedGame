package Game;

import java.util.ArrayList;
import java.util.Scanner;

public class TextBasedGame {
	static int CharHealth=100;
	static int HealthPotion=3;
	
	static void EnemyAttack() {
		CharHealth-=20;
		System.out.println("Enemy Attack you");
		System.out.println("Your Life remain "+CharHealth);
	}
	static void HealthPortion() {
		HealthPotion-=1;
	}
	static void PotionUse() {
		CharHealth+=50;
		System.out.println("Your health is "+CharHealth);
	}
	
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String Char;
		System.out.println("Welcome to Dungeon King\n");
		System.out.println("Enter Char name ");
		Char=in.next();
		System.out.println(Char+" health is "+CharHealth +" and have "+HealthPotion+" Health potion\n");
		System.out.println(Char+" Enter the dungeon");
		
		Skeleton skeleton = new Skeleton();
		Zombie zombie = new Zombie();
		Warrior warrior = new Warrior();
		Assasin assasin = new Assasin();
		
		ArrayList<Enemies> EnemiesList=new ArrayList<Enemies>();
		EnemiesList.add(skeleton);
		EnemiesList.add(zombie);
		EnemiesList.add(warrior);
		EnemiesList.add(assasin);
		
		while(true) {
			System.out.println();
			Enemies RandomEnemies=EnemiesList.get((int)(EnemiesList.size()*Math.random()));
			if (RandomEnemies.equals(skeleton)) {
				System.out.print(Char+" come accross ");
				System.out.println(skeleton.Name);
				
			}
			if (RandomEnemies.equals(zombie)) {
				System.out.print(Char+" come accross ");
				System.out.println(zombie.Name);
				
			}
			if (RandomEnemies.equals(warrior)) {
				System.out.print(Char+" come accross ");
				System.out.println(warrior.Name);
				
			}
			if (RandomEnemies.equals(assasin)) {
				System.out.print(Char+" come accross ");
				System.out.println(assasin.Name);
			}
			System.out.println("(1) Attack\t(2) Use potion\t(3) Run Away");
			int option = in.nextInt();
			if (option==1) {
				RandomEnemies.AttackEnemy();
				if (RandomEnemies.EnemyHealth==0) {
					EnemiesList.remove(RandomEnemies);
					HealthPotion+=1;
					System.out.println("Enemy eliminate");
					System.out.println("You have "+HealthPotion+" health potion now");
				}
				else if (CharHealth==0) {
					System.out.println(Char+" die\n Game over!!!");
					System.exit(0);
				}
				else {
					EnemyAttack();
				}
			}
			else if (option==2) {
				if (CharHealth==0) {
					System.out.println(Char+" die\n Game over!!!");
					System.exit(0);
				}
				else {
					HealthPortion();
					System.out.println(Char+" use health potion");
					PotionUse();
					EnemyAttack();
				}
			}
			else if (option == 3) {
				if (CharHealth==0) {
					System.out.println(Char+" die\n Game over!!!");
					System.exit(0);
				}
				System.out.println(Char+" run");
			}
			if (EnemiesList.size()==0) {
				System.out.println(Char+" Is now the King of the Dungeon");
				System.exit(0);
			}
		}
	}
}
