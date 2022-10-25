package java_1025;

class Generics <T> {
	private T [] data;


	//...dms varoable args 로 개수에 상관없이 매개변수를 받고자 할 때 사용
	//받은 매개변수들은 배열로 만들어 집니다.



	public Generics(T ... n) {
		this.data = n;
	}
	//배열의 데이터를 순처적으로 접근해서 출력하는 매서드
	public void display() {
		for(T temp : data) {
			System.out.println(temp);
		}
	}

}



 class TemplateProgramming {

	public static void main(String[] args) {
		Generics <String> g1 = new Generics<String>("Karina", "Suzi", "IU");
		g1.display();

		Generics <Integer> g2 = new Generics<Integer>(100, 300, 200, 400);
		g2.display();



	}
}





