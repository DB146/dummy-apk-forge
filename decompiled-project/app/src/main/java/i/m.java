package i;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import n.InterfaceC1689w;
import n.MenuC1678l;
import o.b1;
import o.c1;
import y1.InterfaceC2366n;
import y1.K;
import y1.p0;

/* loaded from: classes.dex */
public final class m implements InterfaceC2366n, InterfaceC1689w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f18083a;

    public /* synthetic */ m(v vVar) {
        this.f18083a = vVar;
    }

    @Override // n.InterfaceC1689w
    public void a(MenuC1678l menuC1678l, boolean z8) {
        u uVar;
        MenuC1678l k = menuC1678l.k();
        int i7 = 0;
        boolean z10 = k != menuC1678l;
        if (z10) {
            menuC1678l = k;
        }
        v vVar = this.f18083a;
        u[] uVarArr = vVar.f18136a0;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i7 < length) {
                uVar = uVarArr[i7];
                if (uVar != null && uVar.f18101h == menuC1678l) {
                    break;
                } else {
                    i7++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (!z10) {
                vVar.r(uVar, z8);
            } else {
                vVar.p(uVar.f18095a, uVar, k);
                vVar.r(uVar, true);
            }
        }
    }

    @Override // n.InterfaceC1689w
    public boolean j(MenuC1678l menuC1678l) {
        Window.Callback callback;
        if (menuC1678l != menuC1678l.k()) {
            return true;
        }
        v vVar = this.f18083a;
        if (!vVar.f18130U || (callback = vVar.f18160z.getCallback()) == null || vVar.f18141f0) {
            return true;
        }
        callback.onMenuOpened(108, menuC1678l);
        return true;
    }

    @Override // y1.InterfaceC2366n
    public p0 l(View view, p0 p0Var) {
        boolean z8;
        View view2;
        p0 p0Var2;
        boolean z10;
        int d10 = p0Var.d();
        v vVar = this.f18083a;
        vVar.getClass();
        int d11 = p0Var.d();
        ActionBarContextView actionBarContextView = vVar.f18120J;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z8 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.f18120J.getLayoutParams();
            if (vVar.f18120J.isShown()) {
                if (vVar.f18153r0 == null) {
                    vVar.f18153r0 = new Rect();
                    vVar.f18154s0 = new Rect();
                }
                Rect rect = vVar.f18153r0;
                Rect rect2 = vVar.f18154s0;
                rect.set(p0Var.b(), p0Var.d(), p0Var.c(), p0Var.a());
                ViewGroup viewGroup = vVar.f18125P;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z11 = c1.f21486a;
                    b1.a(viewGroup, rect, rect2);
                } else {
                    if (!c1.f21486a) {
                        c1.f21486a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            c1.f21487b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                c1.f21487b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = c1.f21487b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i7 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = vVar.f18125P;
                WeakHashMap weakHashMap = K.f26642a;
                p0 a9 = y1.C.a(viewGroup2);
                int b2 = a9 == null ? 0 : a9.b();
                int c10 = a9 == null ? 0 : a9.c();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z10 = true;
                }
                Context context = vVar.f18159y;
                if (i7 <= 0 || vVar.f18127R != null) {
                    View view3 = vVar.f18127R;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c10;
                            vVar.f18127R.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view4 = new View(context);
                    vVar.f18127R = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c10;
                    vVar.f18125P.addView(vVar.f18127R, -1, layoutParams);
                }
                View view5 = vVar.f18127R;
                r8 = view5 != null;
                if (r8 && view5.getVisibility() != 0) {
                    View view6 = vVar.f18127R;
                    view6.setBackgroundColor((view6.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC1449a.getColor(context, R.color.abc_decor_view_status_guard_light) : AbstractC1449a.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!vVar.f18132W && r8) {
                    d11 = 0;
                }
                z8 = r8;
                r8 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z8 = false;
            } else {
                z8 = false;
                r8 = false;
            }
            if (r8) {
                vVar.f18120J.setLayoutParams(marginLayoutParams);
            }
        }
        View view7 = vVar.f18127R;
        if (view7 != null) {
            view7.setVisibility(z8 ? 0 : 8);
        }
        if (d10 != d11) {
            p0Var2 = p0Var.f(p0Var.b(), d11, p0Var.c(), p0Var.a());
            view2 = view;
        } else {
            view2 = view;
            p0Var2 = p0Var;
        }
        return K.i(view2, p0Var2);
    }
}
