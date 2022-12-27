package de.infodesign.sample;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static SampleService service = new SampleService();
	
    public static void main( String[] args )
    {
    	if (args.length > 0) {
    		service.sayHello(args[0]);
    	} else {
    		service.sayHello();
    	}
    }
    
}
