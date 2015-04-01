#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.infinispan.marshall.core.MarshalledEntry;
import org.infinispan.persistence.spi.CacheWriter;
import org.infinispan.persistence.spi.InitializationContext;
import org.kohsuke.MetaInfServices;

@MetaInfServices
public class CustomCacheWriter<K,V> implements CacheWriter<K, V> {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

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

}
