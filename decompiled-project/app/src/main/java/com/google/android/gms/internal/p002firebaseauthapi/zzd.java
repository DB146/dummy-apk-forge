package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class zzd<T> implements Iterator<T> {
    private int zza = 2;
    private T zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.zza;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int i10 = i7 - 1;
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.zza = 4;
            this.zzb = zza();
            if (this.zza != 3) {
                this.zza = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza = 2;
        T t5 = this.zzb;
        this.zzb = null;
        return t5;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zza();

    public final T zzb() {
        this.zza = 3;
        return null;
    }
}
