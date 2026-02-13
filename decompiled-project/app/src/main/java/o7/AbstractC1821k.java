package o7;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import u.C2052e;
import u.T;

/* renamed from: o7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1821k {

    /* renamed from: a, reason: collision with root package name */
    public static final I5.a f22094a = new I5.a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        G.d(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        int size = zza.size();
        I5.a aVar = f22094a;
        if (size < 2) {
            aVar.c(X.c.t("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = zza.get(1);
        try {
            C2052e d10 = d(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return d10 == null ? new HashMap() : d10;
        } catch (UnsupportedEncodingException e2) {
            aVar.b("Unable to decode token", e2, new Object[0]);
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u.T, u.e] */
    public static C2052e c(JSONObject jSONObject) {
        ?? t5 = new T(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            t5.put(next, obj);
        }
        return t5;
    }

    public static C2052e d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaag(e2);
        }
    }
}
