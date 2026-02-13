package C1;

import B0.C;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import o.C1747m0;
import y1.K;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: F, reason: collision with root package name */
    public static final int f2458F = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public boolean f2459A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2460B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2461C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2462D;

    /* renamed from: E, reason: collision with root package name */
    public final C1747m0 f2463E;

    /* renamed from: a, reason: collision with root package name */
    public final a f2464a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f2465b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f2466c;

    /* renamed from: d, reason: collision with root package name */
    public C f2467d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f2468e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f2469f;

    /* renamed from: u, reason: collision with root package name */
    public final int f2470u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2471v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f2472w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f2473x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f2474y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2475z;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, C1.a] */
    public d(C1747m0 c1747m0) {
        ?? obj = new Object();
        obj.f2454e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f2455f = 0L;
        this.f2464a = obj;
        this.f2465b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f2468e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2469f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f2472w = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f2473x = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2474y = fArr5;
        this.f2466c = c1747m0;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f4) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f4 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f2470u = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f2471v = f2458F;
        obj.f2450a = 500;
        obj.f2451b = 500;
        this.f2463E = c1747m0;
    }

    public static float b(float f4, float f10, float f11) {
        return f4 > f11 ? f11 : f4 < f10 ? f10 : f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f4, float f10, float f11, int i7) {
        float f12;
        float interpolation;
        float b2 = b(this.f2468e[i7] * f10, 0.0f, this.f2469f[i7]);
        float c10 = c(f10 - f4, b2) - c(f4, b2);
        AccelerateInterpolator accelerateInterpolator = this.f2465b;
        if (c10 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c10);
        } else {
            if (c10 <= 0.0f) {
                f12 = 0.0f;
                if (f12 != 0.0f) {
                    return 0.0f;
                }
                float f13 = this.f2472w[i7];
                float f14 = this.f2473x[i7];
                float f15 = this.f2474y[i7];
                float f16 = f13 * f11;
                return f12 > 0.0f ? b(f12 * f16, f14, f15) : -b((-f12) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(c10);
        }
        f12 = b(interpolation, -1.0f, 1.0f);
        if (f12 != 0.0f) {
        }
    }

    public final float c(float f4, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f2470u;
        if (i7 == 0 || i7 == 1) {
            if (f4 < f10) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f10);
                }
                if (this.f2461C && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f4 < 0.0f) {
            return f4 / (-f10);
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f2459A) {
            this.f2461C = false;
            return;
        }
        a aVar = this.f2464a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (currentAnimationTimeMillis - aVar.f2454e);
        int i11 = aVar.f2451b;
        if (i10 > i11) {
            i7 = i11;
        } else if (i10 >= 0) {
            i7 = i10;
        }
        aVar.f2457i = i7;
        aVar.f2456h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C1747m0 c1747m0;
        int count;
        a aVar = this.f2464a;
        float f4 = aVar.f2453d;
        int abs = (int) (f4 / Math.abs(f4));
        Math.abs(aVar.f2452c);
        if (abs == 0 || (count = (c1747m0 = this.f2463E).getCount()) == 0) {
            return false;
        }
        int childCount = c1747m0.getChildCount();
        int firstVisiblePosition = c1747m0.getFirstVisiblePosition();
        int i7 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i7 >= count && c1747m0.getChildAt(childCount - 1).getBottom() <= c1747m0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c1747m0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7;
        int i10 = 1;
        if (!this.f2462D) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f2460B = true;
        this.f2475z = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f2466c;
        float a9 = a(x2, width, listView.getWidth(), 0);
        float a10 = a(motionEvent.getY(), view.getHeight(), listView.getHeight(), 1);
        a aVar = this.f2464a;
        aVar.f2452c = a9;
        aVar.f2453d = a10;
        if (!this.f2461C && e()) {
            if (this.f2467d == null) {
                this.f2467d = new C(this, i10);
            }
            this.f2461C = true;
            this.f2459A = true;
            if (this.f2475z || (i7 = this.f2471v) <= 0) {
                this.f2467d.run();
            } else {
                C c10 = this.f2467d;
                long j = i7;
                WeakHashMap weakHashMap = K.f26642a;
                listView.postOnAnimationDelayed(c10, j);
            }
            this.f2475z = true;
        }
        return false;
    }
}
