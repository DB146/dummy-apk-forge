package i;

import B0.AbstractC0169c;
import P4.C0463k;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h.AbstractC1213a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l2.EnumC1474s;
import l2.InterfaceC1479x;
import l2.X;
import m.AbstractC1519a;
import m.C1521c;
import m.C1526h;
import n.C1673g;
import n.C1674h;
import n.C1680n;
import n.InterfaceC1676j;
import n.MenuC1678l;
import o.C1721B;
import o.C1725b0;
import o.C1732f;
import o.C1740j;
import o.C1752p;
import o.C1759t;
import o.C1763v;
import o.C1771z;
import o.InterfaceC1729d0;
import o.InterfaceC1731e0;
import o.L;
import o.P0;
import o.U0;
import o.Z0;
import o.c1;
import u.T;
import u1.C2094d;
import u1.C2095e;
import y1.AbstractC2352B;
import y1.C2375x;
import y1.InterfaceC2362j;
import y1.K;
import y1.S;

/* loaded from: classes.dex */
public final class v extends k implements InterfaceC1676j, LayoutInflater.Factory2 {

    /* renamed from: w0, reason: collision with root package name */
    public static final T f18108w0 = new T(0);

    /* renamed from: x0, reason: collision with root package name */
    public static final int[] f18109x0 = {R.attr.windowBackground};

    /* renamed from: y0, reason: collision with root package name */
    public static final boolean f18110y0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public r f18111A;

    /* renamed from: B, reason: collision with root package name */
    public final Object f18112B;

    /* renamed from: C, reason: collision with root package name */
    public G f18113C;

    /* renamed from: D, reason: collision with root package name */
    public C1526h f18114D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f18115E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC1729d0 f18116F;

    /* renamed from: G, reason: collision with root package name */
    public R7.a f18117G;

    /* renamed from: H, reason: collision with root package name */
    public m f18118H;

    /* renamed from: I, reason: collision with root package name */
    public AbstractC1519a f18119I;

    /* renamed from: J, reason: collision with root package name */
    public ActionBarContextView f18120J;

    /* renamed from: K, reason: collision with root package name */
    public PopupWindow f18121K;
    public l L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f18124O;

    /* renamed from: P, reason: collision with root package name */
    public ViewGroup f18125P;

    /* renamed from: Q, reason: collision with root package name */
    public TextView f18126Q;

    /* renamed from: R, reason: collision with root package name */
    public View f18127R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f18128S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f18129T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f18130U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f18131V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f18132W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f18133X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f18134Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f18135Z;

    /* renamed from: a0, reason: collision with root package name */
    public u[] f18136a0;

    /* renamed from: b0, reason: collision with root package name */
    public u f18137b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f18138c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f18139d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f18140e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f18141f0;

    /* renamed from: g0, reason: collision with root package name */
    public Configuration f18142g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f18143h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f18144i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f18145j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f18146k0;

    /* renamed from: l0, reason: collision with root package name */
    public s f18147l0;

    /* renamed from: m0, reason: collision with root package name */
    public s f18148m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f18149n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f18150o0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f18152q0;

    /* renamed from: r0, reason: collision with root package name */
    public Rect f18153r0;

    /* renamed from: s0, reason: collision with root package name */
    public Rect f18154s0;

    /* renamed from: t0, reason: collision with root package name */
    public C1278A f18155t0;

    /* renamed from: u0, reason: collision with root package name */
    public OnBackInvokedDispatcher f18156u0;

    /* renamed from: v0, reason: collision with root package name */
    public OnBackInvokedCallback f18157v0;

    /* renamed from: x, reason: collision with root package name */
    public final Object f18158x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f18159y;

    /* renamed from: z, reason: collision with root package name */
    public Window f18160z;

    /* renamed from: M, reason: collision with root package name */
    public S f18122M = null;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f18123N = true;

    /* renamed from: p0, reason: collision with root package name */
    public final l f18151p0 = new l(this, 0);

