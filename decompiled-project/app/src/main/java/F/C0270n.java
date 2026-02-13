package F;

import A0.AbstractC0017g;
import A0.InterfaceC0035y;
import C.C0225j;
import y0.AbstractC2323H;
import y0.AbstractC2328M;
import y0.AbstractC2338f;
import y0.InterfaceC2317B;
import z0.C2582d;
import z0.InterfaceC2581c;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270n extends c0.l implements InterfaceC2581c, InterfaceC0035y {

    /* renamed from: F, reason: collision with root package name */
    public static final C0268l f3984F = new Object();

    /* renamed from: C, reason: collision with root package name */
    public E.e f3985C;

    /* renamed from: D, reason: collision with root package name */
    public C0267k f3986D;

    /* renamed from: E, reason: collision with root package name */
    public z.V f3987E;

    @Override // z0.InterfaceC2581c
    public final Q5.e c() {
        C2582d c2582d = new C2582d(AbstractC2338f.f26582a);
        c2582d.f28154e.setValue(this);
        return c2582d;
    }

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        AbstractC2323H b2 = zVar.b(j);
        return t5.Q(b2.f26554a, b2.f26555b, Eb.w.f3892a, new C0225j(b2, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r4.f3987E == z.V.f27943a) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4.f3987E == z.V.f27944b) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p0(C0266j c0266j, int i7) {
        boolean z8;
        if (!(AbstractC2328M.f(i7, 5) ? true : AbstractC2328M.f(i7, 6))) {
            if (!(AbstractC2328M.f(i7, 3) ? true : AbstractC2328M.f(i7, 4))) {
                if (!(AbstractC2328M.f(i7, 1) ? true : AbstractC2328M.f(i7, 2))) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            }
            z8 = false;
        }
        if (z8) {
            return false;
        }
        if (q0(i7)) {
            if (c0266j.f3979b < this.f3985C.f3406a.d().f3479n - 1) {
                return true;
            }
        } else if (c0266j.f3978a > 0) {
            return true;
        }
        return false;
    }

    public final boolean q0(int i7) {
        if (!AbstractC2328M.f(i7, 1)) {
            if (AbstractC2328M.f(i7, 2)) {
                return true;
            }
            if (!AbstractC2328M.f(i7, 5)) {
                if (AbstractC2328M.f(i7, 6)) {
                    return true;
                }
                if (AbstractC2328M.f(i7, 3)) {
                    int ordinal = AbstractC0017g.t(this).f54M.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            return true;
                        }
                        throw new Db.d(1);
                    }
                } else {
                    if (!AbstractC2328M.f(i7, 4)) {
                        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                    int ordinal2 = AbstractC0017g.t(this).f54M.ordinal();
                    if (ordinal2 == 0) {
                        return true;
                    }
                    if (ordinal2 != 1) {
                        throw new Db.d(1);
                    }
                }
            }
        }
        return false;
    }
}
