package A9;

import com.kt.apps.core.base.leanback.SearchOrbView;
import com.kt.apps.core.base.leanback.TitleView;

/* loaded from: classes2.dex */
public final class p3 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TitleView f1345a;

    public p3(TitleView titleView) {
        this.f1345a = titleView;
    }

    @Override // A9.r3
    public final void a(boolean z8) {
        SearchOrbView searchOrbView = this.f1345a.f16110c;
        searchOrbView.f16037A = z8 && searchOrbView.hasFocus();
        searchOrbView.b();
    }
}
