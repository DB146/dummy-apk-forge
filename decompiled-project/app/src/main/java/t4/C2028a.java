package t4;

import F.C0257a;
import M6.e;
import h3.o;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import m4.C1586o0;
import m4.K;
import n5.AbstractC1705a;
import n5.D;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;
import s4.s;
import s4.v;
import z4.C2588a;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2028a implements InterfaceC1982j {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f24477n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f24478o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f24479p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f24480q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f24481r;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24483b;

    /* renamed from: c, reason: collision with root package name */
    public long f24484c;

    /* renamed from: d, reason: collision with root package name */
    public int f24485d;

    /* renamed from: e, reason: collision with root package name */
    public int f24486e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24487f;

    /* renamed from: h, reason: collision with root package name */
    public int f24488h;

    /* renamed from: i, reason: collision with root package name */
    public long f24489i;
    public InterfaceC1984l j;
    public v k;

    /* renamed from: l, reason: collision with root package name */
    public s f24490l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24491m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24482a = new byte[1];
    public int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f24478o = iArr;
        int i7 = D.f21141a;
        Charset charset = e.f6799c;
        f24479p = "#!AMR\n".getBytes(charset);
        f24480q = "#!AMR-WB\n".getBytes(charset);
        f24481r = iArr[8];
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f24484c = 0L;
        this.f24485d = 0;
        this.f24486e = 0;
        if (j != 0) {
            s sVar = this.f24490l;
            if (sVar instanceof C2588a) {
                this.f24489i = (Math.max(0L, j - ((C2588a) sVar).f28241b) * 8000000) / r0.f28244e;
                return;
            }
        }
        this.f24489i = 0L;
    }

    public final int b(C1979g c1979g) {
        boolean z8;
        c1979g.f24057f = 0;
        byte[] bArr = this.f24482a;
        c1979g.x(bArr, 0, 1, false);
        byte b2 = bArr[0];
        if ((b2 & 131) > 0) {
            throw C1586o0.a("Invalid padding bits for frame header " + ((int) b2), null);
        }
        int i7 = (b2 >> 3) & 15;
        if (i7 >= 0 && i7 <= 15 && (((z8 = this.f24483b) && (i7 < 10 || i7 > 13)) || (!z8 && (i7 < 12 || i7 > 14)))) {
            return z8 ? f24478o[i7] : f24477n[i7];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f24483b ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i7);
        throw C1586o0.a(sb2.toString(), null);
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        return d((C1979g) interfaceC1983k);
    }

    public final boolean d(C1979g c1979g) {
        c1979g.f24057f = 0;
        byte[] bArr = f24479p;
        byte[] bArr2 = new byte[bArr.length];
        c1979g.x(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f24483b = false;
            c1979g.r(bArr.length);
            return true;
        }
        c1979g.f24057f = 0;
        byte[] bArr3 = f24480q;
        byte[] bArr4 = new byte[bArr3.length];
        c1979g.x(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f24483b = true;
        c1979g.r(bArr3.length);
        return true;
    }

    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        AbstractC1705a.n(this.k);
        int i7 = D.f21141a;
        if (((C1979g) interfaceC1983k).f24055d == 0 && !d((C1979g) interfaceC1983k)) {
            throw C1586o0.a("Could not find AMR header.", null);
        }
        if (!this.f24491m) {
            this.f24491m = true;
            boolean z8 = this.f24483b;
            String str = z8 ? "audio/amr-wb" : "audio/3gpp";
            int i10 = z8 ? 16000 : 8000;
            v vVar = this.k;
            K k = new K();
            k.k = str;
            k.f19984l = f24481r;
            k.f19996x = 1;
            k.f19997y = i10;
            o.w(k, vVar);
        }
        int i11 = -1;
        if (this.f24486e == 0) {
            try {
                int b2 = b((C1979g) interfaceC1983k);
                this.f24485d = b2;
                this.f24486e = b2;
                if (this.g == -1) {
                    long j = ((C1979g) interfaceC1983k).f24055d;
                    this.g = b2;
                }
                if (this.g == b2) {
                    this.f24488h++;
                }
            } catch (EOFException unused) {
            }
        }
        int d10 = this.k.d(interfaceC1983k, this.f24486e, true);
        if (d10 != -1) {
            int i12 = this.f24486e - d10;
            this.f24486e = i12;
            i11 = 0;
            if (i12 <= 0) {
                this.k.e(this.f24484c + this.f24489i, 1, this.f24485d, 0, null);
                this.f24484c += 20000;
            }
        }
        if (!this.f24487f) {
            C1986n c1986n = new C1986n(-9223372036854775807L);
            this.f24490l = c1986n;
            this.j.i(c1986n);
            this.f24487f = true;
        }
        return i11;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.j = interfaceC1984l;
        this.k = interfaceC1984l.u(0, 1);
        interfaceC1984l.f();
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
