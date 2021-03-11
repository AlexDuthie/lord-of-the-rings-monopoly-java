package playerTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PlayerCountTest.class, PlayerDebtTest.class, PlayerLocationTest.class, PlayerMovesTest.class,
		PlayerNameTest.class, PlayerTokenTest.class, PlayerWalletTest.class })
public class AllPlayerTests {

}
