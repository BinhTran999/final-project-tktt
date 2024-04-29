package back.com.vn.back.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.*;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.context.annotation.Configuration;

@Slf4j
@EnableCaching
@Configuration

public class CacheConfig implements CachingConfigurer {

    public CacheErrorHandler errorHander(){
        return new CacheErrorHandler() {
            @Override
            public void handleCacheGetError(RuntimeException exception, Cache cache, Object key) {
                log.error("Failure getting from cache: " + cache.getName() + ", and exception: " + exception );
            }

            @Override
            public void handleCachePutError(RuntimeException exception, Cache cache, Object key, Object value) {
                log.error("Failure putting from cache: " + cache.getName() + ", and exception: " + exception );
            }

            @Override
            public void handleCacheEvictError(RuntimeException exception, Cache cache, Object key) {
                log.error("Failure evicting from cache: " + cache.getName() + ", and exception: " + exception );
            }

            @Override
            public void handleCacheClearError(RuntimeException exception, Cache cache) {
                log.error("Failure cleaning from cache: " + cache.getName() + ", and exception: " + exception );
            }
        };
    }
}
