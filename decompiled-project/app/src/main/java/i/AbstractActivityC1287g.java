package i;

import A9.S2;
import I2.K;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.C1521c;
import m.C1526h;
import m.C1528j;
import o.F0;
import o.U0;
import o.Z0;
import u1.C2094d;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1287g extends W1.G implements h {

    /* renamed from: N, reason: collision with root package name */
    public v f18071N;

    public AbstractActivityC1287g() {
        ((q3.s) this.f14050d.f23372c).D("androidx:appcompat", new Q2.a(this));
        g(new Aa.g(this, 6));
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        v vVar = (v) l();
        vVar.v();
        ((ViewGroup) vVar.f18125P.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f18111A.a(vVar.f18160z.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 29;
        v vVar = (v) l();
        vVar.f18139d0 = true;
        int i18 = vVar.f18143h0;
        if (i18 == -100) {
            i18 = k.f18073b;
        }
        int B10 = vVar.B(context, i18);
        if (k.b(context) && k.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (k.f18080w) {
                    try {
                        C2094d c2094d = k.f18074c;
                        if (c2094d == null) {
                            if (k.f18075d == null) {
                                k.f18075d = C2094d.a(k1.f.e(context));
                            }
                            if (!k.f18075d.f24825a.f24826a.isEmpty()) {
                                k.f18074c = k.f18075d;
                            }
                        } else if (!c2094d.equals(k.f18075d)) {
                            C2094d c2094d2 = k.f18074c;
                            k.f18075d = c2094d2;
                            k1.f.d(context, c2094d2.f24825a.f24826a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!k.f18077f) {
                k.f18072a.execute(new S2(context, i17));
            }
        }
        C2094d o10 = v.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.s(context, B10, o10, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C1521c) {
            try {
                ((C1521c) context).a(v.s(context, B10, o10, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (v.f18110y0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f4 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f4 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i19 = configuration3.mcc;
                    int i20 = configuration4.mcc;
                    if (i19 != i20) {
                        configuration.mcc = i20;
                    }
                    int i21 = configuration3.mnc;
                    int i22 = configuration4.mnc;
                    if (i21 != i22) {
                        configuration.mnc = i22;
                    }
                    int i23 = Build.VERSION.SDK_INT;
                    p.a(configuration3, configuration4, configuration);
                    int i24 = configuration3.touchscreen;
                    int i25 = configuration4.touchscreen;
                    if (i24 != i25) {
                        configuration.touchscreen = i25;
                    }
                    int i26 = configuration3.keyboard;
                    int i27 = configuration4.keyboard;
                    if (i26 != i27) {
                        configuration.keyboard = i27;
                    }
                    int i28 = configuration3.keyboardHidden;
                    int i29 = configuration4.keyboardHidden;
                    if (i28 != i29) {
                        configuration.keyboardHidden = i29;
                    }
                    int i30 = configuration3.navigation;
                    int i31 = configuration4.navigation;
                    if (i30 != i31) {
                        configuration.navigation = i31;
                    }
                    int i32 = configuration3.navigationHidden;
                    int i33 = configuration4.navigationHidden;
                    if (i32 != i33) {
                        configuration.navigationHidden = i33;
                    }
                    int i34 = configuration3.orientation;
                    int i35 = configuration4.orientation;
                    if (i34 != i35) {
                        configuration.orientation = i35;
                    }
                    int i36 = configuration3.screenLayout & 15;
                    int i37 = configuration4.screenLayout & 15;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 192;
                    int i39 = configuration4.screenLayout & 192;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 48;
                    int i41 = configuration4.screenLayout & 48;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    int i42 = configuration3.screenLayout & 768;
                    int i43 = configuration4.screenLayout & 768;
                    if (i42 != i43) {
                        configuration.screenLayout |= i43;
                    }
                    if (i23 >= 26) {
                        i7 = configuration3.colorMode;
                        int i44 = i7 & 3;
                        i10 = configuration4.colorMode;
                        if (i44 != (i10 & 3)) {
                            i15 = configuration.colorMode;
                            i16 = configuration4.colorMode;
                            configuration.colorMode = i15 | (i16 & 3);
                        }
                        i11 = configuration3.colorMode;
                        int i45 = i11 & 12;
                        i12 = configuration4.colorMode;
                        if (i45 != (i12 & 12)) {
                            i13 = configuration.colorMode;
                            i14 = configuration4.colorMode;
                            configuration.colorMode = i13 | (i14 & 12);
                        }
                    }
                    int i46 = configuration3.uiMode & 15;
                    int i47 = configuration4.uiMode & 15;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.uiMode & 48;
                    int i49 = configuration4.uiMode & 48;
                    if (i48 != i49) {
                        configuration.uiMode |= i49;
                    }
                    int i50 = configuration3.screenWidthDp;
                    int i51 = configuration4.screenWidthDp;
                    if (i50 != i51) {
                        configuration.screenWidthDp = i51;
                    }
                    int i52 = configuration3.screenHeightDp;
                    int i53 = configuration4.screenHeightDp;
                    if (i52 != i53) {
                        configuration.screenHeightDp = i53;
                    }
                    int i54 = configuration3.smallestScreenWidthDp;
                    int i55 = configuration4.smallestScreenWidthDp;
                    if (i54 != i55) {
                        configuration.smallestScreenWidthDp = i55;
                    }
                    int i56 = configuration3.densityDpi;
                    int i57 = configuration4.densityDpi;
                    if (i56 != i57) {
                        configuration.densityDpi = i57;
                    }
                }
            }
            Configuration s3 = v.s(context, B10, o10, configuration, true);
            C1521c c1521c = new C1521c(context, com.kt.apps.media.xemtv.beta.R.style.Theme_AppCompat_Empty);
            c1521c.a(s3);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c1521c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        n1.j.a(theme);
                    } else {
                        synchronized (n1.b.f21027e) {
                            if (!n1.b.g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    n1.b.f21028f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                n1.b.g = true;
                            }
                            Method method = n1.b.f21028f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e10) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e10);
                                    n1.b.f21028f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c1521c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((v) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // k1.h, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((v) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i7) {
        v vVar = (v) l();
        vVar.v();
        return vVar.f18160z.findViewById(i7);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v vVar = (v) l();
        if (vVar.f18114D == null) {
            vVar.z();
            G g = vVar.f18113C;
            vVar.f18114D = new C1526h(g != null ? g.X() : vVar.f18159y);
        }
        return vVar.f18114D;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i7 = Z0.f21469a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        v vVar = (v) l();
        if (vVar.f18113C != null) {
            vVar.z();
            vVar.f18113C.getClass();
            vVar.A(0);
        }
    }

    public final k l() {
        if (this.f18071N == null) {
            K k = k.f18072a;
            this.f18071N = new v(this, null, this, this);
        }
        return this.f18071N;
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v vVar = (v) l();
        if (vVar.f18130U && vVar.f18124O) {
            vVar.z();
            G g = vVar.f18113C;
            if (g != null) {
                g.a0(g.f18004d.getResources().getBoolean(com.kt.apps.media.xemtv.beta.R.bool.abc_action_bar_embed_tabs));
            }
        }
        o.r a9 = o.r.a();
        Context context = vVar.f18159y;
        synchronized (a9) {
            F0 f02 = a9.f21581a;
            synchronized (f02) {
                u.r rVar = (u.r) f02.f21375b.get(context);
                if (rVar != null) {
                    rVar.a();
                }
            }
        }
        vVar.f18142g0 = new Configuration(vVar.f18159y.getResources().getConfiguration());
        vVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // W1.G, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // W1.G, c.AbstractActivityC0867k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        Intent b2;
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        v vVar = (v) l();
        vVar.z();
        G g = vVar.f18113C;
        if (menuItem.getItemId() == 16908332 && g != null && (((U0) g.f18007h).f21437b & 4) != 0 && (b2 = k1.f.b(this)) != null) {
            if (!shouldUpRecreateTask(b2)) {
                navigateUpTo(b2);
                return true;
            }
            k1.w wVar = new k1.w(this);
            Intent b10 = k1.f.b(this);
            if (b10 == null) {
                b10 = k1.f.b(this);
            }
            if (b10 != null) {
                ComponentName component = b10.getComponent();
                if (component == null) {
                    component = b10.resolveActivity(wVar.f18805b.getPackageManager());
                }
                wVar.b(component);
                wVar.f18804a.add(b10);
            }
            wVar.i();
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) l()).v();
    }

    @Override // W1.G, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        v vVar = (v) l();
        vVar.z();
        G g = vVar.f18113C;
        if (g != null) {
            g.f18020w = true;
        }
    }

    @Override // W1.G, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((v) l()).m(true, false);
    }

    @Override // W1.G, android.app.Activity
    public final void onStop() {
        super.onStop();
        v vVar = (v) l();
        vVar.z();
        G g = vVar.f18113C;
        if (g != null) {
            g.f18020w = false;
            C1528j c1528j = g.f18019v;
            if (c1528j != null) {
                c1528j.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        l().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((v) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void setContentView(int i7) {
        h();
        l().i(i7);
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public void setContentView(View view) {
        h();
        l().j(view);
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        l().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        super.setTheme(i7);
        ((v) l()).f18144i0 = i7;
    }
}
