package ExceptionHandling;

import ExceptionHandling.perfomenceTesting.ReturnCodesPerformance;
import ExceptionHandling.perfomenceTesting.TryCatchPerformance;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ReturnCodesPerformance.class, TryCatchPerformance.class, ReturnCodesTest.class, TryCatchTest.class})
public class TestSuite {
}
