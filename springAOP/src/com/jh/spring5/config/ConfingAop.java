package com.jh.spring5.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan(basePackages = {"com.jh"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfingAop {

}
