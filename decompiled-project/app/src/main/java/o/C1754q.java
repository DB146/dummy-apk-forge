package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import h.AbstractC1213a;

/* renamed from: o.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1754q {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f21573a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f21574b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21575c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21576d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21577e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f21578f;

    public /* synthetic */ C1754q(TextView textView) {
        this.f21578f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f21578f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f21575c || this.f21576d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f21575c) {
                    mutate.setTintList(this.f21573a);
                }
                if (this.f21576d) {
                    mutate.setTintMode(this.f21574b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C1752p c1752p = (C1752p) this.f21578f;
        Drawable checkMarkDrawable = c1752p.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f21575c || this.f21576d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f21575c) {
                    mutate.setTintList(this.f21573a);
                }
                if (this.f21576d) {
                    mutate.setTintMode(this.f21574b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c1752p.getDrawableState());
                }
                c1752p.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x0024, B:5:0x002b, B:8:0x0031, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x0024, B:5:0x002b, B:8:0x0031, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f21578f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1213a.f17575m;
        l2.X u3 = l2.X.u(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        y1.K.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) u3.f19195c, i7, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(Q5.e.x(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(u3.m(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(AbstractC1737h0.c(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(Q5.e.x(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            u3.w();
        }
    }
}
