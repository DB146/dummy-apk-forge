package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzalr extends zzajj<Long> implements zzalc<Long>, RandomAccess {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        new zzalr(jArr, 0, false);
    }

    public zzalr() {
        this(zza, 0, true);
    }

    private zzalr(long[] jArr, int i7, boolean z8) {
        super(z8);
        this.zzb = jArr;
        this.zzc = i7;
    }

    private static int zzd(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zze(int i7) {
        return c.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzf(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
        long[] jArr = this.zzb;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i10 - i7);
        } else {
            long[] jArr2 = new long[zzd(jArr.length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, i7);
            System.arraycopy(this.zzb, i7, jArr2, i7 + 1, this.zzc - i7);
            this.zzb = jArr2;
        }
        this.zzb[i7] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zzalb.zza(collection);
        if (!(collection instanceof zzalr)) {
            return super.addAll(collection);
        }
        zzalr zzalrVar = (zzalr) collection;
        int i7 = zzalrVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        long[] jArr = this.zzb;
        if (i11 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zzalrVar.zzb, 0, this.zzb, this.zzc, zzalrVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalr)) {
            return super.equals(obj);
        }
        zzalr zzalrVar = (zzalr) obj;
        if (this.zzc != zzalrVar.zzc) {
            return false;
        }
        long[] jArr = zzalrVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Long.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + zzalb.zza(this.zzb[i10]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == longValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        zza();
        zzf(i7);
        long[] jArr = this.zzb;
        long j = jArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i10, jArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzf(i7);
        long[] jArr = this.zzb;
        long j = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalc<Long> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzalr(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zza(long j) {
        zza();
        int i7 = this.zzc;
        long[] jArr = this.zzb;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[zzd(jArr.length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, this.zzc);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        jArr3[i10] = j;
    }

    public final long zzb(int i7) {
        zzf(i7);
        return this.zzb[i7];
    }

    public final void zzc(int i7) {
        long[] jArr = this.zzb;
        if (i7 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.zzb = new long[Math.max(i7, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i7) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }
}
