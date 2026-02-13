package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.C0953t;
import cc.E;
import cc.F;
import cc.InterfaceC0952s;
import com.bumptech.glide.c;
import kotlin.jvm.internal.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzam extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzam(this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v vVar;
        Exception e2;
        Throwable th;
        a aVar = a.f5345a;
        if (this.zzb != 0) {
            vVar = (v) this.zza;
            try {
                c.c0(obj);
            } catch (Exception e10) {
                e2 = e10;
                InterfaceC0952s zzf = this.zzc.zzf();
                th = (Throwable) vVar.f19134a;
                if (th == null) {
                    th = e2;
                }
                ((C0953t) zzf).W(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e2.getMessage()));
                return q.f3365a;
            }
        } else {
            c.c0(obj);
            ?? obj2 = new Object();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, obj2, null);
                this.zza = obj2;
                this.zzb = 1;
                if (F.L(60000L, zzalVar, this) == aVar) {
                    return aVar;
                }
            } catch (Exception e11) {
                vVar = obj2;
                e2 = e11;
                InterfaceC0952s zzf2 = this.zzc.zzf();
                th = (Throwable) vVar.f19134a;
                if (th == null) {
                }
                ((C0953t) zzf2).W(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e2.getMessage()));
                return q.f3365a;
            }
        }
        return q.f3365a;
    }
}
