package c;

import A9.N2;
import A9.S2;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.kt.apps.media.xemtv.beta.R;
import l2.C1481z;
import l2.InterfaceC1479x;
import l2.Q;

/* renamed from: c.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0868l extends Dialog implements InterfaceC1479x, InterfaceC0854B, Q2.e {

    /* renamed from: a, reason: collision with root package name */
    public C1481z f14059a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.c f14060b;

    /* renamed from: c, reason: collision with root package name */
    public final C0853A f14061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0868l(Context context, int i7) {
        super(context, i7);
        kotlin.jvm.internal.l.e(context, "context");
        this.f14060b = new q3.c(new S2.b(this, new N2(this, 15)));
        this.f14061c = new C0853A(new S2(this, 22));
    }

    public static void c(DialogC0868l dialogC0868l) {
        super.onBackPressed();
    }

    @Override // c.InterfaceC0854B
    public final C0853A a() {
        return this.f14061c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // Q2.e
    public final q3.s b() {
        return (q3.s) this.f14060b.f23372c;
    }

    public final C1481z d() {
        C1481z c1481z = this.f14059a;
        if (c1481z != null) {
            return c1481z;
        }
        C1481z c1481z2 = new C1481z(this);
        this.f14059a = c1481z2;
        return c1481z2;
    }

    public final void e() {
        Window window = getWindow();
        kotlin.jvm.internal.l.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window!!.decorView");
        Q.i(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.l.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.l.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.l.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.l.d(decorView3, "window!!.decorView");
        android.support.v4.media.session.b.C(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f14061c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.l.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0853A c0853a = this.f14061c;
            c0853a.f14011e = onBackInvokedDispatcher;
            c0853a.d(c0853a.g);
        }
        this.f14060b.w(bundle);
        d().d(l2.r.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.l.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f14060b.x(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        d().d(l2.r.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().d(l2.r.ON_DESTROY);
        this.f14059a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        e();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.l.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }

    @Override // l2.InterfaceC1479x
    public final C1481z w() {
        return d();
    }
}
