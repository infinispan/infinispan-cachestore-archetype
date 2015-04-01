#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}; 

import java.util.concurrent.Executor;

import org.infinispan.filter.KeyFilter;
import org.infinispan.marshall.core.MarshalledEntry;
import org.infinispan.persistence.spi.AdvancedCacheLoader;
import org.infinispan.persistence.spi.InitializationContext;
import org.kohsuke.MetaInfServices;

@MetaInfServices
public class CustomAdvancedCacheLoader<K,V> implements AdvancedCacheLoader<K, V> {

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

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void process(
            KeyFilter<? super K> arg0,
            org.infinispan.persistence.spi.AdvancedCacheLoader.CacheLoaderTask<K, V> arg1,
            Executor arg2, boolean arg3, boolean arg4) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

}
