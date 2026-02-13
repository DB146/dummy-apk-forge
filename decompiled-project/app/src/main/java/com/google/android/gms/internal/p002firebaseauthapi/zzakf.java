package com.google.android.gms.internal.p002firebaseauthapi;

import P1.g;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzakf implements zzams {
    private final zzakb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzakf(zzakb zzakbVar) {
        zzakb zzakbVar2 = (zzakb) zzalb.zza(zzakbVar, "input");
        this.zza = zzakbVar2;
        zzakbVar2.zzc = this;
    }

    public static zzakf zza(zzakb zzakbVar) {
        zzakf zzakfVar = zzakbVar.zzc;
        return zzakfVar != null ? zzakfVar : new zzakf(zzakbVar);
    }

    private final <T> T zza(zzamv<T> zzamvVar, zzakk zzakkVar) {
        T zza = zzamvVar.zza();
        zzc(zza, zzamvVar, zzakkVar);
        zzamvVar.zzd(zza);
        return zza;
    }

    private final Object zza(zzanw zzanwVar, Class<?> cls, zzakk zzakkVar) {
        switch (zzake.zza[zzanwVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case g.BYTES_FIELD_NUMBER /* 8 */:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzamr.zza().zza((Class) cls), zzakkVar);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zza(int i7) {
        if (this.zza.zzc() != i7) {
            throw zzalf.zzj();
        }
    }

    private final void zza(List<String> list, boolean z8) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzalf.zza();
        }
        if (!(list instanceof zzaln) || z8) {
            do {
                list.add(z8 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzaln zzalnVar = (zzaln) list;
        do {
            zzalnVar.zza(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    private final <T> T zzb(zzamv<T> zzamvVar, zzakk zzakkVar) {
        T zza = zzamvVar.zza();
        zzd(zza, zzamvVar, zzakkVar);
        zzamvVar.zzd(zza);
        return zza;
    }

    private final void zzb(int i7) {
        if ((this.zzb & 7) != i7) {
            throw zzalf.zza();
        }
    }

    private static void zzc(int i7) {
        if ((i7 & 3) != 0) {
            throw zzalf.zzg();
        }
    }

    private final <T> void zzc(T t5, zzamv<T> zzamvVar, zzakk zzakkVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzamvVar.zza(t5, this, zzakkVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzalf.zzg();
            }
        } finally {
            this.zzc = i7;
        }
    }

    private static void zzd(int i7) {
        if ((i7 & 7) != 0) {
            throw zzalf.zzg();
        }
    }

    private final <T> void zzd(T t5, zzamv<T> zzamvVar, zzakk zzakkVar) {
        int zzj = this.zza.zzj();
        this.zza.zzv();
        int zza = this.zza.zza(zzj);
        this.zza.zza++;
        zzamvVar.zza(t5, this, zzakkVar);
        this.zza.zzb(0);
        r4.zza--;
        this.zza.zzc(zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final <T> void zza(T t5, zzamv<T> zzamvVar, zzakk zzakkVar) {
        zzb(3);
        zzc(t5, zzamvVar, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajn)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajn zzajnVar = (zzajn) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajnVar.zza(this.zza.zzu());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajnVar.zza(this.zza.zzu());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    @Deprecated
    public final <T> void zza(List<T> list, zzamv<T> zzamvVar, zzakk zzakkVar) {
        int zzi;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw zzalf.zza();
        }
        do {
            list.add(zza(zzamvVar, zzakkVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i7);
        this.zzd = zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        r7.zza.zzc(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void zza(Map<K, V> map, zzalx<K, V> zzalxVar, zzakk zzakkVar) {
        zzb(2);
        int zza = this.zza.zza(this.zza.zzj());
        Object obj = zzalxVar.zzb;
        Object obj2 = zzalxVar.zzd;
        while (true) {
            try {
                int zzc = zzc();
                if (zzc == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                }
                if (zzc == 1) {
                    obj = zza(zzalxVar.zza, (Class<?>) null, (zzakk) null);
                } else if (zzc != 2) {
                    try {
                        if (!zzt()) {
                            throw new zzalf("Unable to parse map entry.");
                            break;
                        }
                    } catch (zzale e2) {
                        if (!zzt()) {
                            throw new zzalf("Unable to parse map entry.", e2);
                        }
                    }
                } else {
                    obj2 = zza(zzalxVar.zzc, zzalxVar.zzd.getClass(), zzakkVar);
                }
            } catch (Throwable th) {
                this.zza.zzc(zza);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final <T> void zzb(T t5, zzamv<T> zzamvVar, zzakk zzakkVar) {
        zzb(2);
        zzd(t5, zzamvVar, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzb(List<zzajp> list) {
        int zzi;
        if ((this.zzb & 7) != 2) {
            throw zzalf.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final <T> void zzb(List<T> list, zzamv<T> zzamvVar, zzakk zzakkVar) {
        int zzi;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw zzalf.zza();
        }
        do {
            list.add(zzb(zzamvVar, zzakkVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i7);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzc() {
        int i7 = this.zzd;
        if (i7 != 0) {
            this.zzb = i7;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i10 = this.zzb;
        return (i10 == 0 || i10 == this.zzc) ? f.API_PRIORITY_OTHER : i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaki)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzaki zzakiVar = (zzaki) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzakiVar.zza(this.zza.zza());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        do {
            zzakiVar.zza(this.zza.zza());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakz)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzakzVar.zzc(this.zza.zzd());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzakzVar.zzc(this.zza.zzd());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakz)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i7 != 5) {
                throw zzalf.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzakzVar.zzc(this.zza.zze());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i10 != 5) {
            throw zzalf.zza();
        }
        do {
            zzakzVar.zzc(this.zza.zze());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzalr)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzalrVar.zza(this.zza.zzk());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        do {
            zzalrVar.zza(this.zza.zzk());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakx)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i7 != 5) {
                throw zzalf.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzakxVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i10 != 5) {
            throw zzalf.zza();
        }
        do {
            zzakxVar.zza(this.zza.zzb());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakz)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzakzVar.zzc(this.zza.zzf());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzakzVar.zzc(this.zza.zzf());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzalr)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzalrVar.zza(this.zza.zzl());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzalrVar.zza(this.zza.zzl());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakz)) {
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i7 != 5) {
                throw zzalf.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzakzVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i10 != 5) {
            throw zzalf.zza();
        }
        do {
            zzakzVar.zzc(this.zza.zzg());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzalr)) {
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzalrVar.zza(this.zza.zzn());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        do {
            zzalrVar.zza(this.zza.zzn());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakz)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzakzVar.zzc(this.zza.zzh());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzakzVar.zzc(this.zza.zzh());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzalr)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzalrVar.zza(this.zza.zzo());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzalrVar.zza(this.zza.zzo());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzn(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzo(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final zzajp zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakz)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzakzVar.zzc(this.zza.zzj());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzakzVar.zzc(this.zza.zzj());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzalr)) {
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw zzalf.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzalf.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzalrVar.zza(this.zza.zzp());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzalrVar.zza(this.zza.zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final boolean zzs() {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final boolean zzt() {
        int i7;
        if (this.zza.zzt() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzd(i7);
    }
}
