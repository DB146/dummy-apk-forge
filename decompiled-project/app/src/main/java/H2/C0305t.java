package H2;

import androidx.datastore.preferences.protobuf.AbstractC0807j;
import androidx.datastore.preferences.protobuf.AbstractC0817u;
import androidx.datastore.preferences.protobuf.AbstractC0819w;
import androidx.datastore.preferences.protobuf.C0804g;
import androidx.datastore.preferences.protobuf.C0810m;
import androidx.datastore.preferences.protobuf.C0821y;
import androidx.datastore.preferences.protobuf.InterfaceC0818v;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.crypto.tink.shaded.protobuf.AbstractC1010d;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1019m;
import com.google.crypto.tink.shaded.protobuf.AbstractC1024s;
import com.google.crypto.tink.shaded.protobuf.AbstractC1029x;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1015i;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: H2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4825a;

    /* renamed from: b, reason: collision with root package name */
    public int f4826b;

    /* renamed from: c, reason: collision with root package name */
    public int f4827c;

    /* renamed from: d, reason: collision with root package name */
    public int f4828d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4829e;

    public /* synthetic */ C0305t() {
        this.f4825a = 0;
    }

    public C0305t(R.I i7) {
        this.f4825a = 1;
        this.f4829e = i7;
    }

    public C0305t(AbstractC0807j abstractC0807j) {
        this.f4825a = 2;
        this.f4828d = 0;
        Charset charset = AbstractC0819w.f13467a;
        this.f4829e = abstractC0807j;
        abstractC0807j.f13418b = this;
    }

    public C0305t(C1015i c1015i) {
        this.f4825a = 3;
        this.f4828d = 0;
        Charset charset = com.google.crypto.tink.shaded.protobuf.A.f15705a;
        this.f4829e = c1015i;
        c1015i.f15779b = this;
    }

    public static void q0(int i7) {
        if ((i7 & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
    }

    public static void r0(int i7) {
        if ((i7 & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
    }

    public void A(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 1) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int A10 = abstractC0807j.A();
            if ((A10 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b2 = abstractC0807j.b() + A10;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.p()));
            } while (abstractC0807j.b() < b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.p()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void B(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int i10 = c1015i.i();
                r0(i10);
                int c10 = c1015i.c() + i10;
                do {
                    list.add(Long.valueOf(c1015i.h()));
                } while (c1015i.c() < c10);
                return;
            }
            do {
                list.add(Long.valueOf(c1015i.h()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i11 = this.f4826b & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int i12 = c1015i.i();
            r0(i12);
            int c11 = c1015i.c() + i12;
            do {
                j.o(c1015i.h());
            } while (c1015i.c() < c11);
            return;
        }
        do {
            j.o(c1015i.h());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public float C() {
        o0(5);
        return Float.intBitsToFloat(((C1015i) this.f4829e).g());
    }

    public void D(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 == 2) {
            int A10 = abstractC0807j.A();
            if ((A10 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b2 = abstractC0807j.b() + A10;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Float.valueOf(abstractC0807j.q()));
            } while (abstractC0807j.b() < b2);
            return;
        }
        if (i7 != 5) {
            throw C0821y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Float.valueOf(abstractC0807j.q()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void E(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1024s;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 == 2) {
                int i10 = c1015i.i();
                q0(i10);
                int c10 = c1015i.c() + i10;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(c1015i.g())));
                } while (c1015i.c() < c10);
                return;
            }
            if (i7 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(c1015i.g())));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1024s abstractC1024s = (AbstractC1024s) list;
        int i11 = this.f4826b & 7;
        if (i11 == 2) {
            int i12 = c1015i.i();
            q0(i12);
            int c11 = c1015i.c() + i12;
            do {
                abstractC1024s.o(Float.intBitsToFloat(c1015i.g()));
            } while (c1015i.c() < c11);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.C.b();
        }
        do {
            abstractC1024s.o(Float.intBitsToFloat(c1015i.g()));
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public Object F(com.google.crypto.tink.shaded.protobuf.a0 a0Var, C1021o c1021o) {
        int i7 = this.f4827c;
        this.f4827c = ((this.f4826b >>> 3) << 3) | 4;
        try {
            Object c10 = a0Var.c();
            a0Var.g(c10, this, c1021o);
            a0Var.a(c10);
            if (this.f4826b == this.f4827c) {
                return c10;
            }
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        } finally {
            this.f4827c = i7;
        }
    }

    public Object G(com.google.crypto.tink.shaded.protobuf.a0 a0Var, C1021o c1021o) {
        o0(3);
        return F(a0Var, c1021o);
    }

    public int H() {
        o0(0);
        return ((C1015i) this.f4829e).i();
    }

    public void I(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.r()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.r()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void J(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1029x;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Integer.valueOf(c1015i.i()));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Integer.valueOf(c1015i.i()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1029x abstractC1029x = (AbstractC1029x) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                abstractC1029x.o(c1015i.i());
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            abstractC1029x.o(c1015i.i());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public long K() {
        o0(0);
        return ((C1015i) this.f4829e).j();
    }

    public void L(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.s()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.s()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void M(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Long.valueOf(c1015i.j()));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Long.valueOf(c1015i.j()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                j.o(c1015i.j());
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            j.o(c1015i.j());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public Object N(com.google.crypto.tink.shaded.protobuf.a0 a0Var, C1021o c1021o) {
        C1015i c1015i = (C1015i) this.f4829e;
        int i7 = c1015i.i();
        if (c1015i.f15778a >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e2 = c1015i.e(i7);
        Object c10 = a0Var.c();
        c1015i.f15778a++;
        a0Var.g(c10, this, c1021o);
        a0Var.a(c10);
        if (c1015i.f15784h != 0) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        c1015i.f15778a--;
        c1015i.f15785i = e2;
        c1015i.m();
        return c10;
    }

    public Object O(com.google.crypto.tink.shaded.protobuf.a0 a0Var, C1021o c1021o) {
        o0(2);
        return N(a0Var, c1021o);
    }

    public int P() {
        o0(5);
        return ((C1015i) this.f4829e).g();
    }

    public void Q(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 == 2) {
            int A10 = abstractC0807j.A();
            if ((A10 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b2 = abstractC0807j.b() + A10;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.t()));
            } while (abstractC0807j.b() < b2);
            return;
        }
        if (i7 != 5) {
            throw C0821y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.t()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void R(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1029x;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 == 2) {
                int i10 = c1015i.i();
                q0(i10);
                int c10 = c1015i.c() + i10;
                do {
                    list.add(Integer.valueOf(c1015i.g()));
                } while (c1015i.c() < c10);
                return;
            }
            if (i7 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            do {
                list.add(Integer.valueOf(c1015i.g()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1029x abstractC1029x = (AbstractC1029x) list;
        int i11 = this.f4826b & 7;
        if (i11 == 2) {
            int i12 = c1015i.i();
            q0(i12);
            int c11 = c1015i.c() + i12;
            do {
                abstractC1029x.o(c1015i.g());
            } while (c1015i.c() < c11);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.C.b();
        }
        do {
            abstractC1029x.o(c1015i.g());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public long S() {
        o0(1);
        return ((C1015i) this.f4829e).h();
    }

    public void T(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 1) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int A10 = abstractC0807j.A();
            if ((A10 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b2 = abstractC0807j.b() + A10;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.u()));
            } while (abstractC0807j.b() < b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.u()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void U(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int i10 = c1015i.i();
                r0(i10);
                int c10 = c1015i.c() + i10;
                do {
                    list.add(Long.valueOf(c1015i.h()));
                } while (c1015i.c() < c10);
                return;
            }
            do {
                list.add(Long.valueOf(c1015i.h()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i11 = this.f4826b & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int i12 = c1015i.i();
            r0(i12);
            int c11 = c1015i.c() + i12;
            do {
                j.o(c1015i.h());
            } while (c1015i.c() < c11);
            return;
        }
        do {
            j.o(c1015i.h());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public int V() {
        o0(0);
        return C1015i.a(((C1015i) this.f4829e).i());
    }

    public void W(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.v()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.v()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void X(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1029x;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Integer.valueOf(C1015i.a(c1015i.i())));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Integer.valueOf(C1015i.a(c1015i.i())));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1029x abstractC1029x = (AbstractC1029x) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                abstractC1029x.o(C1015i.a(c1015i.i()));
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            abstractC1029x.o(C1015i.a(c1015i.i()));
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public long Y() {
        o0(0);
        return C1015i.b(((C1015i) this.f4829e).j());
    }

    public void Z(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.w()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.w()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void a(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f4828d;
        int i12 = i11 * 2;
        int[] iArr = (int[]) this.f4829e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f4829e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f4829e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f4829e;
        iArr4[i12] = i7;
        iArr4[i12 + 1] = i10;
        this.f4828d++;
    }

    public void a0(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Long.valueOf(C1015i.b(c1015i.j())));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Long.valueOf(C1015i.b(c1015i.j())));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                j.o(C1015i.b(c1015i.j()));
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            j.o(C1015i.b(c1015i.j()));
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public void b(RecyclerView recyclerView, boolean z8) {
        this.f4828d = 0;
        int[] iArr = (int[]) this.f4829e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.a aVar = recyclerView.f13614B;
        if (recyclerView.f13612A == null || aVar == null || !aVar.f13714i) {
            return;
        }
        if (z8) {
            if (!recyclerView.f13655e.j()) {
                aVar.k(recyclerView.f13612A.a(), this);
            }
        } else if (!recyclerView.O()) {
            aVar.j(this.f4826b, this.f4827c, recyclerView.f13676v0, this);
        }
        int i7 = this.f4828d;
        if (i7 > aVar.j) {
            aVar.j = i7;
            aVar.k = z8;
            recyclerView.f13651c.n();
        }
    }

    public String b0() {
        o0(2);
        C1015i c1015i = (C1015i) this.f4829e;
        int i7 = c1015i.i();
        if (i7 > 0) {
            int i10 = c1015i.f15781d;
            int i11 = c1015i.f15783f;
            if (i7 <= i10 - i11) {
                String str = new String(c1015i.f15780c, i11, i7, com.google.crypto.tink.shaded.protobuf.A.f15705a);
                c1015i.f15783f += i7;
                return str;
            }
        }
        if (i7 == 0) {
            return "";
        }
        if (i7 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.d();
        }
        throw com.google.crypto.tink.shaded.protobuf.C.f();
    }

    public int c() {
        switch (this.f4825a) {
            case 2:
                int i7 = this.f4828d;
                if (i7 != 0) {
                    this.f4826b = i7;
                    this.f4828d = 0;
                } else {
                    this.f4826b = ((AbstractC0807j) this.f4829e).z();
                }
                int i10 = this.f4826b;
                return (i10 == 0 || i10 == this.f4827c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i10 >>> 3;
            default:
                int i11 = this.f4828d;
                if (i11 != 0) {
                    this.f4826b = i11;
                    this.f4828d = 0;
                } else {
                    this.f4826b = ((C1015i) this.f4829e).l();
                }
                int i12 = this.f4826b;
                return (i12 == 0 || i12 == this.f4827c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i12 >>> 3;
        }
    }

    public void c0(InterfaceC0818v interfaceC0818v, boolean z8) {
        String x2;
        int z10;
        if ((this.f4826b & 7) != 2) {
            throw C0821y.b();
        }
        do {
            AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
            if (z8) {
                n0(2);
                x2 = abstractC0807j.y();
            } else {
                n0(2);
                x2 = abstractC0807j.x();
            }
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(x2);
            if (abstractC0807j.c()) {
                return;
            } else {
                z10 = abstractC0807j.z();
            }
        } while (z10 == this.f4826b);
        this.f4828d = z10;
    }

    public int d(int i7) {
        return ((R.I) this.f4829e).f8743h[this.f4827c + i7];
    }

    public void d0(List list, boolean z8) {
        int l10;
        int l11;
        if ((this.f4826b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.b();
        }
        boolean z10 = list instanceof com.google.crypto.tink.shaded.protobuf.F;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z10 || z8) {
            do {
                list.add(z8 ? e0() : b0());
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.F f4 = (com.google.crypto.tink.shaded.protobuf.F) list;
        do {
            f4.d(m());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public Object e(int i7) {
        return ((R.I) this.f4829e).j[this.f4828d + i7];
    }

    public String e0() {
        o0(2);
        C1015i c1015i = (C1015i) this.f4829e;
        int i7 = c1015i.i();
        if (i7 > 0) {
            int i10 = c1015i.f15781d;
            int i11 = c1015i.f15783f;
            if (i7 <= i10 - i11) {
                String K10 = com.google.crypto.tink.shaded.protobuf.o0.f15808a.K(i11, c1015i.f15780c, i7);
                c1015i.f15783f += i7;
                return K10;
            }
        }
        if (i7 == 0) {
            return "";
        }
        if (i7 <= 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.d();
        }
        throw com.google.crypto.tink.shaded.protobuf.C.f();
    }

    public int f() {
        return this.f4826b;
    }

    public int f0() {
        o0(0);
        return ((C1015i) this.f4829e).i();
    }

    public void g(Object obj, androidx.datastore.preferences.protobuf.W w10, C0810m c0810m) {
        int i7 = this.f4827c;
        this.f4827c = ((this.f4826b >>> 3) << 3) | 4;
        try {
            w10.h(obj, this, c0810m);
            if (this.f4826b == this.f4827c) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.f4827c = i7;
        }
    }

    public void g0(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.A()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.A()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void h(Object obj, androidx.datastore.preferences.protobuf.W w10, C0810m c0810m) {
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        int A10 = abstractC0807j.A();
        if (abstractC0807j.f13417a >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = abstractC0807j.i(A10);
        abstractC0807j.f13417a++;
        w10.h(obj, this, c0810m);
        abstractC0807j.a(0);
        abstractC0807j.f13417a--;
        abstractC0807j.h(i7);
    }

    public void h0(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1029x;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Integer.valueOf(c1015i.i()));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Integer.valueOf(c1015i.i()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1029x abstractC1029x = (AbstractC1029x) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                abstractC1029x.o(c1015i.i());
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            abstractC1029x.o(c1015i.i());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public boolean i() {
        o0(0);
        return ((C1015i) this.f4829e).f();
    }

    public long i0() {
        o0(0);
        return ((C1015i) this.f4829e).j();
    }

    public void j(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Boolean.valueOf(abstractC0807j.j()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Boolean.valueOf(abstractC0807j.j()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void j0(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.B()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Long.valueOf(abstractC0807j.B()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void k(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1010d;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Boolean.valueOf(c1015i.f()));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Boolean.valueOf(c1015i.f()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1010d abstractC1010d = (AbstractC1010d) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                abstractC1010d.o(c1015i.f());
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            abstractC1010d.o(c1015i.f());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public void k0(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Long.valueOf(c1015i.j()));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Long.valueOf(c1015i.j()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                j.o(c1015i.j());
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            j.o(c1015i.j());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public C0804g l() {
        n0(2);
        return ((AbstractC0807j) this.f4829e).k();
    }

    public void l0(int i7) {
        if (((AbstractC0807j) this.f4829e).b() != i7) {
            throw C0821y.e();
        }
    }

    public C1013g m() {
        byte[] bArr;
        o0(2);
        C1015i c1015i = (C1015i) this.f4829e;
        int i7 = c1015i.i();
        byte[] bArr2 = c1015i.f15780c;
        if (i7 > 0) {
            int i10 = c1015i.f15781d;
            int i11 = c1015i.f15783f;
            if (i7 <= i10 - i11) {
                C1013g o10 = AbstractC1014h.o(i11, bArr2, i7);
                c1015i.f15783f += i7;
                return o10;
            }
        }
        if (i7 == 0) {
            return AbstractC1014h.f15775b;
        }
        if (i7 > 0) {
            int i12 = c1015i.f15781d;
            int i13 = c1015i.f15783f;
            if (i7 <= i12 - i13) {
                int i14 = i7 + i13;
                c1015i.f15783f = i14;
                bArr = Arrays.copyOfRange(bArr2, i13, i14);
                C1013g c1013g = AbstractC1014h.f15775b;
                return new C1013g(bArr);
            }
        }
        if (i7 > 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
        if (i7 != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.d();
        }
        bArr = com.google.crypto.tink.shaded.protobuf.A.f15706b;
        C1013g c1013g2 = AbstractC1014h.f15775b;
        return new C1013g(bArr);
    }

    public void m0(int i7) {
        if (((C1015i) this.f4829e).c() != i7) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
    }

    public void n(InterfaceC0818v interfaceC0818v) {
        int z8;
        if ((this.f4826b & 7) != 2) {
            throw C0821y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(l());
            AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void n0(int i7) {
        if ((this.f4826b & 7) != i7) {
            throw C0821y.b();
        }
    }

    public void o(List list) {
        int l10;
        if ((this.f4826b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.b();
        }
        do {
            list.add(m());
            C1015i c1015i = (C1015i) this.f4829e;
            if (c1015i.d()) {
                return;
            } else {
                l10 = c1015i.l();
            }
        } while (l10 == this.f4826b);
        this.f4828d = l10;
    }

    public void o0(int i7) {
        if ((this.f4826b & 7) != i7) {
            throw com.google.crypto.tink.shaded.protobuf.C.b();
        }
    }

    public double p() {
        o0(1);
        return Double.longBitsToDouble(((C1015i) this.f4829e).h());
    }

    public boolean p0() {
        int i7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (abstractC0807j.c() || (i7 = this.f4826b) == this.f4827c) {
            return false;
        }
        return abstractC0807j.C(i7);
    }

    public void q(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 1) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int A10 = abstractC0807j.A();
            if ((A10 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b2 = abstractC0807j.b() + A10;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Double.valueOf(abstractC0807j.m()));
            } while (abstractC0807j.b() < b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Double.valueOf(abstractC0807j.m()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void r(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1019m;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int i10 = c1015i.i();
                r0(i10);
                int c10 = c1015i.c() + i10;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(c1015i.h())));
                } while (c1015i.c() < c10);
                return;
            }
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(c1015i.h())));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1019m abstractC1019m = (AbstractC1019m) list;
        int i11 = this.f4826b & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int i12 = c1015i.i();
            r0(i12);
            int c11 = c1015i.c() + i12;
            do {
                abstractC1019m.o(Double.longBitsToDouble(c1015i.h()));
            } while (c1015i.c() < c11);
            return;
        }
        do {
            abstractC1019m.o(Double.longBitsToDouble(c1015i.h()));
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public int s() {
        o0(0);
        return ((C1015i) this.f4829e).i();
    }

    public void t(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 != 0) {
            if (i7 != 2) {
                throw C0821y.b();
            }
            int b2 = abstractC0807j.b() + abstractC0807j.A();
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.n()));
            } while (abstractC0807j.b() < b2);
            l0(b2);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.n()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void u(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1029x;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                int c10 = c1015i.c() + c1015i.i();
                do {
                    list.add(Integer.valueOf(c1015i.i()));
                } while (c1015i.c() < c10);
                m0(c10);
                return;
            }
            do {
                list.add(Integer.valueOf(c1015i.i()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1029x abstractC1029x = (AbstractC1029x) list;
        int i10 = this.f4826b & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            int c11 = c1015i.c() + c1015i.i();
            do {
                abstractC1029x.o(c1015i.i());
            } while (c1015i.c() < c11);
            m0(c11);
            return;
        }
        do {
            abstractC1029x.o(c1015i.i());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public Object v(androidx.datastore.preferences.protobuf.r0 r0Var, Class cls, C0810m c0810m) {
        int ordinal = r0Var.ordinal();
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        switch (ordinal) {
            case 0:
                n0(1);
                return Double.valueOf(abstractC0807j.m());
            case 1:
                n0(5);
                return Float.valueOf(abstractC0807j.q());
            case 2:
                n0(0);
                return Long.valueOf(abstractC0807j.s());
            case 3:
                n0(0);
                return Long.valueOf(abstractC0807j.B());
            case 4:
                n0(0);
                return Integer.valueOf(abstractC0807j.r());
            case 5:
                n0(1);
                return Long.valueOf(abstractC0807j.p());
            case 6:
                n0(5);
                return Integer.valueOf(abstractC0807j.o());
            case 7:
                n0(0);
                return Boolean.valueOf(abstractC0807j.j());
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                n0(2);
                return abstractC0807j.y();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                n0(2);
                androidx.datastore.preferences.protobuf.W a9 = androidx.datastore.preferences.protobuf.T.f13352c.a(cls);
                AbstractC0817u c10 = a9.c();
                h(c10, a9, c0810m);
                a9.a(c10);
                return c10;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return l();
            case 12:
                n0(0);
                return Integer.valueOf(abstractC0807j.A());
            case 13:
                n0(0);
                return Integer.valueOf(abstractC0807j.n());
            case 14:
                n0(5);
                return Integer.valueOf(abstractC0807j.t());
            case 15:
                n0(1);
                return Long.valueOf(abstractC0807j.u());
            case 16:
                n0(0);
                return Integer.valueOf(abstractC0807j.v());
            case 17:
                n0(0);
                return Long.valueOf(abstractC0807j.w());
        }
    }

    public int w() {
        o0(5);
        return ((C1015i) this.f4829e).g();
    }

    public void x(InterfaceC0818v interfaceC0818v) {
        int z8;
        int i7 = this.f4826b & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) this.f4829e;
        if (i7 == 2) {
            int A10 = abstractC0807j.A();
            if ((A10 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b2 = abstractC0807j.b() + A10;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.o()));
            } while (abstractC0807j.b() < b2);
            return;
        }
        if (i7 != 5) {
            throw C0821y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0818v).add(Integer.valueOf(abstractC0807j.o()));
            if (abstractC0807j.c()) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == this.f4826b);
        this.f4828d = z8;
    }

    public void y(List list) {
        int l10;
        int l11;
        boolean z8 = list instanceof AbstractC1029x;
        C1015i c1015i = (C1015i) this.f4829e;
        if (!z8) {
            int i7 = this.f4826b & 7;
            if (i7 == 2) {
                int i10 = c1015i.i();
                q0(i10);
                int c10 = c1015i.c() + i10;
                do {
                    list.add(Integer.valueOf(c1015i.g()));
                } while (c1015i.c() < c10);
                return;
            }
            if (i7 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            do {
                list.add(Integer.valueOf(c1015i.g()));
                if (c1015i.d()) {
                    return;
                } else {
                    l10 = c1015i.l();
                }
            } while (l10 == this.f4826b);
            this.f4828d = l10;
            return;
        }
        AbstractC1029x abstractC1029x = (AbstractC1029x) list;
        int i11 = this.f4826b & 7;
        if (i11 == 2) {
            int i12 = c1015i.i();
            q0(i12);
            int c11 = c1015i.c() + i12;
            do {
                abstractC1029x.o(c1015i.g());
            } while (c1015i.c() < c11);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.C.b();
        }
        do {
            abstractC1029x.o(c1015i.g());
            if (c1015i.d()) {
                return;
            } else {
                l11 = c1015i.l();
            }
        } while (l11 == this.f4826b);
        this.f4828d = l11;
    }

    public long z() {
        o0(1);
        return ((C1015i) this.f4829e).h();
    }
}
