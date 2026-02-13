package C6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import y6.C2400f;
import y6.C2401g;
import y6.C2404j;

/* loaded from: classes.dex */
public final class e extends C2400f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f2929q;

    public e(e eVar) {
        super(eVar);
        this.f2929q = eVar.f2929q;
    }

    public e(C2404j c2404j, RectF rectF) {
        super(c2404j);
        this.f2929q = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y6.g, C6.f, android.graphics.drawable.Drawable] */
    @Override // y6.C2400f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? c2401g = new C2401g(this);
        c2401g.L = this;
        c2401g.invalidateSelf();
        return c2401g;
    }
}
