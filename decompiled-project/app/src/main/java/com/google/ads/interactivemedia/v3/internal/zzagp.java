package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzagp implements Iterator {
    private final ArrayDeque zza;
    private zzadn zzb;

    public /* synthetic */ zzagp(zzadr zzadrVar, zzago zzagoVar) {
        zzadr zzadrVar2;
        if (!(zzadrVar instanceof zzagr)) {
            this.zza = null;
            this.zzb = (zzadn) zzadrVar;
            return;
        }
        zzagr zzagrVar = (zzagr) zzadrVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzagrVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzagrVar);
        zzadrVar2 = zzagrVar.zzd;
        this.zzb = zzb(zzadrVar2);
    }

    private final zzadn zzb(zzadr zzadrVar) {
        while (zzadrVar instanceof zzagr) {
            zzagr zzagrVar = (zzagr) zzadrVar;
            this.zza.push(zzagrVar);
            zzadrVar = zzagrVar.zzd;
        }
        return (zzadn) zzadrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadn next() {
        zzadn zzadnVar;
        zzadr zzadrVar;
        zzadn zzadnVar2 = this.zzb;
        if (zzadnVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzadnVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzadrVar = ((zzagr) this.zza.pop()).zze;
            zzadnVar = zzb(zzadrVar);
        } while (zzadnVar.zzd() == 0);
        this.zzb = zzadnVar;
        return zzadnVar2;
    }
}
