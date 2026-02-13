package Y5;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11435a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11440f;

    public L0(La.f fVar, boolean z8, Uri uri, String str, String str2) {
        this.f11438d = z8;
        this.f11439e = uri;
        this.f11436b = str;
        this.f11437c = str2;
        Objects.requireNonNull(fVar);
        this.f11440f = fVar;
    }

    public L0(S0 s02, AtomicReference atomicReference, String str, String str2, boolean z8) {
        this.f11439e = atomicReference;
        this.f11436b = str;
        this.f11437c = str2;
        this.f11438d = z8;
        Objects.requireNonNull(s02);
        this.f11440f = s02;
    }

    public L0(C0632l1 c0632l1, O1 o12, boolean z8, r rVar, Bundle bundle) {
        this.f11439e = o12;
        this.f11438d = z8;
        this.f11436b = rVar;
        this.f11437c = bundle;
        Objects.requireNonNull(c0632l1);
        this.f11440f = c0632l1;
    }

    public L0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2, boolean z8) {
        this.f11439e = zzcuVar;
        this.f11436b = str;
        this.f11437c = str2;
        this.f11438d = z8;
        this.f11440f = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0103 A[Catch: RuntimeException -> 0x00dd, TRY_ENTER, TryCatch #2 {RuntimeException -> 0x00dd, blocks: (B:35:0x0103, B:37:0x010e, B:40:0x011b, B:42:0x0121, B:43:0x013b, B:44:0x0144, B:48:0x014c, B:50:0x0151, B:53:0x0163, B:54:0x0172, B:56:0x016a, B:57:0x0186, B:59:0x018c, B:61:0x0192, B:63:0x0198, B:65:0x01a0, B:67:0x01a8, B:69:0x01b0, B:71:0x01b6, B:74:0x01c8, B:79:0x008e, B:81:0x0094, B:83:0x009c, B:85:0x00a2, B:87:0x00a8, B:89:0x00ae, B:91:0x00b6, B:93:0x00be, B:95:0x00c6, B:97:0x00ce, B:98:0x00e2, B:100:0x00f0), top: B:78:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c A[Catch: RuntimeException -> 0x00dd, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00dd, blocks: (B:35:0x0103, B:37:0x010e, B:40:0x011b, B:42:0x0121, B:43:0x013b, B:44:0x0144, B:48:0x014c, B:50:0x0151, B:53:0x0163, B:54:0x0172, B:56:0x016a, B:57:0x0186, B:59:0x018c, B:61:0x0192, B:63:0x0198, B:65:0x01a0, B:67:0x01a8, B:69:0x01b0, B:71:0x01b6, B:74:0x01c8, B:79:0x008e, B:81:0x0094, B:83:0x009c, B:85:0x00a2, B:87:0x00a8, B:89:0x00ae, B:91:0x00b6, B:93:0x00be, B:95:0x00c6, B:97:0x00ce, B:98:0x00e2, B:100:0x00f0), top: B:78:0x008e }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        La.f fVar;
        M1 m12;
        W w10;
        Bundle I02;
        boolean z8;
        CharSequence charSequence;
        switch (this.f11435a) {
            case 0:
                C0632l1 o10 = ((AppMeasurementDynamiteService) this.f11440f).f15154a.o();
                o10.J();
                o10.K();
                o10.X(new RunnableC0608d1(o10, (String) this.f11436b, (String) this.f11437c, o10.Z(false), this.f11438d, (zzcu) this.f11439e));
                return;
            case 1:
                C0632l1 o11 = ((C0646q0) ((S0) this.f11440f).f3094a).o();
                o11.J();
                o11.K();
                o11.X(new RunnableC0608d1(o11, (AtomicReference) this.f11439e, (String) this.f11436b, (String) this.f11437c, o11.Z(false), this.f11438d));
                return;
            case 2:
                La.f fVar2 = (La.f) this.f11440f;
                S0 s02 = (S0) fVar2.f6436b;
                s02.J();
                C0646q0 c0646q0 = (C0646q0) s02.f3094a;
                String str = (String) this.f11437c;
                Uri uri = (Uri) this.f11439e;
                try {
                    m12 = c0646q0.f11915w;
                    w10 = c0646q0.f11912f;
                    C0646q0.j(m12);
                } catch (RuntimeException e2) {
                    e = e2;
                    fVar = fVar2;
                }
                try {
                    fVar = fVar2;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                                I02 = m12.I0(Uri.parse("https://google.com/search?".concat(str)));
                                if (I02 != null) {
                                    I02.putString("_cis", "referrer");
                                }
                                String str2 = (String) this.f11436b;
                                z8 = this.f11438d;
                                R7.b bVar = s02.f11544F;
                                if (z8) {
                                    M1 m13 = c0646q0.f11915w;
                                    C0646q0.j(m13);
                                    Bundle I03 = m13.I0(uri);
                                    if (I03 != null) {
                                        I03.putString("_cis", "intent");
                                        if (I03.containsKey("gclid") || I02 == null || !I02.containsKey("gclid")) {
                                            charSequence = "utm_medium";
                                        } else {
                                            charSequence = "utm_medium";
                                            I03.putString("_cer", "gclid=" + I02.getString("gclid"));
                                        }
                                        s02.Q(str2, "_cmp", I03);
                                        bVar.y(str2, I03);
                                        if (TextUtils.isEmpty(str)) {
                                            return;
                                        }
                                        C0646q0.l(w10);
                                        U u3 = w10.f11572A;
                                        u3.b(str, "Activity created with referrer");
                                        if (c0646q0.f11910d.T(null, F.f11266G0)) {
                                            if (I02 != null) {
                                                s02.Q(str2, "_cmp", I02);
                                                bVar.y(str2, I02);
                                            } else {
                                                C0646q0.l(w10);
                                                u3.b(str, "Referrer does not contain valid parameters");
                                            }
                                            c0646q0.f11917y.getClass();
                                            s02.T("auto", "_ldl", null, true, System.currentTimeMillis());
                                            return;
                                        }
                                        if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains(charSequence) && !str.contains("utm_term") && !str.contains("utm_content"))) {
                                            C0646q0.l(w10);
                                            u3.a("Activity created with data 'referrer' without required params");
                                            return;
                                        } else {
                                            if (TextUtils.isEmpty(str)) {
                                                return;
                                            }
                                            c0646q0.f11917y.getClass();
                                            s02.T("auto", "_ldl", str, true, System.currentTimeMillis());
                                            return;
                                        }
                                    }
                                }
                                charSequence = "utm_medium";
                                if (TextUtils.isEmpty(str)) {
                                }
                            } else {
                                W w11 = ((C0646q0) m12.f3094a).f11912f;
                                C0646q0.l(w11);
                                w11.f11572A.a("Activity created with data 'referrer' without required params");
                            }
                        } catch (RuntimeException e10) {
                            e = e10;
                            fVar2 = fVar;
                            W w12 = ((C0646q0) ((S0) fVar2.f6436b).f3094a).f11912f;
                            C0646q0.l(w12);
                            w12.f11577f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                            return;
                        }
                    }
                    I02 = null;
                    String str22 = (String) this.f11436b;
                    z8 = this.f11438d;
                    R7.b bVar2 = s02.f11544F;
                    if (z8) {
                    }
                    charSequence = "utm_medium";
                    if (TextUtils.isEmpty(str)) {
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    W w122 = ((C0646q0) ((S0) fVar2.f6436b).f3094a).f11912f;
                    C0646q0.l(w122);
                    w122.f11577f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                C0632l1 c0632l1 = (C0632l1) this.f11440f;
                I i7 = c0632l1.f11815d;
                C0646q0 c0646q02 = (C0646q0) c0632l1.f3094a;
                if (i7 == null) {
                    W w13 = c0646q02.f11912f;
                    C0646q0.l(w13);
                    w13.f11577f.a("Failed to send default event parameters to service");
                    return;
                }
                boolean T10 = c0646q02.f11910d.T(null, F.f11312c1);
                O1 o12 = (O1) this.f11439e;
                if (T10) {
                    c0632l1.b0(i7, this.f11438d ? null : (r) this.f11436b, o12);
                    return;
                }
                try {
                    i7.l(o12, (Bundle) this.f11437c);
                    c0632l1.W();
                    return;
                } catch (RemoteException e12) {
                    W w14 = c0646q02.f11912f;
                    C0646q0.l(w14);
                    w14.f11577f.b(e12, "Failed to send default event parameters to service");
                    return;
                }
        }
    }
}
