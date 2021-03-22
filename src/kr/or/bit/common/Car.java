package kr.or.bit.common;

public class Car {
	int door;  // default는 같은  package에서만
	public int window;  // 다른 package에서 사용 가능
	private int handle; // 캡슐화 -> setter, getter가 같이 따라 붙어야한다.직접할당을 막고 간접할당을 통해 읽고쓸수 있는 특수한 목적에 쓴다.

}
