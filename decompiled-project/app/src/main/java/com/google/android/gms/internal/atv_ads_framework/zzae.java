package com.google.android.gms.internal.atv_ads_framework;

import h3.o;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzae implements Map, Serializable {
    private transient zzaf zza;
    private transient zzaf zzb;
    private transient zzy zzc;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzam.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzaf zzafVar = this.zzb;
        if (zzafVar != null) {
            return zzafVar;
        }
        zzaf zzd = zzd();
        this.zzb = zzd;
        return zzd;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(o.l(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z8 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z8) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z8 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public abstract zzy zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzy values() {
        zzy zzyVar = this.zzc;
        if (zzyVar != null) {
            return zzyVar;
        }
        zzy zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzaf zzc();

    public abstract zzaf zzd();

    @Override // java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzaf entrySet() {
        zzaf zzafVar = this.zza;
        if (zzafVar != null) {
            return zzafVar;
        }
        zzaf zzc = zzc();
        this.zza = zzc;
        return zzc;
    }
}
