package H2;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f4694a;

    /* renamed from: b, reason: collision with root package name */
    public int f4695b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f4696c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f4697d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4698e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4699f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4700u;

    public h0(RecyclerView recyclerView) {
        this.f4700u = recyclerView;
        I i7 = RecyclerView.f13610W0;
        this.f4697d = i7;
        this.f4698e = false;
        this.f4699f = false;
        this.f4696c = new OverScroller(recyclerView.getContext(), i7);
    }

    public final void a(int i7, int i10) {
        RecyclerView recyclerView = this.f4700u;
        recyclerView.setScrollState(2);
        this.f4695b = 0;
        this.f4694a = 0;
        Interpolator interpolator = this.f4697d;
        I i11 = RecyclerView.f13610W0;
        if (interpolator != i11) {
            this.f4697d = i11;
            this.f4696c = new OverScroller(recyclerView.getContext(), i11);
        }
        this.f4696c.fling(0, 0, i7, i10, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        b();
    }

    public final void b() {
        if (this.f4698e) {
            this.f4699f = true;
            return;
        }
        RecyclerView recyclerView = this.f4700u;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = y1.K.f26642a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i7, int i10, int i11, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f4700u;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i10);
            boolean z8 = abs > abs2;
            int width = z8 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z8) {
                abs = abs2;
            }
            i11 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f13610W0;
        }
        if (this.f4697d != interpolator) {
            this.f4697d = interpolator;
            this.f4696c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f4695b = 0;
        this.f4694a = 0;
        recyclerView.setScrollState(2);
        this.f4696c.startScroll(0, 0, i7, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f4700u;
        if (recyclerView.f13614B == null) {
            recyclerView.removeCallbacks(this);
            this.f4696c.abortAnimation();
            return;
        }
        this.f4699f = false;
        this.f4698e = true;
        recyclerView.p();
        OverScroller overScroller = this.f4696c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.f4694a;
            int i14 = currY - this.f4695b;
            this.f4694a = currX;
            this.f4695b = currY;
            int o10 = RecyclerView.o(i13, recyclerView.f13646W, recyclerView.f13650b0, recyclerView.getWidth());
            int o11 = RecyclerView.o(i14, recyclerView.f13648a0, recyclerView.f13652c0, recyclerView.getHeight());
            int[] iArr = recyclerView.f13626H0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u3 = recyclerView.u(o10, o11, 1, iArr, null);
            int[] iArr2 = recyclerView.f13626H0;
            if (u3) {
                o10 -= iArr2[0];
                o11 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o10, o11);
            }
            if (recyclerView.f13612A != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.g0(o10, o11, iArr2);
                int i15 = iArr2[0];
                int i16 = iArr2[1];
                int i17 = o10 - i15;
                int i18 = o11 - i16;
                B b2 = recyclerView.f13614B.f13711e;
                if (b2 != null && !b2.f4575d && b2.f4576e) {
                    int b10 = recyclerView.f13676v0.b();
                    if (b10 == 0) {
                        b2.l();
                    } else if (b2.f4572a >= b10) {
                        b2.f4572a = b10 - 1;
                        b2.i(i15, i16);
                    } else {
                        b2.i(i15, i16);
                    }
                }
                i12 = i15;
                i7 = i17;
                i10 = i18;
                i11 = i16;
            } else {
                i7 = o10;
                i10 = o11;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.f13619E.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f13626H0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i19 = i11;
            recyclerView.v(i12, i11, i7, i10, null, 1, iArr3);
            int i20 = i7 - iArr2[0];
            int i21 = i10 - iArr2[1];
            if (i12 != 0 || i19 != 0) {
                recyclerView.w(i12, i19);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z8 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i20 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i21 != 0));
            B b11 = recyclerView.f13614B.f13711e;
            if ((b11 == null || !b11.f4575d) && z8) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i22 = i20 < 0 ? -currVelocity : i20 > 0 ? currVelocity : 0;
                    if (i21 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i21 <= 0) {
                        currVelocity = 0;
                    }
                    if (i22 < 0) {
                        recyclerView.y();
                        if (recyclerView.f13646W.isFinished()) {
                            recyclerView.f13646W.onAbsorb(-i22);
                        }
                    } else if (i22 > 0) {
                        recyclerView.z();
                        if (recyclerView.f13650b0.isFinished()) {
                            recyclerView.f13650b0.onAbsorb(i22);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f13648a0.isFinished()) {
                            recyclerView.f13648a0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f13652c0.isFinished()) {
                            recyclerView.f13652c0.onAbsorb(currVelocity);
                        }
                    }
                    if (i22 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = y1.K.f26642a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f13608U0) {
                    C0305t c0305t = recyclerView.f13674u0;
                    int[] iArr4 = (int[]) c0305t.f4829e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0305t.f4828d = 0;
                }
            } else {
                b();
                RunnableC0307v runnableC0307v = recyclerView.f13672t0;
                if (runnableC0307v != null) {
                    runnableC0307v.a(recyclerView, i12, i19);
                }
            }
        }
        B b12 = recyclerView.f13614B.f13711e;
        if (b12 != null && b12.f4575d) {
            b12.i(0, 0);
        }
        this.f4698e = false;
        if (!this.f4699f) {
            recyclerView.setScrollState(0);
            recyclerView.p0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = y1.K.f26642a;
            recyclerView.postOnAnimation(this);
        }
    }
}
