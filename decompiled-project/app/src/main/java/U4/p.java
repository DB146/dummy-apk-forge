package U4;

import java.io.EOFException;
import java.util.Arrays;
import m4.K;
import m4.L;
import m5.InterfaceC1613j;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class p implements s4.v {

    /* renamed from: f, reason: collision with root package name */
    public static final L f9615f;
    public static final L g;

    /* renamed from: a, reason: collision with root package name */
    public final s4.v f9616a;

    /* renamed from: b, reason: collision with root package name */
    public final L f9617b;

    /* renamed from: c, reason: collision with root package name */
    public L f9618c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9619d;

    /* renamed from: e, reason: collision with root package name */
    public int f9620e;

    static {
        K k = new K();
        k.k = "application/id3";
        f9615f = new L(k);
        K k7 = new K();
        k7.k = "application/x-emsg";
        g = new L(k7);
    }

    public p(s4.v vVar, int i7) {
        this.f9616a = vVar;
        if (i7 == 1) {
            this.f9617b = f9615f;
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException(h3.o.l(i7, "Unknown metadataType: "));
            }
            this.f9617b = g;
        }
        this.f9619d = new byte[0];
        this.f9620e = 0;
    }

    @Override // s4.v
    public final void a(L l10) {
        this.f9618c = l10;
        this.f9616a.a(this.f9617b);
    }

    @Override // s4.v
    public final void c(int i7, n5.v vVar) {
        int i10 = this.f9620e + i7;
        byte[] bArr = this.f9619d;
        if (bArr.length < i10) {
            this.f9619d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        vVar.f(this.f9620e, this.f9619d, i7);
        this.f9620e += i7;
    }

    @Override // s4.v
    public final int d(InterfaceC1613j interfaceC1613j, int i7, boolean z8) {
        int i10 = this.f9620e + i7;
        byte[] bArr = this.f9619d;
        if (bArr.length < i10) {
            this.f9619d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int D10 = interfaceC1613j.D(this.f9619d, this.f9620e, i7);
        if (D10 != -1) {
            this.f9620e += D10;
            return D10;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // s4.v
    public final void e(long j, int i7, int i10, int i11, s4.u uVar) {
        this.f9618c.getClass();
        int i12 = this.f9620e - i11;
        n5.v vVar = new n5.v(Arrays.copyOfRange(this.f9619d, i12 - i10, i12));
        byte[] bArr = this.f9619d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f9620e = i11;
        String str = this.f9618c.f20096z;
        L l10 = this.f9617b;
        if (!D.a(str, l10.f20096z)) {
            if (!"application/x-emsg".equals(this.f9618c.f20096z)) {
                AbstractC1705a.S("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f9618c.f20096z);
                return;
            }
            H4.a W10 = G4.b.W(vVar);
            L o10 = W10.o();
            String str2 = l10.f20096z;
            if (o10 == null || !D.a(str2, o10.f20096z)) {
                AbstractC1705a.S("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + W10.o());
                return;
            }
            byte[] y10 = W10.y();
            y10.getClass();
            vVar = new n5.v(y10);
        }
        int a9 = vVar.a();
        s4.v vVar2 = this.f9616a;
        vVar2.c(a9, vVar);
        vVar2.e(j, i7, a9, i11, uVar);
    }
}
