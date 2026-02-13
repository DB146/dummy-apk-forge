package Y5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import r5.C1942a;
import r5.C1943b;

/* loaded from: classes.dex */
public final class I0 extends AbstractC0636n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0 f11378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(S0 s02, InterfaceC0661y0 interfaceC0661y0, int i7) {
        super(interfaceC0661y0);
        this.f11377e = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(s02);
                this.f11378f = s02;
                super(interfaceC0661y0);
                return;
            case 2:
                Objects.requireNonNull(s02);
                this.f11378f = s02;
                super(interfaceC0661y0);
                return;
            case 3:
                Objects.requireNonNull(s02);
                this.f11378f = s02;
                super(interfaceC0661y0);
                return;
            default:
                Objects.requireNonNull(s02);
                this.f11378f = s02;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0121, code lost:
    
        if (r0.p0() >= 234200) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    @Override // Y5.AbstractC0636n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        C0621i C2;
        Bundle bundle;
        URL url;
        switch (this.f11377e) {
            case 0:
                S0 s02 = ((C0646q0) this.f11378f.f3094a).f11890A;
                C0646q0.k(s02);
                new Thread(new H0(s02, 0)).start();
                return;
            case 1:
                this.f11378f.h0();
                return;
            case 2:
                this.f11378f.P();
                return;
            default:
                S0 s03 = this.f11378f;
                C0646q0 c0646q0 = (C0646q0) s03.f3094a;
                C0640o0 c0640o0 = c0646q0.f11913u;
                C0646q0.l(c0640o0);
                c0640o0.J();
                V0 v02 = c0646q0.f11892C;
                C0646q0.l(v02);
                C0646q0.l(v02);
                String P10 = c0646q0.q().P();
                Boolean V7 = c0646q0.f11910d.V("google_analytics_adid_collection_enabled");
                Object[] objArr = V7 == null || V7.booleanValue();
                W w10 = c0646q0.f11912f;
                if (objArr == true) {
                    C0613f0 c0613f0 = c0646q0.f11911e;
                    C0646q0.j(c0613f0);
                    c0613f0.J();
                    if (c0613f0.Q().i(B0.AD_STORAGE)) {
                        C0646q0 c0646q02 = (C0646q0) c0613f0.f3094a;
                        c0646q02.f11917y.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = c0613f0.f11746v;
                        if (str == null || elapsedRealtime >= c0613f0.f11748x) {
                            c0613f0.f11748x = c0646q02.f11910d.Q(P10, F.f11307b) + elapsedRealtime;
                            try {
                                C1942a a9 = C1943b.a(c0646q02.f11907a);
                                c0613f0.f11746v = "";
                                String str2 = a9.f23785a;
                                if (str2 != null) {
                                    c0613f0.f11746v = str2;
                                }
                                c0613f0.f11747w = a9.f23786b;
                            } catch (Exception e2) {
                                W w11 = c0646q02.f11912f;
                                C0646q0.l(w11);
                                w11.f11572A.b(e2, "Unable to get advertising id");
                                c0613f0.f11746v = "";
                            }
                            pair = new Pair(c0613f0.f11746v, Boolean.valueOf(c0613f0.f11747w));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(c0613f0.f11747w));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        C0646q0.l(w10);
                        w10.f11573B.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        C0646q0.l(v02);
                        v02.L();
                        C0646q0 c0646q03 = (C0646q0) v02.f3094a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) c0646q03.f11907a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb2 = new StringBuilder();
                                C0632l1 o10 = c0646q0.o();
                                o10.J();
                                o10.K();
                                if (o10.Q()) {
                                    M1 m12 = ((C0646q0) o10.f3094a).f11915w;
                                    C0646q0.j(m12);
                                    break;
                                }
                                S0 s04 = c0646q0.f11890A;
                                C0646q0.k(s04);
                                s04.J();
                                C0632l1 o11 = ((C0646q0) s04.f3094a).o();
                                o11.J();
                                o11.K();
                                I i7 = o11.f11815d;
                                C0646q0 c0646q04 = (C0646q0) o11.f3094a;
                                if (i7 == null) {
                                    o11.P();
                                    W w12 = c0646q04.f11912f;
                                    C0646q0.l(w12);
                                    w12.f11572A.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        C2 = i7.C(o11.Z(false));
                                        o11.W();
                                    } catch (RemoteException e10) {
                                        W w13 = c0646q04.f11912f;
                                        C0646q0.l(w13);
                                        w13.f11577f.b(e10, "Failed to get consents; remote exception");
                                    }
                                    bundle = C2 == null ? C2.f11776a : null;
                                    if (bundle != null) {
                                        int i10 = c0646q0.f11904P;
                                        c0646q0.f11904P = i10 + 1;
                                        r11 = i10 < 10;
                                        C0646q0.l(w10);
                                        String str3 = i10 < 10 ? "Retrying." : "Skipping.";
                                        w10.f11572A.b(Integer.valueOf(c0646q0.f11904P), A3.c.m(new StringBuilder(str3.length() + 60), "Failed to retrieve DMA consent from the service, ", str3, " retryCount"));
                                    } else {
                                        C0 b2 = C0.b(100, bundle);
                                        sb2.append("&gcs=");
                                        sb2.append(b2.f());
                                        C0639o c10 = C0639o.c(100, bundle);
                                        sb2.append("&dma=");
                                        Boolean bool = Boolean.FALSE;
                                        sb2.append(!Objects.equals(c10.f11860c, bool) ? 1 : 0);
                                        String str4 = c10.f11861d;
                                        if (!TextUtils.isEmpty(str4)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str4);
                                        }
                                        int ordinal = C0.d(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            bool = ordinal != 3 ? null : Boolean.TRUE;
                                        }
                                        int i11 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i11);
                                        C0646q0.l(w10);
                                        w10.f11573B.b(sb2, "Consent query parameters to Bow");
                                        M1 m13 = c0646q0.f11915w;
                                        C0646q0.j(m13);
                                        ((C0646q0) c0646q0.q().f3094a).f11910d.O();
                                        String str5 = (String) pair.first;
                                        long f4 = c0613f0.f11737I.f() - 1;
                                        String sb3 = sb2.toString();
                                        C0646q0 c0646q05 = (C0646q0) m13.f3094a;
                                        try {
                                            com.google.android.gms.common.internal.G.d(str5);
                                            com.google.android.gms.common.internal.G.d(P10);
                                            String str6 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + m13.p0()) + "&rdid=" + str5 + "&bundleid=" + P10 + "&retry=" + f4;
                                            if (P10.equals(c0646q05.f11910d.N("debug.deferred.deeplink"))) {
                                                str6 = str6.concat("&ddl_test=1");
                                            }
                                            if (!sb3.isEmpty()) {
                                                if (sb3.charAt(0) != '&') {
                                                    str6 = str6.concat("&");
                                                }
                                                str6 = str6.concat(sb3);
                                            }
                                            url = new URL(str6);
                                        } catch (IllegalArgumentException e11) {
                                            e = e11;
                                            W w14 = c0646q05.f11912f;
                                            C0646q0.l(w14);
                                            w14.f11577f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r11) {
                                            }
                                        } catch (MalformedURLException e12) {
                                            e = e12;
                                            W w142 = c0646q05.f11912f;
                                            C0646q0.l(w142);
                                            w142.f11577f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r11) {
                                            }
                                        }
                                        if (url != null) {
                                            C0646q0.l(v02);
                                            C0619h0 c0619h0 = new C0619h0(c0646q0);
                                            v02.L();
                                            C0640o0 c0640o02 = c0646q03.f11913u;
                                            C0646q0.l(c0640o02);
                                            c0640o02.V(new Z(v02, P10, url, (byte[]) null, (HashMap) null, c0619h0));
                                        }
                                    }
                                }
                                C2 = null;
                                if (C2 == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                C0646q0.l(w10);
                                w10.f11580w.a("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        C0646q0.l(w10);
                        w10.f11580w.a("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    C0646q0.l(w10);
                    w10.f11573B.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (r11) {
                    s03.f11546H.b(2000L);
                    return;
                }
                return;
        }
    }
}
