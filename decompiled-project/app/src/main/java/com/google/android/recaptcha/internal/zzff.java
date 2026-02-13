package com.google.android.recaptcha.internal;

import Db.g;
import Hb.d;
import ac.n;
import android.support.v4.media.session.b;
import cc.F;

/* loaded from: classes.dex */
public final class zzff {
    private final g zza;
    private final g zzb;
    private final g zzc;

    public zzff() {
        int i7 = zzav.zza;
        this.zza = b.z(zzfc.zza);
        this.zzb = b.z(zzfd.zza);
        this.zzc = b.z(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, d dVar) {
        try {
            String zzl = zzscVar.zzl();
            String zzM = zzscVar.zzM();
            zzaq zzf = zzffVar.zzf();
            String str = null;
            if (zzf != null && zzf.zzd(zzM)) {
                zzen zzf2 = zzekVar.zzf(25);
                try {
                    String zza = zzffVar.zzf().zza(zzM);
                    if (zza != null) {
                        zzf2.zza();
                        str = zza;
                    }
                } catch (Exception e2) {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzR, e2.getMessage()));
                }
                zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
            }
            if (str == null) {
                zzaq zzf3 = zzffVar.zzf();
                if (zzf3 != null) {
                    zzf3.zzb();
                }
                zzen zzf4 = zzekVar.zzf(23);
                try {
                    str = zzffVar.zzg().zzb(zzl);
                    zzf4.zza();
                    zzen zzf5 = zzekVar.zzf(24);
                    try {
                        zzaq zzf6 = zzffVar.zzf();
                        if (zzf6 != null) {
                            zzf6.zzc(zzM, str);
                        }
                        zzf5.zza();
                    } catch (Exception e10) {
                        zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e10.getMessage()));
                    }
                } catch (zzbd e11) {
                    zzf4.zzb(e11);
                    throw e11;
                }
            }
            return n.W(zzscVar.zzk(), "JAVASCRIPT_TAG", str);
        } catch (Exception e12) {
            if (e12 instanceof zzbd) {
                throw e12;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e12.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, d dVar) {
        return F.k(new zzfb(this, str, zztoVar, null), dVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, d dVar) {
        return zze(this, zzscVar, zzekVar, dVar);
    }
}
