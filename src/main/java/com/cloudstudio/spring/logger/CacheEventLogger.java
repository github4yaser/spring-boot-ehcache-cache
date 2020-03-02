package com.cloudstudio.spring.logger;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

public class CacheEventLogger implements CacheEventListener<Object, Object> {

  @Override
  public void onEvent(CacheEvent cacheEvent) {
    System.out.println("Caching Event : {} - [Key: {}, Old Value: {}, New Value{}]"+cacheEvent.getType()+cacheEvent.getKey()+cacheEvent.getOldValue()+cacheEvent.getNewValue());
  }
  
}
