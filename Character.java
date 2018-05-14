
public class Character {
	
	public int life;
	private int item[] = new int [10];
	private int num;
	private int x,y;
	
	
	
	public Character () {
		
		life=30;
		x=y=100;
		
		for(int i=0;i<10;i++) {
			item[i]=0;
		}
		
		num=0;
	}
	
	void getItem(Item I) {
		if(num<10){
			item[num++]=I.life;
		}
		else{
			return;
		}
	}
	
	
	void useItem() {
		if(life<100) {
			System.out.println(num);
			life= life+item[--num]; //이렇게 안하면 체력이 0으로 더해지고 시작한다. 대체 왜? item[num]의 숫자가 이상하게 들어간다.
			if(life>100) {
				life=100;
			}
			
		}
		else{
			return;
		}
	}
	
	void hurtLife(int n) {
		life=life-n;
	}
	
	void move(int newX,int newY) {
		x=newX;
		y=newY;
	}
	void printmove() {
		System.out.println(x+","+y+"\n");
	}

}
