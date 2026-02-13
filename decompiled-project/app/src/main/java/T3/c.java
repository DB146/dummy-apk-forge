package T3;

import W3.o;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f9220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9221b;

    /* renamed from: c, reason: collision with root package name */
    public S3.c f9222c;

    public c() {
        if (!o.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f9220a = Integer.MIN_VALUE;
        this.f9221b = Integer.MIN_VALUE;
    }

    @Override // T3.i
    public final void a(S3.c cVar) {
        this.f9222c = cVar;
    }

    @Override // T3.i
    public final void b(Drawable drawable) {
    }

    @Override // P3.i
    public final void c() {
    }

    @Override // T3.i
    public final void d(S3.g gVar) {
    }

    @Override // T3.i
    public final void e(Drawable drawable) {
    }

    @Override // T3.i
    public final void f(S3.g gVar) {
        gVar.m(this.f9220a, this.f9221b);
    }

    @Override // T3.i
    public final S3.c g() {
        return this.f9222c;
    }

    @Override // P3.i
    public final void j() {
    }

    @Override // P3.i
    public final void k() {
    }
}
