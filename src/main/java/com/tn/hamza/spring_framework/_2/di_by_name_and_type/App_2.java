package com.tn.hamza.spring_framework._2.di_by_name_and_type;

/**
 * <h1>@Resource</h1> The @Resource which is part of
 * <strong>javax.annotation.Resource</strong> package can be used by Spring to
 * inject/add dependencies in-between beans, in fact it used to get a reference
 * to a bean <br>
 * <br>
 * <strong>In Spring, every bean in the application context is given a name. By
 * default, the name of the bean will be its class name in lowerCamelCase
 * format, and to change the default name a value can be specified to the
 * '@Component' annotation, {@link MyShapeDrawerImpl}</strong> <br>
 * <br>
 * <Strong>!!! Notes !!! : </strong>
 * <ul>
 * <li>The'@Resource' uses the name of the target annotated attribute in
 * <strong>lowerCamelCase</strong> format to look for the respective bean, so
 * the name of the target bean must match it.<br>
 * See {@link MySimpleServiceImpl#greetingServiceImpl}</li>
 * <li>As well the '@Resource' annotation has an optional 'name' attribute to
 * specify the target bean name (same lowerCamelCase as before ).</li>
 * </ul>
 * <br>
 * <h1>How it all works ?</h1> Well, to perform DI (dependency injection ) of a dependency, Spring
 * tries first to search for the respective bean <strong>"by name"<strong> first from the context,
 * if no bean found by name then Spring falls back to DI <strong>"by Type"<strong> an example would an interface implementation<br>
 * <br>
 * A comparative study about @Resource vs @Inject vs @Autowired can be found
 * here :
 * {@linkplain https://blogs.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/}
 * 
 * @author Hamza Hedhly
 *
 */
public class App_2 {


}
