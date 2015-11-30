package com.corryn.scb.core.naming;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.util.AnnotationLiteral;
import javax.naming.NamingException;

/**
 * CDILookupService.
 *
 * @author GH29142
 *
 */
public class CDILookupService
{
	/**
	 * lookup
	 *
	 * @param forClass forClass
	 * @param <T> class.
	 * @return <T> Reference to <T>.
	 * @throws NamingException NamingException.
	 */
	@SuppressWarnings(
	{ "unchecked", "rawtypes" })
	public static <T> T lookup(Class<T> forClass) throws NamingException
	{
		BeanManager beanManager = lookupBeanManager();
		Set<Bean<?>> beans = beanManager.getBeans(forClass, new Annotation[0]);
		Iterator<?> iterator = beans.iterator();
		if(iterator.hasNext())
		{
			Bean<?> bean = (Bean<?>) iterator.next();

			CreationalContext creationalContext = beanManager.createCreationalContext(bean);
			Context beanScopeContext = beanManager.getContext(bean.getScope());
			Object beanInstance = beanScopeContext.get(bean, creationalContext);
			if(beanInstance == null)
			{
				throw new NamingException();
			}
			return (T) beanInstance;
		}
		throw new NamingException();
	}

	/**
	 * lookupForAllCDIBeans
	 *
	 * @return List<Object> beans.
	 * @throws NamingException NamingException.
	 */
	@SuppressWarnings(
	{ "unchecked", "rawtypes" })
	public static List<Object> lookupForAllCDIBeans() throws NamingException
	{
		BeanManager beanManager = lookupBeanManager();
		Set<Bean<?>> beans = beanManager.getBeans(Object.class, new Annotation[]
		{ new AnnotationLiteral()
		{
			private static final long serialVersionUID = 1L;
		} });
		List<Object> beanInstances = new ArrayList();
		for(Bean bean : beans)
		{
			CreationalContext creationalContext = beanManager.createCreationalContext(bean);
			Context beanScopeContext = beanManager.getContext(bean.getScope());
			Object beanInstance = beanScopeContext.get(bean, creationalContext);
			if(beanInstance != null)
			{
				beanInstances.add(beanInstance);
			}
		}
		return beanInstances;
	}

	/**
	 * lookupBeanManager.
	 * @return BeanManager.
	 */
	private static BeanManager lookupBeanManager()
	{
		return (BeanManager) JNDILookupService.lookup("java:comp/BeanManager");
	}
}