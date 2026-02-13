package androidx.appcompat.widget;

import P4.C0463k;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import i.v;
import n.MenuC1678l;
import o.C1732f;
import o.C1740j;
import o.InterfaceC1727c0;
import o.InterfaceC1729d0;
import o.U0;
import y1.S;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f13003a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f13004b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f13005c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f13006d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f13007e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f13008f;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f13009u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1727c0 f13010v;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13009u = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f13007e == null) {
            this.f13007e = new TypedValue();
        }
        return this.f13007e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f13008f == null) {
            this.f13008f = new TypedValue();
        }
        return this.f13008f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f13005c == null) {
            this.f13005c = new TypedValue();
        }
        return this.f13005c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f13006d == null) {
            this.f13006d = new TypedValue();
        }
        return this.f13006d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f13003a == null) {
            this.f13003a = new TypedValue();
        }
        return this.f13003a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f13004b == null) {
            this.f13004b = new TypedValue();
        }
        return this.f13004b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1727c0 interfaceC1727c0 = this.f13010v;
        if (interfaceC1727c0 != null) {
            interfaceC1727c0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1740j c1740j;
        super.onDetachedFromWindow();
        InterfaceC1727c0 interfaceC1727c0 = this.f13010v;
        if (interfaceC1727c0 != null) {
            v vVar = (v) ((C0463k) interfaceC1727c0).f8074b;
            InterfaceC1729d0 interfaceC1729d0 = vVar.f18116F;
            if (interfaceC1729d0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1729d0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((U0) actionBarOverlayLayout.f12965e).f21436a.f13079a;
                if (actionMenuView != null && (c1740j = actionMenuView.f12977H) != null) {
                    c1740j.c();
                    C1732f c1732f = c1740j.f21511H;
                    if (c1732f != null && c1732f.b()) {
                        c1732f.f21016i.dismiss();
                    }
                }
            }
            if (vVar.f18121K != null) {
                vVar.f18160z.getDecorView().removeCallbacks(vVar.L);
                if (vVar.f18121K.isShowing()) {
                    try {
                        vVar.f18121K.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f18121K = null;
            }
            S s3 = vVar.f18122M;
            if (s3 != null) {
                s3.b();
            }
            MenuC1678l menuC1678l = vVar.y(0).f18101h;
            if (menuC1678l != null) {
                menuC1678l.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean z8;
        int i12;
        int measuredWidth;
        TypedValue typedValue;
        int i13;
        int i14;
        float fraction;
        int i15;
        int i16;
        float fraction2;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z10 = true;
        boolean z11 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f13009u;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z11 ? this.f13006d : this.f13005c;
            if (typedValue2 != null && (i17 = typedValue2.type) != 0) {
                if (i17 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i17 == 6) {
                    int i19 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i19, i19);
                } else {
                    i18 = 0;
                    if (i18 > 0) {
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z8 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z11 ? this.f13007e : this.f13008f;
                            if (typedValue3 != null && (i15 = typedValue3.type) != 0) {
                                if (i15 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i15 == 6) {
                                    int i20 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i20, i20);
                                } else {
                                    i16 = 0;
                                    if (i16 > 0) {
                                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                                        super.onMeasure(i11, i12);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z8 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z11 ? this.f13004b : this.f13003a;
                                            if (typedValue != null && (i13 = typedValue.type) != 0) {
                                                if (i13 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i13 == 6) {
                                                    int i21 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i21, i21);
                                                } else {
                                                    i14 = 0;
                                                    if (i14 > 0) {
                                                        i14 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i14) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                                        if (z10) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i12);
                                                        return;
                                                    }
                                                }
                                                i14 = (int) fraction;
                                                if (i14 > 0) {
                                                }
                                                if (measuredWidth < i14) {
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (z10) {
                                        }
                                    }
                                }
                                i16 = (int) fraction2;
                                if (i16 > 0) {
                                }
                            }
                        }
                        i12 = i10;
                        super.onMeasure(i11, i12);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z8) {
                            if (!z11) {
                            }
                            if (typedValue != null) {
                                if (i13 != 5) {
                                }
                                i14 = (int) fraction;
                                if (i14 > 0) {
                                }
                                if (measuredWidth < i14) {
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                }
            }
        }
        i11 = i7;
        z8 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i12 = i10;
        super.onMeasure(i11, i12);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z8) {
        }
        z10 = false;
        if (z10) {
        }
    }

    public void setAttachListener(InterfaceC1727c0 interfaceC1727c0) {
        this.f13010v = interfaceC1727c0;
    }
}
