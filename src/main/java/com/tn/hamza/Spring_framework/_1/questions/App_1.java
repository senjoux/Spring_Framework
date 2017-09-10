package com.tn.hamza.Spring_framework._1.questions;


/**
 * <h1>Spring Framework
 * <h2>The Spring framework helps :
 * <ul>
 * <li>Manage beans : initialization, setup, destruction ..etc</li>
 * <li>Wire dependencies</li>
 * <li>and many more ...</li>
 * </ul>
 * 
 * <h2>To make good use of Spring, one have to ask :</h2>
 * <ul>
 * <li>A- What are the beans ?</li>
 * <li>B- What are the dependencies of a bean ? : which package(s) ?</li>
 * <li>C- Where to search for beans ?</li>
 * </ul>
 * 
 * <h3>A-</h3> The <Strong>'@Component'</Strong> annotation can be used to
 * define a bean, see {@link AirBlower} <br>
 * All beans are maintained by what so called as "Application Context", see
 * {@link MyMain_1#main(String[])}}
 * <h3>B-</h3> The <Strong>'@Autowired'</Strong> annotation is used to specify a
 * dependency, see {@link BalloonsMaker}}
 * <h3>C-</h3> The <Strong> '@ComponentScan'</Strong> annotation is used to
 * specify where to scan for beans <br>
 * !!! Note !!! : Spring boot scan for beans within the same package as
 * the @SpringBootApplication class so if the application has only one single
 * package there is no need to use the @ComponentScan annotation to scan for
 * beans, Spring boot knows how to do it automatically, see {@link MyMain_1}
 * 
 * @author Hamza Hedhly
 *
 */
public class App_1 {

}
