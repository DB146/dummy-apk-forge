package o4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class P implements InterfaceC1802p {

    /* renamed from: b, reason: collision with root package name */
    public int f21798b;

    /* renamed from: c, reason: collision with root package name */
    public float f21799c;

    /* renamed from: d, reason: collision with root package name */
    public float f21800d;

    /* renamed from: e, reason: collision with root package name */
    public C1800n f21801e;

    /* renamed from: f, reason: collision with root package name */
    public C1800n f21802f;
    public C1800n g;

    /* renamed from: h, reason: collision with root package name */
    public C1800n f21803h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21804i;
    public O j;
    public ByteBuffer k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f21805l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f21806m;

    /* renamed from: n, reason: collision with root package name */
    public long f21807n;

    /* renamed from: o, reason: collision with root package name */
    public long f21808o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21809p;

    @Override // o4.InterfaceC1802p
    public final ByteBuffer a() {
        O o10 = this.j;
        if (o10 != null) {
            int i7 = o10.f21788m;
            int i10 = o10.f21780b;
            int i11 = i7 * i10 * 2;
            if (i11 > 0) {
                if (this.k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.f21805l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f21805l.clear();
                }
                ShortBuffer shortBuffer = this.f21805l;
                int min = Math.min(shortBuffer.remaining() / i10, o10.f21788m);
                int i12 = min * i10;
                shortBuffer.put(o10.f21787l, 0, i12);
                int i13 = o10.f21788m - min;
                o10.f21788m = i13;
                short[] sArr = o10.f21787l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f21808o += i11;
                this.k.limit(i11);
                this.f21806m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.f21806m;
        this.f21806m = InterfaceC1802p.f21871a;
        return byteBuffer;
    }

    @Override // o4.InterfaceC1802p
    public final C1800n b(C1800n c1800n) {
        if (c1800n.f21869c != 2) {
            throw new C1801o(c1800n);
        }
        int i7 = this.f21798b;
        if (i7 == -1) {
            i7 = c1800n.f21867a;
        }
        this.f21801e = c1800n;
        C1800n c1800n2 = new C1800n(i7, c1800n.f21868b, 2);
        this.f21802f = c1800n2;
        this.f21804i = true;
        return c1800n2;
    }

    @Override // o4.InterfaceC1802p
    public final void c() {
        O o10 = this.j;
        if (o10 != null) {
            int i7 = o10.k;
            float f4 = o10.f21781c;
            float f10 = o10.f21782d;
            int i10 = o10.f21788m + ((int) ((((i7 / (f4 / f10)) + o10.f21790o) / (o10.f21783e * f10)) + 0.5f));
            short[] sArr = o10.j;
            int i11 = o10.f21785h * 2;
            o10.j = o10.c(sArr, i7, i11 + i7);
            int i12 = 0;
            while (true) {
                int i13 = o10.f21780b;
                if (i12 >= i11 * i13) {
                    break;
                }
                o10.j[(i13 * i7) + i12] = 0;
                i12++;
            }
            o10.k = i11 + o10.k;
            o10.f();
            if (o10.f21788m > i10) {
                o10.f21788m = i10;
            }
            o10.k = 0;
            o10.f21793r = 0;
            o10.f21790o = 0;
        }
        this.f21809p = true;
    }

    @Override // o4.InterfaceC1802p
    public final boolean d() {
        O o10;
        return this.f21809p && ((o10 = this.j) == null || (o10.f21788m * o10.f21780b) * 2 == 0);
    }

    @Override // o4.InterfaceC1802p
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            O o10 = this.j;
            o10.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f21807n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i7 = o10.f21780b;
            int i10 = remaining2 / i7;
            short[] c10 = o10.c(o10.j, o10.k, i10);
            o10.j = c10;
            asShortBuffer.get(c10, o10.k * i7, ((i10 * i7) * 2) / 2);
            o10.k += i10;
            o10.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // o4.InterfaceC1802p
    public final void flush() {
        if (isActive()) {
            C1800n c1800n = this.f21801e;
            this.g = c1800n;
            C1800n c1800n2 = this.f21802f;
            this.f21803h = c1800n2;
            if (this.f21804i) {
                this.j = new O(c1800n.f21867a, c1800n.f21868b, this.f21799c, this.f21800d, c1800n2.f21867a);
            } else {
                O o10 = this.j;
                if (o10 != null) {
                    o10.k = 0;
                    o10.f21788m = 0;
                    o10.f21790o = 0;
                    o10.f21791p = 0;
                    o10.f21792q = 0;
                    o10.f21793r = 0;
                    o10.f21794s = 0;
                    o10.f21795t = 0;
                    o10.f21796u = 0;
                    o10.f21797v = 0;
                }
            }
        }
        this.f21806m = InterfaceC1802p.f21871a;
        this.f21807n = 0L;
        this.f21808o = 0L;
        this.f21809p = false;
    }

    @Override // o4.InterfaceC1802p
    public final boolean isActive() {
        return this.f21802f.f21867a != -1 && (Math.abs(this.f21799c - 1.0f) >= 1.0E-4f || Math.abs(this.f21800d - 1.0f) >= 1.0E-4f || this.f21802f.f21867a != this.f21801e.f21867a);
    }

    @Override // o4.InterfaceC1802p
    public final void reset() {
        this.f21799c = 1.0f;
        this.f21800d = 1.0f;
        C1800n c1800n = C1800n.f21866e;
        this.f21801e = c1800n;
        this.f21802f = c1800n;
        this.g = c1800n;
        this.f21803h = c1800n;
        ByteBuffer byteBuffer = InterfaceC1802p.f21871a;
        this.k = byteBuffer;
        this.f21805l = byteBuffer.asShortBuffer();
        this.f21806m = byteBuffer;
        this.f21798b = -1;
        this.f21804i = false;
        this.j = null;
        this.f21807n = 0L;
        this.f21808o = 0L;
        this.f21809p = false;
    }
}
