package ma.karems;

import junit.framework.TestCase;

public class Calcultest extends TestCase {
    private Calculma cal;
    
		
	protected void setUp() throws Exception {
		super.setUp();
		 cal=new Calculma(); 
		
	}
	
	public void testSomme() {
		assertTrue(cal.somme(6,2)==8);
	}
	public void testProduit() {
		assertTrue(cal.produit(6,2)==12);
	}

}
