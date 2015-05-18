#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.infinispan.commons.configuration.ConfiguredBy;
import org.infinispan.marshall.core.MarshalledEntry;
import org.infinispan.persistence.spi.CacheLoader;
import org.infinispan.persistence.spi.InitializationContext;
import org.kohsuke.MetaInfServices;

@MetaInfServices
@ConfiguredBy(CustomStoreConfiguration.class)
public class CustomCacheLoader<K,V> implements CacheLoader<K, V> {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void init(InitializationContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public MarshalledEntry<K, V> load(Object arg0) {
        // TODO Auto-generated method stub
        return null;
    }

}
