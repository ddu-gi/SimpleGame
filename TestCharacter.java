
public class TestCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character ch1 = new Character();
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		
		System.out.println("ch1의 체력"+ch1.life);
		ch1.printmove();
		
		ch1.getItem(item1);
		ch1.getItem(item2);
		ch1.getItem(item3);
		System.out.println("ch1의 체력"+ch1.life);
		System.out.println("\n");
		
		
		ch1.useItem();
		System.out.println("ch1의 체력"+ch1.life);
		System.out.println("\n");
		ch1.useItem();
		System.out.println("ch1의 체력"+ch1.life);
		
		
		ch1.move(25, 35);
		ch1.printmove();
		
		ch1.hurtLife(5);
		System.out.println("ch1의 체력"+ch1.life);
	}

}
