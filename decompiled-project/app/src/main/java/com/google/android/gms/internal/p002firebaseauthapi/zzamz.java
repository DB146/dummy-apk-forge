package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzamz extends zzamw {
    public zzamz() {
        super();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamw
    public final void zzd() {
        if (!zze()) {
            for (int i7 = 0; i7 < zza(); i7++) {
                Map.Entry zza = zza(i7);
                if (((zzakt) zza.getKey()).zze()) {
                    zza.setValue(Collections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzakt) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
