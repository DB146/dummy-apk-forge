package com.google.android.recaptcha.internal;

import Db.l;
import Db.m;
import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import cc.F;
import cc.I;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh extends i implements e {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzen zzenVar2;
        a aVar = a.f5345a;
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            c.c0(obj);
        } else {
            c.c0(obj);
            E e2 = (E) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(F.e(e2, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            I[] iArr = (I[]) arrayList.toArray(new I[0]);
            I[] iArr2 = (I[]) Arrays.copyOf(iArr, iArr.length);
            this.zze = zzenVar;
            this.zza = 1;
            obj = F.f(iArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar2 = zzenVar;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((m) it.next()).f3357a;
            if (!(obj2 instanceof l)) {
                zzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}
