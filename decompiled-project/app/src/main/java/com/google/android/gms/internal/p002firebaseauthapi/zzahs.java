package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahs {
    private List<zzaht> zza;

    public zzahs() {
        this.zza = new ArrayList();
    }

    private zzahs(List<zzaht> list) {
        if (list.isEmpty()) {
            this.zza = Collections.emptyList();
        } else {
            this.zza = Collections.unmodifiableList(list);
        }
    }

    public static zzahs zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahs(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            arrayList.add(jSONObject == null ? new zzaht() : new zzaht(e.a(jSONObject.optString("federatedId")), e.a(jSONObject.optString("displayName")), e.a(jSONObject.optString("photoUrl")), e.a(jSONObject.optString("providerId")), null, e.a(jSONObject.optString("phoneNumber")), e.a(jSONObject.optString("email"))));
        }
        return new zzahs(arrayList);
    }

    public final List<zzaht> zza() {
        return this.zza;
    }
}
