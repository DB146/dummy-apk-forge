package R1;

import C.C0218c;
import P4.C0463k;
import a3.C0709A;
import a3.r;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import q3.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public final C0463k f8819d;

    /* renamed from: a, reason: collision with root package name */
    public float f8816a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f8817b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8818c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8820e = false;

    /* renamed from: f, reason: collision with root package name */
    public float f8821f = Float.MAX_VALUE;
    public float g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public long f8822h = 0;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public float f8823i = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public f f8824l = null;

    /* renamed from: m, reason: collision with root package name */
    public float f8825m = Float.MAX_VALUE;

    public e(C0218c c0218c) {
        this.f8819d = new C0463k(c0218c, 1);
    }

    public static c b() {
        ThreadLocal threadLocal = c.f8806i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new q3.c(20, (byte) 0)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [R1.a, java.lang.Object] */
    public final void a(float f4) {
        float durationScale;
        if (this.f8820e) {
            this.f8825m = f4;
            return;
        }
        if (this.f8824l == null) {
            this.f8824l = new f(f4);
        }
        f fVar = this.f8824l;
        double d10 = f4;
        fVar.f8833i = d10;
        double d11 = (float) d10;
        if (d11 > this.f8821f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d11 < this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f8823i * 0.75f);
        fVar.f8829d = abs;
        fVar.f8830e = abs * 62.5d;
        q3.c cVar = b().f8811e;
        cVar.getClass();
        if (Thread.currentThread() != ((Looper) cVar.f23372c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z8 = this.f8820e;
        if (z8 || z8) {
            return;
        }
        this.f8820e = true;
        if (!this.f8818c) {
            this.f8817b = ((C0218c) this.f8819d.f8074b).f2397b;
        }
        float f10 = this.f8817b;
        if (f10 > this.f8821f || f10 < this.g) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c b2 = b();
        ArrayList arrayList = b2.f8808b;
        if (arrayList.size() == 0) {
            q3.c cVar2 = b2.f8811e;
            cVar2.getClass();
            ((Choreographer) cVar2.f23371b).postFrameCallback(new b(b2.f8810d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b2.g = durationScale;
                if (b2.f8813h == null) {
                    b2.f8813h = new s(b2, 19);
                }
                final s sVar = b2.f8813h;
                if (((a) sVar.f23438b) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: R1.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f11) {
                            ((c) s.this.f23439c).g = f11;
                        }
                    };
                    sVar.f23438b = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f4) {
        ArrayList arrayList;
        ((C0218c) this.f8819d.f8074b).f2397b = f4;
        int i7 = 0;
        while (true) {
            arrayList = this.k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                r rVar = (r) arrayList.get(i7);
                float f10 = this.f8817b;
                C0709A c0709a = rVar.g;
                long max = Math.max(-1L, Math.min(c0709a.L + 1, Math.round(f10)));
                c0709a.F(max, rVar.f12559a);
                rVar.f12559a = max;
            }
            i7++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
