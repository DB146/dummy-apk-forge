package y1;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: y1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2370s {

    /* renamed from: a, reason: collision with root package name */
    public final r f26734a;

    public C2370s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f26734a = new C2369q(nestedScrollView);
        } else {
            this.f26734a = new Y5.A(19);
        }
    }
}
