package mail.dksdbtjd4.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import navermail.dksdbtjd4.stack.PersonVO;

public class Main {
	public static void main(String[] args) {
		//PriorityQueue는 데이터를 정렬!!!된 순서대로 꺼낼 수 있도록 해주는 클래스


		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = 
				new PriorityQueue<>();


		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);


		//데이터 꺼내기  70 90나옴 정렬되서 순서로! 
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());

		
		
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		//이상태에서 만들면 PersonVO의 크기를 비교못해서 예외발생
		
		//PriorityQueue<PersonVO> persons=
			//	new PriorityQueue<>();
		
		
		//PersonVO클레스에 Comparable 인터페이스를 implements하고 
		//compareTo라는 메서드를 재정의해서 해결할수 있고
		//main을손대라
		
		//comparator 인터페이스를 대입받을수 있는경우 compartor인터페이스를 
		//구현한 클래스의 인스턴스를 이용해서 생성해도됩니다.
		
		
		
		PriorityQueue<PersonVO> persons=
				new PriorityQueue<>(new Comparator<PersonVO>() {

					@Override
					public int compare(PersonVO o1, PersonVO o2) {
						// TODO Auto-generated method stub
						return o2.getPhone().compareTo(o1.getPhone());
					}
			
		});
		

		
		
		persons.offer(new PersonVO(1,"양념치킨", new Date(100, 9, 10), "01011112222"));

		persons.offer(new PersonVO(2,"후라이드", new Date(102, 1, 3), "01033334444"));
		
		persons.offer(new PersonVO(3,"뿌링클", new Date(97, 1, 3), "01033334444"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());

	}

}
