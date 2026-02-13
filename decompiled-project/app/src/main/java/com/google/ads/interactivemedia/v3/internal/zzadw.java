package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.f;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadw implements zzagk {
    private final zzadv zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzadw(zzadv zzadvVar) {
        byte[] bArr = zzafa.zzd;
        this.zza = zzadvVar;
        zzadvVar.zzc = this;
    }

    private final void zzP(Object obj, zzags zzagsVar, zzaef zzaefVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzagsVar.zzh(obj, this, zzaefVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzafc.zzg();
            }
        } finally {
            this.zzc = i7;
        }
    }

    private final void zzQ(Object obj, zzags zzagsVar, zzaef zzaefVar) {
        int zze = ((zzadt) this.zza).zze();
        zzadv zzadvVar = this.zza;
        if (zzadvVar.zza >= zzadvVar.zzb) {
            throw new zzafc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzc = zzadvVar.zzc(zze);
        this.zza.zza++;
        zzagsVar.zzh(obj, this, zzaefVar);
        this.zza.zzm(0);
        r5.zza--;
        this.zza.zzn(zzc);
    }

    private final void zzR(int i7) {
        if (this.zza.zzb() != i7) {
            throw zzafc.zzi();
        }
    }

    private final void zzS(int i7) {
        if ((this.zzb & 7) != i7) {
            throw zzafc.zza();
        }
    }

    private static final void zzT(int i7) {
        if ((i7 & 3) != 0) {
            throw zzafc.zzg();
        }
    }

    private static final void zzU(int i7) {
        if ((i7 & 7) != 0) {
            throw zzafc.zzg();
        }
    }

    public static zzadw zzq(zzadv zzadvVar) {
        zzadw zzadwVar = zzadvVar.zzc;
        return zzadwVar != null ? zzadwVar : new zzadw(zzadvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzA(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zze = ((zzadt) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zze2 = ((zzadt) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzg());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzg());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzB(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaem)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zze = ((zzadt) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzadt) this.zza).zzd())));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i7 != 5) {
                throw zzafc.zza();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((zzadt) this.zza).zzd())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaem zzaemVar = (zzaem) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zze2 = ((zzadt) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaemVar.zze(Float.intBitsToFloat(((zzadt) this.zza).zzd()));
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i10 != 5) {
            throw zzafc.zza();
        }
        do {
            zzaemVar.zze(Float.intBitsToFloat(((zzadt) this.zza).zzd()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    @Deprecated
    public final void zzC(List list, zzags zzagsVar, zzaef zzaefVar) {
        int zzf;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw zzafc.zza();
        }
        do {
            Object zze = zzagsVar.zze();
            zzP(zze, zzagsVar, zzaefVar);
            zzagsVar.zzf(zze);
            list.add(zze);
            zzadv zzadvVar = this.zza;
            if (zzadvVar.zzp() || this.zzd != 0) {
                return;
            } else {
                zzf = zzadvVar.zzf();
            }
        } while (zzf == i7);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzD(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zze());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzE(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzh());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzh());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzF(List list, zzags zzagsVar, zzaef zzaefVar) {
        int zzf;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw zzafc.zza();
        }
        do {
            Object zze = zzagsVar.zze();
            zzQ(zze, zzagsVar, zzaefVar);
            zzagsVar.zzf(zze);
            list.add(zze);
            zzadv zzadvVar = this.zza;
            if (zzadvVar.zzp() || this.zzd != 0) {
                return;
            } else {
                zzf = zzadvVar.zzf();
            }
        } while (zzf == i7);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzG(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zze = ((zzadt) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i7 != 5) {
                throw zzafc.zza();
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zze2 = ((zzadt) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i10 != 5) {
            throw zzafc.zza();
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zzd());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzH(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zze = ((zzadt) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zze2 = ((zzadt) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzg());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzg());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzI(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzadv.zzs(((zzadt) this.zza).zze())));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(zzadv.zzs(((zzadt) this.zza).zze())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(zzadv.zzs(((zzadt) this.zza).zze()));
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(zzadv.zzs(((zzadt) this.zza).zze()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzJ(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzadv.zzt(((zzadt) this.zza).zzh())));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(zzadv.zzt(((zzadt) this.zza).zzh())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzafoVar.zzf(zzadv.zzt(((zzadt) this.zza).zzh()));
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzafoVar.zzf(zzadv.zzt(((zzadt) this.zza).zzh()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    public final void zzK(List list, boolean z8) {
        int zzf;
        int zzf2;
        if ((this.zzb & 7) != 2) {
            throw zzafc.zza();
        }
        if (!(list instanceof zzafh) || z8) {
            do {
                list.add(z8 ? zzs() : zzr());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafh zzafhVar = (zzafh) list;
        do {
            zzafhVar.zzi(zzp());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzL(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zze());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzM(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzh());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzh());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final boolean zzN() {
        zzS(0);
        return this.zza.zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final boolean zzO() {
        int i7;
        zzadv zzadvVar = this.zza;
        if (zzadvVar.zzp() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return zzadvVar.zzr(i7);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final double zza() {
        zzS(1);
        return Double.longBitsToDouble(((zzadt) this.zza).zzg());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final float zzb() {
        zzS(5);
        return Float.intBitsToFloat(((zzadt) this.zza).zzd());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzc() {
        int i7 = this.zzd;
        if (i7 != 0) {
            this.zzb = i7;
            this.zzd = 0;
        } else {
            i7 = this.zza.zzf();
            this.zzb = i7;
        }
        return (i7 == 0 || i7 == this.zzc) ? f.API_PRIORITY_OTHER : i7 >>> 3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zze() {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzf() {
        zzS(5);
        return ((zzadt) this.zza).zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzg() {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzh() {
        zzS(5);
        return ((zzadt) this.zza).zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzi() {
        zzS(0);
        return zzadv.zzs(((zzadt) this.zza).zze());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzj() {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzk() {
        zzS(1);
        return ((zzadt) this.zza).zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzl() {
        zzS(0);
        return ((zzadt) this.zza).zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzm() {
        zzS(1);
        return ((zzadt) this.zza).zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzn() {
        zzS(0);
        return zzadv.zzt(((zzadt) this.zza).zzh());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzo() {
        zzS(0);
        return ((zzadt) this.zza).zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final zzadr zzp() {
        zzS(2);
        return this.zza.zzj();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final String zzr() {
        zzS(2);
        return this.zza.zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final String zzs() {
        zzS(2);
        return this.zza.zzl();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzt(Object obj, zzags zzagsVar, zzaef zzaefVar) {
        zzS(3);
        zzP(obj, zzagsVar, zzaefVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzu(Object obj, zzags zzagsVar, zzaef zzaefVar) {
        zzS(2);
        zzQ(obj, zzagsVar, zzaefVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzv(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzadg)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzq()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadg zzadgVar = (zzadg) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzadgVar.zze(this.zza.zzq());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzadgVar.zze(this.zza.zzq());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzw(List list) {
        int zzf;
        if ((this.zzb & 7) != 2) {
            throw zzafc.zza();
        }
        do {
            list.add(zzp());
            zzadv zzadvVar = this.zza;
            if (zzadvVar.zzp()) {
                return;
            } else {
                zzf = zzadvVar.zzf();
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzx(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaec)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zze = ((zzadt) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzadt) this.zza).zzg())));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((zzadt) this.zza).zzg())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaec zzaecVar = (zzaec) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zze2 = ((zzadt) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaecVar.zze(Double.longBitsToDouble(((zzadt) this.zza).zzg()));
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzaecVar.zze(Double.longBitsToDouble(((zzadt) this.zza).zzg()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzy(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zze());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzz(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zze = ((zzadt) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i7 != 5) {
                throw zzafc.zza();
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zze2 = ((zzadt) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i10 != 5) {
            throw zzafc.zza();
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zzd());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }
}
