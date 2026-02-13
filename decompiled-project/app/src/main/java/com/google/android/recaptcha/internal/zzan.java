package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import android.content.Context;
import cc.C0953t;
import cc.E;
import cc.F;
import cc.I;
import cc.InterfaceC0952s;
import com.bumptech.glide.c;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.jvm.internal.l;
import mc.AbstractC1660e;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class zzan {
    public InterfaceC0952s zza;
    private final E zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final InterfaceC1656a zzg = AbstractC1660e.a();

    public zzan(Context context, E e2, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = e2;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(d dVar) {
        zzag zzagVar;
        int i7;
        if (dVar instanceof zzag) {
            zzagVar = (zzag) dVar;
            int i10 = zzagVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzagVar.zza;
                a aVar = a.f5345a;
                i7 = zzagVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    I zza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
                    zzagVar.zzc = 1;
                    obj = zza.await(zzagVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                }
                return obj;
            }
        }
        zzagVar = new zzag(this, dVar);
        Object obj2 = zzagVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzagVar.zzc;
        if (i7 != 0) {
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, d dVar) {
        zzah zzahVar;
        int i7;
        if (dVar instanceof zzah) {
            zzahVar = (zzah) dVar;
            int i10 = zzahVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzahVar.zza;
                a aVar = a.f5345a;
                i7 = zzahVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    InterfaceC0952s zzf = zzf();
                    zzahVar.zzd = str;
                    zzahVar.zzc = 1;
                    obj = ((C0953t) zzf).o(zzahVar);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.c0(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzahVar.zzd;
                    c.c0(obj);
                }
                I zza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzahVar.zzd = null;
                zzahVar.zzc = 2;
                obj = zza.await(zzahVar);
            }
        }
        zzahVar = new zzah(this, dVar);
        Object obj2 = zzahVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzahVar.zzc;
        if (i7 != 0) {
        }
        I zza2 = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        obj2 = zza2.await(zzahVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, d dVar) {
        zzaf zzafVar;
        int i7;
        zzan zzanVar;
        if (dVar instanceof zzaf) {
            zzafVar = (zzaf) dVar;
            int i10 = zzafVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzafVar.zza;
                a aVar = a.f5345a;
                i7 = zzafVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    try {
                        zzafVar.zzd = this;
                        zzafVar.zze = str;
                        zzafVar.zzc = 1;
                        obj = zzj(str, zzafVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        zzanVar = this;
                    } catch (Exception unused) {
                        zzanVar = this;
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                        if (zzanVar.zze(zzafVar) == aVar) {
                        }
                        zzafVar.zzd = null;
                        zzafVar.zze = null;
                        zzafVar.zzc = 3;
                        obj = zzanVar.zzj(str, zzafVar);
                        if (obj == aVar) {
                        }
                        return (String) obj;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c.c0(obj);
                            return (String) obj;
                        }
                        str = zzafVar.zze;
                        zzanVar = zzafVar.zzd;
                        c.c0(obj);
                        zzafVar.zzd = null;
                        zzafVar.zze = null;
                        zzafVar.zzc = 3;
                        obj = zzanVar.zzj(str, zzafVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        return (String) obj;
                    }
                    str = zzafVar.zze;
                    zzanVar = zzafVar.zzd;
                    try {
                        c.c0(obj);
                    } catch (Exception unused2) {
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                        if (zzanVar.zze(zzafVar) == aVar) {
                            return aVar;
                        }
                        zzafVar.zzd = null;
                        zzafVar.zze = null;
                        zzafVar.zzc = 3;
                        obj = zzanVar.zzj(str, zzafVar);
                        if (obj == aVar) {
                        }
                        return (String) obj;
                    }
                }
                return (String) obj;
            }
        }
        zzafVar = new zzaf(this, dVar);
        Object obj2 = zzafVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzafVar.zzc;
        if (i7 != 0) {
        }
        return (String) obj2;
    }

    public final Object zzd(long j, d dVar) {
        this.zzf = j;
        return q.f3365a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: all -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00ac, blocks: (B:18:0x0052, B:22:0x0060), top: B:17:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(d dVar) {
        zzak zzakVar;
        int i7;
        InterfaceC1656a interfaceC1656a;
        zzan zzanVar;
        try {
            if (dVar instanceof zzak) {
                zzakVar = (zzak) dVar;
                int i10 = zzakVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzakVar.zzd = i10 - Integer.MIN_VALUE;
                    Object obj = zzakVar.zzb;
                    a aVar = a.f5345a;
                    i7 = zzakVar.zzd;
                    q qVar = q.f3365a;
                    if (i7 != 0) {
                        c.c0(obj);
                        interfaceC1656a = this.zzg;
                        zzakVar.zze = this;
                        zzakVar.zza = interfaceC1656a;
                        zzakVar.zzd = 1;
                        if (interfaceC1656a.n(zzakVar) != aVar) {
                            zzanVar = this;
                        }
                    }
                    if (i7 != 1) {
                        if (i7 == 2) {
                            c.c0(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1656a = (InterfaceC1656a) zzakVar.zza;
                    zzanVar = zzakVar.zze;
                    c.c0(obj);
                    if (l.a(zzanVar.zze, zzao.zza)) {
                        return qVar;
                    }
                    zzanVar.zze = zzao.zzb;
                    interfaceC1656a.l(null);
                    zzek zzekVar = zzanVar.zzc;
                    zzekVar.zzc(zzekVar.zzd());
                    zzekVar.zzb(2);
                    zzen zzf = zzekVar.zzf(38);
                    zzanVar.zza = F.a();
                    F.B(zzanVar.zzb, null, 0, new zzam(zzanVar, zzf, null), 3);
                    zzakVar.zze = null;
                    zzakVar.zza = null;
                    zzakVar.zzd = 2;
                    if (!zzanVar.zzh) {
                        new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                        zzanVar.zzh = true;
                    }
                    return qVar == aVar ? aVar : qVar;
                }
            }
            if (l.a(zzanVar.zze, zzao.zza)) {
            }
        } finally {
            interfaceC1656a.l(null);
        }
        zzakVar = new zzak(this, dVar);
        Object obj2 = zzakVar.zzb;
        a aVar2 = a.f5345a;
        i7 = zzakVar.zzd;
        q qVar2 = q.f3365a;
        if (i7 != 0) {
        }
    }

    public final InterfaceC0952s zzf() {
        InterfaceC0952s interfaceC0952s = this.zza;
        if (interfaceC0952s != null) {
            return interfaceC0952s;
        }
        return null;
    }
}
