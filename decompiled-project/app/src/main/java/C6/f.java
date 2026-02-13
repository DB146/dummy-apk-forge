package C6;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import y6.C2401g;

/* loaded from: classes.dex */
public final class f extends C2401g {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f2930M = 0;
    public e L;

    @Override // y6.C2401g
    public final void f(Canvas canvas) {
        if (this.L.f2929q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.L.f2929q);
        } else {
            canvas.clipRect(this.L.f2929q, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.L = new e(this.L);
        return this;
    }

    public final void o(float f4, float f10, float f11, float f12) {
        RectF rectF = this.L.f2929q;
        if (f4 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f4, f10, f11, f12);
        invalidateSelf();
    }
}
