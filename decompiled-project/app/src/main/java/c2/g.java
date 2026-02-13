package c2;

import W1.G;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g extends LayerDrawable {

    /* renamed from: a, reason: collision with root package name */
    public A7.a[] f14142a;

    /* renamed from: b, reason: collision with root package name */
    public int f14143b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14144c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f14145d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [c2.e, android.graphics.drawable.Drawable] */
    public final void a(int i7, G g) {
        for (int i10 = 0; i10 < getNumberOfLayers(); i10++) {
            if (getId(i10) == i7) {
                this.f14142a[i10] = null;
                if (getDrawable(i10) instanceof f) {
                    return;
                }
                g.getResources();
                ?? drawable = new Drawable();
                drawable.f14140a = new d();
                super.setDrawableByLayerId(i7, drawable);
                return;
            }
        }
    }

    public final A7.a b(int i7, Drawable drawable) {
        super.setDrawableByLayerId(i7, drawable);
        for (int i10 = 0; i10 < getNumberOfLayers(); i10++) {
            if (getId(i10) == i7) {
                A7.a aVar = new A7.a(drawable);
                A7.a[] aVarArr = this.f14142a;
                aVarArr[i10] = aVar;
                invalidateSelf();
                return aVarArr[i10];
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i7;
        int i10;
        int i11 = 0;
        while (true) {
            A7.a[] aVarArr = this.f14142a;
            if (i11 >= aVarArr.length) {
                return;
            }
            A7.a aVar = aVarArr[i11];
            if (aVar != null && (drawable = (Drawable) aVar.f532b) != null) {
                int alpha = drawable.getAlpha();
                int i12 = this.f14143b;
                if (i12 < 255) {
                    i10 = i12 * alpha;
                    i7 = 1;
                } else {
                    i7 = 0;
                    i10 = alpha;
                }
                int i13 = aVarArr[i11].f531a;
                if (i13 < 255) {
                    i10 *= i13;
                    i7++;
                }
                if (i7 == 0) {
                    drawable.draw(canvas);
                } else {
                    if (i7 == 1) {
                        i10 /= 255;
                    } else if (i7 == 2) {
                        i10 /= 65025;
                    }
                    try {
                        this.f14144c = true;
                        drawable.setAlpha(i10);
                        drawable.draw(canvas);
                        drawable.setAlpha(alpha);
                    } finally {
                        this.f14144c = false;
                    }
                }
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f14143b;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.f14144c) {
            return;
        }
        super.invalidateDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [A7.a, java.lang.Object] */
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable mutate = super.mutate();
        int numberOfLayers = getNumberOfLayers();
        for (int i7 = 0; i7 < numberOfLayers; i7++) {
            A7.a[] aVarArr = this.f14142a;
            A7.a aVar = aVarArr[i7];
            if (aVar != 0) {
                Drawable drawable = getDrawable(i7);
                ?? obj = new Object();
                obj.f531a = 255;
                obj.f532b = drawable;
                obj.f531a = aVar.f531a;
                aVarArr[i7] = obj;
            }
        }
        return mutate;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f14143b != i7) {
            this.f14143b = i7;
            invalidateSelf();
            h hVar = (h) this.f14145d.get();
            if (hVar != null) {
                hVar.d();
            }
        }
    }

    @Override // android.graphics.drawable.LayerDrawable
    public final boolean setDrawableByLayerId(int i7, Drawable drawable) {
        return b(i7, drawable) != null;
    }
}
