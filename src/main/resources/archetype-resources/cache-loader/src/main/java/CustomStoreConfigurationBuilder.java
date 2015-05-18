#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};
import org.infinispan.configuration.cache.AbstractStoreConfigurationBuilder;
import org.infinispan.configuration.cache.PersistenceConfigurationBuilder;

/**
 * CustomStoreConfigurationBuilder.
 * 
 * This class will be used by the ConfigurationBuilder to implement fluent configuration for the custom CacheLoader / CacheWriter.
 * Methods should use the fluent style, rather than the setter/getter style and should return an instance of this object.
 * 
 */
public class CustomStoreConfigurationBuilder extends AbstractStoreConfigurationBuilder<CustomStoreConfiguration, CustomStoreConfigurationBuilder> {

    String sampleAttribute;

    public CustomStoreConfigurationBuilder(
            PersistenceConfigurationBuilder builder) {
        super(builder);
    }
    
    public CustomStoreConfigurationBuilder sampleAttribute(String sampleAttribute) {
        this.sampleAttribute = sampleAttribute;
        return this;
    }

    @Override
    public CustomStoreConfiguration create() {
        /*
         * This method should construct a new instance of a CustomStoreConfiguration object. There will be one instance per cache.
         */
        return new CustomStoreConfiguration(sampleAttribute, purgeOnStartup, fetchPersistentState, ignoreModifications, async.create(),
              singletonStore.create(), preload, shared, properties);
    }

    @Override
    public CustomStoreConfigurationBuilder self() {
        return this;
    }

}
