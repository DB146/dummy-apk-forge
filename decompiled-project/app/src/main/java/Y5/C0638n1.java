package Y5;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import r5.C1942a;
import r5.C1943b;

/* renamed from: Y5.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638n1 extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f11850d;

    /* renamed from: e, reason: collision with root package name */
    public final C0610e0 f11851e;

    /* renamed from: f, reason: collision with root package name */
    public final C0610e0 f11852f;

    /* renamed from: u, reason: collision with root package name */
    public final C0610e0 f11853u;

    /* renamed from: v, reason: collision with root package name */
    public final C0610e0 f11854v;

    /* renamed from: w, reason: collision with root package name */
    public final C0610e0 f11855w;

    /* renamed from: x, reason: collision with root package name */
    public final C0610e0 f11856x;

    public C0638n1(I1 i12) {
        super(i12);
        this.f11850d = new HashMap();
        C0613f0 c0613f0 = ((C0646q0) this.f3094a).f11911e;
        C0646q0.j(c0613f0);
        this.f11851e = new C0610e0(c0613f0, "last_delete_stale", 0L);
        C0613f0 c0613f02 = ((C0646q0) this.f3094a).f11911e;
        C0646q0.j(c0613f02);
        this.f11852f = new C0610e0(c0613f02, "last_delete_stale_batch", 0L);
        C0613f0 c0613f03 = ((C0646q0) this.f3094a).f11911e;
        C0646q0.j(c0613f03);
        this.f11853u = new C0610e0(c0613f03, "backoff", 0L);
        C0613f0 c0613f04 = ((C0646q0) this.f3094a).f11911e;
        C0646q0.j(c0613f04);
        this.f11854v = new C0610e0(c0613f04, "last_upload", 0L);
        C0613f0 c0613f05 = ((C0646q0) this.f3094a).f11911e;
        C0646q0.j(c0613f05);
        this.f11855w = new C0610e0(c0613f05, "last_upload_attempt", 0L);
        C0613f0 c0613f06 = ((C0646q0) this.f3094a).f11911e;
        C0646q0.j(c0613f06);
        this.f11856x = new C0610e0(c0613f06, "midnight_offset", 0L);
    }

    @Override // Y5.D1
    public final void M() {
    }

    public final Pair N(String str) {
        C0635m1 c0635m1;
        C1942a c1942a;
        J();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.f11917y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f11850d;
        C0635m1 c0635m12 = (C0635m1) hashMap.get(str);
        if (c0635m12 != null && elapsedRealtime < c0635m12.f11841c) {
            return new Pair(c0635m12.f11839a, Boolean.valueOf(c0635m12.f11840b));
        }
        E e2 = F.f11307b;
        C0615g c0615g = c0646q0.f11910d;
        long Q3 = c0615g.Q(str, e2) + elapsedRealtime;
        try {
            try {
                c1942a = C1943b.a(c0646q0.f11907a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c0635m12 != null && elapsedRealtime < c0635m12.f11841c + c0615g.Q(str, F.f11310c)) {
                    return new Pair(c0635m12.f11839a, Boolean.valueOf(c0635m12.f11840b));
                }
                c1942a = null;
            }
        } catch (Exception e10) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11572A.b(e10, "Unable to get advertising id");
            c0635m1 = new C0635m1(Q3, "", false);
        }
        if (c1942a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = c1942a.f23785a;
        boolean z8 = c1942a.f23786b;
        c0635m1 = str2 != null ? new C0635m1(Q3, str2, z8) : new C0635m1(Q3, "", z8);
        hashMap.put(str, c0635m1);
        return new Pair(c0635m1.f11839a, Boolean.valueOf(c0635m1.f11840b));
    }

    public final String O(String str, boolean z8) {
        J();
        String str2 = z8 ? (String) N(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest a02 = M1.a0();
        if (a02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, a02.digest(str2.getBytes())));
    }
}
