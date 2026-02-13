package D4;

import A4.i;
import android.net.Uri;
import java.util.Map;
import m4.C1586o0;
import m4.K;
import m4.L;
import m5.C1619p;
import n5.AbstractC1705a;
import n5.D;
import s4.C1979g;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public int f3211a;

    /* renamed from: b, reason: collision with root package name */
    public long f3212b;

    /* renamed from: c, reason: collision with root package name */
    public long f3213c;

    /* renamed from: d, reason: collision with root package name */
    public int f3214d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3215e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3216f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3217h;

    public c(InterfaceC1984l interfaceC1984l, v vVar, i iVar, String str, int i7) {
        this.f3215e = interfaceC1984l;
        this.f3216f = vVar;
        this.g = iVar;
        int i10 = iVar.f391d;
        int i11 = iVar.f388a;
        int i12 = (i10 * i11) / 8;
        int i13 = iVar.f390c;
        if (i13 != i12) {
            throw C1586o0.a("Expected block size: " + i12 + "; got: " + i13, null);
        }
        int i14 = iVar.f389b;
        int i15 = i14 * i12;
        int i16 = i15 * 8;
        int max = Math.max(i12, i15 / 10);
        this.f3211a = max;
        K k = new K();
        k.k = str;
        k.f19981f = i16;
        k.g = i16;
        k.f19984l = max;
        k.f19996x = i11;
        k.f19997y = i14;
        k.f19998z = i7;
        this.f3217h = new L(k);
    }

    @Override // D4.b
    public boolean a(C1979g c1979g, long j) {
        int i7;
        int i10;
        long j10 = j;
        while (j10 > 0 && (i7 = this.f3214d) < (i10 = this.f3211a)) {
            int d10 = ((v) this.f3216f).d(c1979g, (int) Math.min(i10 - i7, j10), true);
            if (d10 == -1) {
                j10 = 0;
            } else {
                this.f3214d += d10;
                j10 -= d10;
            }
        }
        i iVar = (i) this.g;
        int i11 = this.f3214d;
        int i12 = iVar.f390c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long T10 = this.f3212b + D.T(this.f3213c, 1000000L, iVar.f389b);
            int i14 = i13 * i12;
            int i15 = this.f3214d - i14;
            ((v) this.f3216f).e(T10, 1, i14, i15, null);
            this.f3213c += i13;
            this.f3214d = i15;
        }
        return j10 <= 0;
    }

    @Override // D4.b
    public void b(int i7, long j) {
        ((InterfaceC1984l) this.f3215e).i(new f((i) this.g, 1, i7, j));
        ((v) this.f3216f).a((L) this.f3217h);
    }

    @Override // D4.b
    public void c(long j) {
        this.f3212b = j;
        this.f3214d = 0;
        this.f3213c = 0L;
    }

    public C1619p d() {
        AbstractC1705a.o((Uri) this.f3215e, "The uri must be set.");
        return new C1619p((Uri) this.f3215e, this.f3211a, (byte[]) this.f3216f, (Map) this.g, this.f3212b, this.f3213c, (String) this.f3217h, this.f3214d);
    }
}
