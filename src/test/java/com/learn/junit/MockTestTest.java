package com.learn.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
	
import static org.mockito.ArgumentMatchers.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class MockTestTest {
	
	@Mock
	MockTest mockObject;
	
	@InjectMocks
	MockImpl mockImpl;
	

	@Test
	void test() {
		
		when(mockObject.mockOutput()).thenReturn("This is output from mock");
		
		assertEquals("This is output from mock", mockImpl.perform());
	}

}
