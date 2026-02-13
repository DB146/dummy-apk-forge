package Y5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzrg;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class N extends H {

    /* renamed from: A, reason: collision with root package name */
    public int f11462A;

    /* renamed from: B, reason: collision with root package name */
    public String f11463B;

    /* renamed from: C, reason: collision with root package name */
    public String f11464C;

    /* renamed from: D, reason: collision with root package name */
    public long f11465D;

    /* renamed from: E, reason: collision with root package name */
    public String f11466E;

    /* renamed from: c, reason: collision with root package name */
    public String f11467c;

    /* renamed from: d, reason: collision with root package name */
    public String f11468d;

    /* renamed from: e, reason: collision with root package name */
    public int f11469e;

    /* renamed from: f, reason: collision with root package name */
    public String f11470f;

    /* renamed from: u, reason: collision with root package name */
    public String f11471u;

    /* renamed from: v, reason: collision with root package name */
    public long f11472v;

    /* renamed from: w, reason: collision with root package name */
    public final long f11473w;

    /* renamed from: x, reason: collision with root package name */
    public final long f11474x;

    /* renamed from: y, reason: collision with root package name */
    public List f11475y;

    /* renamed from: z, reason: collision with root package name */
    public String f11476z;

    public N(C0646q0 c0646q0, long j, long j10) {
        super(c0646q0);
        this.f11465D = 0L;
        this.f11466E = null;
        this.f11473w = j;
        this.f11474x = j10;
    }

    @Override // Y5.H
    public final boolean M() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final O1 N(String str) {
        boolean z8;
        long j;
        Class<?> loadClass;
        String str2;
        long f4;
        List list;
        long j10;
        String str3;
        String str4;
        C0646q0 c0646q0;
        int i7;
        int i10;
        long j11;
        ApplicationInfo g;
        E e2;
        int i11;
        long j12;
        int i12;
        int extensionVersion;
        int extensionVersion2;
        J();
        String P10 = P();
        String Q3 = Q();
        K();
        String str5 = this.f11468d;
        K();
        long j13 = this.f11469e;
        K();
        com.google.android.gms.common.internal.G.g(this.f11470f);
        String str6 = this.f11470f;
        C0646q0 c0646q02 = (C0646q0) this.f3094a;
        c0646q02.f11910d.O();
        K();
        J();
        long j14 = this.f11472v;
        Context context = c0646q02.f11907a;
        M1 m12 = c0646q02.f11915w;
        if (j14 == 0) {
            C0646q0.j(m12);
            String packageName = context.getPackageName();
            m12.J();
            com.google.android.gms.common.internal.G.d(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest a02 = M1.a0();
            long j15 = -1;
            C0646q0 c0646q03 = (C0646q0) m12.f3094a;
            if (a02 == null) {
                W w10 = c0646q03.f11912f;
                C0646q0.l(w10);
                w10.f11577f.a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (m12.m0(context, packageName)) {
                            j15 = 0;
                        } else {
                            Signature[] signatureArr = O5.c.a(context).h(64, c0646q03.f11907a.getPackageName()).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                W w11 = c0646q03.f11912f;
                                C0646q0.l(w11);
                                w11.f11580w.a("Could not get signatures");
                            } else {
                                j15 = M1.b0(a02.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        W w12 = c0646q03.f11912f;
                        C0646q0.l(w12);
                        w12.f11577f.b(e10, "Package name not found");
                    }
                }
                j14 = 0;
                this.f11472v = j14;
            }
            j14 = j15;
            this.f11472v = j14;
        }
        long j16 = j14;
        boolean a9 = c0646q02.a();
        C0613f0 c0613f0 = c0646q02.f11911e;
        C0646q0.j(c0613f0);
        boolean z10 = !c0613f0.f11734F;
        J();
        boolean a10 = c0646q02.a();
        C0615g c0615g = c0646q02.f11910d;
        if (a10) {
            zzrg.zza();
            z8 = a9;
            boolean T10 = c0615g.T(null, F.f11268H0);
            W w13 = c0646q02.f11912f;
            if (!T10) {
                try {
                    j = j16;
                    try {
                        loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (ClassNotFoundException unused2) {
                }
                if (loadClass != null) {
                    try {
                        Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                        if (invoke == null) {
                            str2 = null;
                        } else {
                            try {
                                str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused3) {
                                C0646q0.l(w13);
                                w13.f11582y.a("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused4) {
                        C0646q0.l(w13);
                        w13.f11581x.a("Failed to obtain Firebase Analytics instance");
                    }
                    C0646q0.j(c0613f0);
                    f4 = c0613f0.f11744f.f();
                    long j17 = c0646q02.f11906R;
                    if (f4 != 0) {
                        j17 = Math.min(j17, f4);
                    }
                    long j18 = j17;
                    K();
                    int i13 = this.f11462A;
                    Boolean V7 = c0615g.V("google_analytics_adid_collection_enabled");
                    boolean z11 = V7 != null || V7.booleanValue();
                    C0646q0.j(c0613f0);
                    c0613f0.J();
                    boolean z12 = c0613f0.N().getBoolean("deferred_analytics_collection", false);
                    Boolean valueOf = Boolean.valueOf(c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true) != EnumC0663z0.GRANTED);
                    List list2 = this.f11475y;
                    String g2 = c0613f0.Q().g();
                    if (this.f11476z == null) {
                        C0646q0.j(m12);
                        this.f11476z = m12.B0();
                    }
                    String str7 = this.f11476z;
                    if (c0613f0.Q().i(B0.ANALYTICS_STORAGE)) {
                        J();
                        list = list2;
                        j10 = 0;
                        if (this.f11465D == 0) {
                            str3 = str6;
                        } else {
                            c0646q02.f11917y.getClass();
                            str3 = str6;
                            long currentTimeMillis = System.currentTimeMillis() - this.f11465D;
                            if (this.f11464C != null && currentTimeMillis > 86400000 && this.f11466E == null) {
                                O();
                            }
                        }
                        if (this.f11464C == null) {
                            O();
                        }
                        str4 = this.f11464C;
                    } else {
                        str3 = str6;
                        list = list2;
                        j10 = 0;
                        str4 = null;
                    }
                    Boolean V10 = c0615g.V("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = V10 == null ? false : V10.booleanValue();
                    C0646q0.j(m12);
                    String P11 = P();
                    c0646q0 = (C0646q0) m12.f3094a;
                    if (c0646q0.f11907a.getPackageManager() == null) {
                        j11 = j10;
                    } else {
                        try {
                            i7 = 0;
                            try {
                                g = O5.c.a(c0646q0.f11907a).g(0, P11);
                            } catch (PackageManager.NameNotFoundException unused5) {
                                W w14 = c0646q0.f11912f;
                                C0646q0.l(w14);
                                w14.f11583z.b(P11, "PackageManager failed to find running app: app_id");
                                i10 = i7;
                                j11 = i10;
                                C0646q0.j(c0613f0);
                                C0 Q10 = c0613f0.Q();
                                C0646q0.j(c0613f0);
                                c0613f0.J();
                                String str8 = C0639o.b(c0613f0.N().getString("dma_consent_settings", null)).f11859b;
                                zzql.zza();
                                e2 = F.f11285Q0;
                                if (c0615g.T(null, e2)) {
                                }
                                zzql.zza();
                                if (c0615g.T(null, e2)) {
                                }
                                String str9 = c0615g.f11754c;
                                String valueOf2 = String.valueOf(C0.h(c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true)));
                                C0646q0.i(c0646q02.f11898I);
                                return new O1(P10, Q3, str5, j13, str3, 130000L, j, str, z8, z10, str2, j18, i13, z11, z12, valueOf, this.f11473w, list, g2, str7, str4, booleanValue, j11, Q10.f11231b, str8, i11, j12, str9, valueOf2, c0646q02.f11906R, c0646q02.f11898I.O().zza());
                            }
                        } catch (PackageManager.NameNotFoundException unused6) {
                            i7 = 0;
                        }
                        if (g != null) {
                            i10 = g.targetSdkVersion;
                            j11 = i10;
                        }
                        i10 = i7;
                        j11 = i10;
                    }
                    C0646q0.j(c0613f0);
                    C0 Q102 = c0613f0.Q();
                    C0646q0.j(c0613f0);
                    c0613f0.J();
                    String str82 = C0639o.b(c0613f0.N().getString("dma_consent_settings", null)).f11859b;
                    zzql.zza();
                    e2 = F.f11285Q0;
                    if (c0615g.T(null, e2)) {
                        i11 = 0;
                    } else {
                        C0646q0.j(m12);
                        if (Build.VERSION.SDK_INT >= 30) {
                            extensionVersion = SdkExtensions.getExtensionVersion(30);
                            if (extensionVersion > 3) {
                                extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
                                i12 = extensionVersion2;
                                i11 = i12;
                            }
                        }
                        i12 = 0;
                        i11 = i12;
                    }
                    zzql.zza();
                    if (c0615g.T(null, e2)) {
                        j12 = j10;
                    } else {
                        C0646q0.j(m12);
                        j12 = m12.e0();
                    }
                    String str92 = c0615g.f11754c;
                    String valueOf22 = String.valueOf(C0.h(c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true)));
                    C0646q0.i(c0646q02.f11898I);
                    return new O1(P10, Q3, str5, j13, str3, 130000L, j, str, z8, z10, str2, j18, i13, z11, z12, valueOf, this.f11473w, list, g2, str7, str4, booleanValue, j11, Q102.f11231b, str82, i11, j12, str92, valueOf22, c0646q02.f11906R, c0646q02.f11898I.O().zza());
                }
                str2 = null;
                C0646q0.j(c0613f0);
                f4 = c0613f0.f11744f.f();
                long j172 = c0646q02.f11906R;
                if (f4 != 0) {
                }
                long j182 = j172;
                K();
                int i132 = this.f11462A;
                Boolean V72 = c0615g.V("google_analytics_adid_collection_enabled");
                if (V72 != null) {
                }
                C0646q0.j(c0613f0);
                c0613f0.J();
                boolean z122 = c0613f0.N().getBoolean("deferred_analytics_collection", false);
                Boolean valueOf3 = Boolean.valueOf(c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true) != EnumC0663z0.GRANTED);
                List list22 = this.f11475y;
                String g22 = c0613f0.Q().g();
                if (this.f11476z == null) {
                }
                String str72 = this.f11476z;
                if (c0613f0.Q().i(B0.ANALYTICS_STORAGE)) {
                }
                Boolean V102 = c0615g.V("google_analytics_sgtm_upload_enabled");
                if (V102 == null) {
                }
                C0646q0.j(m12);
                String P112 = P();
                c0646q0 = (C0646q0) m12.f3094a;
                if (c0646q0.f11907a.getPackageManager() == null) {
                }
                C0646q0.j(c0613f0);
                C0 Q1022 = c0613f0.Q();
                C0646q0.j(c0613f0);
                c0613f0.J();
                String str822 = C0639o.b(c0613f0.N().getString("dma_consent_settings", null)).f11859b;
                zzql.zza();
                e2 = F.f11285Q0;
                if (c0615g.T(null, e2)) {
                }
                zzql.zza();
                if (c0615g.T(null, e2)) {
                }
                String str922 = c0615g.f11754c;
                String valueOf222 = String.valueOf(C0.h(c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true)));
                C0646q0.i(c0646q02.f11898I);
                return new O1(P10, Q3, str5, j13, str3, 130000L, j, str, z8, z10, str2, j182, i132, z11, z122, valueOf3, this.f11473w, list, g22, str72, str4, booleanValue, j11, Q1022.f11231b, str822, i11, j12, str922, valueOf222, c0646q02.f11906R, c0646q02.f11898I.O().zza());
            }
            C0646q0.l(w13);
            w13.f11573B.a("Disabled IID for tests.");
        } else {
            z8 = a9;
        }
        j = j16;
        str2 = null;
        C0646q0.j(c0613f0);
        f4 = c0613f0.f11744f.f();
        long j1722 = c0646q02.f11906R;
        if (f4 != 0) {
        }
        long j1822 = j1722;
        K();
        int i1322 = this.f11462A;
        Boolean V722 = c0615g.V("google_analytics_adid_collection_enabled");
        if (V722 != null) {
        }
        C0646q0.j(c0613f0);
        c0613f0.J();
        boolean z1222 = c0613f0.N().getBoolean("deferred_analytics_collection", false);
        Boolean valueOf32 = Boolean.valueOf(c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true) != EnumC0663z0.GRANTED);
        List list222 = this.f11475y;
        String g222 = c0613f0.Q().g();
        if (this.f11476z == null) {
        }
        String str722 = this.f11476z;
        if (c0613f0.Q().i(B0.ANALYTICS_STORAGE)) {
        }
        Boolean V1022 = c0615g.V("google_analytics_sgtm_upload_enabled");
        if (V1022 == null) {
        }
        C0646q0.j(m12);
        String P1122 = P();
        c0646q0 = (C0646q0) m12.f3094a;
        if (c0646q0.f11907a.getPackageManager() == null) {
        }
        C0646q0.j(c0613f0);
        C0 Q10222 = c0613f0.Q();
        C0646q0.j(c0613f0);
        c0613f0.J();
        String str8222 = C0639o.b(c0613f0.N().getString("dma_consent_settings", null)).f11859b;
        zzql.zza();
        e2 = F.f11285Q0;
        if (c0615g.T(null, e2)) {
        }
        zzql.zza();
        if (c0615g.T(null, e2)) {
        }
        String str9222 = c0615g.f11754c;
        String valueOf2222 = String.valueOf(C0.h(c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true)));
        C0646q0.i(c0646q02.f11898I);
        return new O1(P10, Q3, str5, j13, str3, 130000L, j, str, z8, z10, str2, j1822, i1322, z11, z1222, valueOf32, this.f11473w, list, g222, str722, str4, booleanValue, j11, Q10222.f11231b, str8222, i11, j12, str9222, valueOf2222, c0646q02.f11906R, c0646q02.f11898I.O().zza());
    }

    public final void O() {
        String format;
        J();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        boolean i7 = c0613f0.Q().i(B0.ANALYTICS_STORAGE);
        W w10 = c0646q0.f11912f;
        if (i7) {
            byte[] bArr = new byte[16];
            M1 m12 = c0646q0.f11915w;
            C0646q0.j(m12);
            m12.G0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C0646q0.l(w10);
            w10.f11572A.a("Analytics Storage consent is not granted");
            format = null;
        }
        C0646q0.l(w10);
        w10.f11572A.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.f11464C = format;
        c0646q0.f11917y.getClass();
        this.f11465D = System.currentTimeMillis();
    }

    public final String P() {
        K();
        com.google.android.gms.common.internal.G.g(this.f11467c);
        return this.f11467c;
    }

    public final String Q() {
        J();
        K();
        com.google.android.gms.common.internal.G.g(this.f11463B);
        return this.f11463B;
    }
}
