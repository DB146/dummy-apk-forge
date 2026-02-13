package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.C0953t;
import cc.E;
import cc.InterfaceC0952s;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdx extends i implements e {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzdx(this.zzb, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0952s interfaceC0952s;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 == 0) {
            interfaceC0952s = this.zzb.zzc;
            this.zza = 1;
            if (((C0953t) interfaceC0952s).o(this) == aVar) {
                return aVar;
            }
        }
        return q.f3365a;
    }
}
