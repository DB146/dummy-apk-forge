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
public final class zzk extends i implements e {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object obj2;
        a aVar = a.f5345a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            c.c0(obj);
        } else {
            c.c0(obj);
            E e2 = (E) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(F.e(e2, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            I[] iArr = (I[]) arrayList.toArray(new I[0]);
            I[] iArr2 = (I[]) Arrays.copyOf(iArr, iArr.length);
            this.zzf = zzf;
            this.zza = 1;
            obj = F.f(iArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((m) it2.next()).f3357a instanceof l)) {
                    zzenVar.zza();
                    obj2 = q.f3365a;
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        obj2 = c.n(zzbdVar);
        return new m(obj2);
    }
}
