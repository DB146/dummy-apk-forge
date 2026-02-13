package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzamw<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzanc zze;
    private Map<K, V> zzf;

    private zzamw() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    private final int zza(K k) {
        int i7;
        int i10 = this.zzb;
        int i11 = i10 - 1;
        if (i11 >= 0) {
            int compareTo = k.compareTo((Comparable) ((zzana) this.zza[i11]).getKey());
            if (compareTo > 0) {
                i7 = i10 + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = k.compareTo((Comparable) ((zzana) this.zza[i13]).getKey());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        i7 = i12 + 1;
        return -i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i7) {
        zzg();
        V v10 = (V) ((zzana) this.zza[i7]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.zzb - i7) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzana(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v10;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzamw<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzanc(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzamw)) {
            return super.equals(obj);
        }
        zzamw zzamwVar = (zzamw) obj;
        int size = size();
        if (size != zzamwVar.size()) {
            return false;
        }
        int i7 = this.zzb;
        if (i7 != zzamwVar.zzb) {
            return entrySet().equals(zzamwVar.entrySet());
        }
        for (int i10 = 0; i10 < i7; i10++) {
            if (!zza(i10).equals(zzamwVar.zza(i10))) {
                return false;
            }
        }
        if (i7 != size) {
            return this.zzc.equals(zzamwVar.zzc);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzamw<K, V>) comparable);
        return zza >= 0 ? (V) ((zzana) this.zza[zza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i7 = this.zzb;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += this.zza[i11].hashCode();
        }
        return this.zzc.size() > 0 ? i10 + this.zzc.hashCode() : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzamw<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzamw<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v10) {
        zzg();
        int zza = zza((zzamw<K, V>) k);
        if (zza >= 0) {
            return (V) ((zzana) this.zza[zza]).setValue(v10);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i7 = -(zza + 1);
        if (i7 >= 16) {
            return zzf().put(k, v10);
        }
        int i10 = this.zzb;
        if (i10 == 16) {
            zzana zzanaVar = (zzana) this.zza[15];
            this.zzb = i10 - 1;
            zzf().put((Comparable) zzanaVar.getKey(), zzanaVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7, objArr, i7 + 1, (objArr.length - i7) - 1);
        this.zza[i7] = new zzana(this, k, v10);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i7) {
        if (i7 < this.zzb) {
            return (zzana) this.zza[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzc() {
        return new zzanb(this);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
