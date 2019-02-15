package fiTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PredicateTest.class, BinaryOperatorTest.class, UnaryOperatorTest.class,
                     FunctionTest.class, ConsumerTest.class})
public class FunctionalInterfacesTestSuite {

}
