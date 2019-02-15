package ExceptionHandling.perfomenceTesting;

import ExceptionHandling.ReturnCodesTest;
import ExceptionHandling.TryCatchTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ReturnCodesPerformance.class, TryCatchPerformance.class})

public class PerformanceTestSuite {
}
