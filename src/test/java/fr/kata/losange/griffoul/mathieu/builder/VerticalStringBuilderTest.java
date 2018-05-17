package fr.kata.losange.griffoul.mathieu.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mathieu_griffoul on 17/05/2018.
 */
public class VerticalStringBuilderTest {

	private VerticalStringBuilder verticalStringBuilder;

	@Before
	public void init() {
		this.verticalStringBuilder = new VerticalStringBuilder();
	}

	@Test
	public void buildVerticalString_should_return_correct_string(){
		String s = verticalStringBuilder.buildVerticalString('d');
		Assert.assertEquals("abcdcba", s);

		s = verticalStringBuilder.buildVerticalString('h');
		Assert.assertEquals("abcdefghgfedcba", s);

		s = verticalStringBuilder.buildVerticalString('c');
		Assert.assertEquals("abcba", s);
	}

}
