package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.C0953t;
import cc.E;
import cc.F;
import com.bumptech.glide.c;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.jvm.internal.v;

/* loaded from: classes.dex */
final class zzal extends i implements e {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ v zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, v vVar, d dVar) {
        super(2, dVar);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = vVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzal(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:8:0x0024, B:10:0x0030, B:39:0x0016), top: B:38:0x0016 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:7:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007d -> B:5:0x0011). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z8;
        boolean z10;
        int errorCode;
        a aVar = a.f5345a;
        int i7 = this.zzc;
        if (i7 == 0) {
            c.c0(obj);
            j = 1000;
            z8 = true;
            if (!z8) {
            }
        } else if (i7 != 1) {
            z10 = this.zzb;
            j = this.zza;
            c.c0(obj);
            z8 = z10;
            j += j;
            if (!z8) {
                zzan zzanVar = this.zzd;
                this.zza = j;
                this.zzc = 1;
                obj = zzanVar.zzi(this);
                if (obj == aVar) {
                    return aVar;
                }
                ((C0953t) this.zzd.zzf()).J((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
                this.zzd.zze = zzao.zzc;
                this.zze.zza();
                z8 = false;
                if (!z8) {
                    return q.f3365a;
                }
            }
        } else {
            j = this.zza;
            try {
                c.c0(obj);
            } catch (Exception e2) {
                this.zzf.f19134a = e2;
                z10 = (e2 instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e2).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z10) {
                    throw e2;
                }
                this.zza = j;
                this.zzb = true;
                this.zzc = 2;
                if (F.l(j, this) == aVar) {
                    return aVar;
                }
            }
            ((C0953t) this.zzd.zzf()).J((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            this.zzd.zze = zzao.zzc;
            this.zze.zza();
            z8 = false;
            if (!z8) {
            }
        }
    }
}
