package com.google.android.recaptcha.internal;

import Hb.d;
import Ib.a;
import Rb.e;
import android.app.Application;
import android.support.v4.media.session.b;
import com.bumptech.glide.c;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.l;
import l1.AbstractC1449a;
import mc.AbstractC1660e;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final InterfaceC1656a zzb = AbstractC1660e.a();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();
    private final zzl zze = new zzl(null, 1, null);

    public zzcv(Application application) {
        Map map;
        Map map2;
        this.zza = application;
        int i7 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(null, 1, null)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i10 = 0; i10 < 13; i10++) {
            zzaw zzawVar = zzawVarArr[i10];
            map = zzav.zzc;
            if (!map.containsKey(Integer.valueOf(zzawVar.zza()))) {
                map2 = zzav.zzc;
                map2.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (l.a(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) {
        if (j < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (AbstractC1449a.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return l.a(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar, int i7, Object obj) {
        return zzcvVar.zzg(str, (i7 & 2) != 0 ? 10000L : j, null, (i7 & 8) != 0 ? zzcvVar.zzf : zzbiVar, (i7 & 16) != 0 ? zzch.zza : zzchVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i7, e eVar, d dVar) {
        zzcu zzcuVar;
        int i10;
        Exception e2;
        zzen zzenVar;
        zzbd e10;
        if (dVar instanceof zzcu) {
            zzcuVar = (zzcu) dVar;
            int i11 = zzcuVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzcuVar.zza;
                Object obj2 = a.f5345a;
                i10 = zzcuVar.zzc;
                if (i10 != 0) {
                    c.c0(obj);
                    zzek zzk = zzk(str, this.zzf, i7);
                    zzen zzf = zzk.zzf(6);
                    try {
                        zzcuVar.zzd = zzf;
                        zzcuVar.zzc = 1;
                        obj = eVar.invoke(zzk, zzcuVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        zzenVar = zzf;
                    } catch (zzbd e11) {
                        e10 = e11;
                        zzenVar = zzf;
                        zzenVar.zzb(e10);
                        throw e10.zzc();
                    } catch (Exception e12) {
                        e2 = e12;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e2.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar.zzc();
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzcuVar.zzd;
                    try {
                        c.c0(obj);
                    } catch (zzbd e13) {
                        e10 = e13;
                        zzenVar.zzb(e10);
                        throw e10.zzc();
                    } catch (Exception e14) {
                        e2 = e14;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e2.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2.zzc();
                    }
                }
                zzenVar.zza();
                return obj;
            }
        }
        zzcuVar = new zzcu(this, dVar);
        Object obj3 = zzcuVar.zza;
        Object obj22 = a.f5345a;
        i10 = zzcuVar.zzc;
        if (i10 != 0) {
        }
        zzenVar.zza();
        return obj3;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i7) {
        String uuid = UUID.randomUUID().toString();
        int i10 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) b.z(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i7, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:25:0x0084, B:29:0x009a, B:34:0x008f), top: B:24:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar) {
        zzcs zzcsVar;
        Object obj;
        a aVar;
        int i7;
        String str2;
        InterfaceC1656a interfaceC1656a;
        zzcv zzcvVar;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j10;
        InterfaceC1656a interfaceC1656a2;
        int i10;
        int i11;
        try {
            if (dVar instanceof zzcs) {
                zzcsVar = (zzcs) dVar;
                int i12 = zzcsVar.zzg;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    zzcsVar.zzg = i12 - Integer.MIN_VALUE;
                    obj = zzcsVar.zze;
                    aVar = a.f5345a;
                    i7 = zzcsVar.zzg;
                    if (i7 != 0) {
                        c.c0(obj);
                        InterfaceC1656a interfaceC1656a3 = this.zzb;
                        zzcsVar.zza = this;
                        str2 = str;
                        zzcsVar.zzh = str2;
                        zzcsVar.zzb = null;
                        zzcsVar.zzj = zzbiVar;
                        zzcsVar.zzi = zzchVar;
                        zzcsVar.zzc = interfaceC1656a3;
                        zzcsVar.zzd = j;
                        zzcsVar.zzg = 1;
                        if (interfaceC1656a3.n(zzcsVar) != aVar) {
                            interfaceC1656a = interfaceC1656a3;
                            zzcvVar = this;
                            zzbiVar2 = zzbiVar;
                            zzchVar2 = zzchVar;
                            j10 = j;
                        }
                        return aVar;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC1656a2 = (InterfaceC1656a) zzcsVar.zza;
                        try {
                            c.c0(obj);
                            zzdc zzdcVar = (zzdc) obj;
                            interfaceC1656a2.l(null);
                            return zzdcVar;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC1656a2.l(null);
                            throw th;
                        }
                    }
                    long j11 = zzcsVar.zzd;
                    InterfaceC1656a interfaceC1656a4 = (InterfaceC1656a) zzcsVar.zzc;
                    zzch zzchVar3 = zzcsVar.zzi;
                    zzbi zzbiVar3 = zzcsVar.zzj;
                    String str3 = zzcsVar.zzh;
                    zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
                    c.c0(obj);
                    zzchVar2 = zzchVar3;
                    zzbiVar2 = zzbiVar3;
                    zzcvVar = zzcvVar2;
                    interfaceC1656a = interfaceC1656a4;
                    str2 = str3;
                    j10 = j11;
                    if (!l.a(zzchVar2, zzch.zza)) {
                        i11 = 3;
                    } else {
                        if (!l.a(zzchVar2, zzch.zzb)) {
                            i10 = 2;
                            zzct zzctVar = new zzct(zzcvVar, str2, j10, null, zzbiVar2, zzchVar2, null);
                            zzcsVar.zza = interfaceC1656a;
                            zzcsVar.zzh = null;
                            zzcsVar.zzb = null;
                            zzcsVar.zzj = null;
                            zzcsVar.zzi = null;
                            zzcsVar.zzc = null;
                            zzcsVar.zzg = 2;
                            obj = zzcvVar.zzj(str2, i10, zzctVar, zzcsVar);
                            if (obj != aVar) {
                                interfaceC1656a2 = interfaceC1656a;
                                zzdc zzdcVar2 = (zzdc) obj;
                                interfaceC1656a2.l(null);
                                return zzdcVar2;
                            }
                            return aVar;
                        }
                        i11 = 4;
                    }
                    i10 = i11;
                    zzct zzctVar2 = new zzct(zzcvVar, str2, j10, null, zzbiVar2, zzchVar2, null);
                    zzcsVar.zza = interfaceC1656a;
                    zzcsVar.zzh = null;
                    zzcsVar.zzb = null;
                    zzcsVar.zzj = null;
                    zzcsVar.zzi = null;
                    zzcsVar.zzc = null;
                    zzcsVar.zzg = 2;
                    obj = zzcvVar.zzj(str2, i10, zzctVar2, zzcsVar);
                    if (obj != aVar) {
                    }
                    return aVar;
                }
            }
            if (!l.a(zzchVar2, zzch.zza)) {
            }
            i10 = i11;
            zzct zzctVar22 = new zzct(zzcvVar, str2, j10, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = interfaceC1656a;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            obj = zzcvVar.zzj(str2, i10, zzctVar22, zzcsVar);
            if (obj != aVar) {
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            interfaceC1656a2 = interfaceC1656a;
            interfaceC1656a2.l(null);
            throw th;
        }
        zzcsVar = new zzcs(this, dVar);
        obj = zzcsVar.zze;
        aVar = a.f5345a;
        i7 = zzcsVar.zzg;
        if (i7 != 0) {
        }
    }
}
