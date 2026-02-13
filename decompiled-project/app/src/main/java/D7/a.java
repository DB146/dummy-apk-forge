package D7;

import A0.G0;
import android.text.TextUtils;
import android.util.Log;
import i2.C1332t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements U2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3260a;

    public a(String query, int i7) {
        switch (i7) {
            case 2:
                l.e(query, "query");
                this.f3260a = query;
                return;
            default:
                query.getClass();
                this.f3260a = query;
                return;
        }
    }

    public a(String str, C1332t c1332t) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f3260a = str;
    }

    public static void b(G0 g02, f fVar) {
        c(g02, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f3277a);
        c(g02, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(g02, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        c(g02, "Accept", "application/json");
        c(g02, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f3278b);
        c(g02, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f3279c);
        c(g02, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f3280d);
        c(g02, "X-CRASHLYTICS-INSTALLATION-ID", fVar.f3281e.c().f25099a);
    }

    public static void c(G0 g02, String str, String str2) {
        if (str2 != null) {
            ((HashMap) g02.f29d).put(str, str2);
        }
    }

    public static HashMap d(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f3283h);
        hashMap.put("display_version", fVar.g);
        hashMap.put("source", Integer.toString(fVar.f3284i));
        String str = fVar.f3282f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f3260a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public JSONObject e(A7.a aVar) {
        StringBuilder sb2 = new StringBuilder("Settings response code was: ");
        int i7 = aVar.f531a;
        sb2.append(i7);
        String sb3 = sb2.toString();
        s7.c cVar = s7.c.f24187a;
        cVar.f(sb3);
        String str = this.f3260a;
        if (i7 != 200 && i7 != 201 && i7 != 202 && i7 != 203) {
            String str2 = "Settings request failed; (status: " + i7 + ") from " + str;
            if (!cVar.b(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", str2, null);
            return null;
        }
        String str3 = (String) aVar.f532b;
        try {
            return new JSONObject(str3);
        } catch (Exception e2) {
            cVar.g("Failed to parse settings JSON from " + str, e2);
            cVar.g("Settings response " + str3, null);
            return null;
        }
    }

    public String f(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }

    @Override // U2.f
    public String l() {
        return this.f3260a;
    }

    @Override // U2.f
    public void n(U2.e eVar) {
    }
}
