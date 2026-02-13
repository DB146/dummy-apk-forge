package P8;

import H2.C0305t;
import Q.C0;
import Q.InterfaceC0482c;
import h3.H;
import kotlin.jvm.internal.w;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8218a;

    /* renamed from: b, reason: collision with root package name */
    public int f8219b;

    /* renamed from: c, reason: collision with root package name */
    public int f8220c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i7, (i11 & 2) != 0 ? 0 : i10, 1, (byte) 0);
        this.f8218a = 1;
    }

    public /* synthetic */ h(int i7, int i10, int i11, byte b2) {
        this.f8218a = i11;
        this.f8219b = i7;
        this.f8220c = i10;
    }

    public abstract boolean a(int i7, boolean z8);

    public abstract void b(int i7, int i10, C0305t c0305t);

    public abstract void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar);

    public abstract int d(int[] iArr, int i7, boolean z8);

    public abstract int e(int[] iArr, int i7, boolean z8);

    public abstract H f(int i7);

    public abstract byte[] g();

    public abstract byte[] h(int i7, byte[] bArr);

    public boolean i() {
        return false;
    }

    public abstract boolean j(int i7, boolean z8);

    public h k() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public String toString() {
        switch (this.f8218a) {
            case 0:
                int i7 = this.f8219b;
                byte[] bArr = new byte[i7];
                int i10 = this.f8220c;
                StringBuilder sb2 = new StringBuilder((i7 + 1) * i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    bArr = h(i11, bArr);
                    for (int i12 = 0; i12 < i7; i12++) {
                        int i13 = bArr[i12] & 255;
                        sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            case 1:
                String c10 = w.a(getClass()).c();
                return c10 == null ? "" : c10;
            default:
                return super.toString();
        }
    }
}
