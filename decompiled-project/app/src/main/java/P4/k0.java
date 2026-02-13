package P4;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import m4.C1586o0;
import m4.E0;
import m5.C1617n;
import m5.C1619p;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC0476y, InterfaceC1601E {

    /* renamed from: A, reason: collision with root package name */
    public byte[] f8075A;

    /* renamed from: B, reason: collision with root package name */
    public int f8076B;

    /* renamed from: a, reason: collision with root package name */
    public final C1619p f8077a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1615l f8078b;

    /* renamed from: c, reason: collision with root package name */
    public final m5.T f8079c;

    /* renamed from: d, reason: collision with root package name */
    public final Y5.B f8080d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.s f8081e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f8082f;

    /* renamed from: v, reason: collision with root package name */
    public final long f8084v;

    /* renamed from: x, reason: collision with root package name */
    public final m4.L f8086x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f8087y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8088z;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f8083u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final m5.J f8085w = new m5.J("SingleSampleMediaPeriod");

    public k0(C1619p c1619p, InterfaceC1615l interfaceC1615l, m5.T t5, m4.L l10, long j, Y5.B b2, A4.s sVar, boolean z8) {
        this.f8077a = c1619p;
        this.f8078b = interfaceC1615l;
        this.f8079c = t5;
        this.f8086x = l10;
        this.f8084v = j;
        this.f8080d = b2;
        this.f8081e = sVar;
        this.f8087y = z8;
        this.f8082f = new n0(new m0("", l10));
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        return j;
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f8085w.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    @Override // m5.InterfaceC1601E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        long j11;
        D4.e eVar;
        m5.S s3 = ((j0) interfaceC1603G).f8070b;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        int i10 = n5.D.f21141a;
        Y5.B b2 = this.f8080d;
        b2.getClass();
        if (!(iOException instanceof C1586o0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof m5.z) && !(iOException instanceof m5.I)) {
            int i11 = C1617n.f20620b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1617n) || ((C1617n) th).f20621a != 2008) {
                }
            }
            j11 = Math.min((i7 - 1) * 1000, 5000);
            boolean z8 = j11 != -9223372036854775807L || i7 >= b2.d(1);
            if (this.f8087y || !z8) {
                eVar = j11 == -9223372036854775807L ? new D4.e(0, j11, false) : m5.J.f20551f;
            } else {
                AbstractC1705a.R(iOException, "SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.");
                this.f8088z = true;
                eVar = m5.J.f20550e;
            }
            D4.e eVar2 = eVar;
            this.f8081e.v(rVar, 1, -1, this.f8086x, 0, null, 0L, this.f8084v, iOException, !eVar2.a());
            return eVar2;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        if (this.f8087y) {
        }
        if (j11 == -9223372036854775807L) {
        }
        D4.e eVar22 = eVar;
        this.f8081e.v(rVar, 1, -1, this.f8086x, 0, null, 0L, this.f8084v, iOException, !eVar22.a());
        return eVar22;
    }

    @Override // P4.f0
    public final long j() {
        return (this.f8088z || this.f8085w.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        return this.f8082f;
    }

    @Override // m5.InterfaceC1601E
    public final void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        m5.S s3 = ((j0) interfaceC1603G).f8070b;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f8080d.getClass();
        this.f8081e.q(rVar, 1, -1, null, 0, null, 0L, this.f8084v);
    }

    @Override // P4.f0
    public final long n() {
        return this.f8088z ? Long.MIN_VALUE : 0L;
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        interfaceC0475x.a(this);
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8083u;
            if (i7 >= arrayList.size()) {
                return j;
            }
            i0 i0Var = (i0) arrayList.get(i7);
            if (i0Var.f8063a == 2) {
                i0Var.f8063a = 1;
            }
            i7++;
        }
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
    }

    @Override // m5.InterfaceC1601E
    public final void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        j0 j0Var = (j0) interfaceC1603G;
        this.f8076B = (int) j0Var.f8070b.f20580b;
        byte[] bArr = j0Var.f8071c;
        bArr.getClass();
        this.f8075A = bArr;
        this.f8088z = true;
        m5.S s3 = j0Var.f8070b;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f8080d.getClass();
        this.f8081e.t(rVar, 1, -1, this.f8086x, 0, null, 0L, this.f8084v);
    }

    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        for (int i7 = 0; i7 < sVarArr.length; i7++) {
            d0 d0Var = d0VarArr[i7];
            ArrayList arrayList = this.f8083u;
            if (d0Var != null && (sVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(d0Var);
                d0VarArr[i7] = null;
            }
            if (d0VarArr[i7] == null && sVarArr[i7] != null) {
                i0 i0Var = new i0(this);
                arrayList.add(i0Var);
                d0VarArr[i7] = i0Var;
                zArr2[i7] = true;
            }
        }
        return j;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        if (this.f8088z) {
            return false;
        }
        m5.J j10 = this.f8085w;
        if (j10.d() || j10.c()) {
            return false;
        }
        InterfaceC1616m e2 = this.f8078b.e();
        m5.T t5 = this.f8079c;
        if (t5 != null) {
            e2.a(t5);
        }
        C1619p c1619p = this.f8077a;
        j10.f(new j0(e2, c1619p), this, this.f8080d.d(1));
        this.f8081e.z(new r(c1619p), 1, -1, this.f8086x, 0, null, 0L, this.f8084v);
        return true;
    }

    @Override // P4.f0
    public final void y(long j) {
    }
}
