package kodkod.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import kodkod.test.sys.AllSysTests;
import kodkod.test.unit.AllUnitTests;

@RunWith(Suite.class)
@SuiteClasses({
	AllUnitTests.class,
	AllSysTests.class
})

public class AllTests {}
