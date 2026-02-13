package Y5;

import java.util.Objects;
import u.C2052e;

/* renamed from: Y5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0597a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f11620d;

    public RunnableC0597a(C0605c1 c0605c1, Z0 z02, long j) {
        this.f11617a = 2;
        this.f11618b = z02;
        this.f11619c = j;
        Objects.requireNonNull(c0605c1);
        this.f11620d = c0605c1;
    }

    public RunnableC0597a(C0654v c0654v, String str, long j, int i7) {
        this.f11617a = i7;
        switch (i7) {
            case 1:
                this.f11618b = str;
                this.f11619c = j;
                Objects.requireNonNull(c0654v);
                this.f11620d = c0654v;
                return;
            default:
                this.f11618b = str;
                this.f11619c = j;
                Objects.requireNonNull(c0654v);
                this.f11620d = c0654v;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11617a) {
            case 0:
                C0654v c0654v = (C0654v) this.f11620d;
                c0654v.J();
                String str = (String) this.f11618b;
                com.google.android.gms.common.internal.G.d(str);
                C2052e c2052e = c0654v.f11960c;
                boolean isEmpty = c2052e.isEmpty();
                long j = this.f11619c;
                if (isEmpty) {
                    c0654v.f11961d = j;
                }
                Integer num = (Integer) c2052e.get(str);
                if (num != null) {
                    c2052e.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                if (c2052e.f24637c < 100) {
                    c2052e.put(str, 1);
                    c0654v.f11959b.put(str, Long.valueOf(j));
                    return;
                } else {
                    W w10 = ((C0646q0) c0654v.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11580w.a("Too many ads visible");
                    return;
                }
            case 1:
                C0654v c0654v2 = (C0654v) this.f11620d;
                c0654v2.J();
                String str2 = (String) this.f11618b;
                com.google.android.gms.common.internal.G.d(str2);
                C2052e c2052e2 = c0654v2.f11960c;
                Integer num2 = (Integer) c2052e2.get(str2);
                C0646q0 c0646q0 = (C0646q0) c0654v2.f3094a;
                if (num2 == null) {
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    return;
                }
                C0605c1 c0605c1 = c0646q0.f11918z;
                C0646q0.k(c0605c1);
                Z0 P10 = c0605c1.P(false);
                int intValue = num2.intValue() - 1;
                if (intValue != 0) {
                    c2052e2.put(str2, Integer.valueOf(intValue));
                    return;
                }
                c2052e2.remove(str2);
                C2052e c2052e3 = c0654v2.f11959b;
                Long l10 = (Long) c2052e3.get(str2);
                long j10 = this.f11619c;
                W w12 = c0646q0.f11912f;
                if (l10 == null) {
                    C0646q0.l(w12);
                    w12.f11577f.a("First ad unit exposure time was never set");
                } else {
                    long longValue = j10 - l10.longValue();
                    c2052e3.remove(str2);
                    c0654v2.O(str2, longValue, P10);
                }
                if (c2052e2.isEmpty()) {
                    long j11 = c0654v2.f11961d;
                    if (j11 == 0) {
                        C0646q0.l(w12);
                        w12.f11577f.a("First ad exposure time was never set");
                        return;
                    } else {
                        c0654v2.N(j10 - j11, P10);
                        c0654v2.f11961d = 0L;
                        return;
                    }
                }
                return;
            default:
                Z0 z02 = (Z0) this.f11618b;
                long j12 = this.f11619c;
                C0605c1 c0605c12 = (C0605c1) this.f11620d;
                c0605c12.N(z02, false, j12);
                c0605c12.f11688e = null;
                C0632l1 o10 = ((C0646q0) c0605c12.f3094a).o();
                o10.J();
                o10.K();
                o10.X(new E5.k(o10, (Z0) null));
                return;
        }
    }
}
