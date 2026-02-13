package A9;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: A9.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0124p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f1341a = new Rect();

    public static int a(View view, C0116n1 c0116n1, int i7) {
        View view2;
        int i10;
        int height;
        int width;
        int width2;
        int width3;
        J0 j02 = (J0) view.getLayoutParams();
        int i11 = c0116n1.f1299a;
        if (i11 == 0 || (view2 = view.findViewById(i11)) == null) {
            view2 = view;
        }
        int i12 = c0116n1.f1301c;
        Rect rect = f1341a;
        if (i7 != 0) {
            if (c0116n1.f1303e) {
                float f4 = c0116n1.f1302d;
                if (f4 == 0.0f) {
                    i12 += view2.getPaddingTop();
                } else if (f4 == 100.0f) {
                    i12 -= view2.getPaddingBottom();
                }
            }
            if (c0116n1.f1302d != -1.0f) {
                if (view2 == view) {
                    j02.getClass();
                    height = (view2.getHeight() - j02.f844f) - j02.f846v;
                } else {
                    height = view2.getHeight();
                }
                i12 += (int) ((height * c0116n1.f1302d) / 100.0f);
            }
            if (view != view2) {
                rect.top = i12;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                i10 = rect.top - j02.f844f;
            } else {
                i10 = i12;
            }
            return c0116n1.f1304f ? i10 + view2.getBaseline() : i10;
        }
        if (view.getLayoutDirection() != 1) {
            if (c0116n1.f1303e) {
                float f10 = c0116n1.f1302d;
                if (f10 == 0.0f) {
                    i12 += view2.getPaddingLeft();
                } else if (f10 == 100.0f) {
                    i12 -= view2.getPaddingRight();
                }
            }
            if (c0116n1.f1302d != -1.0f) {
                if (view2 == view) {
                    j02.getClass();
                    width = (view2.getWidth() - j02.f843e) - j02.f845u;
                } else {
                    width = view2.getWidth();
                }
                i12 += (int) ((width * c0116n1.f1302d) / 100.0f);
            }
            int i13 = i12;
            if (view == view2) {
                return i13;
            }
            rect.left = i13;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
            return rect.left - j02.f843e;
        }
        if (view2 == view) {
            j02.getClass();
            width2 = (view2.getWidth() - j02.f843e) - j02.f845u;
        } else {
            width2 = view2.getWidth();
        }
        int i14 = width2 - i12;
        if (c0116n1.f1303e) {
            float f11 = c0116n1.f1302d;
            if (f11 == 0.0f) {
                i14 -= view2.getPaddingRight();
            } else if (f11 == 100.0f) {
                i14 += view2.getPaddingLeft();
            }
        }
        if (c0116n1.f1302d != -1.0f) {
            if (view2 == view) {
                j02.getClass();
                width3 = (view2.getWidth() - j02.f843e) - j02.f845u;
            } else {
                width3 = view2.getWidth();
            }
            i14 -= (int) ((width3 * c0116n1.f1302d) / 100.0f);
        }
        if (view == view2) {
            return i14;
        }
        rect.right = i14;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
        return rect.right + j02.f845u;
    }
}
