package y;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: y.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2283E extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f26401a;

    /* renamed from: b, reason: collision with root package name */
    public float f26402b;

    public C2283E(Context context) {
        super(context);
        this.f26401a = Q5.e.b(context).f9970a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i7) {
        this.f26402b = 0.0f;
        super.onAbsorb(i7);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f4) {
        this.f26402b = 0.0f;
        super.onPull(f4);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f4, float f10) {
        this.f26402b = 0.0f;
        super.onPull(f4, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f26402b = 0.0f;
        super.onRelease();
    }
}
