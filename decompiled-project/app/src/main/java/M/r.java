package M;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes.dex */
public final class r extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6521a;

    /* renamed from: b, reason: collision with root package name */
    public j0.n f6522b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f6523c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6524d;

    public r(boolean z8) {
        super(ColorStateList.valueOf(-16777216), null, z8 ? new ColorDrawable(-1) : null);
        this.f6521a = z8;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f6521a) {
            this.f6524d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f6524d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f6524d;
    }
}
