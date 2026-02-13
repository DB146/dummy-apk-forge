package k1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1479x;
import l2.K;
import l2.M;
import y1.InterfaceC2362j;

/* loaded from: classes.dex */
public abstract class h extends Activity implements InterfaceC1479x, InterfaceC2362j {

    /* renamed from: a, reason: collision with root package name */
    public final C1481z f18773a = new C1481z(this);

    @Override // y1.InterfaceC2362j
    public final boolean c(KeyEvent event) {
        kotlin.jvm.internal.l.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.l.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        if (com.bumptech.glide.d.g(decorView, event)) {
            return true;
        }
        return com.bumptech.glide.d.h(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.l.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        if (com.bumptech.glide.d.g(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = M.f19168a;
        K.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.l.e(outState, "outState");
        this.f18773a.g(EnumC1474s.f19229c);
        super.onSaveInstanceState(outState);
    }

    public Context zza() {
        return getApplicationContext();
    }
}
