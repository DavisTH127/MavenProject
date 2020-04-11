package com.platform.project.myTest;

//Suggested auto import Alt + Enter
//mvn clean install
//mvnrepository = you can find the dependency for the pom.xml then run mvn clean install
import org.junit.Assert;
import org.junit.Test;

public class JunitTest {
        @Test
        public void checkString(){
            String str = "Junit is working fine" ;

            Assert.assertEquals("Junit is working fine", str);
            Assert.assertTrue(str.equals("Junit is working fine"));
        }

        @Test
        public void checkString2(){
            String str = "Junit is working fine" ;
            Assert.assertEquals("Junit is not working", str);
        }
    }