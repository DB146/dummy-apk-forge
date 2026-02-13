package C;

import y0.InterfaceC2318C;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218c implements InterfaceC0220e, InterfaceC0222g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2396a;

    /* renamed from: b, reason: collision with root package name */
    public float f2397b;

    public C0218c(int i7) {
        this.f2396a = i7;
        switch (i7) {
            case 1:
                this.f2397b = 0;
                return;
            case 2:
                this.f2397b = 0;
                return;
            case 3:
                this.f2397b = 0;
                return;
            case 4:
                return;
            default:
                this.f2397b = 0;
                return;
        }
    }

    @Override // C.InterfaceC0220e, C.InterfaceC0222g
    public float a() {
        switch (this.f2396a) {
            case 0:
                return this.f2397b;
            case 1:
                return this.f2397b;
            case 2:
                return this.f2397b;
            default:
                return this.f2397b;
        }
    }

    @Override // C.InterfaceC0220e
    public void b(InterfaceC2318C interfaceC2318C, int i7, int[] iArr, V0.l lVar, int[] iArr2) {
        switch (this.f2396a) {
            case 0:
                if (lVar == V0.l.f9982a) {
                    AbstractC0224i.a(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0224i.a(i7, iArr, iArr2, true);
                    return;
                }
            case 1:
                if (lVar == V0.l.f9982a) {
                    AbstractC0224i.d(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0224i.d(i7, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (lVar == V0.l.f9982a) {
                    AbstractC0224i.e(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0224i.e(i7, iArr, iArr2, true);
                    return;
                }
            default:
                if (lVar == V0.l.f9982a) {
                    AbstractC0224i.f(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0224i.f(i7, iArr, iArr2, true);
                    return;
                }
        }
    }

    @Override // C.InterfaceC0222g
    public void c(InterfaceC2318C interfaceC2318C, int i7, int[] iArr, int[] iArr2) {
        switch (this.f2396a) {
            case 0:
                AbstractC0224i.a(i7, iArr, iArr2, false);
                return;
            case 1:
                AbstractC0224i.d(i7, iArr, iArr2, false);
                return;
            case 2:
                AbstractC0224i.e(i7, iArr, iArr2, false);
                return;
            default:
                AbstractC0224i.f(i7, iArr, iArr2, false);
                return;
        }
    }

    public String toString() {
        switch (this.f2396a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
