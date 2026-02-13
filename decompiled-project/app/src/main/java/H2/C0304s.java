package H2;

import A9.C0;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: H2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304s extends Q {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f4798C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f4799D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f4800A;

    /* renamed from: B, reason: collision with root package name */
    public final B0.C f4801B;

    /* renamed from: a, reason: collision with root package name */
    public final int f4802a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4803b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f4804c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f4805d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4806e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4807f;
    public final StateListDrawable g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f4808h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4809i;
    public final int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f4810l;

    /* renamed from: m, reason: collision with root package name */
    public float f4811m;

    /* renamed from: n, reason: collision with root package name */
    public int f4812n;

    /* renamed from: o, reason: collision with root package name */
    public int f4813o;

    /* renamed from: p, reason: collision with root package name */
    public float f4814p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f4817s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f4824z;

    /* renamed from: q, reason: collision with root package name */
    public int f4815q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f4816r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4818t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4819u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f4820v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f4821w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4822x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4823y = new int[2];

    public C0304s(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4824z = ofFloat;
        this.f4800A = 0;
        B0.C c10 = new B0.C(this, 5);
        this.f4801B = c10;
        C0 c02 = new C0(this, 3);
        this.f4804c = stateListDrawable;
        this.f4805d = drawable;
        this.g = stateListDrawable2;
        this.f4808h = drawable2;
        this.f4806e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f4807f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f4809i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f4802a = i10;
        this.f4803b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new r(this));
        ofFloat.addUpdateListener(new B6.c(this, 2));
        RecyclerView recyclerView2 = this.f4817s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            androidx.recyclerview.widget.a aVar = recyclerView2.f13614B;
            if (aVar != null) {
                aVar.d("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f13619E;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.S();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f4817s;
            recyclerView3.f13621F.remove(this);
            if (recyclerView3.f13623G == this) {
                recyclerView3.f13623G = null;
            }
            ArrayList arrayList2 = this.f4817s.f13680x0;
            if (arrayList2 != null) {
                arrayList2.remove(c02);
            }
            this.f4817s.removeCallbacks(c10);
        }
        this.f4817s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f4817s.f13621F.add(this);
            this.f4817s.j(c02);
        }
    }

    public static int e(float f4, float f10, int[] iArr, int i7, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 == 0) {
            return 0;
        }
        int i13 = i7 - i11;
        int i14 = (int) (((f10 - f4) / i12) * i13);
        int i15 = i10 + i14;
        if (i15 >= i13 || i15 < 0) {
            return 0;
        }
        return i14;
    }

    @Override // H2.Q
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i7 = this.f4815q;
        RecyclerView recyclerView2 = this.f4817s;
        if (i7 != recyclerView2.getWidth() || this.f4816r != recyclerView2.getHeight()) {
            this.f4815q = recyclerView2.getWidth();
            this.f4816r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f4800A != 0) {
            if (this.f4818t) {
                int i10 = this.f4815q;
                int i11 = this.f4806e;
                int i12 = i10 - i11;
                int i13 = this.f4810l;
                int i14 = this.k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f4804c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f4816r;
                int i17 = this.f4807f;
                Drawable drawable = this.f4805d;
                drawable.setBounds(0, 0, i17, i16);
                WeakHashMap weakHashMap = y1.K.f26642a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f4819u) {
                int i18 = this.f4816r;
                int i19 = this.f4809i;
                int i20 = i18 - i19;
                int i21 = this.f4813o;
                int i22 = this.f4812n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f4815q;
                int i25 = this.j;
                Drawable drawable2 = this.f4808h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    public final boolean c(float f4, float f10) {
        if (f10 >= this.f4816r - this.f4809i) {
            int i7 = this.f4813o;
            int i10 = this.f4812n;
            if (f4 >= i7 - (i10 / 2) && f4 <= (i10 / 2) + i7) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f4, float f10) {
        RecyclerView recyclerView = this.f4817s;
        WeakHashMap weakHashMap = y1.K.f26642a;
        boolean z8 = recyclerView.getLayoutDirection() == 1;
        int i7 = this.f4806e;
        if (z8) {
            if (f4 > i7) {
                return false;
            }
        } else if (f4 < this.f4815q - i7) {
            return false;
        }
        int i10 = this.f4810l;
        int i11 = this.k / 2;
        return f10 >= ((float) (i10 - i11)) && f10 <= ((float) (i11 + i10));
    }

    public final void f(int i7) {
        B0.C c10 = this.f4801B;
        StateListDrawable stateListDrawable = this.f4804c;
        if (i7 == 2 && this.f4820v != 2) {
            stateListDrawable.setState(f4798C);
            this.f4817s.removeCallbacks(c10);
        }
        if (i7 == 0) {
            this.f4817s.invalidate();
        } else {
            g();
        }
        if (this.f4820v == 2 && i7 != 2) {
            stateListDrawable.setState(f4799D);
            this.f4817s.removeCallbacks(c10);
            this.f4817s.postDelayed(c10, 1200);
        } else if (i7 == 1) {
            this.f4817s.removeCallbacks(c10);
            this.f4817s.postDelayed(c10, 1500);
        }
        this.f4820v = i7;
    }

    public final void g() {
        int i7 = this.f4800A;
        ValueAnimator valueAnimator = this.f4824z;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f4800A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
