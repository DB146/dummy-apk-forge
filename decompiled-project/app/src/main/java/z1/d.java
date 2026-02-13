package z1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f28159e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f28160f;
    public static final d g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f28161h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f28162i;
    public static final d j;
    public static final d k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f28163l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f28164m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f28165n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f28166o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f28167p;

    /* renamed from: a, reason: collision with root package name */
    public final Object f28168a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28169b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f28170c;

    /* renamed from: d, reason: collision with root package name */
    public final o f28171d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        new d(1, (String) null);
        new d(2, (String) null);
        new d(4, (String) null);
        new d(8, (String) null);
        f28159e = new d(16, (String) null);
        new d(32, (String) null);
        f28160f = new d(64, (String) null);
        g = new d(128, (String) null);
        new d(256, h.class);
        new d(512, h.class);
        new d(1024, i.class);
        new d(2048, i.class);
        f28161h = new d(4096, (String) null);
        f28162i = new d(8192, (String) null);
        new d(16384, (String) null);
        new d(32768, (String) null);
        new d(65536, (String) null);
        new d(131072, m.class);
        j = new d(262144, (String) null);
        k = new d(524288, (String) null);
        f28163l = new d(1048576, (String) null);
        new d(2097152, n.class);
        int i7 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.class);
        f28164m = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f28165n = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f28166o = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f28167p = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new d(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (i7 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction16;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new d(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i7 >= 29) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction15;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, l.class);
        new d(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, j.class);
        if (i7 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction3 = accessibilityAction14;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i7 >= 28) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction4 = accessibilityAction13;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
        new d(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i7 >= 30) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction5 = accessibilityAction12;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, R.id.accessibilityActionImeEnter, null, null, null);
        new d(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
        if (i7 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction6 = accessibilityAction11;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, R.id.CTRL, null, null, null);
        if (i7 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction7 = accessibilityAction10;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, R.id.FUNCTION, null, null, null);
        if (i7 >= 33) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction8 = accessibilityAction9;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, R.id.KEYCODE_0, null, null, null);
        new d(i7 >= 34 ? C1.j.a() : null, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public d(int i7, Class cls) {
        this(null, i7, null, null, cls);
    }

    public d(int i7, String str) {
        this(null, i7, str, null, null);
    }

    public d(Object obj, int i7, String str, o oVar, Class cls) {
        this.f28169b = i7;
        this.f28171d = oVar;
        if (obj == null) {
            this.f28168a = new AccessibilityNodeInfo.AccessibilityAction(i7, str);
        } else {
            this.f28168a = obj;
        }
        this.f28170c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f28168a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f28168a;
        Object obj3 = this.f28168a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f28168a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String d10 = e.d(this.f28169b);
        if (d10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f28168a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d10);
        return sb2.toString();
    }
}
