package J3;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class B implements C3.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5449a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5450b;

    public B(File file) {
        this.f5449a = 3;
        W3.g.c(file, "Argument must not be null");
        this.f5450b = file;
    }

    public /* synthetic */ B(Object obj, int i7) {
        this.f5449a = i7;
        this.f5450b = obj;
    }

    public B(byte[] bArr) {
        this.f5449a = 1;
        W3.g.c(bArr, "Argument must not be null");
        this.f5450b = bArr;
    }

    private final void a() {
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // C3.A
    public final int b() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.f5449a) {
            case 0:
                return W3.o.c((Bitmap) this.f5450b);
            case 1:
                return ((byte[]) this.f5450b).length;
            case 2:
                intrinsicWidth = ((AnimatedImageDrawable) this.f5450b).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.f5450b).getIntrinsicHeight();
                return W3.o.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            default:
                return 1;
        }
    }

    @Override // C3.A
    public final Class c() {
        switch (this.f5449a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f5450b).getClass();
        }
    }

    @Override // C3.A
    public final void d() {
        switch (this.f5449a) {
            case 0:
            case 1:
                return;
            case 2:
                ((AnimatedImageDrawable) this.f5450b).stop();
                ((AnimatedImageDrawable) this.f5450b).clearAnimationCallbacks();
                return;
            default:
                return;
        }
    }

    @Override // C3.A
    public final Object get() {
        switch (this.f5449a) {
            case 0:
                return (Bitmap) this.f5450b;
            case 1:
                return (byte[]) this.f5450b;
            case 2:
                return (AnimatedImageDrawable) this.f5450b;
            default:
                return (File) this.f5450b;
        }
    }
}
