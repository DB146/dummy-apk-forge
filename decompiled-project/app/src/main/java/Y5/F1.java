package Y5;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzil;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzis;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class F1 extends z1 {
    public static final boolean M(String str) {
        String str2 = (String) F.f11349t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.zzq().zzc()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E1 K(String str) {
        I1 i12 = this.f12021b;
        C0633m c0633m = i12.f11405c;
        I1.S(c0633m);
        C0601b0 N02 = c0633m.N0(str);
        Y0 y02 = Y0.GOOGLE_ANALYTICS;
        E1 e12 = null;
        if (N02 == null || !N02.y()) {
            return new E1(L(str), Collections.emptyMap(), y02, null);
        }
        zzil zzb = zzis.zzb();
        zzb.zzb(2);
        zzin zzb2 = zzin.zzb(N02.t());
        com.google.android.gms.common.internal.G.g(zzb2);
        zzb.zza(zzb2);
        String E10 = N02.E();
        C0628k0 c0628k0 = i12.f11403a;
        I1.S(c0628k0);
        zzgl V7 = c0628k0.V(str);
        if (V7 != null) {
            C0633m c0633m2 = i12.f11405c;
            I1.S(c0633m2);
            C0601b0 N03 = c0633m2.N0(str);
            if (N03 != null) {
                boolean zzp = V7.zzp();
                C0646q0 c0646q0 = (C0646q0) this.f3094a;
                if (!zzp || V7.zzq().zzc() != 100) {
                    M1 m12 = c0646q0.f11915w;
                    C0646q0.j(m12);
                    if (!m12.j0(str, N03.C())) {
                        if (!TextUtils.isEmpty(E10)) {
                        }
                    }
                }
                String D10 = N02.D();
                zzb.zzb(2);
                I1.S(c0628k0);
                zzgl V10 = c0628k0.V(N02.D());
                if (V10 == null || !V10.zzp()) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11573B.b(D10, "[sgtm] Missing sgtm_setting in remote config. appId");
                    zzb.zzc(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(N02.C())) {
                        hashMap.put("x-gtm-server-preview", N02.C());
                    }
                    String zzd = V10.zzq().zzd();
                    zzin zzb3 = zzin.zzb(N02.t());
                    if (zzb3 != null && zzb3 != zzin.CLIENT_UPLOAD_ELIGIBLE) {
                        zzb.zza(zzb3);
                    } else if (M(N02.D())) {
                        zzb.zza(zzin.PINNED_TO_SERVICE_UPLOAD);
                    } else if (TextUtils.isEmpty(zzd)) {
                        zzb.zza(zzin.MISSING_SGTM_SERVER_URL);
                    } else {
                        W w11 = c0646q0.f11912f;
                        C0646q0.l(w11);
                        w11.f11573B.b(D10, "[sgtm] Eligible for client side upload. appId");
                        zzb.zzb(3);
                        zzb.zza(zzin.CLIENT_UPLOAD_ELIGIBLE);
                        e12 = new E1(zzd, hashMap, Y0.SGTM_CLIENT, (zzis) zzb.zzbc());
                    }
                    V10.zzq().zza();
                    V10.zzq().zzb();
                    c0646q0.getClass();
                    boolean isEmpty = TextUtils.isEmpty(zzd);
                    W w12 = c0646q0.f11912f;
                    if (isEmpty) {
                        zzb.zzc(6);
                        C0646q0.l(w12);
                        w12.f11573B.b(N02.D(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        C0646q0.l(w12);
                        w12.f11573B.b(D10, "[sgtm] Eligible for local service direct upload. appId");
                        zzb.zzb(5);
                        zzb.zzc(2);
                        e12 = new E1(zzd, hashMap, Y0.SGTM, (zzis) zzb.zzbc());
                    }
                }
                return e12 != null ? e12 : new E1(L(str), Collections.emptyMap(), y02, (zzis) zzb.zzbc());
            }
        }
        zzb.zzc(3);
        return new E1(L(str), Collections.emptyMap(), y02, (zzis) zzb.zzbc());
    }

    public final String L(String str) {
        C0628k0 c0628k0 = this.f12021b.f11403a;
        I1.S(c0628k0);
        String W10 = c0628k0.W(str);
        if (TextUtils.isEmpty(W10)) {
            return (String) F.f11345r.a(null);
        }
        Uri parse = Uri.parse((String) F.f11345r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(W10).length() + 1 + String.valueOf(authority).length());
        sb2.append(W10);
        sb2.append(".");
        sb2.append(authority);
        buildUpon.authority(sb2.toString());
        return buildUpon.build().toString();
    }
}
