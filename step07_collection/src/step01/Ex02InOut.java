package step01;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Ex02InOut {

	public static void main(String[] args) {
		// Stack : LIFO
		Stack<String> card = new Stack<String>();
		
		// push()
		card.add("현대카드");
		card.add("신한카드");
		card.add("우리카드");
		
		System.out.println(card);
		// [현대카드, 신한카드, 우리카드]
		
		// pop() : 마지막요소("우리카드") 삭제
		System.out.println(card.pop());
		System.out.println(card);
		
		// isEmpty() : 비어있는지
		System.out.println(card.isEmpty());
		// capacity() : 용량
		System.out.println(card.capacity());
		
		System.out.println();
		
		// Queue : FIFO(선입선출)
		Queue<String> drinkBox = new LinkedList<String>();
		
		// offer()
		drinkBox.add("Coke");
		drinkBox.add("Dr.Pepper");
		drinkBox.add("Sprite");
		
		// poll() : 첫번째요소("Coke") 삭제 후, 삭제요소값 따로 출력
		System.out.println(drinkBox);
		System.out.println(drinkBox.poll());
		System.out.println(drinkBox);
		
		
		
		
		
		
		
		
		

	}

}
