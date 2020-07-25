package com.example.daggersample;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Akash Saini on 25/07/20.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
