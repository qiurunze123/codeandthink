package com.code.proxy.custom;

import java.lang.reflect.Method;

public interface GQInvocationHandler {

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
