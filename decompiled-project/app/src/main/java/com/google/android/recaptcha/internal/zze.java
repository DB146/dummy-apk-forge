package com.google.android.recaptcha.internal;

import Db.m;
import Db.q;
import Hb.d;
import Ib.a;
import cc.F;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(1:(2:11|12)(2:14|15))(3:16|17|(1:19)(1:12)))(4:20|21|22|23))(4:41|42|43|(1:45)(1:46))|24|25|(1:27)|12))|50|6|(0)(0)|24|25|(0)|12) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r10 = r0;
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3 A[PHI: r0
      0x00d3: PHI (r0v14 java.lang.Object) = (r0v12 java.lang.Object), (r0v12 java.lang.Object), (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:26:0x008d, B:27:0x008f, B:18:0x00d0, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #2 {Exception -> 0x0093, blocks: (B:25:0x0084, B:27:0x008f), top: B:24:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, d dVar) {
        zza zzaVar;
        int i7;
        zzen zza;
        Exception exc;
        long j10;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        String str2 = str;
        long j11 = j;
        if (dVar instanceof zza) {
            zzaVar = (zza) dVar;
            int i10 = zzaVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i10 - Integer.MIN_VALUE;
                Object obj = zzaVar.zzc;
                a aVar = a.f5345a;
                i7 = zzaVar.zze;
                if (i7 != 0) {
                    c.c0(obj);
                    zza = zza(str);
                    try {
                        zzb zzbVar = new zzb(this, str2, null);
                        zzaVar.zza = this;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = zza;
                        zzaVar.zzb = j11;
                        zzaVar.zze = 1;
                        obj = F.L(j11, zzbVar, zzaVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        zzeVar2 = this;
                    } catch (Exception e2) {
                        exc = e2;
                        j10 = j11;
                        zzenVar = zza;
                        zzeVar = this;
                        zzbd zza2 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                        }
                        zzaVar.zza = zzeVar;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = null;
                        zzaVar.zze = 2;
                        if (zzeVar.zzi(str2, j10, exc, zzaVar) == aVar) {
                        }
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj = zzeVar.zzd(str2, zzaVar);
                        if (obj != aVar) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                c.c0(obj);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = zzaVar.zzf;
                        zzeVar = (zze) zzaVar.zza;
                        c.c0(obj);
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj = zzeVar.zzd(str2, zzaVar);
                        return obj != aVar ? aVar : obj;
                    }
                    long j12 = zzaVar.zzb;
                    zzenVar = zzaVar.zzg;
                    String str3 = zzaVar.zzf;
                    zzeVar2 = (zze) zzaVar.zza;
                    try {
                        c.c0(obj);
                        zza = zzenVar;
                        j11 = j12;
                        str2 = str3;
                    } catch (Exception e10) {
                        exc = e10;
                        long j13 = j12;
                        str2 = str3;
                        zzeVar = zzeVar2;
                        j10 = j13;
                        zzbd zza22 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                            zzenVar.zzb(zza22);
                        }
                        zzaVar.zza = zzeVar;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = null;
                        zzaVar.zze = 2;
                        if (zzeVar.zzi(str2, j10, exc, zzaVar) == aVar) {
                            return aVar;
                        }
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj = zzeVar.zzd(str2, zzaVar);
                        if (obj != aVar) {
                        }
                    }
                }
                Object obj2 = ((m) obj).f3357a;
                c.c0(obj2);
                obj = (zzsi) obj2;
                if (zza != null) {
                    zza.zza();
                }
            }
        }
        zzaVar = new zza(this, dVar);
        Object obj3 = zzaVar.zzc;
        a aVar2 = a.f5345a;
        i7 = zzaVar.zze;
        if (i7 != 0) {
        }
        Object obj22 = ((m) obj3).f3357a;
        c.c0(obj22);
        obj3 = (zzsi) obj22;
        if (zza != null) {
        }
    }

    public abstract Object zzd(String str, d dVar);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r13 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: Exception -> 0x0051, TRY_LEAVE, TryCatch #1 {Exception -> 0x0051, blocks: (B:27:0x004d, B:28:0x0077, B:30:0x0082), top: B:26:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j, zzsc zzscVar, d dVar) {
        zzc zzcVar;
        int i7;
        Exception e2;
        zze zzeVar;
        zzen zzenVar;
        Object obj;
        Object obj2;
        zzbd zzbdVar;
        if (dVar instanceof zzc) {
            zzcVar = (zzc) dVar;
            int i10 = zzcVar.zzd;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i10 - Integer.MIN_VALUE;
                Object obj3 = zzcVar.zzb;
                Object obj4 = a.f5345a;
                i7 = zzcVar.zzd;
                q qVar = q.f3365a;
                if (i7 != 0) {
                    c.c0(obj3);
                    zzen zzb = zzb();
                    if (this.zza) {
                        zzb.zza();
                        return qVar;
                    }
                    try {
                        zzd zzdVar = new zzd(this, zzscVar, null);
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 1;
                        Object L = F.L(j, zzdVar, zzcVar);
                        if (L != obj4) {
                            zzeVar = this;
                            obj = L;
                            zzenVar = zzb;
                        }
                    } catch (Exception e10) {
                        e2 = e10;
                        zzeVar = this;
                        zzenVar = zzb;
                        zzeVar.zza = false;
                        zzcVar.zza = zzeVar;
                        zzcVar.zze = zzenVar;
                        zzcVar.zzd = 2;
                        Object zzj = zzeVar.zzj(e2, zzcVar);
                        obj2 = zzj;
                    }
                    return obj4;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzbdVar = (zzbd) zzcVar.zza;
                        c.c0(obj3);
                        return c.n(zzbdVar);
                    }
                    zzenVar = zzcVar.zze;
                    zzeVar = (zze) zzcVar.zza;
                    c.c0(obj3);
                    obj2 = obj3;
                    zzbd zzbdVar2 = (zzbd) obj2;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar2);
                    }
                    zzcVar.zza = zzbdVar2;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbdVar2, zzcVar) != obj4) {
                        zzbdVar = zzbdVar2;
                        return c.n(zzbdVar);
                    }
                    return obj4;
                }
                zzenVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                try {
                    c.c0(obj3);
                    obj = obj3;
                } catch (Exception e11) {
                    e2 = e11;
                    zzeVar.zza = false;
                    zzcVar.zza = zzeVar;
                    zzcVar.zze = zzenVar;
                    zzcVar.zzd = 2;
                    Object zzj2 = zzeVar.zzj(e2, zzcVar);
                    obj2 = zzj2;
                }
                c.c0(((m) obj).f3357a);
                zzeVar.zza = true;
                if (zzenVar != null) {
                    zzenVar.zza();
                }
                return qVar;
            }
        }
        zzcVar = new zzc(this, dVar);
        Object obj32 = zzcVar.zzb;
        Object obj42 = a.f5345a;
        i7 = zzcVar.zzd;
        q qVar2 = q.f3365a;
        if (i7 != 0) {
        }
        c.c0(((m) obj).f3357a);
        zzeVar.zza = true;
        if (zzenVar != null) {
        }
        return qVar2;
    }

    public abstract Object zzf(String str, d dVar);

    public Object zzg(zzbd zzbdVar, d dVar) {
        return q.f3365a;
    }

    public abstract Object zzh(zzsc zzscVar, d dVar);

    public Object zzi(String str, long j, Exception exc, d dVar) {
        return q.f3365a;
    }

    public Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
