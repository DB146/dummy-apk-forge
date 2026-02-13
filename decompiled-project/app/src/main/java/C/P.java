package C;

import a0.AbstractC0688o;
import android.os.Build;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import q1.C1876b;
import u.C2047J;
import y1.C2361i;
import y1.p0;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f2369u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0216a f2370a = C0217b.b(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final C0216a f2371b;

    /* renamed from: c, reason: collision with root package name */
    public final C0216a f2372c;

    /* renamed from: d, reason: collision with root package name */
    public final C0216a f2373d;

    /* renamed from: e, reason: collision with root package name */
    public final C0216a f2374e;

    /* renamed from: f, reason: collision with root package name */
    public final C0216a f2375f;
    public final C0216a g;

    /* renamed from: h, reason: collision with root package name */
    public final C0216a f2376h;

    /* renamed from: i, reason: collision with root package name */
    public final C0216a f2377i;
    public final N j;
    public final N k;

    /* renamed from: l, reason: collision with root package name */
    public final N f2378l;

    /* renamed from: m, reason: collision with root package name */
    public final N f2379m;

    /* renamed from: n, reason: collision with root package name */
    public final N f2380n;

    /* renamed from: o, reason: collision with root package name */
    public final N f2381o;

    /* renamed from: p, reason: collision with root package name */
    public final N f2382p;

    /* renamed from: q, reason: collision with root package name */
    public final N f2383q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2384r;

    /* renamed from: s, reason: collision with root package name */
    public int f2385s;

    /* renamed from: t, reason: collision with root package name */
    public final A f2386t;

    public P(View view) {
        C0216a b2 = C0217b.b(128, "displayCutout");
        this.f2371b = b2;
        C0216a b10 = C0217b.b(8, "ime");
        this.f2372c = b10;
        C0216a b11 = C0217b.b(32, "mandatorySystemGestures");
        this.f2373d = b11;
        this.f2374e = C0217b.b(2, "navigationBars");
        this.f2375f = C0217b.b(1, "statusBars");
        C0216a b12 = C0217b.b(519, "systemBars");
        this.g = b12;
        C0216a b13 = C0217b.b(16, "systemGestures");
        this.f2376h = b13;
        C0216a b14 = C0217b.b(64, "tappableElement");
        this.f2377i = b14;
        N n6 = new N(q3.f.D(C1876b.f23340e), "waterfall");
        this.j = n6;
        new M(new M(b12, b10), b2);
        new M(new M(new M(b14, b11), b13), n6);
        this.k = C0217b.d(4, "captionBarIgnoringVisibility");
        this.f2378l = C0217b.d(2, "navigationBarsIgnoringVisibility");
        this.f2379m = C0217b.d(1, "statusBarsIgnoringVisibility");
        this.f2380n = C0217b.d(519, "systemBarsIgnoringVisibility");
        this.f2381o = C0217b.d(64, "tappableElementIgnoringVisibility");
        this.f2382p = C0217b.d(8, "imeAnimationTarget");
        this.f2383q = C0217b.d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f2384r = bool != null ? bool.booleanValue() : true;
        this.f2386t = new A(this);
    }

    public static void a(P p10, p0 p0Var) {
        boolean z8 = false;
        p10.f2370a.f(p0Var, 0);
        p10.f2372c.f(p0Var, 0);
        p10.f2371b.f(p0Var, 0);
        p10.f2374e.f(p0Var, 0);
        p10.f2375f.f(p0Var, 0);
        p10.g.f(p0Var, 0);
        p10.f2376h.f(p0Var, 0);
        p10.f2377i.f(p0Var, 0);
        p10.f2373d.f(p0Var, 0);
        p10.k.f(q3.f.D(p0Var.f26731a.h(4)));
        p10.f2378l.f(q3.f.D(p0Var.f26731a.h(2)));
        p10.f2379m.f(q3.f.D(p0Var.f26731a.h(1)));
        p10.f2380n.f(q3.f.D(p0Var.f26731a.h(519)));
        p10.f2381o.f(q3.f.D(p0Var.f26731a.h(64)));
        C2361i f4 = p0Var.f26731a.f();
        if (f4 != null) {
            p10.j.f(q3.f.D(Build.VERSION.SDK_INT >= 30 ? C1876b.c(D0.e.f(f4.f26714a)) : C1876b.f23340e));
        }
        synchronized (AbstractC0688o.f12405b) {
            C2047J c2047j = AbstractC0688o.f12411i.f12376h;
            if (c2047j != null) {
                if (c2047j.h()) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            AbstractC0688o.a();
        }
    }
}
