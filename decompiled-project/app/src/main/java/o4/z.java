package o4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class z implements InterfaceC1802p {

    /* renamed from: b, reason: collision with root package name */
    public C1800n f21921b;

    /* renamed from: c, reason: collision with root package name */
    public C1800n f21922c;

    /* renamed from: d, reason: collision with root package name */
    public C1800n f21923d;

    /* renamed from: e, reason: collision with root package name */
    public C1800n f21924e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f21925f;
    public ByteBuffer g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21926h;

    public z() {
        ByteBuffer byteBuffer = InterfaceC1802p.f21871a;
        this.f21925f = byteBuffer;
        this.g = byteBuffer;
        C1800n c1800n = C1800n.f21866e;
        this.f21923d = c1800n;
        this.f21924e = c1800n;
        this.f21921b = c1800n;
        this.f21922c = c1800n;
    }

    @Override // o4.InterfaceC1802p
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = InterfaceC1802p.f21871a;
        return byteBuffer;
    }

    @Override // o4.InterfaceC1802p
    public final C1800n b(C1800n c1800n) {
        this.f21923d = c1800n;
        this.f21924e = f(c1800n);
        return isActive() ? this.f21924e : C1800n.f21866e;
    }

    @Override // o4.InterfaceC1802p
    public final void c() {
        this.f21926h = true;
        h();
    }

    @Override // o4.InterfaceC1802p
    public boolean d() {
        return this.f21926h && this.g == InterfaceC1802p.f21871a;
    }

    public abstract C1800n f(C1800n c1800n);

    @Override // o4.InterfaceC1802p
    public final void flush() {
        this.g = InterfaceC1802p.f21871a;
        this.f21926h = false;
        this.f21921b = this.f21923d;
        this.f21922c = this.f21924e;
        g();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // o4.InterfaceC1802p
    public boolean isActive() {
        return this.f21924e != C1800n.f21866e;
    }

    public final ByteBuffer j(int i7) {
        if (this.f21925f.capacity() < i7) {
            this.f21925f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f21925f.clear();
        }
        ByteBuffer byteBuffer = this.f21925f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // o4.InterfaceC1802p
    public final void reset() {
        flush();
        this.f21925f = InterfaceC1802p.f21871a;
        C1800n c1800n = C1800n.f21866e;
        this.f21923d = c1800n;
        this.f21924e = c1800n;
        this.f21921b = c1800n;
        this.f21922c = c1800n;
        i();
    }
}
