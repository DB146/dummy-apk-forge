package I1;

import B0.H;
import U9.i;
import U9.j;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.f;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import m6.C1628d;
import u.AbstractC2065s;
import u.U;
import y1.C2354b;
import y1.C2355c;
import y1.K;
import z1.e;

/* loaded from: classes.dex */
public abstract class a extends C2354b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f4967n = new Rect(f.API_PRIORITY_OTHER, f.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final i f4968o = new i(6);

    /* renamed from: p, reason: collision with root package name */
    public static final j f4969p = new j(6);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f4973h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f4974i;
    public H j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4970d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4971e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f4972f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f4975l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f4976m = Integer.MIN_VALUE;

    public a(Chip chip) {
        this.f4974i = chip;
        this.f4973h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = K.f26642a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // y1.C2354b
    public final C2355c b(View view) {
        if (this.j == null) {
            this.j = new H(this, 1);
        }
        return this.j;
    }

    @Override // y1.C2354b
    public final void d(View view, e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f26680a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C1628d) this).f20691q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        eVar.i(chip.getAccessibilityClassName());
        eVar.n(chip.getText());
    }

    public final boolean j(int i7) {
        if (this.f4975l != i7) {
            return false;
        }
        this.f4975l = Integer.MIN_VALUE;
        C1628d c1628d = (C1628d) this;
        if (i7 == 1) {
            Chip chip = c1628d.f20691q;
            chip.f15267B = false;
            chip.refreshDrawableState();
        }
        q(i7, 8);
        return true;
    }

    public final e k(int i7) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        e eVar = new e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        eVar.i("android.view.View");
        Rect rect = f4967n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        eVar.f28174b = -1;
        Chip chip = this.f4974i;
        obtain.setParent(chip);
        o(i7, eVar);
        if (eVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f4971e;
        eVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        eVar.f28175c = i7;
        obtain.setSource(chip, i7);
        if (this.k == i7) {
            obtain.setAccessibilityFocused(true);
            eVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            eVar.a(64);
        }
        boolean z8 = this.f4975l == i7;
        if (z8) {
            eVar.a(2);
        } else if (obtain.isFocusable()) {
            eVar.a(1);
        }
        obtain.setFocused(z8);
        int[] iArr = this.g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f4970d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            eVar.f(rect3);
            if (eVar.f28174b != -1) {
                e eVar2 = new e(AccessibilityNodeInfo.obtain());
                for (int i10 = eVar.f28174b; i10 != -1; i10 = eVar2.f28174b) {
                    eVar2.f28174b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = eVar2.f28173a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i10, eVar2);
                    eVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f4972f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f28173a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i7, Rect rect) {
        int i10;
        int i11;
        Object obj;
        e eVar;
        int i12;
        int f4;
        int i13;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        U u3 = new U(0);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            u3.e(((Integer) arrayList.get(i14)).intValue(), k(((Integer) arrayList.get(i14)).intValue()));
        }
        int i15 = this.f4975l;
        int i16 = Integer.MIN_VALUE;
        e eVar2 = i15 == Integer.MIN_VALUE ? null : (e) u3.c(i15);
        i iVar = f4968o;
        j jVar = f4969p;
        Chip chip = this.f4974i;
        if (i7 == 1 || i7 == 2) {
            i10 = 0;
            i11 = -1;
            WeakHashMap weakHashMap = K.f26642a;
            boolean z8 = chip.getLayoutDirection() == 1;
            jVar.getClass();
            int f10 = u3.f();
            ArrayList arrayList2 = new ArrayList(f10);
            for (int i17 = 0; i17 < f10; i17++) {
                arrayList2.add((e) u3.g(i17));
            }
            Collections.sort(arrayList2, new b(z8, iVar));
            if (i7 == 1) {
                int size = arrayList2.size();
                if (eVar2 != null) {
                    size = arrayList2.indexOf(eVar2);
                }
                int i18 = size - 1;
                if (i18 >= 0) {
                    obj = arrayList2.get(i18);
                    eVar = (e) obj;
                }
                obj = null;
                eVar = (e) obj;
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (eVar2 == null ? -1 : arrayList2.lastIndexOf(eVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    eVar = (e) obj;
                }
                obj = null;
                eVar = (e) obj;
            }
        } else {
            if (i7 != 17 && i7 != 33 && i7 != 66 && i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i19 = this.f4975l;
            if (i19 != Integer.MIN_VALUE) {
                n(i19).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i7 == 17) {
                    i11 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i7 == 33) {
                    i11 = -1;
                    rect2.set(0, height, width, height);
                } else if (i7 == 66) {
                    rect2.set(-1, 0, -1, height);
                    i11 = -1;
                } else {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i11 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i7 != 17) {
                    i10 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i7 == 33) {
                    i10 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i7 == 66) {
                    i10 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i10 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                jVar.getClass();
                f4 = u3.f();
                Rect rect4 = new Rect();
                eVar = null;
                for (i13 = i10; i13 < f4; i13++) {
                    e eVar3 = (e) u3.g(i13);
                    if (eVar3 != eVar2) {
                        iVar.getClass();
                        eVar3.f(rect4);
                        if (Y6.b.q(i7, rect2, rect4)) {
                            if (Y6.b.q(i7, rect2, rect3) && !Y6.b.d(i7, rect2, rect4, rect3)) {
                                if (!Y6.b.d(i7, rect2, rect3, rect4)) {
                                    int r10 = Y6.b.r(i7, rect2, rect4);
                                    int s3 = Y6.b.s(i7, rect2, rect4);
                                    int i20 = (s3 * s3) + (r10 * 13 * r10);
                                    int r11 = Y6.b.r(i7, rect2, rect3);
                                    int s10 = Y6.b.s(i7, rect2, rect3);
                                    if (i20 >= (s10 * s10) + (r11 * 13 * r11)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            eVar = eVar3;
                        }
                    }
                }
            }
            i11 = -1;
            Rect rect32 = new Rect(rect2);
            if (i7 != 17) {
            }
            jVar.getClass();
            f4 = u3.f();
            Rect rect42 = new Rect();
            eVar = null;
            while (i13 < f4) {
            }
        }
        e eVar4 = eVar;
        if (eVar4 != null) {
            if (u3.f24638a) {
                AbstractC2065s.a(u3);
            }
            int i21 = u3.f24641d;
            int i22 = i10;
            while (true) {
                if (i22 >= i21) {
                    i12 = i11;
                    break;
                }
                if (u3.f24640c[i22] == eVar4) {
                    i12 = i22;
                    break;
                }
                i22++;
            }
            i16 = u3.d(i12);
        }
        return p(i16);
    }

    public final e n(int i7) {
        if (i7 != -1) {
            return k(i7);
        }
        Chip chip = this.f4974i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        e eVar = new e(obtain);
        WeakHashMap weakHashMap = K.f26642a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            eVar.f28173a.addChild(chip, ((Integer) arrayList.get(i10)).intValue());
        }
        return eVar;
    }

    public abstract void o(int i7, e eVar);

    public final boolean p(int i7) {
        int i10;
        Chip chip = this.f4974i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i10 = this.f4975l) == i7) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i7 == Integer.MIN_VALUE) {
            return false;
        }
        this.f4975l = i7;
        C1628d c1628d = (C1628d) this;
        if (i7 == 1) {
            Chip chip2 = c1628d.f20691q;
            chip2.f15267B = true;
            chip2.refreshDrawableState();
        }
        q(i7, 8);
        return true;
    }

    public final void q(int i7, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i7 == Integer.MIN_VALUE || !this.f4973h.isEnabled() || (parent = (view = this.f4974i).getParent()) == null) {
            return;
        }
        if (i7 != -1) {
            obtain = AccessibilityEvent.obtain(i10);
            e n6 = n(i7);
            obtain.getText().add(n6.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n6.f28173a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i7);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
