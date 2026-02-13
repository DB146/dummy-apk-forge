package com.google.android.gms.internal.pal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzadz extends LinkedHashMap {
    private static final zzadz zza;
    private boolean zzb;

    static {
        zzadz zzadzVar = new zzadz();
        zza = zzadzVar;
        zzadzVar.zzb = false;
    }

    private zzadz() {
        this.zzb = true;
    }

    private zzadz(Map map) {
        super(map);
        this.zzb = true;
    }

    public static zzadz zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzadg.zzb((byte[]) obj);
        }
        if (obj instanceof zzadb) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i7 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        zzadg.zze(obj);
        zzadg.zze(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            zzadg.zze(obj);
            zzadg.zze(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzadz zzb() {
        return isEmpty() ? new zzadz() : new zzadz(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzadz zzadzVar) {
        zzg();
        if (zzadzVar.isEmpty()) {
            return;
        }
        putAll(zzadzVar);
    }

    public final boolean zze() {
        return this.zzb;
    }
}
