package d2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.IntProperty;

/* loaded from: classes.dex */
public final class g extends Drawable {

    /* renamed from: d, reason: collision with root package name */
    public static final e f16503d = new IntProperty("verticalOffset");

    /* renamed from: a, reason: collision with root package name */
    public final Rect f16504a;

    /* renamed from: b, reason: collision with root package name */
    public f f16505b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16506c;

    public g() {
        this.f16504a = new Rect();
        this.f16506c = false;
        this.f16505b = new f();
    }

    public g(f fVar) {
        this.f16504a = new Rect();
        this.f16506c = false;
        this.f16505b = fVar;
    }

    public final void a(Bitmap bitmap) {
        f fVar = this.f16505b;
        fVar.f16499b = bitmap;
        if (bitmap != null) {
            fVar.f16501d.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            fVar.f16501d.set(0, 0, 0, 0);
        }
        this.f16505b.f16500c = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f16505b.f16499b != null) {
            Rect bounds = getBounds();
            Rect rect = this.f16504a;
            rect.left = 0;
            rect.top = this.f16505b.f16502e;
            rect.right = bounds.width();
            f fVar = this.f16505b;
            Rect rect2 = fVar.f16500c;
            if (rect2 == null) {
                rect2 = fVar.f16501d;
            }
            rect.bottom = rect.top + ((int) (rect2.height() * (bounds.width() / rect2.width())));
            int save = canvas.save();
            canvas.clipRect(bounds);
            f fVar2 = this.f16505b;
            canvas.drawBitmap(fVar2.f16499b, rect2, rect, fVar2.f16498a);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16505b.f16498a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f16505b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap = this.f16505b.f16499b;
        return (bitmap == null || bitmap.hasAlpha() || this.f16505b.f16498a.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f16506c && super.mutate() == this) {
            this.f16505b = new f(this.f16505b);
            this.f16506c = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (i7 != this.f16505b.f16498a.getAlpha()) {
            this.f16505b.f16498a.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16505b.f16498a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
