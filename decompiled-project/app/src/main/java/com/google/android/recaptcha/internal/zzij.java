package com.google.android.recaptcha.internal;

import Db.q;
import android.webkit.JavascriptInterface;
import cc.C0953t;
import cc.InterfaceC0952s;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzij {
    final /* synthetic */ zzja zza;
    private Long zzb;
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzek zzekVar;
        zzen zzenVar;
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzenVar = zzjaVar.zzp;
            if (zzenVar != null) {
                zzenVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzl = zzrc.zzl(zzbt.zza(str));
        zztw zzi = zztx.zzi();
        zzi.zzf(zzl);
        zztx zztxVar = (zztx) zzi.zzk();
        zzekVar = this.zza.zzj;
        zzekVar.zze(zztxVar);
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzek zzekVar;
        zzb();
        zztw zzi = zztx.zzi();
        zzi.zzq(zzrr.zzi(zzbt.zza(str)));
        zztx zztxVar = (zztx) zzi.zzk();
        zzekVar = this.zza.zzj;
        zzekVar.zze(zztxVar);
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzts zzg = zzts.zzg(zzbt.zza(str));
        zzg.zzi().name();
        if (zzg.zzi() != zztv.JS_CODE_SUCCESS) {
            zzg.zzi().name();
            int i7 = zzbd.zza;
            zzbd zza = zzbc.zza(zzg.zzi());
            this.zza.zzA().hashCode();
            ((C0953t) this.zza.zzA()).W(zza);
            return;
        }
        this.zza.zzA().hashCode();
        if (((C0953t) this.zza.zzA()).J(q.f3365a)) {
            return;
        }
        this.zza.zzA().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        Map map;
        zzb();
        zzsi zzi = zzsi.zzi(zzbt.zza(str));
        zzi.toString();
        map = this.zza.zze;
        InterfaceC0952s interfaceC0952s = (InterfaceC0952s) map.remove(zzi.zzk());
        if (interfaceC0952s != null) {
            ((C0953t) interfaceC0952s).J(zzi);
        }
    }
}
