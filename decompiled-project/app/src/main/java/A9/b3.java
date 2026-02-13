package A9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class b3 extends FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final Rect f1065v = new Rect();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1066a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1067b;

    /* renamed from: c, reason: collision with root package name */
    public View f1068c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1069d;

    /* renamed from: e, reason: collision with root package name */
    public int f1070e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f1071f;

    /* renamed from: u, reason: collision with root package name */
    public int f1072u;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1071f == null || this.f1072u == 0) {
            return;
        }
        canvas.drawRect(this.f1068c.getLeft(), this.f1068c.getTop(), this.f1068c.getRight(), this.f1068c.getBottom(), this.f1071f);
    }

    public int getShadowType() {
        return this.f1070e;
    }

    public View getWrappedView() {
        return this.f1068c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        View view;
        super.onLayout(z8, i7, i10, i11, i12);
        if (!z8 || (view = this.f1068c) == null) {
            return;
        }
        int pivotX = (int) view.getPivotX();
        Rect rect = f1065v;
        rect.left = pivotX;
        rect.top = (int) this.f1068c.getPivotY();
        offsetDescendantRectToMyCoords(this.f1068c, rect);
        setPivotX(rect.left);
        setPivotY(rect.top);
    }

    public void setOverlayColor(int i7) {
        Paint paint = this.f1071f;
        if (paint == null || i7 == this.f1072u) {
            return;
        }
        this.f1072u = i7;
        paint.setColor(i7);
        invalidate();
    }

    public void setShadowFocusLevel(float f4) {
        Object obj = this.f1067b;
        if (obj != null) {
            e3.b(obj, this.f1070e, f4);
        }
    }
}
