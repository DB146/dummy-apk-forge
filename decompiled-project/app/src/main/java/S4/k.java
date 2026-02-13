package S4;

import Y5.C0646q0;
import Y5.M1;
import Y5.W;
import Y5.r;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.G;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9129a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f9130b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9131c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9132d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9133e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9134f;
    public final Object g;

    public k(long j, T4.m mVar, T4.b bVar, R4.d dVar, long j10, i iVar) {
        this.f9130b = j;
        this.f9133e = mVar;
        this.f9134f = bVar;
        this.f9131c = j10;
        this.f9132d = dVar;
        this.g = iVar;
    }

    public k(C0646q0 c0646q0, String str, String str2, String str3, long j, long j10, r rVar) {
        G.d(str2);
        G.d(str3);
        G.g(rVar);
        this.f9132d = str2;
        this.f9133e = str3;
        this.f9134f = true == TextUtils.isEmpty(str) ? null : str;
        this.f9130b = j;
        this.f9131c = j10;
        if (j10 != 0 && j10 > j) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11580w.c("Event created with reverse previous/current timestamps. appId, name", W.R(str2), W.R(str3));
        }
        this.g = rVar;
    }

    public k(C0646q0 c0646q0, String str, String str2, String str3, long j, long j10, Bundle bundle) {
        r rVar;
        G.d(str2);
        G.d(str3);
        this.f9132d = str2;
        this.f9133e = str3;
        this.f9134f = true == TextUtils.isEmpty(str) ? null : str;
        this.f9130b = j;
        this.f9131c = j10;
        if (j10 != 0 && j10 > j) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(W.R(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.a("Param name can't be null");
                    it.remove();
                } else {
                    M1 m12 = c0646q0.f11915w;
                    C0646q0.j(m12);
                    Object Q3 = m12.Q(bundle2.get(next), next);
                    if (Q3 == null) {
                        W w12 = c0646q0.f11912f;
                        C0646q0.l(w12);
                        w12.f11580w.b(c0646q0.f11916x.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        M1 m13 = c0646q0.f11915w;
                        C0646q0.j(m13);
                        m13.Y(bundle2, next, Q3);
                    }
                }
            }
            rVar = new r(bundle2);
        }
        this.g = rVar;
    }

    public k a(long j, T4.m mVar) {
        long c10;
        i d10 = ((T4.m) this.f9133e).d();
        i d11 = mVar.d();
        if (d10 == null) {
            return new k(j, mVar, (T4.b) this.f9134f, (R4.d) this.f9132d, this.f9131c, d10);
        }
        if (!d10.s()) {
            return new k(j, mVar, (T4.b) this.f9134f, (R4.d) this.f9132d, this.f9131c, d11);
        }
        long y10 = d10.y(j);
        if (y10 == 0) {
            return new k(j, mVar, (T4.b) this.f9134f, (R4.d) this.f9132d, this.f9131c, d11);
        }
        long v10 = d10.v();
        long b2 = d10.b(v10);
        long j10 = y10 + v10;
        long j11 = j10 - 1;
        long g = d10.g(j11, j) + d10.b(j11);
        long v11 = d11.v();
        long b10 = d11.b(v11);
        long j12 = this.f9131c;
        if (g != b10) {
            if (g < b10) {
                throw new IOException();
            }
            if (b10 < b2) {
                c10 = j12 - (d11.c(b2, j) - v10);
                return new k(j, mVar, (T4.b) this.f9134f, (R4.d) this.f9132d, c10, d11);
            }
            j10 = d10.c(b10, j);
        }
        c10 = (j10 - v11) + j12;
        return new k(j, mVar, (T4.b) this.f9134f, (R4.d) this.f9132d, c10, d11);
    }

    public long b(long j) {
        i iVar = (i) this.g;
        long j10 = this.f9130b;
        return (iVar.z(j10, j) + (iVar.l(j10, j) + this.f9131c)) - 1;
    }

    public long c(long j) {
        return ((i) this.g).g(j - this.f9131c, this.f9130b) + d(j);
    }

    public long d(long j) {
        return ((i) this.g).b(j - this.f9131c);
    }

    public k e(C0646q0 c0646q0, long j) {
        return new k(c0646q0, (String) this.f9134f, (String) this.f9132d, (String) this.f9133e, this.f9130b, j, (r) this.g);
    }

    public String toString() {
        switch (this.f9129a) {
            case 1:
                String rVar = ((r) this.g).toString();
                String str = (String) this.f9132d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f9133e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + rVar.length() + 1);
                h3.o.v(sb2, "Event{appId='", str, "', name='", str2);
                return A3.c.m(sb2, "', params=", rVar, "}");
            default:
                return super.toString();
        }
    }
}
