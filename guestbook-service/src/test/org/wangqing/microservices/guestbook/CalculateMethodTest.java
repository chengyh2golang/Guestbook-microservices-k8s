package org.wangqing.microservices.guestbook; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* CalculateMethod Tester. 
* 
* @author <Authors name> 
* @since <pre>06/17/2020</pre> 
* @version 1.0 
*/ 
public class CalculateMethodTest { 
CalculateMethod Calc = new CalculateMethod();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sum(int a, int b) 
* 
*/ 
@Test
public void testSum() throws Exception { 
//TODO: Test goes here...
    int a = 1;
    int b = 2;
    Assert.assertTrue( 3 == Calc.sum(a,b));
} 


} 
