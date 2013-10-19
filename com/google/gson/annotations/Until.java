package com.google.gson.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
public @interface Until
{
  public abstract double value();
}

/* Location:           /Users/libinpan/Work/s3/s3distcp.jar
 * Qualified Name:     com.google.gson.annotations.Until
 * JD-Core Version:    0.6.2
 */