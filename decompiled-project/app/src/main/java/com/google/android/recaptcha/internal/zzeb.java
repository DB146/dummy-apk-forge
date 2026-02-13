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
public final class zzeb extends i implements e {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC0952s zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC0952s interfaceC0952s, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
        this.zzc = interfaceC0952s;
        this.zzd = j;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzci zzciVar;
        a aVar = a.f5345a;
        try {
            if (this.zza != 0) {
                c.c0(obj);
            } else {
                c.c0(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((Boolean) obj).getClass();
        } catch (zzbd e2) {
            zzec zzecVar = this.zzb;
            zzciVar = zzcm.zzd;
            zzecVar.zzf = zzciVar;
            ((C0953t) this.zzc).W(e2);
        }
        return q.f3365a;
    }
}
