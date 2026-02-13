package C;

import y0.InterfaceC2318C;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219d implements InterfaceC0220e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2398a = 1;

    @Override // C.InterfaceC0220e
    public final void b(InterfaceC2318C interfaceC2318C, int i7, int[] iArr, V0.l lVar, int[] iArr2) {
        switch (this.f2398a) {
            case 0:
                if (lVar == V0.l.f9982a) {
                    AbstractC0224i.c(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0224i.b(iArr, iArr2, true);
                    return;
                }
            default:
                if (lVar == V0.l.f9982a) {
                    AbstractC0224i.b(iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0224i.c(i7, iArr, iArr2, true);
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.f2398a) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
