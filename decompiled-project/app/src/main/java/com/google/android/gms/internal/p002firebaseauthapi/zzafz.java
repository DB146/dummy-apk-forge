package com.google.android.gms.internal.p002firebaseauthapi;

import I5.a;
import X.c;
import com.google.android.gms.common.api.Status;
import h3.H;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzafz extends zzaeg {
    private final String zza;
    private final /* synthetic */ zzafu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafz(zzafu zzafuVar, zzaeg zzaegVar, String str) {
        super(zzaegVar);
        this.zzb = zzafuVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = zzafu.zza;
        StringBuilder n6 = c.n("SMS verification code request failed: ", H.v(status.f14897a), " ");
        n6.append(status.f14898b);
        aVar.c(n6.toString(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzagb zzagbVar = (zzagb) hashMap.get(this.zza);
        if (zzagbVar == null) {
            return;
        }
        Iterator<zzaeg> it = zzagbVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb(String str) {
        a aVar;
        HashMap hashMap;
        aVar = zzafu.zza;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzagb zzagbVar = (zzagb) hashMap.get(this.zza);
        if (zzagbVar == null) {
            return;
        }
        Iterator<zzaeg> it = zzagbVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzagbVar.zzg = true;
        zzagbVar.zzd = str;
        if (zzagbVar.zza <= 0) {
            this.zzb.zze(this.zza);
        } else if (!zzagbVar.zzc) {
            this.zzb.zzd(this.zza);
        } else {
            if (zzae.zzc(zzagbVar.zze)) {
                return;
            }
            zzafu.zzb(this.zzb, this.zza);
        }
    }
}
