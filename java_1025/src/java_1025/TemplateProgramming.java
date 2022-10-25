package java_1025;



/*
 * 로직은 같은데 매개변수의 자료형이 달라서 Overloading을 이용해서 구현
 */
//class Algorithm{
//	//정수 2개를 더해서 결과를 리턴하는 메서드
//	public static int add(int n1, int n2) {
//		return n1 +n2;
//	}
//	
//	
//	//실수 2개를 더해서 결과를 리턴하는 메서드
//	public static double add(double n1, double n2) {
//		return n1+n2;







//자료형의 이름을 임시로 만들어두고 내부에서 임시로 만든 자료형을 사용한 후 
//인스턴스를 생성할 때 자료형을 결정하는 방식을 이용
//단 인스턴스를 만들때 또는 메서드를 호출할 때 실제로 자료형을 기재해야합니다.
//이 때 사용되는 자료형은 Object로 상속 받은 클래스의 자료형 만 가능합니다.
//int 와 primitive type의 경우는 Integer 와 같은  Wrapper클래스를 이용해야 합니다.
//미지정 자료형의 개수는 제한이 없습니다.
//인스턴스를 만들 때 자료형을 설정하지 않으면 경고가 발생합니다.
class Algorithm<T>{


	//개의 데이터를 받아서 내용을 변경하는 메서드

	public void swap(T n1, T n2) {
		T imsi = n1;
		n1 = n2;
		n2 = imsi;


	}


}
