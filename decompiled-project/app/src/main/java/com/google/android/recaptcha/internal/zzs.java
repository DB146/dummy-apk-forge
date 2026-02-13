package com.google.android.recaptcha.internal;

import Db.m;
import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import cc.F;
import cc.InterfaceC0937i0;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzs extends i implements e {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, dVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 == 0) {
            E e2 = (E) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(F.B(e2, null, 0, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3));
            }
            InterfaceC0937i0[] interfaceC0937i0Arr = (InterfaceC0937i0[]) arrayList2.toArray(new InterfaceC0937i0[0]);
            InterfaceC0937i0[] interfaceC0937i0Arr2 = (InterfaceC0937i0[]) Arrays.copyOf(interfaceC0937i0Arr, interfaceC0937i0Arr.length);
            this.zza = 1;
            if (F.z(interfaceC0937i0Arr2, this) == aVar) {
                return aVar;
            }
        }
        zzq = this.zzb.zzq(this.zzc);
        return new m(zzq);
    }
}
