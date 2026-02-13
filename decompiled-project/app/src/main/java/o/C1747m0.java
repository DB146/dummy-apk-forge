package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.kt.apps.media.xemtv.beta.R;
import d2.C1044d;
import e3.RunnableC1077b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1747m0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f21538a;

    /* renamed from: b, reason: collision with root package name */
    public int f21539b;

    /* renamed from: c, reason: collision with root package name */
    public int f21540c;

    /* renamed from: d, reason: collision with root package name */
    public int f21541d;

    /* renamed from: e, reason: collision with root package name */
    public int f21542e;

    /* renamed from: f, reason: collision with root package name */
    public int f21543f;

    /* renamed from: u, reason: collision with root package name */
    public C1044d f21544u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21545v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f21546w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21547x;

    /* renamed from: y, reason: collision with root package name */
    public C1.d f21548y;

    /* renamed from: z, reason: collision with root package name */
    public RunnableC1077b f21549z;

    public C1747m0(Context context, boolean z8) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f21538a = new Rect();
        this.f21539b = 0;
        this.f21540c = 0;
        this.f21541d = 0;
        this.f21542e = 0;
        this.f21546w = z8;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i7, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i7) {
        boolean z8;
        boolean z10;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked == 1) {
            z8 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z8 = true;
                    if (z8 || z11) {
                        this.f21547x = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f21543f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z8) {
                        C1.d dVar = this.f21548y;
                        if (dVar != null) {
                            if (dVar.f2462D) {
                                dVar.d();
                            }
                            dVar.f2462D = false;
                        }
                    } else {
                        if (this.f21548y == null) {
                            this.f21548y = new C1.d(this);
                        }
                        C1.d dVar2 = this.f21548y;
                        boolean z12 = dVar2.f2462D;
                        dVar2.f2462D = true;
                        dVar2.onTouch(this, motionEvent);
                    }
                    return z8;
                }
                z8 = false;
                if (z8) {
                }
                this.f21547x = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f21543f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z8) {
                }
                return z8;
            }
            z8 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i7);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y10);
            if (pointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f4 = x2;
                float f10 = y10;
                this.f21547x = true;
                int i10 = Build.VERSION.SDK_INT;
                AbstractC1739i0.a(this, f4, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f21543f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f21543f = pointToPosition;
                AbstractC1739i0.a(childAt3, f4 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || pointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f21538a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f21539b;
                rect.top -= this.f21540c;
                rect.right += this.f21541d;
                rect.bottom += this.f21542e;
                if (i10 >= 33) {
                    z10 = AbstractC1743k0.a(this);
                } else {
                    Field field = AbstractC1745l0.f21537a;
                    if (field != null) {
                        try {
                            z10 = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z10 = false;
                }
                if (childAt3.isEnabled() != z10) {
                    boolean z14 = !z10;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1743k0.b(this, z14);
                    } else {
                        Field field2 = AbstractC1745l0.f21537a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f4, f10);
                }
                C1044d c1044d = this.f21544u;
                if (c1044d != null) {
                    c1044d.f16496b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z8 = true;
                z11 = false;
            }
            if (z8) {
            }
            this.f21547x = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f21543f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z8) {
            }
            return z8;
        }
        z8 = false;
        if (z8) {
        }
        this.f21547x = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f21543f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z8) {
        }
        return z8;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f21538a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f21549z != null) {
            return;
        }
        super.drawableStateChanged();
        C1044d c1044d = this.f21544u;
        if (c1044d != null) {
            c1044d.f16496b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f21547x && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f21546w || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f21546w || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f21546w || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f21546w && this.f21545v) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f21549z = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f21549z == null) {
            RunnableC1077b runnableC1077b = new RunnableC1077b(this, 8);
            this.f21549z = runnableC1077b;
            post(runnableC1077b);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 < 30 || !AbstractC1741j0.f21530d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC1741j0.f21527a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC1741j0.f21528b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC1741j0.f21529c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f21547x && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f21543f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1077b runnableC1077b = this.f21549z;
        if (runnableC1077b != null) {
            C1747m0 c1747m0 = (C1747m0) runnableC1077b.f16710b;
            c1747m0.f21549z = null;
            c1747m0.removeCallbacks(runnableC1077b);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z8) {
        this.f21545v = z8;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1044d c1044d = null;
        if (drawable != null) {
            C1044d c1044d2 = new C1044d(1);
            Drawable drawable2 = (Drawable) c1044d2.f16497c;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1044d2.f16497c = drawable;
            drawable.setCallback(c1044d2);
            c1044d2.f16496b = true;
            c1044d = c1044d2;
        }
        this.f21544u = c1044d;
        super.setSelector(c1044d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f21539b = rect.left;
        this.f21540c = rect.top;
        this.f21541d = rect.right;
        this.f21542e = rect.bottom;
    }
}
