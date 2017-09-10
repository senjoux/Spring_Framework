package com.tn.hamza.spring_framework._3.di_beans_same_name;

/**
 * <h1>Multiple beans : Which one to inject ?</h1>
 * 
 * <h2>Problem :</h2> Let's say that we have two classes (beans) which
 * implements the same interface. When injecting the interface to another
 * component/bean, Spring will get confused which instance (of the two
 * implementations) to inject and will throw an "NoUniqueBeanDefinitionException
 * .. required a single bean, but 2 were found: ..", execute
 * {@link MyMain_3_1#main(String[])} to see the exception
 * 
 * <h2>Solutions :</h2> There are different possible ways to avoid/fix this
 * issue :
 * <ul>
 * <li>
 * <h3>A- Specify a concrete name of the desired bean, like via "name" attribute
 * of the '@Resource' annotation</h3> see
 * {@link GreetingService_2_Impl#mySimpleService_2}</li>
 * <li>
 * <h3>B- Give a name to the bean, via the "@Component" annotation so that the
 * bean name matches the injected variable name</h3> see
 * {@link GreetingService_3_Impl#a} and {@link MySimpleService_3_Impl_1}</li>
 * <li>
 * 		xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 * </li>
 * </ul>
 * 
 * @author Hamza Hedhly
 *
 */
public class App_3 {
}
