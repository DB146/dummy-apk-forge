package rc;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23931a;

    /* renamed from: b, reason: collision with root package name */
    public int f23932b;

    /* renamed from: c, reason: collision with root package name */
    public int f23933c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23934d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23935e;

    /* renamed from: f, reason: collision with root package name */
    public D f23936f;
    public D g;

    public D() {
        this.f23931a = new byte[8192];
        this.f23935e = true;
        this.f23934d = false;
    }

    public D(byte[] data, int i7, int i10, boolean z8, boolean z10) {
        kotlin.jvm.internal.l.e(data, "data");
        this.f23931a = data;
        this.f23932b = i7;
        this.f23933c = i10;
        this.f23934d = z8;
        this.f23935e = z10;
    }

    public final D a() {
        D d10 = this.f23936f;
        if (d10 == this) {
            d10 = null;
        }
        D d11 = this.g;
        kotlin.jvm.internal.l.b(d11);
        d11.f23936f = this.f23936f;
        D d12 = this.f23936f;
        kotlin.jvm.internal.l.b(d12);
        d12.g = this.g;
        this.f23936f = null;
        this.g = null;
        return d10;
    }

    public final void b(D segment) {
        kotlin.jvm.internal.l.e(segment, "segment");
        segment.g = this;
        segment.f23936f = this.f23936f;
        D d10 = this.f23936f;
        kotlin.jvm.internal.l.b(d10);
        d10.g = segment;
        this.f23936f = segment;
    }

    public final D c() {
        this.f23934d = true;
        return new D(this.f23931a, this.f23932b, this.f23933c, true, false);
    }

    public final void d(D sink, int i7) {
        kotlin.jvm.internal.l.e(sink, "sink");
        if (!sink.f23935e) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.f23933c;
        int i11 = i10 + i7;
        byte[] bArr = sink.f23931a;
        if (i11 > 8192) {
            if (sink.f23934d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f23932b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            Eb.n.N(bArr, 0, bArr, i12, i10);
            sink.f23933c -= sink.f23932b;
            sink.f23932b = 0;
        }
        int i13 = sink.f23933c;
        int i14 = this.f23932b;
        Eb.n.N(this.f23931a, i13, bArr, i14, i14 + i7);
        sink.f23933c += i7;
        this.f23932b += i7;
    }
}
