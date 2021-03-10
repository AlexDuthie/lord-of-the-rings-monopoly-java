package playerTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PlayerDebtTest.class, PlayerDebtTest2.class, PlayerLocationTest.class, PlayerNameTest.class,
		PlayerSpacesMovedTest.class, PlayerTokenTest.class, PlayerWalletTest.class })
public class AllTests {

}
