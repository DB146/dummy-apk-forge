package A0;

import i0.C1289b;
import java.util.HashMap;
import java.util.Map;
import y0.AbstractC2323H;
import y0.AbstractC2335c;
import y0.C2344l;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2323H f83a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f85c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0007b f88f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f89h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public M(InterfaceC0007b interfaceC0007b, int i7) {
        this.f89h = i7;
        this.f83a = (AbstractC2323H) interfaceC0007b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Rb.e, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r12v6, types: [y0.H, A0.b] */
    public static final void a(M m10, C2344l c2344l, int i7, n0 n0Var) {
        m10.getClass();
        float f4 = i7;
        long floatToRawIntBits = Float.floatToRawIntBits(f4);
        int floatToRawIntBits2 = Float.floatToRawIntBits(f4);
        while (true) {
            long j = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            do {
                switch (m10.f89h) {
                    case 0:
                        s0 s0Var = n0Var.f292T;
                        if (s0Var != null) {
                            j = s0Var.a(j, false);
                        }
                        j = Z9.x.M(j, n0Var.f284K);
                        break;
                    default:
                        U r02 = n0Var.r0();
                        kotlin.jvm.internal.l.b(r02);
                        long j10 = r02.f119A;
                        j = C1289b.e((Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L), j);
                        break;
                }
                n0Var = n0Var.f275B;
                kotlin.jvm.internal.l.b(n0Var);
                if (n0Var.equals(m10.f83a.i())) {
                    int round = Math.round(c2344l instanceof C2344l ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    HashMap hashMap = m10.g;
                    if (hashMap.containsKey(c2344l)) {
                        int intValue = ((Number) Eb.B.E(c2344l, hashMap)).intValue();
                        C2344l c2344l2 = AbstractC2335c.f26577a;
                        round = ((Number) c2344l.f26588a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(c2344l, Integer.valueOf(round));
                    return;
                }
            } while (!m10.b(n0Var).containsKey(c2344l));
            float c10 = m10.c(n0Var, c2344l);
            floatToRawIntBits = Float.floatToRawIntBits(c10);
            floatToRawIntBits2 = Float.floatToRawIntBits(c10);
        }
    }

    public final Map b(n0 n0Var) {
        switch (this.f89h) {
            case 0:
                return n0Var.c0().a();
            default:
                U r02 = n0Var.r0();
                kotlin.jvm.internal.l.b(r02);
                return r02.c0().a();
        }
    }

    public final int c(n0 n0Var, C2344l c2344l) {
        switch (this.f89h) {
            case 0:
                return n0Var.T(c2344l);
            default:
                U r02 = n0Var.r0();
                kotlin.jvm.internal.l.b(r02);
                return r02.T(c2344l);
        }
    }

    public final boolean d() {
        return this.f85c || this.f86d || this.f87e;
    }

    public final boolean e() {
        h();
        return this.f88f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [y0.H, A0.b] */
    public final void f() {
        this.f84b = true;
        ?? r02 = this.f83a;
        InterfaceC0007b j = r02.j();
        if (j == null) {
            return;
        }
        if (this.f85c) {
            j.requestLayout();
        }
        if (this.f86d) {
            r02.E();
        }
        if (this.f87e) {
            r02.requestLayout();
        }
        j.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [y0.H, A0.b] */
    public final void g() {
        HashMap hashMap = this.g;
        hashMap.clear();
        C0005a c0005a = new C0005a(this, 0);
        ?? r22 = this.f83a;
        r22.C(c0005a);
        hashMap.putAll(b(r22.i()));
        this.f84b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [y0.H, A0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        M a9;
        M a10;
        boolean d10 = d();
        ?? r12 = this.f83a;
        InterfaceC0007b interfaceC0007b = r12;
        if (!d10) {
            InterfaceC0007b j = r12.j();
            if (j == null) {
                return;
            }
            InterfaceC0007b interfaceC0007b2 = j.a().f88f;
            if (interfaceC0007b2 != null) {
                boolean d11 = interfaceC0007b2.a().d();
                interfaceC0007b = interfaceC0007b2;
            }
            InterfaceC0007b interfaceC0007b3 = this.f88f;
            if (interfaceC0007b3 == null || interfaceC0007b3.a().d()) {
                return;
            }
            InterfaceC0007b j10 = interfaceC0007b3.j();
            if (j10 != null && (a10 = j10.a()) != null) {
                a10.h();
            }
            InterfaceC0007b j11 = interfaceC0007b3.j();
            interfaceC0007b = (j11 == null || (a9 = j11.a()) == null) ? null : a9.f88f;
        }
        this.f88f = interfaceC0007b;
    }
}
