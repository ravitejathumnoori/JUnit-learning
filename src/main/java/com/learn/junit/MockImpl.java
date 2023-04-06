package com.learn.junit;

public class MockImpl {

	private MockTest mockTest;
	
	public MockImpl(MockTest mockTest) {
		
		this.mockTest = mockTest;
	}
	
	public String perform() {
		return mockTest.mockOutput();
	}

}
