#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}; 

import java.util.concurrent.Executor;

import org.infinispan.marshall.core.MarshalledEntry;
import org.infinispan.persistence.spi.AdvancedCacheWriter;
import org.infinispan.persistence.spi.InitializationContext;
import org.kohsuke.MetaInfServices;

@MetaInfServices
public class CustomAdvancedCacheWriter<K,V> implements AdvancedCacheWriter<K, V> {

    @Override
    public boolean delete(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void init(InitializationContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void write(MarshalledEntry<? extends K, ? extends V> arg0) {
        // TODO Auto-generated method stub
        
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
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void purge(
            Executor arg0,
            org.infinispan.persistence.spi.AdvancedCacheWriter.PurgeListener<? super K> arg1) {
        // TODO Auto-generated method stub
        
    }

}
