package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zznz extends zzod {
    public zznz() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzod
    public final void zza() {
        if (!zzb()) {
            for (int i7 = 0; i7 < zzc(); i7++) {
                Map.Entry zzd = zzd(i7);
                if (((zzlu) ((zzoa) zzd).zza()).zzd()) {
                    zzd.setValue(Collections.unmodifiableList((List) zzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzlu) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
