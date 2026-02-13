package a3;

import A9.Q1;
import Y5.C0660y;
import a.AbstractC0672a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: a3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728e extends u {

    /* renamed from: S, reason: collision with root package name */
    public static final String[] f12531S = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: T, reason: collision with root package name */
    public static final Q1 f12532T = new Q1(4, PointF.class, "topLeft");

    /* renamed from: U, reason: collision with root package name */
    public static final Q1 f12533U = new Q1(5, PointF.class, "bottomRight");

    /* renamed from: V, reason: collision with root package name */
    public static final Q1 f12534V = new Q1(6, PointF.class, "bottomRight");

    /* renamed from: W, reason: collision with root package name */
    public static final Q1 f12535W = new Q1(7, PointF.class, "topLeft");

    /* renamed from: X, reason: collision with root package name */
    public static final Q1 f12536X = new Q1(8, PointF.class, "position");

    public static void O(C0712D c0712d) {
        View view = c0712d.f12499b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = c0712d.f12498a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", c0712d.f12499b.getParent());
    }

    @Override // a3.u
    public final void e(C0712D c0712d) {
        O(c0712d);
    }

    @Override // a3.u
    public final void h(C0712D c0712d) {
        O(c0712d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a3.u
    public final Animator l(ViewGroup viewGroup, C0712D c0712d, C0712D c0712d2) {
        int i7;
        ObjectAnimator a9;
        if (c0712d == null || c0712d2 == null) {
            return null;
        }
        HashMap hashMap = c0712d.f12498a;
        HashMap hashMap2 = c0712d2.f12498a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i10 = rect.left;
        int i11 = rect2.left;
        int i12 = rect.top;
        int i13 = rect2.top;
        int i14 = rect.right;
        int i15 = rect2.right;
        int i16 = rect.bottom;
        int i17 = rect2.bottom;
        int i18 = i14 - i10;
        int i19 = i16 - i12;
        int i20 = i15 - i11;
        int i21 = i17 - i13;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
            i7 = 0;
        } else {
            i7 = (i10 == i11 && i12 == i13) ? 0 : 1;
            if (i14 != i15 || i16 != i17) {
                i7++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i7++;
        }
        if (i7 <= 0) {
            return null;
        }
        View view = c0712d2.f12499b;
        AbstractC0714F.a(view, i10, i12, i14, i16);
        if (i7 == 2) {
            if (i18 == i20 && i19 == i21) {
                this.f12584K.getClass();
                a9 = AbstractC0736m.a(view, f12536X, C0660y.c(i10, i12, i11, i13));
            } else {
                C0727d c0727d = new C0727d(view);
                this.f12584K.getClass();
                ObjectAnimator a10 = AbstractC0736m.a(c0727d, f12532T, C0660y.c(i10, i12, i11, i13));
                this.f12584K.getClass();
                ObjectAnimator a11 = AbstractC0736m.a(c0727d, f12533U, C0660y.c(i14, i16, i15, i17));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a10, a11);
                animatorSet.addListener(new C0725b(c0727d));
                a9 = animatorSet;
            }
        } else if (i10 == i11 && i12 == i13) {
            this.f12584K.getClass();
            a9 = AbstractC0736m.a(view, f12534V, C0660y.c(i14, i16, i15, i17));
        } else {
            this.f12584K.getClass();
            a9 = AbstractC0736m.a(view, f12535W, C0660y.c(i10, i12, i11, i13));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC0672a.r(viewGroup4, true);
            p().a(new C0726c(viewGroup4));
        }
        return a9;
    }

    @Override // a3.u
    public final String[] r() {
        return f12531S;
    }

    @Override // a3.u
    public final boolean u() {
        return true;
    }
}
