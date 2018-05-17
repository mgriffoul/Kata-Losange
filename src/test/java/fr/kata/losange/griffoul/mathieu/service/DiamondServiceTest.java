package fr.kata.losange.griffoul.mathieu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fr.kata.losange.griffoul.mathieu.bo.Diamond;
import fr.kata.losange.griffoul.mathieu.builder.DiamondBuilder;
import fr.kata.losange.griffoul.mathieu.builder.VerticalStringBuilder;

import static org.mockito.Matchers.anyChar;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by mathieu_griffoul on 17/05/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class DiamondServiceTest {

	@InjectMocks
	private DiamondService diamondService;

	@Mock
	private VerticalStringBuilder verticalStringBuilder;

	@Mock
	private DiamondBuilder diamondBuilder;

	@Test
	public void diamondService_should_call_verticalStringBuilder_and_diamondBuilder() {
		Diamond diamond = mock(Diamond.class);
		String verticalString = "toto";
		char c = 'a';
		when(verticalStringBuilder.buildVerticalString(anyChar())).thenReturn(verticalString);
		when(diamondBuilder.leftDiamondBuilder(anyString())).thenReturn(diamond);

		diamondService.BuildDiamond(c);

		verify(verticalStringBuilder).buildVerticalString(c);
		verify(diamondBuilder).leftDiamondBuilder(verticalString);
		verify(diamondBuilder).rightDiamondBuilder(diamond);
	}

}
