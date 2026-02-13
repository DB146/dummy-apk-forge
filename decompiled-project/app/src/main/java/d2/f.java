package d2;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f16498a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f16499b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f16500c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16501d;

    /* renamed from: e, reason: collision with root package name */
    public int f16502e;

    public f() {
        this.f16501d = new Rect();
        this.f16498a = new Paint();
    }

    public f(f fVar) {
        Rect rect = new Rect();
        this.f16501d = rect;
        this.f16499b = fVar.f16499b;
        this.f16498a = new Paint(fVar.f16498a);
        this.f16500c = fVar.f16500c != null ? new Rect(fVar.f16500c) : null;
        rect.set(fVar.f16501d);
        this.f16502e = fVar.f16502e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new g(this);
    }
}
