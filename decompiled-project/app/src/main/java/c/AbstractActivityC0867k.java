package c;

import A9.N2;
import B0.C0215z0;
import W1.E;
import W1.L;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.kt.apps.media.xemtv.beta.R;
import e.InterfaceC1073a;
import f.C1124h;
import f.InterfaceC1118b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1470n;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;
import l2.K;
import l2.M;
import l2.Q;
import l2.X;
import l2.Z;
import l2.a0;
import l2.d0;
import l2.e0;
import x1.InterfaceC2257a;

/* renamed from: c.k */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0867k extends k1.h implements e0, InterfaceC1470n, Q2.e, InterfaceC0854B {

    /* renamed from: H */
    public static final /* synthetic */ int f14040H = 0;

    /* renamed from: A */
    public final CopyOnWriteArrayList f14041A;

    /* renamed from: B */
    public final CopyOnWriteArrayList f14042B;

    /* renamed from: C */
    public final CopyOnWriteArrayList f14043C;

    /* renamed from: D */
    public boolean f14044D;

    /* renamed from: E */
    public boolean f14045E;

    /* renamed from: F */
    public final Db.o f14046F;

    /* renamed from: G */
    public final Db.o f14047G;

    /* renamed from: b */
    public final F5.i f14048b = new F5.i();

    /* renamed from: c */
    public final X f14049c = new X(new RunnableC0859c(this, 0));

    /* renamed from: d */
    public final q3.c f14050d;

    /* renamed from: e */
    public d0 f14051e;

    /* renamed from: f */
    public final ViewTreeObserverOnDrawListenerC0864h f14052f;

    /* renamed from: u */
    public final Db.o f14053u;

    /* renamed from: v */
    public final AtomicInteger f14054v;

    /* renamed from: w */
    public final C0865i f14055w;

    /* renamed from: x */
    public final CopyOnWriteArrayList f14056x;

    /* renamed from: y */
    public final CopyOnWriteArrayList f14057y;

    /* renamed from: z */
    public final CopyOnWriteArrayList f14058z;

    public AbstractActivityC0867k() {
        q3.c cVar = new q3.c(new S2.b(this, new N2(this, 15)));
        this.f14050d = cVar;
        this.f14052f = new ViewTreeObserverOnDrawListenerC0864h(this);
        this.f14053u = android.support.v4.media.session.b.z(new C0866j(this, 2));
        this.f14054v = new AtomicInteger();
        this.f14055w = new C0865i(this);
        this.f14056x = new CopyOnWriteArrayList();
        this.f14057y = new CopyOnWriteArrayList();
        this.f14058z = new CopyOnWriteArrayList();
        this.f14041A = new CopyOnWriteArrayList();
        this.f14042B = new CopyOnWriteArrayList();
        this.f14043C = new CopyOnWriteArrayList();
        C1481z c1481z = this.f18773a;
        if (c1481z == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i7 = 0;
        c1481z.a(new InterfaceC1477v(this) { // from class: c.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0867k f14023b;

            {
                this.f14023b = this;
            }

            @Override // l2.InterfaceC1477v
            public final void onStateChanged(InterfaceC1479x interfaceC1479x, l2.r rVar) {
                Window window;
                View peekDecorView;
                switch (i7) {
                    case 0:
                        if (rVar != l2.r.ON_STOP || (window = this.f14023b.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    default:
                        AbstractActivityC0867k abstractActivityC0867k = this.f14023b;
                        if (rVar == l2.r.ON_DESTROY) {
                            abstractActivityC0867k.f14048b.f4108b = null;
                            if (!abstractActivityC0867k.isChangingConfigurations()) {
                                abstractActivityC0867k.s().a();
                            }
                            ViewTreeObserverOnDrawListenerC0864h viewTreeObserverOnDrawListenerC0864h = abstractActivityC0867k.f14052f;
                            AbstractActivityC0867k abstractActivityC0867k2 = viewTreeObserverOnDrawListenerC0864h.f14030d;
                            abstractActivityC0867k2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0864h);
                            abstractActivityC0867k2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0864h);
                            return;
                        }
                        return;
                }
            }
        });
        final int i10 = 1;
        this.f18773a.a(new InterfaceC1477v(this) { // from class: c.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0867k f14023b;

            {
                this.f14023b = this;
            }

            @Override // l2.InterfaceC1477v
            public final void onStateChanged(InterfaceC1479x interfaceC1479x, l2.r rVar) {
                Window window;
                View peekDecorView;
                switch (i10) {
                    case 0:
                        if (rVar != l2.r.ON_STOP || (window = this.f14023b.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    default:
                        AbstractActivityC0867k abstractActivityC0867k = this.f14023b;
                        if (rVar == l2.r.ON_DESTROY) {
                            abstractActivityC0867k.f14048b.f4108b = null;
                            if (!abstractActivityC0867k.isChangingConfigurations()) {
                                abstractActivityC0867k.s().a();
                            }
                            ViewTreeObserverOnDrawListenerC0864h viewTreeObserverOnDrawListenerC0864h = abstractActivityC0867k.f14052f;
                            AbstractActivityC0867k abstractActivityC0867k2 = viewTreeObserverOnDrawListenerC0864h.f14030d;
                            abstractActivityC0867k2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0864h);
                            abstractActivityC0867k2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0864h);
                            return;
                        }
                        return;
                }
            }
        });
        this.f18773a.a(new Q2.b(this, 3));
        cVar.v();
        Q.c(this);
        ((q3.s) cVar.f23372c).D("android:support:activity-result", new C0215z0(this, 3));
        g(new E(this, 1));
        this.f14046F = android.support.v4.media.session.b.z(new C0866j(this, 0));
        this.f14047G = android.support.v4.media.session.b.z(new C0866j(this, 3));
    }

    @Override // c.InterfaceC0854B
    public final C0853A a() {
        return (C0853A) this.f14047G.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        this.f14052f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // Q2.e
    public final q3.s b() {
        return (q3.s) this.f14050d.f23372c;
    }

    public final void f(InterfaceC2257a listener) {
        kotlin.jvm.internal.l.e(listener, "listener");
        this.f14056x.add(listener);
    }

    public final void g(InterfaceC1073a interfaceC1073a) {
        F5.i iVar = this.f14048b;
        iVar.getClass();
        AbstractActivityC0867k abstractActivityC0867k = (AbstractActivityC0867k) iVar.f4108b;
        if (abstractActivityC0867k != null) {
            interfaceC1073a.a(abstractActivityC0867k);
        }
        ((CopyOnWriteArraySet) iVar.f4107a).add(interfaceC1073a);
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        Q.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView2, "window.decorView");
        Q.j(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView3, "window.decorView");
        android.support.v4.media.session.b.C(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final C1124h i(com.bumptech.glide.c cVar, InterfaceC1118b interfaceC1118b) {
        C0865i registry = this.f14055w;
        kotlin.jvm.internal.l.e(registry, "registry");
        return registry.d("activity_rq#" + this.f14054v.getAndIncrement(), this, cVar, interfaceC1118b);
    }

    public a0 n() {
        return (a0) this.f14046F.getValue();
    }

    @Override // l2.InterfaceC1470n
    public final o2.d o() {
        o2.d dVar = new o2.d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f21663a;
        if (application != null) {
            Y5.B b2 = Z.f19198d;
            Application application2 = getApplication();
            kotlin.jvm.internal.l.d(application2, "application");
            linkedHashMap.put(b2, application2);
        }
        linkedHashMap.put(Q.f19174a, this);
        linkedHashMap.put(Q.f19175b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(Q.f19176c, extras);
        }
        return dVar;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        if (this.f14055w.a(i7, i10, intent)) {
            return;
        }
        super.onActivityResult(i7, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.l.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f14056x.iterator();
        while (it.hasNext()) {
            ((InterfaceC2257a) it.next()).accept(newConfig);
        }
    }

    @Override // k1.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f14050d.w(bundle);
        F5.i iVar = this.f14048b;
        iVar.getClass();
        iVar.f4108b = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f4107a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1073a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = M.f19168a;
        K.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        kotlin.jvm.internal.l.e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f14049c.f19195c).iterator();
        while (it.hasNext()) {
            ((L) it.next()).f10329a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem item) {
        kotlin.jvm.internal.l.e(item, "item");
        boolean z8 = true;
        if (super.onMenuItemSelected(i7, item)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14049c.f19195c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z8 = false;
                break;
            }
            if (((L) it.next()).f10329a.p()) {
                break;
            }
        }
        return z8;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z8) {
        if (this.f14044D) {
            return;
        }
        Iterator it = this.f14041A.iterator();
        while (it.hasNext()) {
            ((InterfaceC2257a) it.next()).accept(new k1.j(z8));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z8, Configuration newConfig) {
        kotlin.jvm.internal.l.e(newConfig, "newConfig");
        this.f14044D = true;
        try {
            super.onMultiWindowModeChanged(z8, newConfig);
            this.f14044D = false;
            Iterator it = this.f14041A.iterator();
            while (it.hasNext()) {
                ((InterfaceC2257a) it.next()).accept(new k1.j(z8));
            }
        } catch (Throwable th) {
            this.f14044D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.l.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f14058z.iterator();
        while (it.hasNext()) {
            ((InterfaceC2257a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        kotlin.jvm.internal.l.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f14049c.f19195c).iterator();
        while (it.hasNext()) {
            ((L) it.next()).f10329a.q();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z8) {
        if (this.f14045E) {
            return;
        }
        Iterator it = this.f14042B.iterator();
        while (it.hasNext()) {
            ((InterfaceC2257a) it.next()).accept(new k1.v(z8));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z8, Configuration newConfig) {
        kotlin.jvm.internal.l.e(newConfig, "newConfig");
        this.f14045E = true;
        try {
            super.onPictureInPictureModeChanged(z8, newConfig);
            this.f14045E = false;
            Iterator it = this.f14042B.iterator();
            while (it.hasNext()) {
                ((InterfaceC2257a) it.next()).accept(new k1.v(z8));
            }
        } catch (Throwable th) {
            this.f14045E = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        kotlin.jvm.internal.l.e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f14049c.f19195c).iterator();
        while (it.hasNext()) {
            ((L) it.next()).f10329a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.l.e(permissions, "permissions");
        kotlin.jvm.internal.l.e(grantResults, "grantResults");
        if (this.f14055w.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i7, permissions, grantResults);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, c.g] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0863g c0863g;
        d0 d0Var = this.f14051e;
        if (d0Var == null && (c0863g = (C0863g) getLastNonConfigurationInstance()) != null) {
            d0Var = c0863g.f14026a;
        }
        if (d0Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f14026a = d0Var;
        return obj;
    }

    @Override // k1.h, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.l.e(outState, "outState");
        C1481z c1481z = this.f18773a;
        if (c1481z != null) {
            c1481z.g(EnumC1474s.f19229c);
        }
        super.onSaveInstanceState(outState);
        this.f14050d.x(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f14057y.iterator();
        while (it.hasNext()) {
            ((InterfaceC2257a) it.next()).accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f14043C.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (vc.i.w()) {
                Trace.beginSection(vc.i.I("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C0875s c0875s = (C0875s) this.f14053u.getValue();
            synchronized (c0875s.f14065b) {
                try {
                    c0875s.f14066c = true;
                    Iterator it = c0875s.f14067d.iterator();
                    while (it.hasNext()) {
                        ((Rb.a) it.next()).invoke();
                    }
                    c0875s.f14067d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // l2.e0
    public final d0 s() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f14051e == null) {
            C0863g c0863g = (C0863g) getLastNonConfigurationInstance();
            if (c0863g != null) {
                this.f14051e = c0863g.f14026a;
            }
            if (this.f14051e == null) {
                this.f14051e = new d0();
            }
        }
        d0 d0Var = this.f14051e;
        kotlin.jvm.internal.l.b(d0Var);
        return d0Var;
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        this.f14052f.a(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        this.f14052f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        this.f14052f.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        kotlin.jvm.internal.l.e(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        kotlin.jvm.internal.l.e(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i10, int i11, int i12) {
        kotlin.jvm.internal.l.e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i10, int i11, int i12, Bundle bundle) {
        kotlin.jvm.internal.l.e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i10, i11, i12, bundle);
    }

    @Override // l2.InterfaceC1479x
    public final C1481z w() {
        return this.f18773a;
    }
}
