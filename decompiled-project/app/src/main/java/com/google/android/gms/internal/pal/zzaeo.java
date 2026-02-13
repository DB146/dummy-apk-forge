package com.google.android.gms.internal.pal;

import X.c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaeo extends zzabj implements RandomAccess {
    private static final zzaeo zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzaeo zzaeoVar = new zzaeo(new Object[0], 0);
        zza = zzaeoVar;
        zzaeoVar.zzb();
    }

    public zzaeo() {
        this(new Object[10], 0);
    }

    private zzaeo(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    public static zzaeo zze() {
        return zza;
    }

    private final String zzf(int i7) {
        return c.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
        Object[] objArr = this.zzb;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
        } else {
            Object[] objArr2 = new Object[c.b(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.zzb, i7, objArr2, i7 + 1, this.zzc - i7);
            this.zzb = objArr2;
        }
        this.zzb[i7] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i7 = this.zzc;
        Object[] objArr = this.zzb;
        if (i7 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        zzg(i7);
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        zza();
        zzg(i7);
        Object[] objArr = this.zzb;
        Object obj = objArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zza();
        zzg(i7);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzadf
    public final /* bridge */ /* synthetic */ zzadf zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzaeo(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }
}
