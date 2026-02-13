package C;

import java.util.WeakHashMap;
import q1.C1876b;
import y0.InterfaceC2318C;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217b implements InterfaceC0222g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2395a = 1;

    public static final C0216a b(int i7, String str) {
        WeakHashMap weakHashMap = P.f2369u;
        return new C0216a(i7, str);
    }

    public static final N d(int i7, String str) {
        WeakHashMap weakHashMap = P.f2369u;
        return new N(q3.f.D(C1876b.f23340e), str);
    }

    @Override // C.InterfaceC0222g
    public void c(InterfaceC2318C interfaceC2318C, int i7, int[] iArr, int[] iArr2) {
        switch (this.f2395a) {
            case 0:
                AbstractC0224i.c(i7, iArr, iArr2, false);
                return;
            default:
                AbstractC0224i.b(iArr, iArr2, false);
                return;
        }
    }

    public String toString() {
        switch (this.f2395a) {
            case 0:
                return "Arrangement#Bottom";
            case 1:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
