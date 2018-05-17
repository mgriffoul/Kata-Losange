package fr.kata.losange.griffoul.mathieu.validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class InputValidatorTest {

	private InputValidator inputValidator;

	@Before
	public void init() {
		this.inputValidator = new InputValidator();
	}

	@Test
	public void isInputInvalid_should_return_false_if_input_is_a_single_lowercase_char() {
		Assert.assertTrue(inputValidator.isInputValid("e"));
	}

	@Test
	public void isInputInvalid_should_return_true_if_input_is_not_a_single_lowercase_char() {
		Assert.assertFalse(inputValidator.isInputValid("ezaeae"));
		Assert.assertFalse(inputValidator.isInputValid("A"));
		Assert.assertFalse(inputValidator.isInputValid("+"));
		Assert.assertFalse(inputValidator.isInputValid("5+"));
	}

	@Test
	public void isInputInvalid_should_return_true_if_input_is_empty() {
		Assert.assertFalse(inputValidator.isInputValid(""));
	}


}