    public v(Context context, Window window, h hVar, Object obj) {
        AbstractActivityC1287g abstractActivityC1287g = null;
        this.f18143h0 = -100;
        this.f18159y = context;
        this.f18158x = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1287g)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1287g = (AbstractActivityC1287g) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1287g != null) {
                this.f18143h0 = ((v) abstractActivityC1287g.l()).f18143h0;
            }
        }
        if (this.f18143h0 == -100) {
            T t5 = f18108w0;
            Integer num = (Integer) t5.get(this.f18158x.getClass().getName());
            if (num != null) {
                this.f18143h0 = num.intValue();
                t5.remove(this.f18158x.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        o.r.d();
    }

    public static C2094d o(Context context) {
        C2094d c2094d;
        C2094d c2094d2;
        if (Build.VERSION.SDK_INT >= 33 || (c2094d = k.f18074c) == null) {
            return null;
        }
        C2094d b2 = p.b(context.getApplicationContext().getResources().getConfiguration());
        C2095e c2095e = c2094d.f24825a;
        if (c2095e.f24826a.isEmpty()) {
            c2094d2 = C2094d.f24824b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = 0;
            while (i7 < b2.f24825a.f24826a.size() + c2095e.f24826a.size()) {
                Locale locale = i7 < c2095e.f24826a.size() ? c2095e.f24826a.get(i7) : b2.f24825a.f24826a.get(i7 - c2095e.f24826a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i7++;
            }
            c2094d2 = new C2094d(new C2095e(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c2094d2.f24825a.f24826a.isEmpty() ? b2 : c2094d2;
    }

    public static Configuration s(Context context, int i7, C2094d c2094d, Configuration configuration, boolean z8) {
        int i10 = i7 != 1 ? i7 != 2 ? z8 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (c2094d != null) {
            p.d(configuration2, c2094d);
        }
        return configuration2;
    }

    public final void A(int i7) {
        this.f18150o0 = (1 << i7) | this.f18150o0;
        if (this.f18149n0) {
            return;
        }
        View decorView = this.f18160z.getDecorView();
        l lVar = this.f18151p0;
        WeakHashMap weakHashMap = K.f26642a;
        decorView.postOnAnimation(lVar);
        this.f18149n0 = true;
    }

    public final int B(Context context, int i7) {
        if (i7 == -100) {
            return -1;
        }
        if (i7 != -1) {
            if (i7 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).f();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f18148m0 == null) {
                    this.f18148m0 = new s(this, context);
                }
                return this.f18148m0.f();
            }
        }
        return i7;
    }

    public final boolean C() {
        InterfaceC1731e0 interfaceC1731e0;
        P0 p02;
        boolean z8 = this.f18138c0;
        this.f18138c0 = false;
        u y10 = y(0);
        if (y10.f18104m) {
            if (!z8) {
                r(y10, true);
            }
            return true;
        }
        AbstractC1519a abstractC1519a = this.f18119I;
        if (abstractC1519a != null) {
            abstractC1519a.a();
            return true;
        }
        z();
        G g = this.f18113C;
        if (g == null || (interfaceC1731e0 = g.f18007h) == null || (p02 = ((U0) interfaceC1731e0).f21436a.f13084c0) == null || p02.f21417b == null) {
            return false;
        }
        P0 p03 = ((U0) interfaceC1731e0).f21436a.f13084c0;
        C1680n c1680n = p03 == null ? null : p03.f21417b;
        if (c1680n != null) {
            c1680n.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        if (r3.f20935f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(u uVar, KeyEvent keyEvent) {
        int i7;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f18104m || this.f18141f0) {
            return;
        }
        int i10 = uVar.f18095a;
        Context context = this.f18159y;
        if (i10 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f18160z.getCallback();
        if (callback != null && !callback.onMenuOpened(i10, uVar.f18101h)) {
            r(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(uVar, keyEvent)) {
            return;
        }
        t tVar = uVar.f18099e;
        if (tVar == null || uVar.f18105n) {
            if (tVar == null) {
                z();
                G g = this.f18113C;
                Context X10 = g != null ? g.X() : null;
                if (X10 != null) {
                    context = X10;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.actionBarPopupTheme, typedValue, true);
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    newTheme.applyStyle(i11, true);
                }
                newTheme.resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.panelMenuListTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    newTheme.applyStyle(i12, true);
                } else {
                    newTheme.applyStyle(com.kt.apps.media.xemtv.beta.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C1521c c1521c = new C1521c(context, 0);
                c1521c.getTheme().setTo(newTheme);
                uVar.j = c1521c;
                TypedArray obtainStyledAttributes = c1521c.obtainStyledAttributes(AbstractC1213a.j);
                uVar.f18096b = obtainStyledAttributes.getResourceId(86, 0);
                uVar.f18098d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                uVar.f18099e = new t(this, uVar.j);
                uVar.f18097c = 81;
            } else if (uVar.f18105n && tVar.getChildCount() > 0) {
                uVar.f18099e.removeAllViews();
            }
            View view = uVar.g;
            if (view == null) {
                if (uVar.f18101h != null) {
                    if (this.f18118H == null) {
                        this.f18118H = new m(this);
                    }
                    m mVar = this.f18118H;
                    if (uVar.f18102i == null) {
                        C1674h c1674h = new C1674h(uVar.j);
                        uVar.f18102i = c1674h;
                        c1674h.f20934e = mVar;
                        MenuC1678l menuC1678l = uVar.f18101h;
                        menuC1678l.b(c1674h, menuC1678l.f20954a);
                    }
                    C1674h c1674h2 = uVar.f18102i;
                    t tVar2 = uVar.f18099e;
                    if (c1674h2.f20933d == null) {
                        c1674h2.f20933d = (ExpandedMenuView) c1674h2.f20931b.inflate(com.kt.apps.media.xemtv.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) tVar2, false);
                        if (c1674h2.f20935f == null) {
                            c1674h2.f20935f = new C1673g(c1674h2);
                        }
                        c1674h2.f20933d.setAdapter((ListAdapter) c1674h2.f20935f);
                        c1674h2.f20933d.setOnItemClickListener(c1674h2);
                    }
                    ExpandedMenuView expandedMenuView = c1674h2.f20933d;
                    uVar.f18100f = expandedMenuView;
                }
                uVar.f18105n = true;
                return;
            }
            uVar.f18100f = view;
            if (uVar.f18100f != null) {
                if (uVar.g == null) {
                    C1674h c1674h3 = uVar.f18102i;
                    if (c1674h3.f20935f == null) {
                        c1674h3.f20935f = new C1673g(c1674h3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = uVar.f18100f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                uVar.f18099e.setBackgroundResource(uVar.f18096b);
                ViewParent parent = uVar.f18100f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(uVar.f18100f);
                }
                uVar.f18099e.addView(uVar.f18100f, layoutParams2);
                if (!uVar.f18100f.hasFocus()) {
                    uVar.f18100f.requestFocus();
                }
            }
            uVar.f18105n = true;
            return;
        }
        View view2 = uVar.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i7 = -1;
            uVar.f18103l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = uVar.f18097c;
            layoutParams3.windowAnimations = uVar.f18098d;
            windowManager.addView(uVar.f18099e, layoutParams3);
            uVar.f18104m = true;
            if (i10 != 0) {
                H();
                return;
            }
            return;
        }
        i7 = -2;
        uVar.f18103l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = uVar.f18097c;
        layoutParams32.windowAnimations = uVar.f18098d;
        windowManager.addView(uVar.f18099e, layoutParams32);
        uVar.f18104m = true;
        if (i10 != 0) {
        }
    }

    public final boolean E(u uVar, int i7, KeyEvent keyEvent) {
        MenuC1678l menuC1678l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.k || F(uVar, keyEvent)) && (menuC1678l = uVar.f18101h) != null) {
            return menuC1678l.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(u uVar, KeyEvent keyEvent) {
        InterfaceC1729d0 interfaceC1729d0;
        InterfaceC1729d0 interfaceC1729d02;
        Resources.Theme theme;
        InterfaceC1729d0 interfaceC1729d03;
        InterfaceC1729d0 interfaceC1729d04;
        if (this.f18141f0) {
            return false;
        }
        if (uVar.k) {
            return true;
        }
        u uVar2 = this.f18137b0;
        if (uVar2 != null && uVar2 != uVar) {
            r(uVar2, false);
        }
        Window.Callback callback = this.f18160z.getCallback();
        int i7 = uVar.f18095a;
        if (callback != null) {
            uVar.g = callback.onCreatePanelView(i7);
        }
        boolean z8 = i7 == 0 || i7 == 108;
        if (z8 && (interfaceC1729d04 = this.f18116F) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1729d04;
            actionBarOverlayLayout.k();
            ((U0) actionBarOverlayLayout.f12965e).f21444l = true;
        }
        if (uVar.g == null) {
            MenuC1678l menuC1678l = uVar.f18101h;
            if (menuC1678l == null || uVar.f18106o) {
                if (menuC1678l == null) {
                    Context context = this.f18159y;
                    if ((i7 == 0 || i7 == 108) && this.f18116F != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1521c c1521c = new C1521c(context, 0);
                            c1521c.getTheme().setTo(theme);
                            context = c1521c;
                        }
                    }
                    MenuC1678l menuC1678l2 = new MenuC1678l(context);
                    menuC1678l2.f20958e = this;
                    MenuC1678l menuC1678l3 = uVar.f18101h;
                    if (menuC1678l2 != menuC1678l3) {
                        if (menuC1678l3 != null) {
                            menuC1678l3.r(uVar.f18102i);
                        }
                        uVar.f18101h = menuC1678l2;
                        C1674h c1674h = uVar.f18102i;
                        if (c1674h != null) {
                            menuC1678l2.b(c1674h, menuC1678l2.f20954a);
                        }
                    }
                    if (uVar.f18101h == null) {
                        return false;
                    }
                }
                if (z8 && (interfaceC1729d02 = this.f18116F) != null) {
                    if (this.f18117G == null) {
                        this.f18117G = new R7.a(this, 29);
                    }
                    ((ActionBarOverlayLayout) interfaceC1729d02).l(uVar.f18101h, this.f18117G);
                }
                uVar.f18101h.w();
                if (!callback.onCreatePanelMenu(i7, uVar.f18101h)) {
                    MenuC1678l menuC1678l4 = uVar.f18101h;
                    if (menuC1678l4 != null) {
                        if (menuC1678l4 != null) {
                            menuC1678l4.r(uVar.f18102i);
                        }
                        uVar.f18101h = null;
                    }
                    if (z8 && (interfaceC1729d0 = this.f18116F) != null) {
                        ((ActionBarOverlayLayout) interfaceC1729d0).l(null, this.f18117G);
                    }
                    return false;
                }
                uVar.f18106o = false;
            }
            uVar.f18101h.w();
            Bundle bundle = uVar.f18107p;
            if (bundle != null) {
                uVar.f18101h.s(bundle);
                uVar.f18107p = null;
            }
            if (!callback.onPreparePanel(0, uVar.g, uVar.f18101h)) {
                if (z8 && (interfaceC1729d03 = this.f18116F) != null) {
                    ((ActionBarOverlayLayout) interfaceC1729d03).l(null, this.f18117G);
                }
                uVar.f18101h.v();
                return false;
            }
            uVar.f18101h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            uVar.f18101h.v();
        }
        uVar.k = true;
        uVar.f18103l = false;
        this.f18137b0 = uVar;
        return true;
    }

    public final void G() {
        if (this.f18124O) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z8 = false;
            if (this.f18156u0 != null && (y(0).f18104m || this.f18119I != null)) {
                z8 = true;
            }
            if (z8 && this.f18157v0 == null) {
                this.f18157v0 = q.b(this.f18156u0, this);
            } else {
                if (z8 || (onBackInvokedCallback = this.f18157v0) == null) {
                    return;
                }
                q.c(this.f18156u0, onBackInvokedCallback);
                this.f18157v0 = null;
            }
        }
    }

    @Override // i.k
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f18159y);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // i.k
    public final void c() {
        String str;
        this.f18139d0 = true;
        m(false, true);
        w();
        Object obj = this.f18158x;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = k1.f.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                G g = this.f18113C;
                if (g == null) {
                    this.f18152q0 = true;
                } else {
                    g.Z(true);
                }
            }
            synchronized (k.f18079v) {
                k.f(this);
                k.f18078u.add(new WeakReference(this));
            }
        }
        this.f18142g0 = new Configuration(this.f18159y.getResources().getConfiguration());
        this.f18140e0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // i.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        s sVar;
        s sVar2;
        if (this.f18158x instanceof Activity) {
            synchronized (k.f18079v) {
                k.f(this);
            }
        }
        if (this.f18149n0) {
            this.f18160z.getDecorView().removeCallbacks(this.f18151p0);
        }
        this.f18141f0 = true;
        if (this.f18143h0 != -100) {
            Object obj = this.f18158x;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f18108w0.put(this.f18158x.getClass().getName(), Integer.valueOf(this.f18143h0));
                sVar = this.f18147l0;
                if (sVar != null) {
                    sVar.c();
                }
                sVar2 = this.f18148m0;
                if (sVar2 == null) {
                    sVar2.c();
                    return;
                }
                return;
            }
        }
        f18108w0.remove(this.f18158x.getClass().getName());
        sVar = this.f18147l0;
        if (sVar != null) {
        }
        sVar2 = this.f18148m0;
        if (sVar2 == null) {
        }
    }

    @Override // n.InterfaceC1676j
    public final boolean e(MenuC1678l menuC1678l, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f18160z.getCallback();
        if (callback != null && !this.f18141f0) {
            MenuC1678l k = menuC1678l.k();
            u[] uVarArr = this.f18136a0;
            int length = uVarArr != null ? uVarArr.length : 0;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    uVar = uVarArr[i7];
                    if (uVar != null && uVar.f18101h == k) {
                        break;
                    }
                    i7++;
                } else {
                    uVar = null;
                    break;
                }
            }
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f18095a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.e() != false) goto L20;
     */
    @Override // n.InterfaceC1676j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(MenuC1678l menuC1678l) {
        ActionMenuView actionMenuView;
        C1740j c1740j;
        C1740j c1740j2;
        C1740j c1740j3;
        InterfaceC1729d0 interfaceC1729d0 = this.f18116F;
        if (interfaceC1729d0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1729d0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((U0) actionBarOverlayLayout.f12965e).f21436a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f13079a) != null && actionMenuView.f12976G) {
                if (ViewConfiguration.get(this.f18159y).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f18116F;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((U0) actionBarOverlayLayout2.f12965e).f21436a.f13079a;
                    if (actionMenuView2 != null) {
                        C1740j c1740j4 = actionMenuView2.f12977H;
                        if (c1740j4 != null) {
                            if (c1740j4.f21512I == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f18160z.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f18116F;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((U0) actionBarOverlayLayout3.f12965e).f21436a.f13079a;
                if ((actionMenuView3 == null || (c1740j3 = actionMenuView3.f12977H) == null || !c1740j3.e()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f18116F;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((U0) actionBarOverlayLayout4.f12965e).f21436a.f13079a;
                    if (actionMenuView4 != null && (c1740j2 = actionMenuView4.f12977H) != null) {
                        c1740j2.c();
                    }
                    if (this.f18141f0) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).f18101h);
                    return;
                }
                if (callback == null || this.f18141f0) {
                    return;
                }
                if (this.f18149n0 && (1 & this.f18150o0) != 0) {
                    View decorView = this.f18160z.getDecorView();
                    l lVar = this.f18151p0;
                    decorView.removeCallbacks(lVar);
                    lVar.run();
                }
                u y10 = y(0);
                MenuC1678l menuC1678l2 = y10.f18101h;
                if (menuC1678l2 == null || y10.f18106o || !callback.onPreparePanel(0, y10.g, menuC1678l2)) {
                    return;
                }
                callback.onMenuOpened(108, y10.f18101h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f18116F;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((U0) actionBarOverlayLayout5.f12965e).f21436a.f13079a;
                if (actionMenuView5 == null || (c1740j = actionMenuView5.f12977H) == null) {
                    return;
                }
                c1740j.l();
                return;
            }
        }
        u y11 = y(0);
        y11.f18105n = true;
        r(y11, false);
        D(y11, null);
    }

    @Override // i.k
    public final boolean h(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.f18134Y && i7 == 108) {
            return false;
        }
        if (this.f18130U && i7 == 1) {
            this.f18130U = false;
        }
        if (i7 == 1) {
            G();
            this.f18134Y = true;
            return true;
        }
        if (i7 == 2) {
            G();
            this.f18128S = true;
            return true;
        }
        if (i7 == 5) {
            G();
            this.f18129T = true;
            return true;
        }
        if (i7 == 10) {
            G();
            this.f18132W = true;
            return true;
        }
        if (i7 == 108) {
            G();
            this.f18130U = true;
            return true;
        }
        if (i7 != 109) {
            return this.f18160z.requestFeature(i7);
        }
        G();
        this.f18131V = true;
        return true;
    }

    @Override // i.k
    public final void i(int i7) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f18125P.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f18159y).inflate(i7, viewGroup);
        this.f18111A.a(this.f18160z.getCallback());
    }

    @Override // i.k
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f18125P.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f18111A.a(this.f18160z.getCallback());
    }

    @Override // i.k
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f18125P.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f18111A.a(this.f18160z.getCallback());
    }

    @Override // i.k
    public final void l(CharSequence charSequence) {
        this.f18115E = charSequence;
        InterfaceC1729d0 interfaceC1729d0 = this.f18116F;
        if (interfaceC1729d0 != null) {
            interfaceC1729d0.setWindowTitle(charSequence);
            return;
        }
        G g = this.f18113C;
        if (g == null) {
            TextView textView = this.f18126Q;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        U0 u02 = (U0) g.f18007h;
        if (u02.g) {
            return;
        }
        u02.f21442h = charSequence;
        if ((u02.f21437b & 8) != 0) {
            Toolbar toolbar = u02.f21436a;
            toolbar.setTitle(charSequence);
            if (u02.g) {
                K.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z8, boolean z10) {
        int i7;
        Configuration configuration;
        C2094d b2;
        int i10;
        boolean z11;
        Object obj;
        Object obj2;
        Activity activity;
        if (this.f18141f0) {
            return false;
        }
        int i11 = this.f18143h0;
        if (i11 == -100) {
            i11 = k.f18073b;
        }
        int i12 = i11;
        Context context = this.f18159y;
        int B10 = B(context, i12);
        int i13 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        C2094d o10 = i13 < 33 ? o(context) : null;
        if (!z10 && o10 != null) {
            o10 = p.b(context.getResources().getConfiguration());
        }
        Configuration s3 = s(context, B10, o10, null, false);
        boolean z12 = this.f18146k0;
        Object obj3 = this.f18158x;
        boolean z13 = true;
        if (!z12 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i7 = 0;
                configuration = this.f18142g0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i14 = configuration.uiMode & 48;
                int i15 = s3.uiMode & 48;
                C2094d b10 = p.b(configuration);
                b2 = o10 != null ? null : p.b(s3);
                i10 = i14 == i15 ? 512 : 0;
                if (b2 != null && !b10.equals(b2)) {
                    i10 |= 8196;
                }
                if (((~i7) & i10) != 0 && z8 && this.f18139d0 && ((f18110y0 || this.f18140e0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i16 = Build.VERSION.SDK_INT;
                        if (i16 >= 31 && (i10 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s3.getLayoutDirection());
                        }
                        if (i16 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new k1.a(activity, r3));
                        }
                        z11 = true;
                        if (!z11 || i10 == 0) {
                            z13 = z11;
                        } else {
                            r3 = (i7 & i10) == i10 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i15;
                            if (b2 != null) {
                                p.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i17 = Build.VERSION.SDK_INT;
                            if (i17 < 26 && i17 < 28) {
                                if (!Y6.b.f12032i) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        Y6.b.f12031h = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                                    }
                                    Y6.b.f12032i = true;
                                }
                                Field field = Y6.b.f12031h;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e10) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!Y6.b.f12027c) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                Y6.b.f12026b = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e11) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                            }
                                            Y6.b.f12027c = true;
                                        }
                                        Field field2 = Y6.b.f12026b;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e12) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                            }
                                            if (obj2 != null) {
                                                if (!Y6.b.f12029e) {
                                                    try {
                                                        Y6.b.f12028d = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e13) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e13);
                                                    }
                                                    Y6.b.f12029e = true;
                                                }
                                                Class cls = Y6.b.f12028d;
                                                if (cls != null) {
                                                    if (!Y6.b.g) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            Y6.b.f12030f = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e14) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e14);
                                                        }
                                                        Y6.b.g = true;
                                                    }
                                                    Field field3 = Y6.b.f12030f;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e15) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e15);
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i18 = this.f18144i0;
                            if (i18 != 0) {
                                context.setTheme(i18);
                                context.getTheme().applyStyle(this.f18144i0, true);
                            }
                            if (r3 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC1479x) {
                                    if (((InterfaceC1479x) activity2).w().f19242d.compareTo(EnumC1474s.f19229c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f18140e0 && !this.f18141f0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z13 && (obj3 instanceof AbstractActivityC1287g)) {
                            if ((i10 & 512) != 0) {
                            }
                            if ((i10 & 4) != 0) {
                            }
                        }
                        if (b2 != null) {
                            p.c(p.b(context.getResources().getConfiguration()));
                        }
                        if (i12 == 0) {
                            x(context).n();
                        } else {
                            s sVar = this.f18147l0;
                            if (sVar != null) {
                                sVar.c();
                            }
                        }
                        if (i12 == 3) {
                            if (this.f18148m0 == null) {
                                this.f18148m0 = new s(this, context);
                            }
                            this.f18148m0.n();
                        } else {
                            s sVar2 = this.f18148m0;
                            if (sVar2 != null) {
                                sVar2.c();
                            }
                        }
                        return z13;
                    }
                }
                z11 = false;
                if (z11) {
                }
                z13 = z11;
                if (z13) {
                    if ((i10 & 512) != 0) {
                    }
                    if ((i10 & 4) != 0) {
                    }
                }
                if (b2 != null) {
                }
                if (i12 == 0) {
                }
                if (i12 == 3) {
                }
                return z13;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i13 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f18145j0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e16) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e16);
                this.f18145j0 = 0;
            }
        }
        this.f18146k0 = true;
        i7 = this.f18145j0;
        configuration = this.f18142g0;
        if (configuration == null) {
        }
        int i142 = configuration.uiMode & 48;
        int i152 = s3.uiMode & 48;
        C2094d b102 = p.b(configuration);
        if (o10 != null) {
        }
        if (i142 == i152) {
        }
        if (b2 != null) {
            i10 |= 8196;
        }
        if (((~i7) & i10) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z11 = false;
        if (z11) {
        }
        z13 = z11;
        if (z13) {
        }
        if (b2 != null) {
        }
        if (i12 == 0) {
        }
        if (i12 == 3) {
        }
        return z13;
    }

    public final void n(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f18160z != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof r) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        r rVar = new r(this, callback);
        this.f18111A = rVar;
        window.setCallback(rVar);
        X t5 = X.t(this.f18159y, null, f18109x0);
        Drawable o10 = t5.o(0);
        if (o10 != null) {
            window.setBackgroundDrawable(o10);
        }
        t5.w();
        this.f18160z = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f18156u0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f18157v0) != null) {
            q.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f18157v0 = null;
        }
        Object obj = this.f18158x;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f18156u0 = q.a(activity);
                H();
            }
        }
        this.f18156u0 = null;
        H();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c1771z;
        int i7;
        String str2 = str;
        char c10 = 4;
        View view2 = null;
        if (this.f18155t0 == null) {
            int[] iArr = AbstractC1213a.j;
            Context context2 = this.f18159y;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f18155t0 = new C1278A();
            } else {
                try {
                    this.f18155t0 = (C1278A) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f18155t0 = new C1278A();
                }
            }
        }
        C1278A c1278a = this.f18155t0;
        int i10 = Z0.f21469a;
        c1278a.getClass();
        int i11 = 0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17587y, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c1521c = (resourceId == 0 || ((context instanceof C1521c) && ((C1521c) context).f19621a == resourceId)) ? context : new C1521c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str2.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1455429095:
                if (str2.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1346021293:
                if (str2.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -938935918:
                if (str2.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str2.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -339785223:
                if (str2.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 776382189:
                if (str2.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 799298502:
                if (str2.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1125864064:
                if (str2.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 1413872058:
                if (str2.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 1601505219:
                if (str2.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1666676343:
                if (str2.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2001146706:
                if (str2.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                c1771z = new C1771z(c1521c, attributeSet);
                break;
            case 1:
                c1771z = new C1752p(c1521c, attributeSet);
                break;
            case 2:
                c1771z = new C1763v(c1521c, attributeSet);
                break;
            case 3:
                c1771z = c1278a.e(c1521c, attributeSet);
                break;
            case 4:
                c1771z = new AppCompatImageButton(c1521c, attributeSet);
                break;
            case 5:
                c1771z = new C1721B(c1521c, attributeSet);
                break;
            case 6:
                c1771z = new L(c1521c, attributeSet);
                break;
            case 7:
                c1771z = c1278a.d(c1521c, attributeSet);
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                c1771z = new C1725b0(c1521c, attributeSet);
                break;
            case '\t':
                c1771z = new AppCompatImageView(c1521c, attributeSet);
                break;
            case '\n':
                c1771z = c1278a.a(c1521c, attributeSet);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                c1771z = c1278a.c(c1521c, attributeSet);
                break;
            case '\f':
                c1771z = new C1759t(c1521c, attributeSet);
                break;
            case '\r':
                c1771z = c1278a.b(c1521c, attributeSet);
                break;
            default:
                c1771z = null;
                break;
        }
        if (c1771z == null && context != c1521c) {
            Object[] objArr = c1278a.f17988a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c1521c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i12 = 0;
                    while (true) {
                        String[] strArr = C1278A.g;
                        if (i12 < 3) {
                            View f4 = c1278a.f(c1521c, str2, strArr[i12]);
                            if (f4 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f4;
                            } else {
                                i12++;
                            }
                        }
                    }
                } else {
                    View f10 = c1278a.f(c1521c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f10;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c1771z = view2;
        }
        if (c1771z != null) {
            Context context3 = c1771z.getContext();
            if ((context3 instanceof ContextWrapper) && c1771z.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C1278A.f17983c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c1771z.setOnClickListener(new z(c1771z, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            int i13 = 28;
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c1521c.obtainStyledAttributes(attributeSet, C1278A.f17984d);
                Class<Boolean> cls = Boolean.class;
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z8 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = K.f26642a;
                    i7 = 0;
                    new C2375x(com.kt.apps.media.xemtv.beta.R.id.tag_accessibility_heading, cls, i11, i13, 3).e(c1771z, Boolean.valueOf(z8));
                } else {
                    i7 = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c1521c.obtainStyledAttributes(attributeSet, C1278A.f17985e);
                if (obtainStyledAttributes5.hasValue(i7)) {
                    K.o(c1771z, obtainStyledAttributes5.getString(i7));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c1521c.obtainStyledAttributes(attributeSet, C1278A.f17986f);
                if (obtainStyledAttributes6.hasValue(i7)) {
                    boolean z10 = obtainStyledAttributes6.getBoolean(i7, i7);
                    WeakHashMap weakHashMap2 = K.f26642a;
                    new C2375x(com.kt.apps.media.xemtv.beta.R.id.tag_screen_reader_focusable, cls, i7, i13, 0).e(c1771z, Boolean.valueOf(z10));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c1771z;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p(int i7, u uVar, MenuC1678l menuC1678l) {
        if (menuC1678l == null) {
            if (uVar == null && i7 >= 0) {
                u[] uVarArr = this.f18136a0;
                if (i7 < uVarArr.length) {
                    uVar = uVarArr[i7];
                }
            }
            if (uVar != null) {
                menuC1678l = uVar.f18101h;
            }
        }
        if ((uVar == null || uVar.f18104m) && !this.f18141f0) {
            r rVar = this.f18111A;
            Window.Callback callback = this.f18160z.getCallback();
            rVar.getClass();
            try {
                rVar.f18089d = true;
                callback.onPanelClosed(i7, menuC1678l);
            } finally {
                rVar.f18089d = false;
            }
        }
    }

    public final void q(MenuC1678l menuC1678l) {
        C1740j c1740j;
        if (this.f18135Z) {
            return;
        }
        this.f18135Z = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18116F;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((U0) actionBarOverlayLayout.f12965e).f21436a.f13079a;
        if (actionMenuView != null && (c1740j = actionMenuView.f12977H) != null) {
            c1740j.c();
            C1732f c1732f = c1740j.f21511H;
            if (c1732f != null && c1732f.b()) {
                c1732f.f21016i.dismiss();
            }
        }
        Window.Callback callback = this.f18160z.getCallback();
        if (callback != null && !this.f18141f0) {
            callback.onPanelClosed(108, menuC1678l);
        }
        this.f18135Z = false;
    }

    public final void r(u uVar, boolean z8) {
        t tVar;
        InterfaceC1729d0 interfaceC1729d0;
        C1740j c1740j;
        if (z8 && uVar.f18095a == 0 && (interfaceC1729d0 = this.f18116F) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1729d0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((U0) actionBarOverlayLayout.f12965e).f21436a.f13079a;
            if (actionMenuView != null && (c1740j = actionMenuView.f12977H) != null && c1740j.e()) {
                q(uVar.f18101h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f18159y.getSystemService("window");
        if (windowManager != null && uVar.f18104m && (tVar = uVar.f18099e) != null) {
            windowManager.removeView(tVar);
            if (z8) {
                p(uVar.f18095a, uVar, null);
            }
        }
        uVar.k = false;
        uVar.f18103l = false;
        uVar.f18104m = false;
        uVar.f18100f = null;
        uVar.f18105n = true;
        if (this.f18137b0 == uVar) {
            this.f18137b0 = null;
        }
        if (uVar.f18095a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.c() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (r7.l() != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z8;
        boolean z10;
        ActionMenuView actionMenuView;
        C1740j c1740j;
        Object obj = this.f18158x;
        if (((obj instanceof InterfaceC2362j) || (obj instanceof x)) && (decorView = this.f18160z.getDecorView()) != null && com.bumptech.glide.d.g(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            r rVar = this.f18111A;
            Window.Callback callback = this.f18160z.getCallback();
            rVar.getClass();
            try {
                rVar.f18088c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                rVar.f18088c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f18138c0 = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                u y10 = y(0);
                if (y10.f18104m) {
                    return true;
                }
                F(y10, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f18119I != null) {
                    return true;
                }
                u y11 = y(0);
                InterfaceC1729d0 interfaceC1729d0 = this.f18116F;
                Context context = this.f18159y;
                if (interfaceC1729d0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1729d0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((U0) actionBarOverlayLayout.f12965e).f21436a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f13079a) != null && actionMenuView.f12976G && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f18116F;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((U0) actionBarOverlayLayout2.f12965e).f21436a.f13079a;
                        if (actionMenuView2 == null || (c1740j = actionMenuView2.f12977H) == null || !c1740j.e()) {
                            if (!this.f18141f0 && F(y11, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f18116F;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((U0) actionBarOverlayLayout3.f12965e).f21436a.f13079a;
                                if (actionMenuView3 != null) {
                                    C1740j c1740j2 = actionMenuView3.f12977H;
                                    if (c1740j2 != null) {
                                    }
                                }
                            }
                            z8 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f18116F;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((U0) actionBarOverlayLayout4.f12965e).f21436a.f13079a;
                            if (actionMenuView4 != null) {
                                C1740j c1740j3 = actionMenuView4.f12977H;
                                if (c1740j3 != null) {
                                }
                            }
                            z8 = false;
                        }
                        if (z8) {
                            return true;
                        }
                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                }
                boolean z11 = y11.f18104m;
                if (z11 || y11.f18103l) {
                    r(y11, true);
                    z8 = z11;
                    if (z8) {
                    }
                } else {
                    if (y11.k) {
                        if (y11.f18106o) {
                            y11.k = false;
                            z10 = F(y11, keyEvent);
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            D(y11, keyEvent);
                            z8 = true;
                            if (z8) {
                            }
                        }
                    }
                    z8 = false;
                    if (z8) {
                    }
                }
            }
        } else if (C()) {
            return true;
        }
        return false;
    }

    public final void u(int i7) {
        u y10 = y(i7);
        if (y10.f18101h != null) {
            Bundle bundle = new Bundle();
            y10.f18101h.t(bundle);
            if (bundle.size() > 0) {
                y10.f18107p = bundle;
            }
            y10.f18101h.w();
            y10.f18101h.clear();
        }
        y10.f18106o = true;
        y10.f18105n = true;
        if ((i7 == 108 || i7 == 0) && this.f18116F != null) {
            u y11 = y(0);
            y11.k = false;
            F(y11, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.f18124O) {
            return;
        }
        int[] iArr = AbstractC1213a.j;
        Context context = this.f18159y;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.f18133X = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f18160z.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f18134Y) {
            viewGroup = this.f18132W ? (ViewGroup) from.inflate(com.kt.apps.media.xemtv.beta.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.kt.apps.media.xemtv.beta.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f18133X) {
            viewGroup = (ViewGroup) from.inflate(com.kt.apps.media.xemtv.beta.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f18131V = false;
            this.f18130U = false;
        } else if (this.f18130U) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1521c(context, typedValue.resourceId) : context).inflate(com.kt.apps.media.xemtv.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1729d0 interfaceC1729d0 = (InterfaceC1729d0) viewGroup.findViewById(com.kt.apps.media.xemtv.beta.R.id.decor_content_parent);
            this.f18116F = interfaceC1729d0;
            interfaceC1729d0.setWindowCallback(this.f18160z.getCallback());
            if (this.f18131V) {
                ((ActionBarOverlayLayout) this.f18116F).j(109);
            }
            if (this.f18128S) {
                ((ActionBarOverlayLayout) this.f18116F).j(2);
            }
            if (this.f18129T) {
                ((ActionBarOverlayLayout) this.f18116F).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f18130U + ", windowActionBarOverlay: " + this.f18131V + ", android:windowIsFloating: " + this.f18133X + ", windowActionModeOverlay: " + this.f18132W + ", windowNoTitle: " + this.f18134Y + " }");
        }
        m mVar = new m(this);
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2352B.l(viewGroup, mVar);
        if (this.f18116F == null) {
            this.f18126Q = (TextView) viewGroup.findViewById(com.kt.apps.media.xemtv.beta.R.id.title);
        }
        boolean z8 = c1.f21486a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.kt.apps.media.xemtv.beta.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f18160z.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f18160z.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0463k(this, 27));
        this.f18125P = viewGroup;
        Object obj = this.f18158x;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f18115E;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1729d0 interfaceC1729d02 = this.f18116F;
            if (interfaceC1729d02 != null) {
                interfaceC1729d02.setWindowTitle(title);
            } else {
                G g = this.f18113C;
                if (g != null) {
                    U0 u02 = (U0) g.f18007h;
                    if (!u02.g) {
                        u02.f21442h = title;
                        if ((u02.f21437b & 8) != 0) {
                            Toolbar toolbar = u02.f21436a;
                            toolbar.setTitle(title);
                            if (u02.g) {
                                K.o(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f18126Q;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f18125P.findViewById(R.id.content);
        View decorView = this.f18160z.getDecorView();
        contentFrameLayout2.f13009u.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f18124O = true;
        u y10 = y(0);
        if (this.f18141f0 || y10.f18101h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f18160z == null) {
            Object obj = this.f18158x;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f18160z == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0169c x(Context context) {
        if (this.f18147l0 == null) {
            if (Q7.h.f8693f == null) {
                Context applicationContext = context.getApplicationContext();
                Q7.h.f8693f = new Q7.h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f18147l0 = new s(this, Q7.h.f8693f);
        }
        return this.f18147l0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [i.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u y(int i7) {
        Object[] objArr;
        u[] uVarArr = this.f18136a0;
        if (uVarArr != null) {
            int length = uVarArr.length;
            objArr = uVarArr;
        }
        u[] uVarArr2 = new u[i7 + 1];
        if (uVarArr != null) {
            System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
        }
        this.f18136a0 = uVarArr2;
        objArr = uVarArr2;
        u uVar = objArr[i7];
        if (uVar != 0) {
            return uVar;
        }
        ?? obj = new Object();
        obj.f18095a = i7;
        obj.f18105n = false;
        objArr[i7] = obj;
        return obj;
    }

    public final void z() {
        v();
        if (this.f18130U && this.f18113C == null) {
            Object obj = this.f18158x;
            if (obj instanceof Activity) {
                this.f18113C = new G((Activity) obj, this.f18131V);
            } else if (obj instanceof Dialog) {
                this.f18113C = new G((Dialog) obj);
            }
            G g = this.f18113C;
            if (g != null) {
                g.Z(this.f18152q0);
            }
        }
    }
}
