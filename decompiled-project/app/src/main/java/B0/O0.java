package B0;

import android.graphics.Outline;
import j0.C1368f;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final O0 f1768a = new Object();

    public final void a(Outline outline, j0.z zVar) {
        if (!(zVar instanceof C1368f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C1368f) zVar).f18539a);
    }
}
