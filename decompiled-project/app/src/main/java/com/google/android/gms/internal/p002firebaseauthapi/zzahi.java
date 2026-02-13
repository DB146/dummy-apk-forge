package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahi implements zzaer<zzahi> {
    private static final String zza = "zzahi";
    private List<String> zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahi zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    this.zzb.add(optJSONArray.getString(i7));
                }
            }
            return this;
        } catch (JSONException e2) {
            throw zzajc.zza(e2, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
