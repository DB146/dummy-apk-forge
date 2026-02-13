package Y5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f11533b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f11534c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f11535d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final R7.a f11536a;

    public Q(R7.a aVar) {
        this.f11536a = aVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.G.g(atomicReference);
        com.google.android.gms.common.internal.G.b(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (Objects.equals(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i7];
                        if (str2 == null) {
                            str2 = strArr2[i7] + "(" + strArr[i7] + ")";
                            strArr3[i7] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11536a.I() ? str : g(str, D0.f11237c, D0.f11235a, f11533b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11536a.I() ? str : g(str, D0.f11240f, D0.f11239e, f11534c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11536a.I() ? str : str.startsWith("_exp_") ? y.S.b("experiment_id(", str, ")") : g(str, D0.j, D0.f11242i, f11535d);
    }

    public final String d(C0648s c0648s) {
        R7.a aVar = this.f11536a;
        if (!aVar.I()) {
            return c0648s.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(c0648s.f11931c);
        sb2.append(",name=");
        sb2.append(a(c0648s.f11929a));
        sb2.append(",params=");
        r rVar = c0648s.f11930b;
        sb2.append(rVar == null ? null : !aVar.I() ? rVar.f11922a.toString() : e(rVar.D()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f11536a.I()) {
            return bundle.toString();
        }
        StringBuilder m10 = X.c.m("Bundle[{");
        for (String str : bundle.keySet()) {
            if (m10.length() != 8) {
                m10.append(", ");
            }
            m10.append(b(str));
            m10.append("=");
            Object obj = bundle.get(str);
            m10.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        m10.append("}]");
        return m10.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder m10 = X.c.m("[");
        for (Object obj : objArr) {
            String e2 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e2 != null) {
                if (m10.length() != 1) {
                    m10.append(", ");
                }
                m10.append(e2);
            }
        }
        m10.append("]");
        return m10.toString();
    }
}
