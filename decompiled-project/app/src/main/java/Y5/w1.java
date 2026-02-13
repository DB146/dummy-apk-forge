package Y5;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzkp;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final N6.t0 f11983a;

    static {
        N6.F f4 = N6.H.f7232b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        N6.r.c(24, objArr);
        f11983a = N6.H.D(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean c(zzko zzkoVar, N6.y0 y0Var, N6.y0 y0Var2, N6.G0 g02, char[] cArr, int i7, int i10, int i11, String str, String str2, String str3, boolean z8, boolean z10) {
        v1 v1Var;
        char c10;
        int d10 = d(zzkoVar);
        if (d10 > 0 && (i10 != 1 || i7 != 1)) {
            cArr[d10] = '2';
        }
        if (h(zzkoVar, y0Var2) == zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            if (zzkoVar == zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i11 == 1 && g02.f7231d.equals(str)) {
                if (d10 > 0 && cArr[d10] != '2') {
                    cArr[d10] = '1';
                }
                return true;
            }
            if (y0Var.containsKey(zzkoVar) && (v1Var = (v1) y0Var.get(zzkoVar)) != null) {
                int ordinal = v1Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return h(zzkoVar, y0Var2) == zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? g(zzkoVar, cArr, str3, z10) : f(zzkoVar, cArr, str2, z8);
                        }
                        if (ordinal == 3) {
                            return h(zzkoVar, y0Var2) == zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? f(zzkoVar, cArr, str2, z8) : g(zzkoVar, cArr, str3, z10);
                        }
                    } else if (h(zzkoVar, y0Var2) != zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return g(zzkoVar, cArr, str3, z10);
                    }
                } else if (h(zzkoVar, y0Var2) != zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return f(zzkoVar, cArr, str2, z8);
                }
                c10 = '8';
            }
            c10 = '0';
        }
        if (d10 <= 0 || cArr[d10] == '2') {
            return false;
        }
        cArr[d10] = c10;
        return false;
    }

    public static final int d(zzko zzkoVar) {
        if (zzkoVar == zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkoVar == zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkoVar == zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkoVar == zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String e(zzko zzkoVar, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < zzkoVar.zza()) ? "0" : String.valueOf(str.charAt(zzkoVar.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzkoVar.zza()) {
            str3 = String.valueOf(str2.charAt(zzkoVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean f(zzko zzkoVar, char[] cArr, String str, boolean z8) {
        char c10;
        int d10 = d(zzkoVar);
        if (!z8) {
            c10 = '4';
        } else {
            if (str.length() >= zzkoVar.zza()) {
                char charAt = str.charAt(zzkoVar.zza() - 1);
                boolean z10 = charAt == '1';
                if (d10 > 0 && cArr[d10] != '2') {
                    cArr[d10] = charAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c10 = '0';
        }
        if (d10 > 0 && cArr[d10] != '2') {
            cArr[d10] = c10;
        }
        return false;
    }

    public static final boolean g(zzko zzkoVar, char[] cArr, String str, boolean z8) {
        char c10;
        int d10 = d(zzkoVar);
        if (!z8) {
            c10 = '5';
        } else {
            if (str.length() >= zzkoVar.zza()) {
                char charAt = str.charAt(zzkoVar.zza() - 1);
                boolean z10 = charAt == '1';
                if (d10 > 0 && cArr[d10] != '2') {
                    cArr[d10] = charAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c10 = '0';
        }
        if (d10 > 0 && cArr[d10] != '2') {
            cArr[d10] = c10;
        }
        return false;
    }

    public static final zzkp h(zzko zzkoVar, N6.y0 y0Var) {
        Object obj = zzkp.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = y0Var.get(zzkoVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (zzkp) obj;
    }
}
