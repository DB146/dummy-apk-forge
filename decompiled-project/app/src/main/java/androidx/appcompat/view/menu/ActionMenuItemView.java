package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import h.AbstractC1213a;
import n.AbstractC1669c;
import n.C1668b;
import n.C1680n;
import n.InterfaceC1677k;
import n.InterfaceC1691y;
import n.MenuC1678l;
import o.InterfaceC1742k;
import y7.u0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC1691y, View.OnClickListener, InterfaceC1742k {

    /* renamed from: A, reason: collision with root package name */
    public AbstractC1669c f12884A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f12885B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f12886C;

    /* renamed from: D, reason: collision with root package name */
    public final int f12887D;

    /* renamed from: E, reason: collision with root package name */
    public int f12888E;

    /* renamed from: F, reason: collision with root package name */
    public final int f12889F;

    /* renamed from: v, reason: collision with root package name */
    public C1680n f12890v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f12891w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f12892x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC1677k f12893y;

    /* renamed from: z, reason: collision with root package name */
    public C1668b f12894z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f12885B = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17568c, 0, 0);
        this.f12887D = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f12889F = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f12888E = -1;
        setSaveEnabled(false);
    }

    @Override // n.InterfaceC1691y
    public final void a(C1680n c1680n) {
        this.f12890v = c1680n;
        setIcon(c1680n.getIcon());
        setTitle(c1680n.getTitleCondensed());
        setId(c1680n.f20985a);
        setVisibility(c1680n.isVisible() ? 0 : 8);
        setEnabled(c1680n.isEnabled());
        if (c1680n.hasSubMenu() && this.f12894z == null) {
            this.f12894z = new C1668b(this);
        }
    }

    @Override // o.InterfaceC1742k
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.InterfaceC1742k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f12890v.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // n.InterfaceC1691y
    public C1680n getItemData() {
        return this.f12890v;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z8 = true;
        boolean z10 = !TextUtils.isEmpty(this.f12891w);
        if (this.f12892x != null && ((this.f12890v.f20980M & 4) != 4 || (!this.f12885B && !this.f12886C))) {
            z8 = false;
        }
        boolean z11 = z10 & z8;
        setText(z11 ? this.f12891w : null);
        CharSequence charSequence = this.f12890v.f20973E;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f12890v.f20989e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f12890v.f20974F;
        if (TextUtils.isEmpty(charSequence2)) {
            u0.K(this, z11 ? null : this.f12890v.f20989e);
        } else {
            u0.K(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1677k interfaceC1677k = this.f12893y;
        if (interfaceC1677k != null) {
            interfaceC1677k.c(this.f12890v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12885B = h();
        i();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i11 = this.f12888E) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f12887D;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i10);
        }
        if (!isEmpty || this.f12892x == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f12892x.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1668b c1668b;
        if (this.f12890v.hasSubMenu() && (c1668b = this.f12894z) != null && c1668b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z8) {
    }

    public void setChecked(boolean z8) {
    }

    public void setExpandedFormat(boolean z8) {
        if (this.f12886C != z8) {
            this.f12886C = z8;
            C1680n c1680n = this.f12890v;
            if (c1680n != null) {
                MenuC1678l menuC1678l = c1680n.f20970B;
                menuC1678l.f20964y = true;
                menuC1678l.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f12892x = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f12889F;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(InterfaceC1677k interfaceC1677k) {
        this.f12893y = interfaceC1677k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f12888E = i7;
        super.setPadding(i7, i10, i11, i12);
    }

    public void setPopupCallback(AbstractC1669c abstractC1669c) {
        this.f12884A = abstractC1669c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f12891w = charSequence;
        i();
    }
}
