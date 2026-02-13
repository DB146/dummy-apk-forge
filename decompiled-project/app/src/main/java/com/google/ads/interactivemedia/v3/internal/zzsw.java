package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class zzsw extends zzsx implements NavigableMap {
    private static final Comparator zza;
    private static final zzsw zzb;
    private final transient zztp zzc;
    private final transient zzso zzd;
    private final transient zzsw zze;

    static {
        zztf zztfVar = zztf.zza;
        zza = zztfVar;
        zztp zzs = zzsy.zzs(zztfVar);
        int i7 = zzso.zzd;
        zzb = new zzsw(zzs, zzti.zza, null);
    }

    public zzsw(zztp zztpVar, zzso zzsoVar, zzsw zzswVar) {
        this.zzc = zztpVar;
        this.zzd = zzsoVar;
        this.zze = zzswVar;
    }

    public static zzsw zzk(Comparator comparator) {
        if (zztf.zza.equals(comparator)) {
            return zzb;
        }
        zztp zzs = zzsy.zzs(comparator);
        int i7 = zzso.zzd;
        return new zzsw(zzs, zzti.zza, null);
    }

    public static zzsw zzm() {
        return zzb;
    }

    private final zzsw zzq(int i7, int i10) {
        if (i7 == 0) {
            if (i10 == this.zzd.size()) {
                return this;
            }
            i7 = 0;
        }
        return i7 == i10 ? zzk(((zzsy) this.zzc).zza) : new zzsw(this.zzc.zzw(i7, i10), this.zzd.subList(i7, i10), null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return zztd.zza(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((zzsy) this.zzc).zza;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.zzc.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzsw zzswVar = this.zze;
        if (zzswVar != null) {
            return zzswVar;
        }
        if (!isEmpty()) {
            return new zzsw((zztp) this.zzc.descendingSet(), this.zzd.zzh(), this);
        }
        Comparator comparator = ((zzsy) this.zzc).zza;
        return zzk((comparator instanceof zzth ? (zzth) comparator : new zzrw(comparator)).zza());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzd().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.zzc.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return zztd.zza(floorEntry(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        zztp zztpVar = this.zzc;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(zztpVar.zzd, obj, ((zzsy) zztpVar).zza);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.zzd.get(binarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return zztd.zza(higherEntry(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.zzc;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzd().get(this.zzd.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.zzc.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return zztd.zza(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.zzc;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzsk zza() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    /* renamed from: zzb */
    public final zzsk values() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zze() {
        return isEmpty() ? zzto.zza : new zzsv(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zzf() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    /* renamed from: zzh */
    public final /* synthetic */ zzst keySet() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final boolean zzi() {
        return this.zzc.zzd.zzf() || this.zzd.zzf();
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzsw headMap(Object obj, boolean z8) {
        zztp zztpVar = this.zzc;
        obj.getClass();
        return zzq(0, zztpVar.zzu(obj, z8));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzsw subMap(Object obj, boolean z8, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (((zzsy) this.zzc).zza.compare(obj, obj2) <= 0) {
            return headMap(obj2, z10).tailMap(obj, z8);
        }
        throw new IllegalArgumentException(zzro.zzb("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final zzsw tailMap(Object obj, boolean z8) {
        zztp zztpVar = this.zzc;
        obj.getClass();
        return zzq(zztpVar.zzv(obj, z8), this.zzd.size());
    }
}
