package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	/* Negative scenario 1 */
	@Test
	public void numberOutOfRangeReturnsError1() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	/* Positive scenario 1 */
	@Test
	public void testPositiveScenario1() {
		Assert.assertEquals("Error","Eighteen", numberWords.toWords( 18 ) ) ;
	}
}
