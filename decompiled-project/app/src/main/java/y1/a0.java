package y1;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public Z f26678a;

    public a0(int i7, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f26678a = new Y(v7.w.k(i7, interpolator, j));
        } else {
            this.f26678a = new Z(i7, interpolator, j);
        }
    }
}
