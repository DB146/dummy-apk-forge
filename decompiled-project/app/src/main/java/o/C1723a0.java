package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723a0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f21471l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f21472m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f21473a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21474b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f21475c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f21476d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f21477e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f21478f = new int[0];
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f21479h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f21480i;
    public final Context j;
    public final X k;

    public C1723a0(TextView textView) {
        this.f21480i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new Y();
        } else {
            this.k = new X();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f21472m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f21474b) {
                if (this.f21480i.getMeasuredHeight() <= 0 || this.f21480i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.f21480i) ? 1048576 : (this.f21480i.getMeasuredWidth() - this.f21480i.getTotalPaddingLeft()) - this.f21480i.getTotalPaddingRight();
                int height = (this.f21480i.getHeight() - this.f21480i.getCompoundPaddingBottom()) - this.f21480i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f21471l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f21480i.getTextSize()) {
                            g(0, c10);
                        }
                    } finally {
                    }
                }
            }
            this.f21474b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f21478f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i7) {
            int i12 = (i11 + i7) / 2;
            int i13 = this.f21478f[i12];
            TextView textView = this.f21480i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f21479h;
            if (textPaint == null) {
                this.f21479h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f21479h.set(textView.getPaint());
            this.f21479h.setTextSize(i13);
            StaticLayout a9 = W.a(text, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f21480i, this.f21479h, this.k);
            if ((maxLines == -1 || (a9.getLineCount() <= maxLines && a9.getLineEnd(a9.getLineCount() - 1) == text.length())) && a9.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i7 = i10;
            }
        }
        return this.f21478f[i10];
    }

    public final boolean f() {
        return j() && this.f21473a != 0;
    }

    public final void g(int i7, float f4) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i7, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f21480i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f21474b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f21473a == 1) {
            if (!this.g || this.f21478f.length == 0) {
                int floor = ((int) Math.floor((this.f21477e - this.f21476d) / this.f21475c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f21475c) + this.f21476d);
                }
                this.f21478f = b(iArr);
            }
            this.f21474b = true;
        } else {
            this.f21474b = false;
        }
        return this.f21474b;
    }

    public final boolean i() {
        boolean z8 = this.f21478f.length > 0;
        this.g = z8;
        if (z8) {
            this.f21473a = 1;
            this.f21476d = r0[0];
            this.f21477e = r0[r1 - 1];
            this.f21475c = -1.0f;
        }
        return z8;
    }

    public final boolean j() {
        return !(this.f21480i instanceof C1759t);
    }

    public final void k(float f4, float f10, float f11) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f10 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f21473a = 1;
        this.f21476d = f4;
        this.f21477e = f10;
        this.f21475c = f11;
        this.g = false;
    }
}
