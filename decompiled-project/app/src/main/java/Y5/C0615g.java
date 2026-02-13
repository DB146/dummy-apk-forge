package Y5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Y5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615g extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f11753b;

    /* renamed from: c, reason: collision with root package name */
    public String f11754c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0612f f11755d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f11756e;

    public final boolean K(String str) {
        return "1".equals(this.f11755d.a(str, "gaia_collection_enabled"));
    }

    public final boolean L(String str) {
        return "1".equals(this.f11755d.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean M() {
        if (this.f11753b == null) {
            Boolean V7 = V("app_measurement_lite");
            this.f11753b = V7;
            if (V7 == null) {
                this.f11753b = Boolean.FALSE;
            }
        }
        return this.f11753b.booleanValue() || !((C0646q0) this.f3094a).f11908b;
    }

    public final String N(String str) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.G.g(str2);
            return str2;
        } catch (ClassNotFoundException e2) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(e2, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e10) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(e10, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e11) {
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11577f.b(e11, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e12) {
            W w13 = c0646q0.f11912f;
            C0646q0.l(w13);
            w13.f11577f.b(e12, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void O() {
        ((C0646q0) this.f3094a).getClass();
    }

    public final String P(String str, E e2) {
        return TextUtils.isEmpty(str) ? (String) e2.a(null) : (String) e2.a(this.f11755d.a(str, e2.f11245a));
    }

    public final long Q(String str, E e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e2.a(null)).longValue();
        }
        String a9 = this.f11755d.a(str, e2.f11245a);
        if (TextUtils.isEmpty(a9)) {
            return ((Long) e2.a(null)).longValue();
        }
        try {
            return ((Long) e2.a(Long.valueOf(Long.parseLong(a9)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e2.a(null)).longValue();
        }
    }

    public final int R(String str, E e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e2.a(null)).intValue();
        }
        String a9 = this.f11755d.a(str, e2.f11245a);
        if (TextUtils.isEmpty(a9)) {
            return ((Integer) e2.a(null)).intValue();
        }
        try {
            return ((Integer) e2.a(Integer.valueOf(Integer.parseInt(a9)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e2.a(null)).intValue();
        }
    }

    public final double S(String str, E e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e2.a(null)).doubleValue();
        }
        String a9 = this.f11755d.a(str, e2.f11245a);
        if (TextUtils.isEmpty(a9)) {
            return ((Double) e2.a(null)).doubleValue();
        }
        try {
            return ((Double) e2.a(Double.valueOf(Double.parseDouble(a9)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e2.a(null)).doubleValue();
        }
    }

    public final boolean T(String str, E e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e2.a(null)).booleanValue();
        }
        String a9 = this.f11755d.a(str, e2.f11245a);
        return TextUtils.isEmpty(a9) ? ((Boolean) e2.a(null)).booleanValue() : ((Boolean) e2.a(Boolean.valueOf("1".equals(a9)))).booleanValue();
    }

    public final Bundle U() {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        try {
            Context context = c0646q0.f11907a;
            Context context2 = c0646q0.f11907a;
            PackageManager packageManager = context.getPackageManager();
            W w10 = c0646q0.f11912f;
            if (packageManager == null) {
                C0646q0.l(w10);
                w10.f11577f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo g = O5.c.a(context2).g(128, context2.getPackageName());
            if (g != null) {
                return g.metaData;
            }
            C0646q0.l(w10);
            w10.f11577f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(e2, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean V(String str) {
        com.google.android.gms.common.internal.G.d(str);
        Bundle U8 = U();
        if (U8 != null) {
            if (U8.containsKey(str)) {
                return Boolean.valueOf(U8.getBoolean(str));
            }
            return null;
        }
        W w10 = ((C0646q0) this.f3094a).f11912f;
        C0646q0.l(w10);
        w10.f11577f.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean W() {
        ((C0646q0) this.f3094a).getClass();
        Boolean V7 = V("firebase_analytics_collection_deactivated");
        return V7 != null && V7.booleanValue();
    }

    public final boolean X() {
        Boolean V7 = V("google_analytics_automatic_screen_reporting_enabled");
        return V7 == null || V7.booleanValue();
    }

    public final EnumC0663z0 Y(String str, boolean z8) {
        Object obj;
        com.google.android.gms.common.internal.G.d(str);
        Bundle U8 = U();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (U8 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = U8.get(str);
        }
        EnumC0663z0 enumC0663z0 = EnumC0663z0.UNINITIALIZED;
        if (obj == null) {
            return enumC0663z0;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC0663z0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC0663z0.DENIED;
        }
        if (z8 && "eu_consent_policy".equals(obj)) {
            return EnumC0663z0.POLICY;
        }
        W w11 = c0646q0.f11912f;
        C0646q0.l(w11);
        w11.f11580w.b(str, "Invalid manifest metadata for");
        return enumC0663z0;
    }
}
