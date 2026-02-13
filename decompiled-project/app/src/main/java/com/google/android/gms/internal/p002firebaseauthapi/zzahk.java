package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahk implements zzaer<zzahk> {
    private static final String zza = "zzahk";
    private String zzb;
    private zzaj<zzahv> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahk zza(String str) {
        zzaj<zzahv> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = e.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzam zzg = zzaj.zzg();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i7);
                        zzg.zza(jSONObject2 == null ? zzahv.zza(null, null) : zzahv.zza(e.a(jSONObject2.optString("provider")), e.a(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaj.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException e2) {
            e = e2;
            throw zzajc.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzajc.zza(e, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb(String str) {
        G.d(str);
        zzaj<zzahv> zzajVar = this.zzc;
        if (zzajVar != null && !zzajVar.isEmpty()) {
            zzaj<zzahv> zzajVar2 = this.zzc;
            int size = zzajVar2.size();
            int i7 = 0;
            while (i7 < size) {
                zzahv zzahvVar = zzajVar2.get(i7);
                i7++;
                zzahv zzahvVar2 = zzahvVar;
                String zza2 = zzahvVar2.zza();
                String zzb = zzahvVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzahvVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }
}
