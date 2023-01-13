package hooks;

import org.junit.After;
import org.junit.Before;
import utilities.Driver;

public class Hooks {
@Before
public void setup(){
    System.out.println("Before methodu çalıştı");
}
@After
public void teardown(){
    System.out.println("After methodu çalıştı");
    Driver.closeDriver();
}

}
