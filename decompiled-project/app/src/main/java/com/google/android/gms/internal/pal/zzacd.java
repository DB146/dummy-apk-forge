package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.f;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzacd implements zzaeq {
    private final zzacc zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzacd(zzacc zzaccVar) {
        zzadg.zzf(zzaccVar, "input");
        this.zza = zzaccVar;
        zzaccVar.zzc = this;
    }

    private final Object zzP(zzaer zzaerVar, zzacm zzacmVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzaerVar.zze();
            zzaerVar.zzh(zze, this, zzacmVar);
            zzaerVar.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzadi.zzg();
        } finally {
            this.zzc = i7;
        }
    }

    private final Object zzQ(zzaer zzaerVar, zzacm zzacmVar) {
        int zze = ((zzaca) this.zza).zze();
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zza >= zzaccVar.zzb) {
            throw new zzadi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzc = zzaccVar.zzc(zze);
        Object zze2 = zzaerVar.zze();
        this.zza.zza++;
        zzaerVar.zzh(zze2, this, zzacmVar);
        zzaerVar.zzf(zze2);
        this.zza.zzm(0);
        r5.zza--;
        this.zza.zzn(zzc);
        return zze2;
    }

    private final void zzR(int i7) {
        if (this.zza.zzb() != i7) {
            throw zzadi.zzi();
        }
    }

    private final void zzS(int i7) {
        if ((this.zzb & 7) != i7) {
            throw zzadi.zza();
        }
    }

    private static final void zzT(int i7) {
        if ((i7 & 3) != 0) {
            throw zzadi.zzg();
        }
    }

    private static final void zzU(int i7) {
        if ((i7 & 7) != 0) {
            throw zzadi.zzg();
        }
    }

    public static zzacd zzq(zzacc zzaccVar) {
        zzacd zzacdVar = zzaccVar.zzc;
        return zzacdVar != null ? zzacdVar : new zzacd(zzaccVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzA(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzadu)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zze = ((zzaca) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzg()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzaca) this.zza).zzg()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadu zzaduVar = (zzadu) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zze2 = ((zzaca) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzg());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzaduVar.zzf(((zzaca) this.zza).zzg());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzB(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzact)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zze = ((zzaca) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzaca) this.zza).zzd())));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i7 != 5) {
                throw zzadi.zza();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((zzaca) this.zza).zzd())));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzact zzactVar = (zzact) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zze2 = ((zzaca) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzactVar.zze(Float.intBitsToFloat(((zzaca) this.zza).zzd()));
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i10 != 5) {
            throw zzadi.zza();
        }
        do {
            zzactVar.zze(Float.intBitsToFloat(((zzaca) this.zza).zzd()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    @Deprecated
    public final void zzC(List list, zzaer zzaerVar, zzacm zzacmVar) {
        int zzf;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw zzadi.zza();
        }
        do {
            list.add(zzP(zzaerVar, zzacmVar));
            zzacc zzaccVar = this.zza;
            if (zzaccVar.zzp() || this.zzd != 0) {
                return;
            } else {
                zzf = zzaccVar.zzf();
            }
        } while (zzf == i7);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzD(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzada)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzada zzadaVar = (zzada) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzadaVar.zzg(((zzaca) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzadaVar.zzg(((zzaca) this.zza).zze());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzE(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzadu)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzh()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzaca) this.zza).zzh()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadu zzaduVar = (zzadu) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzh());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaduVar.zzf(((zzaca) this.zza).zzh());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzF(List list, zzaer zzaerVar, zzacm zzacmVar) {
        int zzf;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw zzadi.zza();
        }
        do {
            list.add(zzQ(zzaerVar, zzacmVar));
            zzacc zzaccVar = this.zza;
            if (zzaccVar.zzp() || this.zzd != 0) {
                return;
            } else {
                zzf = zzaccVar.zzf();
            }
        } while (zzf == i7);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzG(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzada)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zze = ((zzaca) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i7 != 5) {
                throw zzadi.zza();
            }
            do {
                list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzada zzadaVar = (zzada) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zze2 = ((zzaca) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzadaVar.zzg(((zzaca) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i10 != 5) {
            throw zzadi.zza();
        }
        do {
            zzadaVar.zzg(((zzaca) this.zza).zzd());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzH(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzadu)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zze = ((zzaca) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzg()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzaca) this.zza).zzg()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadu zzaduVar = (zzadu) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zze2 = ((zzaca) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzg());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzaduVar.zzf(((zzaca) this.zza).zzg());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzI(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzada)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzacc.zzs(((zzaca) this.zza).zze())));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(zzacc.zzs(((zzaca) this.zza).zze())));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzada zzadaVar = (zzada) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzadaVar.zzg(zzacc.zzs(((zzaca) this.zza).zze()));
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzadaVar.zzg(zzacc.zzs(((zzaca) this.zza).zze()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzJ(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzadu)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzacc.zzt(((zzaca) this.zza).zzh())));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(zzacc.zzt(((zzaca) this.zza).zzh())));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadu zzaduVar = (zzadu) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzaduVar.zzf(zzacc.zzt(((zzaca) this.zza).zzh()));
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaduVar.zzf(zzacc.zzt(((zzaca) this.zza).zzh()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    public final void zzK(List list, boolean z8) {
        int zzf;
        int zzf2;
        if ((this.zzb & 7) != 2) {
            throw zzadi.zza();
        }
        if (!(list instanceof zzadn) || z8) {
            do {
                list.add(z8 ? zzu() : zzt());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadn zzadnVar = (zzadn) list;
        do {
            zzadnVar.zzi(zzp());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzL(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzada)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzada zzadaVar = (zzada) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzadaVar.zzg(((zzaca) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzadaVar.zzg(((zzaca) this.zza).zze());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzM(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzadu)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzh()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzaca) this.zza).zzh()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadu zzaduVar = (zzadu) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzh());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaduVar.zzf(((zzaca) this.zza).zzh());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final boolean zzN() {
        zzS(0);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final boolean zzO() {
        int i7;
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zzp() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return zzaccVar.zzr(i7);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final double zza() {
        zzS(1);
        return Double.longBitsToDouble(((zzaca) this.zza).zzg());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final float zzb() {
        zzS(5);
        return Float.intBitsToFloat(((zzaca) this.zza).zzd());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
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

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zze() {
        zzS(0);
        return ((zzaca) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzf() {
        zzS(5);
        return ((zzaca) this.zza).zzd();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzg() {
        zzS(0);
        return ((zzaca) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzh() {
        zzS(5);
        return ((zzaca) this.zza).zzd();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzi() {
        zzS(0);
        return zzacc.zzs(((zzaca) this.zza).zze());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzj() {
        zzS(0);
        return ((zzaca) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzk() {
        zzS(1);
        return ((zzaca) this.zza).zzg();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzl() {
        zzS(0);
        return ((zzaca) this.zza).zzh();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzm() {
        zzS(1);
        return ((zzaca) this.zza).zzg();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzn() {
        zzS(0);
        return zzacc.zzt(((zzaca) this.zza).zzh());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzo() {
        zzS(0);
        return ((zzaca) this.zza).zzh();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final zzaby zzp() {
        zzS(2);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    @Deprecated
    public final Object zzr(zzaer zzaerVar, zzacm zzacmVar) {
        zzS(3);
        return zzP(zzaerVar, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final Object zzs(zzaer zzaerVar, zzacm zzacmVar) {
        zzS(2);
        return zzQ(zzaerVar, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final String zzt() {
        zzS(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final String zzu() {
        zzS(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzv(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzabn)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzq()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzabn zzabnVar = (zzabn) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzabnVar.zze(this.zza.zzq());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzabnVar.zze(this.zza.zzq());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzw(List list) {
        int zzf;
        if ((this.zzb & 7) != 2) {
            throw zzadi.zza();
        }
        do {
            list.add(zzp());
            zzacc zzaccVar = this.zza;
            if (zzaccVar.zzp()) {
                return;
            } else {
                zzf = zzaccVar.zzf();
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzx(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzacj)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zze = ((zzaca) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzaca) this.zza).zzg())));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((zzaca) this.zza).zzg())));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzacj zzacjVar = (zzacj) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zze2 = ((zzaca) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzacjVar.zze(Double.longBitsToDouble(((zzaca) this.zza).zzg()));
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzacjVar.zze(Double.longBitsToDouble(((zzaca) this.zza).zzg()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzy(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzada)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzadi.zza();
                }
                int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzada zzadaVar = (zzada) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzadi.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
            do {
                zzadaVar.zzg(((zzaca) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzadaVar.zzg(((zzaca) this.zza).zze());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzz(List list) {
        int zzf;
        int zzf2;
        if (!(list instanceof zzada)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zze = ((zzaca) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i7 != 5) {
                throw zzadi.zza();
            }
            do {
                list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                } else {
                    zzf = zzaccVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzada zzadaVar = (zzada) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zze2 = ((zzaca) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzadaVar.zzg(((zzaca) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i10 != 5) {
            throw zzadi.zza();
        }
        do {
            zzadaVar.zzg(((zzaca) this.zza).zzd());
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            } else {
                zzf2 = zzaccVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }
}
