

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HTMLelements {

	@Test
	public void testIfBlank () {
		String html = "";
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
	}
	
	@Test
	public void testIfP () {
		String html = "<p    </p>";
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
	}
	

	@Test
	public void testIfPEnd () {
		String html = "<p>        <>";
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
	}
	
	@Test
	public void testIfH1 () {
		String html = "<h1         </h1>";
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
	}
	
	@Test
	public void testIfH1End () {
		String html = "<h1>        <h/1";
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
	}
	
	@Test
	public void testIfDiv () {
		String html = "div>        </div>";
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
	}
	
	@Test
	public void testIfDivEnd () {
		String html = "<div>        </div";
		Assertions.assertFalse(Lab7Regex.validateHTML(html));	
	}
	
}


