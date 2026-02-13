package i6;

import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0807j;
import d6.AbstractC1053a;
import ea.C1108c;
import java.util.Iterator;
import java.util.List;
import y1.a0;
import y1.p0;

/* loaded from: classes.dex */
public final class j extends AbstractC0807j {

    /* renamed from: c, reason: collision with root package name */
    public final View f18459c;

    /* renamed from: d, reason: collision with root package name */
    public int f18460d;

    /* renamed from: e, reason: collision with root package name */
    public int f18461e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f18462f;

    public j(View view) {
        super(0);
        this.f18462f = new int[2];
        this.f18459c = view;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void d(a0 a0Var) {
        this.f18459c.setTranslationY(0.0f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void e() {
        View view = this.f18459c;
        int[] iArr = this.f18462f;
        view.getLocationOnScreen(iArr);
        this.f18460d = iArr[1];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final p0 f(p0 p0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((a0) it.next()).f26678a.c() & 8) != 0) {
                this.f18459c.setTranslationY(AbstractC1053a.c(r0.f26678a.b(), this.f18461e, 0));
                break;
            }
        }
        return p0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final C1108c g(C1108c c1108c) {
        View view = this.f18459c;
        int[] iArr = this.f18462f;
        view.getLocationOnScreen(iArr);
        int i7 = this.f18460d - iArr[1];
        this.f18461e = i7;
        view.setTranslationY(i7);
        return c1108c;
    }
}
