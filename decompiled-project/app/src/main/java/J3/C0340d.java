package J3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: J3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340d implements C3.A, C3.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5467a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5468b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5469c;

    public C0340d(D3.a aVar, Bitmap bitmap) {
        W3.g.c(bitmap, "Bitmap must not be null");
        this.f5468b = bitmap;
        W3.g.c(aVar, "BitmapPool must not be null");
        this.f5469c = aVar;
    }

    public C0340d(Resources resources, C3.A a9) {
        W3.g.c(resources, "Argument must not be null");
        this.f5468b = resources;
        W3.g.c(a9, "Argument must not be null");
        this.f5469c = a9;
    }

    public static C0340d e(D3.a aVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0340d(aVar, bitmap);
    }

    @Override // C3.w
    public final void a() {
        switch (this.f5467a) {
            case 0:
                ((Bitmap) this.f5468b).prepareToDraw();
                return;
            default:
                C3.A a9 = (C3.A) this.f5469c;
                if (a9 instanceof C3.w) {
                    ((C3.w) a9).a();
                    return;
                }
                return;
        }
    }

    @Override // C3.A
    public final int b() {
        switch (this.f5467a) {
            case 0:
                return W3.o.c((Bitmap) this.f5468b);
            default:
                return ((C3.A) this.f5469c).b();
        }
    }

    @Override // C3.A
    public final Class c() {
        switch (this.f5467a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // C3.A
    public final void d() {
        switch (this.f5467a) {
            case 0:
                ((D3.a) this.f5469c).g((Bitmap) this.f5468b);
                return;
            default:
                ((C3.A) this.f5469c).d();
                return;
        }
    }

    @Override // C3.A
    public final Object get() {
        switch (this.f5467a) {
            case 0:
                return (Bitmap) this.f5468b;
            default:
                return new BitmapDrawable((Resources) this.f5468b, (Bitmap) ((C3.A) this.f5469c).get());
        }
    }
}
