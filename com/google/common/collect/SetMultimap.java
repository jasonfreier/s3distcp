package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;

@GwtCompatible
public abstract interface SetMultimap<K, V> extends Multimap<K, V>
{
  public abstract Set<V> get(@Nullable K paramK);

  public abstract Set<V> removeAll(@Nullable Object paramObject);

  public abstract Set<V> replaceValues(K paramK, Iterable<? extends V> paramIterable);

  public abstract Set<Map.Entry<K, V>> entries();

  public abstract Map<K, Collection<V>> asMap();

  public abstract boolean equals(@Nullable Object paramObject);
}

/* Location:           /Users/libinpan/Work/s3/s3distcp.jar
 * Qualified Name:     com.google.common.collect.SetMultimap
 * JD-Core Version:    0.6.2
 */