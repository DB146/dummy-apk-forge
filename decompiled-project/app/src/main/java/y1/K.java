package y1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.datastore.preferences.protobuf.AbstractC0807j;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C1759t;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f26642a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f26643b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f26644c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f26645d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final C2374w f26646e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC2376y f26647f = new ViewTreeObserverOnGlobalLayoutListenerC2376y();

    public static S a(View view) {
        if (f26642a == null) {
            f26642a = new WeakHashMap();
        }
        S s3 = (S) f26642a.get(view);
        if (s3 != null) {
            return s3;
        }
        S s10 = new S(view);
        f26642a.put(view, s10);
        return s10;
    }

    public static p0 b(View view, p0 p0Var) {
        int i7 = Build.VERSION.SDK_INT;
        WindowInsets g = p0Var.g();
        if (g != null) {
            WindowInsets a9 = i7 >= 30 ? H.a(view, g) : AbstractC2377z.a(view, g);
            if (!a9.equals(g)) {
                return p0.h(view, a9);
            }
        }
        return p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [y1.J, java.lang.Object] */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = J.f26638d;
        J j = (J) view.getTag(R.id.tag_unhandled_key_event_manager);
        J j10 = j;
        if (j == null) {
            ?? obj = new Object();
            obj.f26639a = null;
            obj.f26640b = null;
            obj.f26641c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            j10 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = j10.f26639a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = J.f26638d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (j10.f26639a == null) {
                            j10.f26639a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = J.f26638d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                j10.f26639a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    j10.f26639a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a9 = j10.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a9 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (j10.f26640b == null) {
                    j10.f26640b = new SparseArray();
                }
                j10.f26640b.put(keyCode, new WeakReference(a9));
            }
        }
        return a9 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return G.a(view);
        }
        if (f26644c) {
            return null;
        }
        if (f26643b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f26643b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f26644c = true;
                return null;
            }
        }
        try {
            Object obj = f26643b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f26644c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = F.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(C1759t c1759t) {
        return Build.VERSION.SDK_INT >= 31 ? I.a(c1759t) : (String[]) c1759t.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z8 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z8) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z8 ? 32 : 2048);
                obtain.setContentChangeTypes(i7);
                if (z8) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i7);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static p0 i(View view, p0 p0Var) {
        WindowInsets g = p0Var.g();
        if (g != null) {
            WindowInsets b2 = AbstractC2377z.b(view, g);
            if (!b2.equals(g)) {
                return p0.h(view, b2);
            }
        }
        return p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2359g j(View view, C2359g c2359g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c2359g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return I.b(view, c2359g);
        }
        C1.l lVar = (C1.l) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2367o interfaceC2367o = f26646e;
        if (lVar == null) {
            if (view instanceof InterfaceC2367o) {
                interfaceC2367o = (InterfaceC2367o) view;
            }
            return interfaceC2367o.a(c2359g);
        }
        C2359g a9 = C1.l.a(view, c2359g);
        if (a9 == null) {
            return null;
        }
        if (view instanceof InterfaceC2367o) {
            interfaceC2367o = (InterfaceC2367o) view;
        }
        return interfaceC2367o.a(a9);
    }

    public static void k(View view, int i7) {
        ArrayList f4 = f(view);
        for (int i10 = 0; i10 < f4.size(); i10++) {
            if (((z1.d) f4.get(i10)).a() == i7) {
                f4.remove(i10);
                return;
            }
        }
    }

    public static void l(View view, z1.d dVar, z1.o oVar) {
        z1.d dVar2 = new z1.d(null, dVar.f28169b, null, oVar, dVar.f28170c);
        View.AccessibilityDelegate d10 = d(view);
        C2354b c2354b = d10 == null ? null : d10 instanceof C2353a ? ((C2353a) d10).f26677a : new C2354b(d10);
        if (c2354b == null) {
            c2354b = new C2354b();
        }
        n(view, c2354b);
        k(view, dVar2.a());
        f(view).add(dVar2);
        h(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            G.b(view, context, iArr, attributeSet, typedArray, i7, i10);
        }
    }

    public static void n(View view, C2354b c2354b) {
        if (c2354b == null && (d(view) instanceof C2353a)) {
            c2354b = new C2354b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2354b == null ? null : c2354b.f26681b);
    }

    public static void o(View view, CharSequence charSequence) {
        new C2375x(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).e(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC2376y viewTreeObserverOnGlobalLayoutListenerC2376y = f26647f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC2376y.f26745a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2376y);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2376y);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC2376y.f26745a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2376y);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2376y);
            }
        }
    }

    public static void p(View view, AbstractC0807j abstractC0807j) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC0807j != null ? new X(abstractC0807j) : null);
            return;
        }
        PathInterpolator pathInterpolator = W.f26665e;
        View.OnApplyWindowInsetsListener v10 = abstractC0807j != null ? new V(view, abstractC0807j) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, v10);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(v10);
        }
    }
}
