package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzami<T> implements zzamv<T> {
    private final zzamc zza;
    private final zzano<?, ?> zzb;
    private final boolean zzc;
    private final zzakm<?> zzd;

    private zzami(zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzamc zzamcVar) {
        this.zzb = zzanoVar;
        this.zzc = zzakmVar.zza(zzamcVar);
        this.zzd = zzakmVar;
        this.zza = zzamcVar;
    }

    public static <T> zzami<T> zza(zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzamc zzamcVar) {
        return new zzami<>(zzanoVar, zzakmVar, zzamcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zza(T t5) {
        zzano<?, ?> zzanoVar = this.zzb;
        int zzb = zzanoVar.zzb(zzanoVar.zzd(t5));
        return this.zzc ? zzb + this.zzd.zza(t5).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final T zza() {
        zzamc zzamcVar = this.zza;
        return zzamcVar instanceof zzaky ? (T) ((zzaky) zzamcVar).zzo() : (T) zzamcVar.zzq().zzf();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t5, zzams zzamsVar, zzakk zzakkVar) {
        boolean z8;
        zzano<?, ?> zzanoVar = this.zzb;
        zzakm<?> zzakmVar = this.zzd;
        Object zzc = zzanoVar.zzc(t5);
        zzakr<?> zzb = zzakmVar.zzb(t5);
        while (zzamsVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzamsVar.zzd();
                int i7 = 0;
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzakmVar.zza(zzakkVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzakmVar.zza(zzamsVar, zza, zzakkVar, zzb);
                        } else {
                            z8 = zzanoVar.zza((zzano<?, ?>) zzc, zzamsVar, 0);
                        }
                    } else {
                        z8 = zzamsVar.zzt();
                    }
                    if (z8) {
                        zzanoVar.zzb((Object) t5, (T) zzc);
                        return;
                    }
                } else {
                    Object obj = null;
                    zzajp zzajpVar = null;
                    while (zzamsVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzamsVar.zzd();
                        if (zzd2 != 16) {
                            if (zzd2 != 26) {
                                if (zzd2 == 12 || !zzamsVar.zzt()) {
                                    break;
                                }
                            } else if (obj != null) {
                                zzakmVar.zza(zzamsVar, obj, zzakkVar, zzb);
                            } else {
                                zzajpVar = zzamsVar.zzp();
                            }
                        } else {
                            i7 = zzamsVar.zzj();
                            obj = zzakmVar.zza(zzakkVar, this.zza, i7);
                        }
                    }
                    if (zzamsVar.zzd() != 12) {
                        throw zzalf.zzb();
                    }
                    if (zzajpVar != null) {
                        if (obj != null) {
                            zzakmVar.zza(zzajpVar, obj, zzakkVar, zzb);
                        } else {
                            zzanoVar.zza((zzano<?, ?>) zzc, i7, zzajpVar);
                        }
                    }
                }
                z8 = true;
                if (z8) {
                }
            } catch (Throwable th) {
                zzanoVar.zzb((Object) t5, (T) zzc);
                throw th;
            }
        }
        zzanoVar.zzb((Object) t5, (T) zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t5, zzaof zzaofVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t5).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzakt zzaktVar = (zzakt) next.getKey();
            if (zzaktVar.zzc() != zzaod.MESSAGE || zzaktVar.zze() || zzaktVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzalj) {
                zzaofVar.zza(zzaktVar.zza(), (Object) ((zzalj) next).zza().zzb());
            } else {
                zzaofVar.zza(zzaktVar.zza(), next.getValue());
            }
        }
        zzano<?, ?> zzanoVar = this.zzb;
        zzanoVar.zza((zzano<?, ?>) zzanoVar.zzd(t5), zzaofVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t5, T t10) {
        zzamx.zza(this.zzb, t5, t10);
        if (this.zzc) {
            zzamx.zza(this.zzd, t5, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t5, byte[] bArr, int i7, int i10, zzajk zzajkVar) {
        zzaky zzakyVar = (zzaky) t5;
        zzann zzannVar = zzakyVar.zzb;
        if (zzannVar == zzann.zzc()) {
            zzannVar = zzann.zzd();
            zzakyVar.zzb = zzannVar;
        }
        ((zzaky.zzb) t5).zza();
        zzaky.zzd zzdVar = null;
        while (i7 < i10) {
            int zzc = zzajl.zzc(bArr, i7, zzajkVar);
            int i11 = zzajkVar.zza;
            if (i11 == 11) {
                int i12 = 0;
                zzajp zzajpVar = null;
                while (zzc < i10) {
                    zzc = zzajl.zzc(bArr, zzc, zzajkVar);
                    int i13 = zzajkVar.zza;
                    int i14 = i13 >>> 3;
                    int i15 = i13 & 7;
                    if (i14 != 2) {
                        if (i14 == 3) {
                            if (zzdVar != null) {
                                zzamr.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i15 == 2) {
                                zzc = zzajl.zza(bArr, zzc, zzajkVar);
                                zzajpVar = (zzajp) zzajkVar.zzc;
                            }
                        }
                        if (i13 != 12) {
                            break;
                        } else {
                            zzc = zzajl.zza(i13, bArr, zzc, i10, zzajkVar);
                        }
                    } else if (i15 == 0) {
                        zzc = zzajl.zzc(bArr, zzc, zzajkVar);
                        i12 = zzajkVar.zza;
                        zzdVar = (zzaky.zzd) this.zzd.zza(zzajkVar.zzd, this.zza, i12);
                    } else if (i13 != 12) {
                    }
                }
                if (zzajpVar != null) {
                    zzannVar.zza((i12 << 3) | 2, zzajpVar);
                }
                i7 = zzc;
            } else if ((i11 & 7) == 2) {
                zzdVar = (zzaky.zzd) this.zzd.zza(zzajkVar.zzd, this.zza, i11 >>> 3);
                if (zzdVar != null) {
                    zzamr.zza();
                    throw new NoSuchMethodError();
                }
                i7 = zzajl.zza(i11, bArr, zzc, i10, zzannVar, zzajkVar);
            } else {
                i7 = zzajl.zza(i11, bArr, zzc, i10, zzajkVar);
            }
        }
        if (i7 != i10) {
            throw zzalf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zzb(T t5) {
        int hashCode = this.zzb.zzd(t5).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t5).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final boolean zzb(T t5, T t10) {
        if (!this.zzb.zzd(t5).equals(this.zzb.zzd(t10))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t5).equals(this.zzd.zza(t10));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zzd(T t5) {
        this.zzb.zzf(t5);
        this.zzd.zzc(t5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final boolean zze(T t5) {
        return this.zzd.zza(t5).zzg();
    }
}
