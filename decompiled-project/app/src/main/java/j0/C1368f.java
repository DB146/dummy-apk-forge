package j0;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: j0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368f implements z {

    /* renamed from: a, reason: collision with root package name */
    public final Path f18539a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f18540b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f18541c;

    public C1368f(Path path) {
        this.f18539a = path;
    }

    public final void b() {
        this.f18539a.reset();
    }

    public final void c(int i7) {
        this.f18539a.setFillType(i7 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
