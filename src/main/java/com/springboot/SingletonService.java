package com.springboot;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.inject.Provider;

@Service
public class SingletonService {

  //@Autowired
  //private PrototypeService prototypeService;

  //@Autowired
  //private ApplicationContext applicationContext;

  @Autowired
  private ObjectFactory<PrototypeService> prototypeServiceProvider;

  public String getMethod() {
   // return applicationContext.getBean(PrototypeService.class).getMethod();
    //return prototypeService.getMethod();
    //return prototypeService().getMethod();
    return prototypeServiceProvider.getObject().getMethod();
  }

  @Lookup
  public PrototypeService prototypeService(){
    return null;
  }

}
