package com.google.android.recaptcha.internal;

import Db.m;
import Eb.n;
import Eb.v;
import Hb.d;
import Ib.a;
import cc.F;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzl(List list, int i7, f fVar) {
        v vVar = v.f3891a;
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) vVar.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzh(zze... elements) {
        List list = this.zza;
        l.e(list, "<this>");
        l.e(elements, "elements");
        list.addAll(n.J(elements));
    }

    public final Object zzb(String str, long j, d dVar) {
        return F.k(new zzh(this, str, j, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j, zzsc zzscVar, zzek zzekVar, d dVar) {
        zzi zziVar;
        int i7;
        if (dVar instanceof zzi) {
            zziVar = (zzi) dVar;
            int i10 = zziVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zziVar.zza;
                a aVar = a.f5345a;
                i7 = zziVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    zzk zzkVar = new zzk(this, zzekVar, j, zzscVar, null);
                    zziVar.zzc = 1;
                    obj = F.k(zzkVar, zziVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                }
                return ((m) obj).f3357a;
            }
        }
        zziVar = new zzi(this, dVar);
        Object obj2 = zziVar.zza;
        a aVar2 = a.f5345a;
        i7 = zziVar.zzc;
        if (i7 != 0) {
        }
        return ((m) obj2).f3357a;
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }
}
