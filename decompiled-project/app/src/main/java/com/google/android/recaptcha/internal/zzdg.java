package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import cc.F;
import cc.H0;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdg extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, d dVar) {
        super(2, dVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzek zzu;
        zzen zzenVar;
        Exception e2;
        zzbd e10;
        H0 e11;
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        a aVar = a.f5345a;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                c.c0(obj);
            } catch (H0 e12) {
                e11 = e12;
                zzs3 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e13) {
                e10 = e13;
                zzs2 = this.zzc.zzs(e10, e10);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e14) {
                e2 = e14;
                zzs = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzZ, e2.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        } else {
            c.c0(obj);
            zzu = this.zzc.zzu(this.zzd);
            zzen zzf = zzu.zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object L = F.L(j, zzdfVar, this);
                if (L == aVar) {
                    return aVar;
                }
                zzenVar = zzf;
                obj = L;
            } catch (H0 e15) {
                zzenVar = zzf;
                e11 = e15;
                zzs3 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e16) {
                zzenVar = zzf;
                e10 = e16;
                zzs2 = this.zzc.zzs(e10, e10);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e17) {
                zzenVar = zzf;
                e2 = e17;
                zzs = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzZ, e2.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        }
        return (zzsr) obj;
    }
}
