package com.corryn.scb.data.persistence;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

@Target({ java.lang.annotation.ElementType.TYPE,
		java.lang.annotation.ElementType.METHOD,
		java.lang.annotation.ElementType.FIELD,
		java.lang.annotation.ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Qualifier
public @interface SCBDatabase {
}
