package mail.dksdbtjd4.queue;




interface Starcraft{
	public void attack();
}

//인터페이스는 구현하는거다!
//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft{

	@Override
	public void attack() {
		System.out.println("질럿의 공격");

	}


	public class AnonymouMain {
		public static void main(String[] args) {

			//인터페이스를 implements 한 클래스를 만들고 인스턴스를 만든후 메서드 호출
			Protoss p = new Protoss();    //Starcraft star = new Protoss();
			p.attack();     //star.attack();

			//인터페이스를 implements 한 클래스를 만들지않고 인스턴스를 생성 호출
			Starcraft z =new Starcraft() {
				//star  = new Starcraft(){								//중갈호에 클릭시 
				@Override
				public void attack() {
					System.out.println("저그의 공격");

				}};
				z.attack();   //star.attack();

				
				//변수를 만들지 않고 인스턴스만 생성해서 메서드 호출
				
				new Starcraft() {

					@Override
					public void attack() {
						System.out.println("테란 공격");

					}

				} .attack(); 



		}
	}

}