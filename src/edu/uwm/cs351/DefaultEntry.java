package edu.uwm.cs351;

import java.util.Map;
import java.util.Objects;

public class DefaultEntry<K,V> implements Map.Entry<K,V>{
	private K key;
	private V value;
	
	public DefaultEntry(K k, V v) {
		key = k;
		value = v;
	}
	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		V old = this.value;
		this.value = value;
		return old;
	}

	@Override
	public boolean equals(Object x) {
		if (!(x instanceof Map.Entry<?,?>)) return false;
		Map.Entry<?,?> e = (Map.Entry<?,?>)x;
		return Objects.equals((Object)key,(Object)e.getKey()) && Objects.equals(value,e.getValue());
	}
}
