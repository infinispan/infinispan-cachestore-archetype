#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};
import org.infinispan.configuration.cache.AbstractStoreConfigurationBuilder;
import org.infinispan.configuration.cache.PersistenceConfigurationBuilder;


public class CustomStoreConfigurationBuilder extends AbstractStoreConfigurationBuilder<CustomStoreConfiguration, CustomStoreConfigurationBuilder>{

    public CustomStoreConfigurationBuilder(
            PersistenceConfigurationBuilder builder) {
        super(builder);
        // TODO Auto-generated constructor stub
    }

    @Override
    public CustomStoreConfiguration create() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CustomStoreConfigurationBuilder self() {
        // TODO Auto-generated method stub
        return null;
    }

}
