package o4;

import N6.t0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import n5.AbstractC1705a;

/* renamed from: o4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1799m {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f21862a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21863b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f21864c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f21865d;

    public C1799m(t0 t0Var) {
        this.f21862a = t0Var;
        C1800n c1800n = C1800n.f21866e;
        this.f21865d = false;
    }

    public final C1800n a(C1800n c1800n) {
        if (c1800n.equals(C1800n.f21866e)) {
            throw new C1801o(c1800n);
        }
        int i7 = 0;
        while (true) {
            t0 t0Var = this.f21862a;
            if (i7 >= t0Var.size()) {
                return c1800n;
            }
            InterfaceC1802p interfaceC1802p = (InterfaceC1802p) t0Var.get(i7);
            C1800n b2 = interfaceC1802p.b(c1800n);
            if (interfaceC1802p.isActive()) {
                AbstractC1705a.m(!b2.equals(C1800n.f21866e));
                c1800n = b2;
            }
            i7++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f21863b;
        arrayList.clear();
        this.f21865d = false;
        int i7 = 0;
        while (true) {
            t0 t0Var = this.f21862a;
            if (i7 >= t0Var.size()) {
                break;
            }
            InterfaceC1802p interfaceC1802p = (InterfaceC1802p) t0Var.get(i7);
            interfaceC1802p.flush();
            if (interfaceC1802p.isActive()) {
                arrayList.add(interfaceC1802p);
            }
            i7++;
        }
        this.f21864c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= c(); i10++) {
            this.f21864c[i10] = ((InterfaceC1802p) arrayList.get(i10)).a();
        }
    }

    public final int c() {
        return this.f21864c.length - 1;
    }

    public final boolean d() {
        return this.f21865d && ((InterfaceC1802p) this.f21863b.get(c())).d() && !this.f21864c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f21863b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1799m)) {
            return false;
        }
        C1799m c1799m = (C1799m) obj;
        t0 t0Var = this.f21862a;
        if (t0Var.size() != c1799m.f21862a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < t0Var.size(); i7++) {
            if (t0Var.get(i7) != c1799m.f21862a.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z8;
        for (boolean z10 = true; z10; z10 = z8) {
            z8 = false;
            int i7 = 0;
            while (i7 <= c()) {
                if (!this.f21864c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f21863b;
                    InterfaceC1802p interfaceC1802p = (InterfaceC1802p) arrayList.get(i7);
                    if (!interfaceC1802p.d()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.f21864c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1802p.f21871a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC1802p.e(byteBuffer2);
                        this.f21864c[i7] = interfaceC1802p.a();
                        z8 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f21864c[i7].hasRemaining();
                    } else if (!this.f21864c[i7].hasRemaining() && i7 < c()) {
                        ((InterfaceC1802p) arrayList.get(i7 + 1)).c();
                    }
                }
                i7++;
            }
        }
    }

    public final int hashCode() {
        return this.f21862a.hashCode();
    }
}
