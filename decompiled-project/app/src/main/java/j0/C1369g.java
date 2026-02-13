package j0;

import android.graphics.PathMeasure;

/* renamed from: j0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369g {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f18542a;

    public C1369g(PathMeasure pathMeasure) {
        this.f18542a = pathMeasure;
    }

    public final void a(float f4, float f10, C1368f c1368f) {
        if (c1368f == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f18542a.getSegment(f4, f10, c1368f.f18539a, true);
    }
}
