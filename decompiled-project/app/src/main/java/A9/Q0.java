package A9;

import android.view.View;
import com.kt.apps.core.base.leanback.SearchBar;
import com.kt.apps.core.base.leanback.VerticalGridView;

/* loaded from: classes2.dex */
public final class Q0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f939b;

    public /* synthetic */ Q0(Object obj, int i7) {
        this.f938a = i7;
        this.f939b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0088g1 c0088g1;
        switch (this.f938a) {
            case 0:
                if (view == null || view.getWindowToken() == null) {
                    return;
                }
                V0 v02 = (V0) this.f939b;
                VerticalGridView verticalGridView = v02.f977d;
                if (verticalGridView.f13625H) {
                    C0080e1 c0080e1 = (C0080e1) verticalGridView.L(view);
                    P0 p02 = c0080e1.f1118u;
                    p02.getClass();
                    c0080e1.f1118u.getClass();
                    boolean z8 = v02.f977d.f13625H;
                    if (!p02.a() || (p02.f929f & 8) == 8 || (c0088g1 = v02.k) == null) {
                        return;
                    }
                    c0088g1.a(c0080e1.f1118u);
                    return;
                }
                return;
            case 1:
                C0101j2 c0101j2 = (C0101j2) this.f939b;
                c0101j2.f1248K.getClass();
                if (c0101j2 != null) {
                    if (c0101j2.f1244G == null) {
                        c0101j2.f1244G = new Y1(c0101j2.f1271a.getContext());
                    }
                    InterfaceC0149w interfaceC0149w = c0101j2.f1467n;
                    if (interfaceC0149w != null) {
                        interfaceC0149w.b(c0101j2, c0101j2.f1244G, c0101j2, c0101j2.f1460d);
                        return;
                    }
                    return;
                }
                return;
            default:
                SearchBar searchBar = (SearchBar) this.f939b;
                if (searchBar.f16022J) {
                    searchBar.b();
                    return;
                } else {
                    searchBar.a();
                    return;
                }
        }
    }
}
