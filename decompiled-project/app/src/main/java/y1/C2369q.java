package y1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: y1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2369q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f26732a;

    public C2369q(NestedScrollView nestedScrollView) {
        this.f26732a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // y1.r
    public final void a(int i7, int i10, int i11, boolean z8) {
        this.f26732a.onScrollLimit(i7, i10, i11, z8);
    }

    @Override // y1.r
    public final void p(int i7, int i10, int i11, int i12) {
        this.f26732a.onScrollProgress(i7, i10, i11, i12);
    }
}
