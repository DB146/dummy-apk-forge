package Z0;

import A9.Y2;
import W1.K;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import c.C0853A;
import c.DialogC0868l;
import c2.q;
import com.kt.apps.media.xemtv.beta.R;
import java.util.UUID;
import l2.Q;

/* loaded from: classes.dex */
public final class k extends DialogC0868l {

    /* renamed from: d, reason: collision with root package name */
    public Rb.a f12126d;

    /* renamed from: e, reason: collision with root package name */
    public j f12127e;

    /* renamed from: f, reason: collision with root package name */
    public final View f12128f;

    /* renamed from: u, reason: collision with root package name */
    public final i f12129u;

    public k(Rb.a aVar, j jVar, View view, V0.l lVar, V0.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), jVar.f12125e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f12126d = aVar;
        this.f12127e = jVar;
        this.f12128f = view;
        float f4 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        q.z(window, this.f12127e.f12125e);
        window.setGravity(17);
        i iVar = new i(getContext(), window);
        iVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        iVar.setClipChildren(false);
        iVar.setElevation(cVar.p(f4));
        iVar.setOutlineProvider(new Y2(2));
        this.f12129u = iVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            f(viewGroup);
        }
        setContentView(iVar);
        Q.i(iVar, Q.d(view));
        Q.j(iVar, Q.e(view));
        android.support.v4.media.session.b.C(iVar, android.support.v4.media.session.b.n(view));
        g(this.f12126d, this.f12127e, lVar);
        C0853A c0853a = this.f14061c;
        a aVar2 = new a(this, 1);
        kotlin.jvm.internal.l.e(c0853a, "<this>");
        c0853a.a(this, new K(aVar2));
    }

    public static final void f(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof i) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                f(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void g(Rb.a aVar, j jVar, V0.l lVar) {
        int i7;
        this.f12126d = aVar;
        this.f12127e = jVar;
        l lVar2 = jVar.f12123c;
        int i10 = f.f12112a;
        ViewGroup.LayoutParams layoutParams = this.f12128f.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z8 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = lVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z8 = true;
            } else {
                if (ordinal != 2) {
                    throw new Db.d(1);
                }
                z8 = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.l.b(window);
        window.setFlags(z8 ? 8192 : -8193, 8192);
        int ordinal2 = lVar.ordinal();
        if (ordinal2 == 0) {
            i7 = 0;
        } else {
            if (ordinal2 != 1) {
                throw new Db.d(1);
            }
            i7 = 1;
        }
        i iVar = this.f12129u;
        iVar.setLayoutDirection(i7);
        boolean z10 = iVar.f12115A;
        boolean z11 = jVar.f12125e;
        boolean z12 = jVar.f12124d;
        boolean z13 = (z10 && z12 == iVar.f12119y && z11 == iVar.f12120z) ? false : true;
        iVar.f12119y = z12;
        iVar.f12120z = z11;
        if (z13) {
            Window window2 = iVar.f12117w;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i11 = z12 ? -2 : -1;
            if (i11 != attributes.width || !iVar.f12115A) {
                window2.setLayout(i11, -2);
                iVar.f12115A = true;
            }
        }
        setCanceledOnTouchOutside(jVar.f12122b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z11 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (!this.f12127e.f12121a || !keyEvent.isTracking() || keyEvent.isCanceled() || i7 != 111) {
            return super.onKeyUp(i7, keyEvent);
        }
        this.f12126d.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int F10;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f12127e.f12122b) {
            return onTouchEvent;
        }
        i iVar = this.f12129u;
        iVar.getClass();
        float x2 = motionEvent.getX();
        if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
            float y10 = motionEvent.getY();
            if (!Float.isInfinite(y10) && !Float.isNaN(y10) && (childAt = iVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + iVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + iVar.getTop();
                int height = childAt.getHeight() + top;
                int F11 = Tb.a.F(motionEvent.getX());
                if (left <= F11 && F11 <= width && top <= (F10 = Tb.a.F(motionEvent.getY())) && F10 <= height) {
                    return onTouchEvent;
                }
            }
        }
        this.f12126d.invoke();
        return true;
    }
}
