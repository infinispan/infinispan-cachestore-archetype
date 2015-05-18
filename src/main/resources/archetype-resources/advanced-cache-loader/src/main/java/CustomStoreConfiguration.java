#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import java.util.Properties;

import org.infinispan.commons.configuration.BuiltBy;
import org.infinispan.commons.configuration.ConfigurationFor;
import org.infinispan.configuration.cache.AbstractStoreConfiguration;
import org.infinispan.configuration.cache.AsyncStoreConfiguration;
import org.infinispan.configuration.cache.SingletonStoreConfiguration;

@BuiltBy(CustomStoreConfigurationBuilder.class)
@ConfigurationFor(CustomAdvancedCacheLoader.class)
public class CustomStoreConfiguration extends AbstractStoreConfiguration {
   
    private final String sampleAttribute;

    public CustomStoreConfiguration(String sampleAttribute, boolean purgeOnStartup,
            boolean fetchPersistentState, boolean ignoreModifications,
            AsyncStoreConfiguration async,
            SingletonStoreConfiguration singletonStore, boolean preload,
            boolean shared, Properties properties) {
        super(purgeOnStartup, fetchPersistentState, ignoreModifications, async,
                singletonStore, preload, shared, properties);
        this.sampleAttribute = sampleAttribute;
    }
    
    public String sampleAttribute() {
        return sampleAttribute;
    }

}
