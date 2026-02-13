package com.google.android.gms.internal.pal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzeg extends zzfg {
    public zzeg(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "6vt+8E5GP5AwoxquDM0Y7lVJzS23/VCjNo5D8xB8rgAaaF6IhToGZhlIAUkgigHl", "jx9F7EAIAhvEI8G+/hWsHBitt0z+K8moFRn7/w45eYc=", zzrVar, i7, 49);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        this.zze.zzab(3);
        try {
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzr zzrVar = this.zze;
            int i7 = 1;
            if (true == booleanValue) {
                i7 = 2;
            }
            zzrVar.zzab(i7);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
