package ind.project.standalone.box.common;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@EnableCaching
//@Configuration
//public class CacheCustomizer implements CacheManagerCustomizer<ConcurrentMapCacheManager> {
//
//    @Override
//    public void customize(ConcurrentMapCacheManager cacheManager) {
//        cacheManager.setCacheNames(Arrays.asList("test"));
//    }
//
////    @Bean
////    public CacheManager cacheManager() {
////        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
////        simpleCacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("customers")));
////        return simpleCacheManager;
////    }
//
//}
