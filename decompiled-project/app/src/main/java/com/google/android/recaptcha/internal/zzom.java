package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    public static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int zzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzna) obj).zzb.zzb() : zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int hashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        boolean zzO;
        zzpl zzplVar = this.zzb;
        Object zza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzovVar.zzd();
                int i7 = 0;
                if (zzd != 11) {
                    if ((zzd & 7) != 2) {
                        zzO = zzovVar.zzO();
                    } else {
                        if (zzmoVar.zza(this.zza, zzd >>> 3) != null) {
                            throw null;
                        }
                        zzO = zzplVar.zzk(zza, zzovVar, 0);
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    zznc zzncVar = null;
                    zzle zzleVar = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzovVar.zzd();
                        if (zzd2 == 16) {
                            i7 = zzovVar.zzj();
                            zzncVar = zzmoVar.zza(this.zza, i7);
                        } else if (zzd2 == 26) {
                            if (zzncVar != null) {
                                throw null;
                            }
                            zzleVar = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVar == null) {
                        continue;
                    } else {
                        if (zzncVar != null) {
                            throw null;
                        }
                        zzplVar.zzg(zza, i7, zzleVar);
                    }
                }
            } finally {
                zzplVar.zzj(obj, zza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[EDGE_INSN: B:24:0x0084->B:25:0x0084 BREAK  A[LOOP:1: B:10:0x0049->B:18:0x0049], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i7, int i10, zzkt zzktVar) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar == zzpm.zzc()) {
            zzpmVar = zzpm.zzf();
            zzndVar.zzc = zzpmVar;
        }
        ((zzna) obj).zzi();
        zznc zzncVar = null;
        while (i7 < i10) {
            int zzi = zzku.zzi(bArr, i7, zzktVar);
            int i11 = zzktVar.zza;
            if (i11 == 11) {
                int i12 = 0;
                zzle zzleVar = null;
                while (zzi < i10) {
                    zzi = zzku.zzi(bArr, zzi, zzktVar);
                    int i13 = zzktVar.zza;
                    int i14 = i13 >>> 3;
                    int i15 = i13 & 7;
                    if (i14 != 2) {
                        if (i14 == 3) {
                            if (zzncVar != null) {
                                int i16 = zzos.zza;
                                throw null;
                            }
                            if (i15 == 2) {
                                zzi = zzku.zza(bArr, zzi, zzktVar);
                                zzleVar = (zzle) zzktVar.zzc;
                            }
                        }
                        if (i13 != 12) {
                            break;
                        } else {
                            zzi = zzku.zzo(i13, bArr, zzi, i10, zzktVar);
                        }
                    } else if (i15 == 0) {
                        zzi = zzku.zzi(bArr, zzi, zzktVar);
                        i12 = zzktVar.zza;
                        zzncVar = zzktVar.zzd.zza(this.zza, i12);
                    } else if (i13 != 12) {
                    }
                }
                if (zzleVar != null) {
                    zzpmVar.zzj((i12 << 3) | 2, zzleVar);
                }
                i7 = zzi;
            } else if ((i11 & 7) == 2) {
                zzncVar = zzktVar.zzd.zza(this.zza, i11 >>> 3);
                if (zzncVar != null) {
                    int i17 = zzos.zza;
                    throw null;
                }
                i7 = zzku.zzh(i11, bArr, zzi, i10, zzpmVar, zzktVar);
            } else {
                i7 = zzku.zzo(i11, bArr, zzi, i10, zzktVar);
            }
        }
        if (i7 != i10) {
            throw new zznn("Failed to parse the message.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) {
        Iterator zzf = ((zzna) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
