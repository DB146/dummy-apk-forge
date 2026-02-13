package c2;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f14138a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f14139b;

    public d() {
        Paint paint = new Paint();
        this.f14139b = paint;
        this.f14138a = new Matrix();
        paint.setFilterBitmap(true);
    }

    public d(d dVar) {
        Paint paint = new Paint();
        this.f14139b = paint;
        dVar.getClass();
        this.f14138a = dVar.f14138a != null ? new Matrix(dVar.f14138a) : new Matrix();
        if (dVar.f14139b.getAlpha() != 255) {
            paint.setAlpha(dVar.f14139b.getAlpha());
        }
        if (dVar.f14139b.getColorFilter() != null) {
            paint.setColorFilter(dVar.f14139b.getColorFilter());
        }
        paint.setFilterBitmap(true);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c2.e, android.graphics.drawable.Drawable] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? drawable = new Drawable();
        drawable.f14140a = this;
        return drawable;
    }
}
