package s4;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24093a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f24094b;

    /* renamed from: c, reason: collision with root package name */
    public int f24095c;

    /* renamed from: d, reason: collision with root package name */
    public long f24096d;

    /* renamed from: e, reason: collision with root package name */
    public int f24097e;

    /* renamed from: f, reason: collision with root package name */
    public int f24098f;
    public int g;

    public final void a(v vVar, u uVar) {
        if (this.f24095c > 0) {
            vVar.e(this.f24096d, this.f24097e, this.f24098f, this.g, uVar);
            this.f24095c = 0;
        }
    }

    public final void b(v vVar, long j, int i7, int i10, int i11, u uVar) {
        if (!(this.g <= i10 + i11)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f24094b) {
            int i12 = this.f24095c;
            int i13 = i12 + 1;
            this.f24095c = i13;
            if (i12 == 0) {
                this.f24096d = j;
                this.f24097e = i7;
                this.f24098f = 0;
            }
            this.f24098f += i10;
            this.g = i11;
            if (i13 >= 16) {
                a(vVar, uVar);
            }
        }
    }

    public final void c(InterfaceC1983k interfaceC1983k) {
        if (this.f24094b) {
            return;
        }
        byte[] bArr = this.f24093a;
        int i7 = 0;
        interfaceC1983k.m(0, bArr, 10);
        interfaceC1983k.q();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                i7 = 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i7 == 0) {
            return;
        }
        this.f24094b = true;
    }
}
