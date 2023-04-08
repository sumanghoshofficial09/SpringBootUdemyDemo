package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisNoOpBindingRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
/**
 * 
 * 
 * @author ciphe
 * 
 * in case of eager intitialization :
 * 
 * constructor injection
13:47:14.038 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'lazyIntializationDemoApplication'
13:47:14.040 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.AutoConfigurationPackages'
13:47:14.040 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration'
13:47:14.042 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration'
13:47:14.043 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration'
13:47:14.044 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration'
13:47:14.045 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'applicationAvailability'
13:47:14.048 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration'
13:47:14.049 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.context.properties.BoundConfigurationProperties'
13:47:14.049 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter'
13:47:14.051 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration'
13:47:14.051 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'lifecycleProcessor'
13:47:14.052 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties'
13:47:14.066 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Autowiring by type from bean name 'lifecycleProcessor' via factory method to bean named 'spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties'
13:47:14.067 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration'
13:47:14.069 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties'
13:47:14.070 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Autowiring by type from bean name 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration' via constructor to bean named 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties'
13:47:14.070 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration'
13:47:14.071 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties'
13:47:14.074 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration'
13:47:14.075 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'taskExecutorBuilder'
13:47:14.076 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties'
13:47:14.078 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Autowiring by type from bean name 'taskExecutorBuilder' via factory method to bean named 'spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties'
13:47:14.081 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration'
13:47:14.084 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'taskSchedulerBuilder'
13:47:14.085 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
13:47:14.087 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Autowiring by type from bean name 'taskSchedulerBuilder' via factory method to bean named 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
Context initialization done 
DRAWING
13:47:14.110 [main] DEBUG org.springframework.context



in case of  lazy intitization 

3:49:23.927 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
13:49:23.929 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Autowiring by type from bean name 'taskSchedulerBuilder' via factory method to bean named 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
Context initialization done 
13:49:23.939 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'b'
13:49:23.939 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Autowiring by type from bean name 'b' via constructor to bean named 'a'
constructor injection
DRAWING
13:49:23.960 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext -- Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@543c6f6d, started on Sat Apr 08 13:49:23 IST 2023


 * 
 * 
 *
 */

@Component
class A
{
	
	public void draw()
	{
		System.out.println("DRAWING");
	}
}


@Component
@Lazy
class B
{
	
   private A a;

public B(A a) {
	super();
	System.out.println("constructor injection");
	this.a = a;
}


void performDraw()
{
	
	a.draw();
}

	
	
	
	
}




@Configuration
@ComponentScan
public class MyLazyInitilizationDemo {
	
	public static void main(String args[])
	{
		
		try(AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(MyLazyInitilizationDemo.class))
		{
			System.out.println("Context initialization done ");
			
			context.getBean(B.class).performDraw();
		}
		
		
		
		
		
		
	}

}
