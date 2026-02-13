package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import ea.C1108c;
import h3.H;
import java.util.WeakHashMap;
import y1.AbstractC2377z;
import y1.K;

/* loaded from: classes.dex */
public final class E extends H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f17995c;

    public /* synthetic */ E(G g, int i7) {
        this.f17994b = i7;
        this.f17995c = g;
    }

    @Override // y1.T
    public final void a() {
        View view;
        G g = this.f17995c;
        switch (this.f17994b) {
            case 0:
                if (g.f18015r && (view = g.j) != null) {
                    view.setTranslationY(0.0f);
                    g.g.setTranslationY(0.0f);
                }
                g.g.setVisibility(8);
                g.g.setTransitioning(false);
                g.f18019v = null;
                C1108c c1108c = g.f18011n;
                if (c1108c != null) {
                    c1108c.h(g.f18010m);
                    g.f18010m = null;
                    g.f18011n = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = g.f18006f;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = K.f26642a;
                    AbstractC2377z.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                g.f18019v = null;
                g.g.requestLayout();
                return;
        }
    }
}
