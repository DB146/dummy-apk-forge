package Y5;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class W extends AbstractC0659x0 {

    /* renamed from: A, reason: collision with root package name */
    public final U f11572A;

    /* renamed from: B, reason: collision with root package name */
    public final U f11573B;

    /* renamed from: c, reason: collision with root package name */
    public char f11574c;

    /* renamed from: d, reason: collision with root package name */
    public long f11575d;

    /* renamed from: e, reason: collision with root package name */
    public String f11576e;

    /* renamed from: f, reason: collision with root package name */
    public final U f11577f;

    /* renamed from: u, reason: collision with root package name */
    public final U f11578u;

    /* renamed from: v, reason: collision with root package name */
    public final U f11579v;

    /* renamed from: w, reason: collision with root package name */
    public final U f11580w;

    /* renamed from: x, reason: collision with root package name */
    public final U f11581x;

    /* renamed from: y, reason: collision with root package name */
    public final U f11582y;

    /* renamed from: z, reason: collision with root package name */
    public final U f11583z;

    public W(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11574c = (char) 0;
        this.f11575d = -1L;
        this.f11577f = new U(this, 6, false, false);
        this.f11578u = new U(this, 6, true, false);
        this.f11579v = new U(this, 6, false, true);
        this.f11580w = new U(this, 5, false, false);
        this.f11581x = new U(this, 5, true, false);
        this.f11582y = new U(this, 5, false, true);
        this.f11583z = new U(this, 4, false, false);
        this.f11572A = new U(this, 3, false, false);
        this.f11573B = new U(this, 2, false, false);
    }

    public static V R(String str) {
        if (str == null) {
            return null;
        }
        return new V(str);
    }

    public static String U(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        String V7 = V(obj, z8);
        String V10 = V(obj2, z8);
        String V11 = V(obj3, z8);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(V7)) {
            sb2.append(str2);
            sb2.append(V7);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(V10)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(V10);
        }
        if (!TextUtils.isEmpty(V11)) {
            sb2.append(str3);
            sb2.append(V11);
        }
        return sb2.toString();
    }

    public static String V(Object obj, boolean z8) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z8) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof V ? ((V) obj).f11571a : z8 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z8 ? th.getClass().getName() : th.toString());
        String canonicalName = C0646q0.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i7++;
        }
        return sb3.toString();
    }

    @Override // Y5.AbstractC0659x0
    public final boolean K() {
        return false;
    }

    public final U N() {
        return this.f11577f;
    }

    public final U O() {
        return this.f11580w;
    }

    public final U P() {
        return this.f11572A;
    }

    public final U Q() {
        return this.f11573B;
    }

    public final void S(int i7, boolean z8, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z8 && Log.isLoggable(T(), i7)) {
            Log.println(i7, T(), U(false, str, obj, obj2, obj3));
        }
        if (z10 || i7 < 5) {
            return;
        }
        com.google.android.gms.common.internal.G.g(str);
        C0640o0 c0640o0 = ((C0646q0) this.f3094a).f11913u;
        if (c0640o0 == null) {
            Log.println(6, T(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c0640o0.f11992b) {
                Log.println(6, T(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i7 >= 9) {
                i7 = 8;
            }
            c0640o0.S(new T(this, i7, str, obj, obj2, obj3));
        }
    }

    public final String T() {
        String str;
        synchronized (this) {
            try {
                if (this.f11576e == null) {
                    ((C0646q0) ((C0646q0) this.f3094a).f11910d.f3094a).getClass();
                    this.f11576e = "FA";
                }
                com.google.android.gms.common.internal.G.g(this.f11576e);
                str = this.f11576e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
