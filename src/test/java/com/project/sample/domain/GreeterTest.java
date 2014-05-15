package com.project.sample.domain;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class GreeterTest {
	
	@Inject
	Greeter greeter;
	
	@Deployment
	public static JavaArchive createDeployment(){
		JavaArchive archive = ShrinkWrap.create(JavaArchive.class, "GreeterArchive").addClass(Greeter.class).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
		System.out.println("Archive: "+archive.toString(true));
		return archive;
	}
	
	@Test
	public void should_create_greeting(){
		Assert.assertEquals("Hello Customer!", greeter.createGreeting("Customer"));
		greeter.greetCustomer("Customer");
	}
	
	

}
