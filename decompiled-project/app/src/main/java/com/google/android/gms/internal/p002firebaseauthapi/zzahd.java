package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import java.util.ArrayList;
import java.util.List;
import n7.E;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahd implements zzaer<zzahd> {
    private static final String zza = "zzahd";
    private zzahf zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahd zza(String str) {
        zzahf zzahfVar;
        int i7;
        zzahc zzahcVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z8 = false;
                    int i10 = 0;
                    while (i10 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        if (jSONObject2 == null) {
                            zzahcVar = new zzahc();
                            i7 = i10;
                        } else {
                            i7 = i10;
                            zzahcVar = new zzahc(e.a(jSONObject2.optString("localId", null)), e.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z8), e.a(jSONObject2.optString("displayName", null)), e.a(jSONObject2.optString("photoUrl", null)), zzahs.zza(jSONObject2.optJSONArray("providerUserInfo")), e.a(jSONObject2.optString("rawPassword", null)), e.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzahq.zza(jSONObject2.optJSONArray("mfaInfo")), E.t(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzahcVar);
                        i10 = i7 + 1;
                        z8 = false;
                    }
                    zzahfVar = new zzahf(arrayList);
                }
                zzahfVar = new zzahf(new ArrayList());
            } else {
                zzahfVar = new zzahf();
            }
            this.zzb = zzahfVar;
            return this;
        } catch (NullPointerException e2) {
            e = e2;
            throw zzajc.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzajc.zza(e, zza, str);
        }
    }

    public final List<zzahc> zza() {
        return this.zzb.zza();
    }
}
