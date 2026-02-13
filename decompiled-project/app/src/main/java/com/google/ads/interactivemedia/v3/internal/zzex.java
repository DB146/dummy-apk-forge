package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y.S;

/* loaded from: classes.dex */
public final class zzex {
    private final List zza;
    private final zzhc zzb;

    public zzex() {
        this.zza = new ArrayList(1);
        this.zzb = null;
    }

    public zzex(zzhc zzhcVar) {
        this.zza = new ArrayList(1);
        this.zzb = zzhcVar;
    }

    public final String toString() {
        return S.b("ErrorListenerSupport [errorListeners=", this.zza.toString(), "]");
    }

    public final void zza(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zza.add(adErrorListener);
    }

    public final void zzb() {
        this.zza.clear();
    }

    public final void zzc(AdErrorEvent adErrorEvent) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((AdErrorEvent.AdErrorListener) it.next()).onAdError(adErrorEvent);
        }
        zzhc zzhcVar = this.zzb;
        if (zzhcVar != null) {
            zzhcVar.zza(adErrorEvent);
        }
    }

    public final void zzd(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zza.remove(adErrorListener);
    }
}
