package i;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1108c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m.AbstractC1519a;
import m.AbstractC1529k;
import m.AbstractC1530l;
import m.AbstractC1531m;
import m.C1521c;
import n.MenuC1678l;
import u.T;
import y1.AbstractC2377z;
import y1.K;
import y1.S;

/* loaded from: classes.dex */
public final class r implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f18086a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18087b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18088c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f18090e;

    public r(v vVar, Window.Callback callback) {
        this.f18090e = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f18086a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f18087b = true;
            callback.onContentChanged();
        } finally {
            this.f18087b = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f18086a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f18086a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        AbstractC1530l.a(this.f18086a, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18086a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.f18088c;
        Window.Callback callback = this.f18086a;
        return z8 ? callback.dispatchKeyEvent(keyEvent) : this.f18090e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z8;
        MenuC1678l menuC1678l;
        boolean performShortcut;
        if (this.f18086a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        v vVar = this.f18090e;
        vVar.z();
        G g = vVar.f18113C;
        if (g != null) {
            F f4 = g.f18009l;
            if (f4 == null || (menuC1678l = f4.f17997d) == null) {
                performShortcut = false;
            } else {
                menuC1678l.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC1678l.performShortcut(keyCode, keyEvent, 0);
            }
        }
        u uVar = vVar.f18137b0;
        if (uVar == null || !vVar.E(uVar, keyEvent.getKeyCode(), keyEvent)) {
            if (vVar.f18137b0 == null) {
                u y10 = vVar.y(0);
                vVar.F(y10, keyEvent);
                boolean E10 = vVar.E(y10, keyEvent.getKeyCode(), keyEvent);
                y10.k = false;
            }
            z8 = false;
            return !z8;
        }
        u uVar2 = vVar.f18137b0;
        if (uVar2 != null) {
            uVar2.f18103l = true;
        }
        z8 = true;
        if (!z8) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18086a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18086a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18086a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f18086a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f18086a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f18086a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f18087b) {
            this.f18086a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof MenuC1678l)) {
            return this.f18086a.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        return this.f18086a.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f18086a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f18086a.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        b(i7, menu);
        v vVar = this.f18090e;
        if (i7 == 108) {
            vVar.z();
            G g = vVar.f18113C;
            if (g != null && true != g.f18012o) {
                g.f18012o = true;
                ArrayList arrayList = g.f18013p;
                if (arrayList.size() > 0) {
                    throw h3.o.i(0, arrayList);
                }
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.f18089d) {
            this.f18086a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        v vVar = this.f18090e;
        if (i7 != 108) {
            if (i7 != 0) {
                vVar.getClass();
                return;
            }
            u y10 = vVar.y(i7);
            if (y10.f18104m) {
                vVar.r(y10, false);
                return;
            }
            return;
        }
        vVar.z();
        G g = vVar.f18113C;
        if (g == null || !g.f18012o) {
            return;
        }
        g.f18012o = false;
        ArrayList arrayList = g.f18013p;
        if (arrayList.size() > 0) {
            throw h3.o.i(0, arrayList);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z8) {
        AbstractC1531m.a(this.f18086a, z8);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        MenuC1678l menuC1678l = menu instanceof MenuC1678l ? (MenuC1678l) menu : null;
        if (i7 == 0 && menuC1678l == null) {
            return false;
        }
        if (menuC1678l != null) {
            menuC1678l.L = true;
        }
        boolean onPreparePanel = this.f18086a.onPreparePanel(i7, view, menu);
        if (menuC1678l != null) {
            menuC1678l.L = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        MenuC1678l menuC1678l = this.f18090e.y(0).f18101h;
        if (menuC1678l != null) {
            d(list, menuC1678l, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f18086a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1529k.a(this.f18086a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18086a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z8) {
        this.f18086a.onWindowFocusChanged(z8);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [q3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [m.a, m.d, java.lang.Object, n.j] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        ViewGroup viewGroup;
        int i10 = 1;
        boolean z8 = false;
        v vVar = this.f18090e;
        if (!vVar.f18123N || i7 != 0) {
            return AbstractC1529k.b(this.f18086a, callback, i7);
        }
        Context context = vVar.f18159y;
        ?? obj = new Object();
        obj.f23383b = context;
        obj.f23382a = callback;
        obj.f23384c = new ArrayList();
        obj.f23385d = new T(0);
        AbstractC1519a abstractC1519a = vVar.f18119I;
        if (abstractC1519a != null) {
            abstractC1519a.a();
        }
        C1108c c1108c = new C1108c(4, vVar, obj, z8);
        vVar.z();
        G g = vVar.f18113C;
        if (g != null) {
            F f4 = g.f18009l;
            if (f4 != null) {
                f4.a();
            }
            g.f18006f.setHideOnContentScrollEnabled(false);
            g.f18008i.e();
            F f10 = new F(g, g.f18008i.getContext(), c1108c);
            MenuC1678l menuC1678l = f10.f17997d;
            menuC1678l.w();
            try {
                if (((q3.i) f10.f17998e.f16831c).A(f10, menuC1678l)) {
                    g.f18009l = f10;
                    f10.i();
                    g.f18008i.c(f10);
                    g.W(true);
                } else {
                    f10 = null;
                }
                vVar.f18119I = f10;
            } finally {
                menuC1678l.v();
            }
        }
        if (vVar.f18119I == null) {
            S s3 = vVar.f18122M;
            if (s3 != null) {
                s3.b();
            }
            AbstractC1519a abstractC1519a2 = vVar.f18119I;
            if (abstractC1519a2 != null) {
                abstractC1519a2.a();
            }
            if (vVar.f18120J == null) {
                boolean z10 = vVar.f18133X;
                Context context2 = vVar.f18159y;
                if (z10) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C1521c c1521c = new C1521c(context2, 0);
                        c1521c.getTheme().setTo(newTheme);
                        context2 = c1521c;
                    }
                    vVar.f18120J = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    vVar.f18121K = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    vVar.f18121K.setContentView(vVar.f18120J);
                    vVar.f18121K.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    vVar.f18120J.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    vVar.f18121K.setHeight(-2);
                    vVar.L = new l(vVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) vVar.f18125P.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        vVar.z();
                        G g2 = vVar.f18113C;
                        Context X10 = g2 != null ? g2.X() : null;
                        if (X10 != null) {
                            context2 = X10;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        vVar.f18120J = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (vVar.f18120J != null) {
                S s10 = vVar.f18122M;
                if (s10 != null) {
                    s10.b();
                }
                vVar.f18120J.e();
                Context context3 = vVar.f18120J.getContext();
                ActionBarContextView actionBarContextView = vVar.f18120J;
                ?? obj2 = new Object();
                obj2.f19626c = context3;
                obj2.f19627d = actionBarContextView;
                obj2.f19628e = c1108c;
                MenuC1678l menuC1678l2 = new MenuC1678l(actionBarContextView.getContext());
                menuC1678l2.f20965z = 1;
                obj2.f19631v = menuC1678l2;
                menuC1678l2.f20958e = obj2;
                if (((q3.i) c1108c.f16831c).A(obj2, menuC1678l2)) {
                    obj2.i();
                    vVar.f18120J.c(obj2);
                    vVar.f18119I = obj2;
                    if (vVar.f18124O && (viewGroup = vVar.f18125P) != null && viewGroup.isLaidOut()) {
                        vVar.f18120J.setAlpha(0.0f);
                        S a9 = K.a(vVar.f18120J);
                        a9.a(1.0f);
                        vVar.f18122M = a9;
                        a9.d(new n(vVar, i10));
                    } else {
                        vVar.f18120J.setAlpha(1.0f);
                        vVar.f18120J.setVisibility(0);
                        if (vVar.f18120J.getParent() instanceof View) {
                            View view = (View) vVar.f18120J.getParent();
                            WeakHashMap weakHashMap = K.f26642a;
                            AbstractC2377z.c(view);
                        }
                    }
                    if (vVar.f18121K != null) {
                        vVar.f18160z.getDecorView().post(vVar.L);
                    }
                } else {
                    vVar.f18119I = null;
                }
            }
            vVar.H();
            vVar.f18119I = vVar.f18119I;
        }
        vVar.H();
        AbstractC1519a abstractC1519a3 = vVar.f18119I;
        if (abstractC1519a3 != null) {
            return obj.t(abstractC1519a3);
        }
        return null;
    }
}
