package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzagn {
    private final ArrayDeque zza = new ArrayDeque();

    private zzagn() {
    }

    public /* synthetic */ zzagn(zzagm zzagmVar) {
    }

    public static /* bridge */ /* synthetic */ zzadr zza(zzagn zzagnVar, zzadr zzadrVar, zzadr zzadrVar2) {
        zzagnVar.zzb(zzadrVar);
        zzagnVar.zzb(zzadrVar2);
        zzadr zzadrVar3 = (zzadr) zzagnVar.zza.pop();
        while (!zzagnVar.zza.isEmpty()) {
            zzadrVar3 = new zzagr((zzadr) zzagnVar.zza.pop(), zzadrVar3);
        }
        return zzadrVar3;
    }

    private final void zzb(zzadr zzadrVar) {
        zzadr zzadrVar2;
        zzadr zzadrVar3;
        if (!zzadrVar.zzh()) {
            if (!(zzadrVar instanceof zzagr)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzadrVar.getClass())));
            }
            zzagr zzagrVar = (zzagr) zzadrVar;
            zzadrVar2 = zzagrVar.zzd;
            zzb(zzadrVar2);
            zzadrVar3 = zzagrVar.zze;
            zzb(zzadrVar3);
            return;
        }
        int zzc = zzc(zzadrVar.zzd());
        int zzc2 = zzagr.zzc(zzc + 1);
        if (this.zza.isEmpty() || ((zzadr) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzadrVar);
            return;
        }
        int zzc3 = zzagr.zzc(zzc);
        zzadr zzadrVar4 = (zzadr) this.zza.pop();
        while (true) {
            if (this.zza.isEmpty() || ((zzadr) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzadrVar4 = new zzagr((zzadr) this.zza.pop(), zzadrVar4);
            }
        }
        zzagr zzagrVar2 = new zzagr(zzadrVar4, zzadrVar);
        while (!this.zza.isEmpty()) {
            if (((zzadr) this.zza.peek()).zzd() >= zzagr.zzc(zzc(zzagrVar2.zzd()) + 1)) {
                break;
            } else {
                zzagrVar2 = new zzagr((zzadr) this.zza.pop(), zzagrVar2);
            }
        }
        this.zza.push(zzagrVar2);
    }

    private static final int zzc(int i7) {
        int binarySearch = Arrays.binarySearch(zzagr.zza, i7);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
