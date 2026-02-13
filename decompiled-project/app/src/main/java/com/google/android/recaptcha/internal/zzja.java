package com.google.android.recaptcha.internal;

import Db.g;
import Db.q;
import Eb.o;
import Hb.d;
import Ib.a;
import android.app.Application;
import android.support.v4.media.session.b;
import android.webkit.WebView;
import cc.C0953t;
import cc.F;
import cc.H0;
import cc.InterfaceC0952s;
import com.bumptech.glide.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzja extends zze {
    public InterfaceC0952s zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final g zzk;
    private final g zzl;
    private final g zzm;
    private final g zzn;
    private final g zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zza = zzekVar.zza();
        zza.zzc(zzekVar.zzd());
        this.zzj = zza;
        int i7 = zzav.zza;
        this.zzk = b.z(zzis.zza);
        this.zzl = b.z(zzit.zza);
        this.zzm = b.z(zziu.zza);
        this.zzn = b.z(zziv.zza);
        this.zzo = b.z(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzE(zzsc zzscVar, d dVar) {
        zzim zzimVar;
        int i7;
        zzbd e2;
        zzja zzjaVar;
        if (dVar instanceof zzim) {
            zzimVar = (zzim) dVar;
            int i10 = zzimVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzimVar.zza;
                a aVar = a.f5345a;
                i7 = zzimVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    try {
                        zzff zzffVar = (zzff) this.zzn.getValue();
                        zzek zzekVar = this.zzj;
                        zzimVar.zzd = this;
                        zzimVar.zzc = 1;
                        obj = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        zzjaVar = this;
                    } catch (zzbd e10) {
                        e2 = e10;
                        zzjaVar = this;
                        ((C0953t) zzjaVar.zzA()).W(e2);
                        return q.f3365a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzjaVar = zzimVar.zzd;
                    try {
                        c.c0(obj);
                    } catch (zzbd e11) {
                        e2 = e11;
                        ((C0953t) zzjaVar.zzA()).W(e2);
                        return q.f3365a;
                    }
                }
                F.B(zzjaVar.zzq.zzb(), null, 0, new zzin(zzjaVar, (String) obj, null), 3);
                return q.f3365a;
            }
        }
        zzimVar = new zzim(this, dVar);
        Object obj2 = zzimVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzimVar.zzc;
        if (i7 != 0) {
        }
        F.B(zzjaVar.zzq.zzb(), null, 0, new zzin(zzjaVar, (String) obj2, null), 3);
        return q.f3365a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzF(String str, d dVar) {
        zzio zzioVar;
        int i7;
        zzja zzjaVar;
        String str2;
        String str3;
        zzen zzenVar;
        if (dVar instanceof zzio) {
            zzioVar = (zzio) dVar;
            int i10 = zzioVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzioVar.zza;
                a aVar = a.f5345a;
                i7 = zzioVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    this.zzp = this.zzj.zzf(26);
                    try {
                        String zza = ((zzbr) this.zzl.getValue()).zza();
                        zzioVar.zzd = this;
                        zzioVar.zze = str;
                        zzioVar.zzf = zza;
                        zzioVar.zzc = 1;
                        Object zzw = zzw(zzioVar);
                        if (zzw == aVar) {
                            return aVar;
                        }
                        str2 = str;
                        str3 = zza;
                        obj = zzw;
                        zzjaVar = this;
                    } catch (Exception e2) {
                        e = e2;
                        zzjaVar = this;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, e.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                        }
                        zzjaVar.zzp = null;
                        ((C0953t) zzjaVar.zzA()).W(zzbdVar);
                        return q.f3365a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = zzioVar.zzf;
                    String str5 = zzioVar.zze;
                    zzjaVar = zzioVar.zzd;
                    try {
                        c.c0(obj);
                        str3 = str4;
                        str2 = str5;
                    } catch (Exception e10) {
                        e = e10;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzU, e.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                            zzenVar.zzb(zzbdVar2);
                        }
                        zzjaVar.zzp = null;
                        ((C0953t) zzjaVar.zzA()).W(zzbdVar2);
                        return q.f3365a;
                    }
                }
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
                return q.f3365a;
            }
        }
        zzioVar = new zzio(this, dVar);
        Object obj2 = zzioVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzioVar.zzc;
        if (i7 != 0) {
        }
        ((WebView) obj2).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
        return q.f3365a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzG(String str, d dVar) {
        zzix zzixVar;
        Object obj;
        int i7;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (dVar instanceof zzix) {
            zzixVar = (zzix) dVar;
            int i10 = zzixVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i10 - Integer.MIN_VALUE;
                obj = zzixVar.zza;
                a aVar = a.f5345a;
                i7 = zzixVar.zzc;
                q qVar = q.f3365a;
                if (i7 != 0) {
                    c.c0(obj);
                    zzcb zzcbVar = this.zzg;
                    zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
                    zzixVar.zzd = this;
                    zzixVar.zze = str;
                    zzixVar.zzc = 1;
                    obj = zzcbVar.zzb(zzjeVarArr, zzixVar);
                    if (obj != aVar) {
                        zzjaVar = this;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzixVar.zze;
                    zzjaVar2 = zzixVar.zzd;
                    c.c0(obj);
                    zzjaVar2.zza = F.a();
                    zzek zzekVar = zzjaVar2.zzj;
                    zzekVar.zzc(str);
                    F.B(zzjaVar2.zzq.zza(), null, 0, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3);
                    return qVar;
                }
                str = zzixVar.zze;
                zzjaVar = zzixVar.zzd;
                c.c0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return qVar;
                }
                zzcb zzcbVar2 = zzjaVar.zzg;
                zzje zzjeVar = zzje.zzb;
                zzixVar.zzd = zzjaVar;
                zzixVar.zze = str;
                zzixVar.zzc = 2;
                if (zzcbVar2.zzc(zzjeVar, zzixVar) != aVar) {
                    zzjaVar2 = zzjaVar;
                    zzjaVar2.zza = F.a();
                    zzek zzekVar2 = zzjaVar2.zzj;
                    zzekVar2.zzc(str);
                    F.B(zzjaVar2.zzq.zza(), null, 0, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3);
                    return qVar;
                }
                return aVar;
            }
        }
        zzixVar = new zzix(this, dVar);
        obj = zzixVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzixVar.zzc;
        q qVar2 = q.f3365a;
        if (i7 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC0952s zzA() {
        InterfaceC0952s interfaceC0952s = this.zza;
        if (interfaceC0952s != null) {
            return interfaceC0952s;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(o.t0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, d dVar) {
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        if (((cc.C0953t) r12).o(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a1, code lost:
    
        if (r12 != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, d dVar) {
        zzip zzipVar;
        Object obj;
        ?? r22;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        zzja zzjaVar4;
        try {
            if (dVar instanceof zzip) {
                zzipVar = (zzip) dVar;
                int i7 = zzipVar.zzc;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    zzipVar.zzc = i7 - Integer.MIN_VALUE;
                    obj = zzipVar.zza;
                    a aVar = a.f5345a;
                    r22 = zzipVar.zzc;
                    if (r22 != 0) {
                        c.c0(obj);
                        zzcb zzcbVar = this.zzg;
                        zzje zzjeVar = zzje.zzd;
                        zzipVar.zzd = this;
                        zzipVar.zze = str;
                        zzipVar.zzc = 1;
                        obj = zzcbVar.zza(zzjeVar, zzipVar);
                        if (obj != aVar) {
                            zzjaVar2 = this;
                        }
                        return aVar;
                    }
                    if (r22 == 1) {
                        str = zzipVar.zze;
                        zzja zzjaVar5 = zzipVar.zzd;
                        c.c0(obj);
                        zzjaVar2 = zzjaVar5;
                    } else if (r22 == 2) {
                        str = zzipVar.zze;
                        zzja zzjaVar6 = zzipVar.zzd;
                        c.c0(obj);
                        zzjaVar3 = zzjaVar6;
                        zzjaVar4 = zzjaVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            zzipVar.zzd = zzjaVar3;
                            zzipVar.zze = str;
                            zzipVar.zzc = 3;
                            Object zzG = zzjaVar3.zzG(str, zzipVar);
                            zzjaVar4 = zzjaVar3;
                            if (zzG == aVar) {
                                return aVar;
                            }
                        }
                        InterfaceC0952s zzA = zzjaVar4.zzA();
                        zzipVar.zzd = zzjaVar4;
                        zzipVar.zze = str;
                        zzipVar.zzc = 4;
                        r22 = zzjaVar4;
                    } else {
                        if (r22 != 3) {
                            if (r22 != 4) {
                                if (r22 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str = zzipVar.zze;
                                zzjaVar = zzipVar.zzd;
                                try {
                                    c.c0(obj);
                                    zzsi zzsiVar = (zzsi) obj;
                                    zzsh zzf = zzsi.zzf();
                                    zzf.zze(str);
                                    zzsl zzf2 = zzsm.zzf();
                                    zzf2.zze(zzsiVar.zzl());
                                    zzf.zzq(zzf2);
                                    zzsj zzf3 = zzsk.zzf();
                                    zzf3.zze(zzsiVar.zzj());
                                    zzf3.zzf(zzsiVar.zzM());
                                    zzf.zzr(zzf3);
                                    return zzf.zzk();
                                } catch (Exception e2) {
                                    e = e2;
                                    zzbd zza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                                    InterfaceC0952s interfaceC0952s = (InterfaceC0952s) zzjaVar.zze.remove(str);
                                    if (interfaceC0952s != null) {
                                        ((C0953t) interfaceC0952s).W(zza);
                                    }
                                    return c.n(zza);
                                }
                            }
                            str = zzipVar.zze;
                            zzja zzjaVar7 = zzipVar.zzd;
                            c.c0(obj);
                            r22 = zzjaVar7;
                            C0953t a9 = F.a();
                            r22.zze.put(str, a9);
                            zztp zzf4 = zztq.zzf();
                            zzf4.zze(str);
                            byte[] zzd = ((zztq) zzf4.zzk()).zzd();
                            F.B(r22.zzq.zzb(), null, 0, new zziq(r22, zzkh.zzh().zzi(zzd, 0, zzd.length), null), 3);
                            zzipVar.zzd = r22;
                            zzipVar.zze = str;
                            zzipVar.zzc = 5;
                            obj = a9.o(zzipVar);
                            if (obj != aVar) {
                                zzjaVar = r22;
                                zzsi zzsiVar2 = (zzsi) obj;
                                zzsh zzf5 = zzsi.zzf();
                                zzf5.zze(str);
                                zzsl zzf22 = zzsm.zzf();
                                zzf22.zze(zzsiVar2.zzl());
                                zzf5.zzq(zzf22);
                                zzsj zzf32 = zzsk.zzf();
                                zzf32.zze(zzsiVar2.zzj());
                                zzf32.zzf(zzsiVar2.zzM());
                                zzf5.zzr(zzf32);
                                return zzf5.zzk();
                            }
                            return aVar;
                        }
                        str = zzipVar.zze;
                        zzja zzjaVar8 = zzipVar.zzd;
                        c.c0(obj);
                        zzjaVar4 = zzjaVar8;
                        InterfaceC0952s zzA2 = zzjaVar4.zzA();
                        zzipVar.zzd = zzjaVar4;
                        zzipVar.zze = str;
                        zzipVar.zzc = 4;
                        r22 = zzjaVar4;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return c.n(new zzbd(zzbb.zzb, zzba.zzav, null));
                    }
                    zzcb zzcbVar2 = zzjaVar2.zzg;
                    zzje zzjeVar2 = zzje.zzc;
                    zzipVar.zzd = zzjaVar2;
                    zzipVar.zze = str;
                    zzipVar.zzc = 2;
                    obj = zzcbVar2.zza(zzjeVar2, zzipVar);
                    zzjaVar3 = zzjaVar2;
                }
            }
            if (r22 != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Exception e10) {
            e = e10;
            zzjaVar = r22;
        }
        zzipVar = new zzip(this, dVar);
        obj = zzipVar.zza;
        a aVar2 = a.f5345a;
        r22 = zzipVar.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, d dVar) {
        if (l.a(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return q.f3365a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzsc zzscVar, d dVar) {
        zzir zzirVar;
        int i7;
        if (dVar instanceof zzir) {
            zzirVar = (zzir) dVar;
            int i10 = zzirVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzirVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzirVar.zza;
                Object obj2 = a.f5345a;
                i7 = zzirVar.zzc;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c.c0(obj);
                        return c.n(new zzbd(zzbb.zzb, zzba.zzav, null));
                    }
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                    return q.f3365a;
                }
                c.c0(obj);
                if (zzscVar.zzT() && zzscVar.zzR() && zzscVar.zzQ()) {
                    this.zzf = zzscVar;
                    String zzd = this.zzc.zzd();
                    zzirVar.zzc = 2;
                } else {
                    zzcb zzcbVar = this.zzg;
                    zzje zzjeVar = zzje.zzd;
                    zzirVar.zzc = 1;
                }
                return obj2;
            }
        }
        zzirVar = new zzir(this, dVar);
        Object obj3 = zzirVar.zza;
        Object obj22 = a.f5345a;
        i7 = zzirVar.zzc;
        if (i7 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, d dVar) {
        exc.getMessage();
        InterfaceC0952s interfaceC0952s = (InterfaceC0952s) this.zze.remove(str);
        if (interfaceC0952s != null) {
            ((C0953t) interfaceC0952s).W(exc);
        }
        return q.f3365a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, d dVar) {
        return ((exc instanceof H0) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(d dVar) {
        return F.K(this.zzq.zzb().l(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), dVar);
    }

    public final Object zzx(d dVar) {
        Object K10 = F.K(this.zzq.zzb().l(), new zzil(this, null), dVar);
        return K10 == a.f5345a ? K10 : q.f3365a;
    }
}
