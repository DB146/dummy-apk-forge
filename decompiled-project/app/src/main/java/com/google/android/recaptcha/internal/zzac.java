package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;

/* loaded from: classes.dex */
final class zzac extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzac(this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        zzan zzanVar;
        String str;
        a aVar = a.f5345a;
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e2) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e2.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i7 = 2;
            this.zzb = 2;
            if (e2 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e2).getErrorCode();
                if (errorCode == -100) {
                    i7 = 44;
                } else if (errorCode == -12) {
                    i7 = 39;
                } else if (errorCode == -3) {
                    i7 = 30;
                } else if (errorCode == -2) {
                    i7 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i7 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i7 = 53;
                            break;
                        case -17:
                            i7 = 52;
                            break;
                        case -16:
                            i7 = 43;
                            break;
                        case -15:
                            i7 = 42;
                            break;
                        case -14:
                            i7 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i7 = 36;
                                    break;
                                case -8:
                                    i7 = 35;
                                    break;
                                case -7:
                                    i7 = 34;
                                    break;
                                case -6:
                                    i7 = 33;
                                    break;
                                case -5:
                                    i7 = 32;
                                    break;
                            }
                    }
                } else {
                    i7 = 28;
                }
            } else {
                i7 = 45;
            }
            zztd zzf = zzte.zzf();
            zzf.zzq(i7);
            zzf.zzr(15);
            obj = zzf.zzk();
            if (obj == aVar) {
                return aVar;
            }
            zzyVar = zzaeVar;
        }
        if (zzenVar == 0) {
            c.c0(obj);
            zzen zzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzanVar = zzaeVar2.zzc;
            str = zzaeVar2.zze;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzb;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                c.c0(obj);
                int zza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(zza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            c.c0(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzk());
        return zzz.zza(zzaeVar3, (zzti) zzf2.zzk());
    }
}
