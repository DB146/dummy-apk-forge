package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import n7.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaau implements zzafn<zzahd> {
    private final /* synthetic */ zzafk zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ F zze;
    private final /* synthetic */ zzaeg zzf;
    private final /* synthetic */ zzahn zzg;

    public zzaau(zzaam zzaamVar, zzafk zzafkVar, String str, String str2, Boolean bool, F f4, zzaeg zzaegVar, zzahn zzahnVar) {
        this.zza = zzafkVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = f4;
        this.zzf = zzaegVar;
        this.zzg = zzahnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahd zzahdVar) {
        List<zzahc> zza = zzahdVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzahc zzahcVar = zza.get(0);
        zzahs zzf = zzahcVar.zzf();
        List<zzaht> zza2 = zzf != null ? zzf.zza() : null;
        if (zza2 != null && !zza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zza2.get(0).zza(this.zzc);
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= zza2.size()) {
                        break;
                    }
                    if (zza2.get(i7).zzf().equals(this.zzb)) {
                        zza2.get(i7).zza(this.zzc);
                        break;
                    }
                    i7++;
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzahcVar.zza(bool.booleanValue());
        } else {
            zzahcVar.zza(zzahcVar.zzb() - zzahcVar.zza() < 1000);
        }
        zzahcVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzahcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
