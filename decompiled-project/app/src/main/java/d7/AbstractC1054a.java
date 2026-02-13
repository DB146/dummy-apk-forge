package d7;

import N6.B;
import N6.F;
import N6.H;
import N6.L;
import N6.r;
import N6.t0;
import Y5.D0;
import android.os.Bundle;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1054a {

    /* renamed from: a, reason: collision with root package name */
    public static final L f16542a;

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f16543b;

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f16544c;

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f16545d;

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f16546e;

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f16547f;

    /* JADX WARN: Type inference failed for: r0v10, types: [N6.B, N6.E] */
    static {
        int i7 = L.f7237c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f16542a = L.E(15, objArr);
        F f4 = H.f7232b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        r.c(7, objArr2);
        f16543b = H.D(7, objArr2);
        f16544c = H.M("auto", "app", "am");
        f16545d = H.L("_r", "_dbg");
        ?? b2 = new B();
        b2.b(D0.f11242i);
        b2.b(D0.j);
        f16546e = b2.h();
        f16547f = H.L("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !f16544c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f16543b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        t0 t0Var = f16545d;
        int i7 = t0Var.f7343d;
        int i10 = 0;
        while (i10 < i7) {
            boolean containsKey = bundle.containsKey((String) t0Var.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f16546e.contains(str2)) {
            return false;
        }
        t0 t0Var = f16547f;
        int i7 = t0Var.f7343d;
        int i10 = 0;
        while (i10 < i7) {
            boolean matches = str2.matches((String) t0Var.get(i10));
            i10++;
            if (matches) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        char c10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        t0 t0Var = f16545d;
        int i7 = t0Var.f7343d;
        int i10 = 0;
        while (i10 < i7) {
            boolean containsKey = bundle.containsKey((String) t0Var.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("fdl")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (c10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (c10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
