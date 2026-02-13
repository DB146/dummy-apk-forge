package Y5;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11958a;

    public u1(Map map) {
        HashMap hashMap = new HashMap();
        this.f11958a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        N6.t0 t0Var = w1.f11983a;
        int i7 = t0Var.f7343d;
        for (int i10 = 0; i10 < i7; i10++) {
            String str = (String) t0Var.get(i10);
            HashMap hashMap = this.f11958a;
            if (hashMap.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) hashMap.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle b() {
        E e2 = F.f11303Z0;
        boolean booleanValue = ((Boolean) e2.a(null)).booleanValue();
        HashMap hashMap = this.f11958a;
        if (!booleanValue ? !(!"1".equals(hashMap.get("GoogleConsent")) || !"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode")))) {
            if (((Boolean) e2.a(null)).booleanValue() && hashMap.get("Version") != null) {
                if (e() >= 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("ad_storage", true != Objects.equals(hashMap.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                    bundle.putString("ad_personalization", (Objects.equals(hashMap.get("AuthorizePurpose3"), "1") && Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                    if (e() >= 4) {
                        bundle.putString("ad_user_data", (Objects.equals(hashMap.get("AuthorizePurpose1"), "1") && Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) ? "granted" : "denied");
                    }
                    return bundle;
                }
            }
            return d();
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        HashMap hashMap = this.f11958a;
        StringBuilder sb2 = new StringBuilder("1");
        int i7 = -1;
        try {
            String str = (String) hashMap.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i7 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i7 < 0 || i7 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 & 63));
        }
        int e2 = e();
        if (e2 < 0 || e2 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(e2));
        }
        int i10 = true != "1".equals(hashMap.get("gdprApplies")) ? 0 : 2;
        int i11 = i10 | 4;
        if ("1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            i11 = i10 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11));
        return sb2.toString();
    }

    public final Bundle d() {
        int e2;
        HashMap hashMap = this.f11958a;
        if ("1".equals(hashMap.get("GoogleConsent")) && (e2 = e()) >= 0) {
            String str = (String) hashMap.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && e2 >= 4) {
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString("ad_user_data", str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int e() {
        try {
            String str = (String) this.f11958a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            return a().equalsIgnoreCase(((u1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
