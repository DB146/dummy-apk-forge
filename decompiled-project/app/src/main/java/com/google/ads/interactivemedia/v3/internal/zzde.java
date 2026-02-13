package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzde extends zzda {
    public zzde(zzct zzctVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzctVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzbx zza = zzbx.zza();
        if (zza != null) {
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zza.zzc()) {
                if (((zzda) this).zza.contains(zzeVar.zzi())) {
                    zzeVar.zzh().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
