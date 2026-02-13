package com.kt.apps.media.xemtv.ui_mobile;

import A9.C0163z1;
import A9.O0;
import B0.C0205u0;
import Ba.j;
import Db.o;
import E9.h;
import Ea.c;
import Ea.d;
import Ea.e;
import Ea.k;
import O9.a;
import a.AbstractC0672a;
import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.b;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.AbstractC0869m;
import c.C0855C;
import c.C0856D;
import d.AbstractC1032a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.Q;

/* loaded from: classes2.dex */
public final class MobileMainActivity extends c {

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ int f16227S = 0;

    /* renamed from: M, reason: collision with root package name */
    public a f16228M;

    /* renamed from: N, reason: collision with root package name */
    public h f16229N;

    /* renamed from: O, reason: collision with root package name */
    public final O0 f16230O = new O0(w.a(ta.c.class), new k(this, 1), new k(this, 0), new k(this, 2));

    /* renamed from: P, reason: collision with root package name */
    public final o f16231P;

    /* renamed from: Q, reason: collision with root package name */
    public final o f16232Q;

    /* renamed from: R, reason: collision with root package name */
    public final o f16233R;

    public MobileMainActivity() {
        w.a(wa.h.class);
        this.f16231P = b.z(new C0163z1(19));
        b.z(new C0163z1(20));
        this.f16232Q = b.z(new C0163z1(21));
        this.f16233R = b.z(new e(this, 0));
    }

    public final h k() {
        h hVar = this.f16229N;
        if (hVar != null) {
            return hVar;
        }
        l.j("exoPlayerManager");
        throw null;
    }

    public final ta.c l() {
        return (ta.c) this.f16230O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Ea.c, l2.x, c.k, l2.e0, com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity, android.app.Activity, Q2.e] */
    /* JADX WARN: Type inference failed for: r11v13, types: [a.a] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    @Override // Ea.c, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l().getListTVChannel(true);
        l().getTvWithLinkStreamLiveData().e(this, new j(new d(this, 0), 4));
        int i7 = AbstractC0869m.f14062a;
        C0855C c0855c = C0855C.f14013a;
        C0856D c0856d = new C0856D(0, 0, c0855c);
        C0856D c0856d2 = new C0856D(AbstractC0869m.f14062a, AbstractC0869m.f14063b, c0855c);
        View decorView = getWindow().getDecorView();
        l.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        l.d(resources, "view.resources");
        boolean booleanValue = ((Boolean) c0855c.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        l.d(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) c0855c.invoke(resources2)).booleanValue();
        int i10 = Build.VERSION.SDK_INT;
        AbstractC0672a obj = i10 >= 30 ? new Object() : i10 >= 29 ? new Object() : i10 >= 28 ? new Object() : i10 >= 26 ? new Object() : new Object();
        Window window = getWindow();
        l.d(window, "window");
        obj.q(c0856d, c0856d2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        l.d(window2, "window");
        obj.d(window2);
        Y.e eVar = new Y.e(1145938529, new Ea.j(this), true);
        ViewGroup.LayoutParams layoutParams = AbstractC1032a.f16281a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0205u0 c0205u0 = childAt instanceof C0205u0 ? (C0205u0) childAt : null;
        if (c0205u0 != null) {
            c0205u0.setParentCompositionContext(null);
            c0205u0.setContent(eVar);
            return;
        }
        C0205u0 c0205u02 = new C0205u0(this);
        c0205u02.setParentCompositionContext(null);
        c0205u02.setContent(eVar);
        View decorView2 = getWindow().getDecorView();
        if (Q.d(decorView2) == null) {
            Q.i(decorView2, this);
        }
        if (Q.e(decorView2) == null) {
            Q.j(decorView2, this);
        }
        if (b.n(decorView2) == null) {
            b.C(decorView2, this);
        }
        setContentView(c0205u02, AbstractC1032a.f16281a);
    }
}
