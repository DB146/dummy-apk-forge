package a0;

import java.util.Arrays;
import java.util.HashMap;
import u.C2047J;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679f extends C0678e {

    /* renamed from: o, reason: collision with root package name */
    public final C0678e f12380o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12381p;

    public C0679f(long j, C0686m c0686m, Rb.c cVar, Rb.c cVar2, C0678e c0678e) {
        super(j, c0686m, cVar, cVar2);
        this.f12380o = c0678e;
        c0678e.k();
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void c() {
        if (this.f12388c) {
            return;
        }
        super.c();
        if (this.f12381p) {
            return;
        }
        this.f12381p = true;
        this.f12380o.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0027, B:13:0x002c, B:16:0x0031, B:21:0x004d, B:23:0x0055, B:24:0x0067, B:26:0x0071, B:27:0x0076, B:29:0x0097, B:30:0x00ad, B:31:0x00b4, B:34:0x00bd, B:35:0x00be, B:44:0x00c9, B:47:0x00df, B:48:0x00cf, B:51:0x00f4, B:52:0x00f5, B:53:0x00aa, B:54:0x0059, B:55:0x0064, B:33:0x00b5), top: B:10:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0027, B:13:0x002c, B:16:0x0031, B:21:0x004d, B:23:0x0055, B:24:0x0067, B:26:0x0071, B:27:0x0076, B:29:0x0097, B:30:0x00ad, B:31:0x00b4, B:34:0x00bd, B:35:0x00be, B:44:0x00c9, B:47:0x00df, B:48:0x00cf, B:51:0x00f4, B:52:0x00f5, B:53:0x00aa, B:54:0x0059, B:55:0x0064, B:33:0x00b5), top: B:10:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0027, B:13:0x002c, B:16:0x0031, B:21:0x004d, B:23:0x0055, B:24:0x0067, B:26:0x0071, B:27:0x0076, B:29:0x0097, B:30:0x00ad, B:31:0x00b4, B:34:0x00bd, B:35:0x00be, B:44:0x00c9, B:47:0x00df, B:48:0x00cf, B:51:0x00f4, B:52:0x00f5, B:53:0x00aa, B:54:0x0059, B:55:0x0064, B:33:0x00b5), top: B:10:0x0027, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a0.s, java.lang.Object] */
    @Override // a0.C0678e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0692s w() {
        int i7;
        C0678e c0678e = this.f12380o;
        if (c0678e.f12379m || c0678e.f12388c) {
            return new Object();
        }
        C2047J c2047j = this.f12376h;
        long j = this.f12387b;
        HashMap c10 = c2047j != null ? AbstractC0688o.c(c0678e.g(), this, this.f12380o.d()) : null;
        Object obj = AbstractC0688o.f12405b;
        synchronized (obj) {
            try {
                AbstractC0688o.d(this);
                if (c2047j != null && c2047j.f24612d != 0) {
                    AbstractC0692s z8 = z(this.f12380o.g(), c2047j, c10, this.f12380o.d());
                    if (!z8.equals(C0684k.f12390b)) {
                        return z8;
                    }
                    C2047J x2 = this.f12380o.x();
                    if (x2 != null) {
                        x2.k(c2047j);
                    } else {
                        this.f12380o.B(c2047j);
                        this.f12376h = null;
                    }
                    if (this.f12380o.g() < j) {
                        this.f12380o.v();
                    }
                    C0678e c0678e2 = this.f12380o;
                    c0678e2.r(c0678e2.d().o(j).b(this.j));
                    this.f12380o.A(j);
                    C0678e c0678e3 = this.f12380o;
                    i7 = this.f12389d;
                    this.f12389d = -1;
                    if (i7 < 0) {
                        int[] iArr = c0678e3.k;
                        kotlin.jvm.internal.l.e(iArr, "<this>");
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i7;
                        c0678e3.k = copyOf;
                    } else {
                        c0678e3.getClass();
                    }
                    C0678e c0678e4 = this.f12380o;
                    C0686m c0686m = this.j;
                    c0678e4.getClass();
                    synchronized (obj) {
                        c0678e4.j = c0678e4.j.y(c0686m);
                        C0678e c0678e5 = this.f12380o;
                        int[] iArr2 = this.k;
                        c0678e5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = c0678e5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                kotlin.jvm.internal.l.b(copyOf2);
                                iArr2 = copyOf2;
                            }
                            c0678e5.k = iArr2;
                        }
                    }
                    this.f12379m = true;
                    if (!this.f12381p) {
                        this.f12381p = true;
                        this.f12380o.l();
                    }
                    return C0684k.f12390b;
                }
                a();
                if (this.f12380o.g() < j) {
                }
                C0678e c0678e22 = this.f12380o;
                c0678e22.r(c0678e22.d().o(j).b(this.j));
                this.f12380o.A(j);
                C0678e c0678e32 = this.f12380o;
                i7 = this.f12389d;
                this.f12389d = -1;
                if (i7 < 0) {
                }
                C0678e c0678e42 = this.f12380o;
                C0686m c0686m2 = this.j;
                c0678e42.getClass();
                synchronized (obj) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
