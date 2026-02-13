package gc;

import fc.P;
import java.util.Arrays;

/* renamed from: gc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1207b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1209d[] f17501a;

    /* renamed from: b, reason: collision with root package name */
    public int f17502b;

    /* renamed from: c, reason: collision with root package name */
    public int f17503c;

    /* renamed from: d, reason: collision with root package name */
    public F f17504d;

    public final AbstractC1209d c() {
        AbstractC1209d abstractC1209d;
        F f4;
        synchronized (this) {
            try {
                AbstractC1209d[] abstractC1209dArr = this.f17501a;
                if (abstractC1209dArr == null) {
                    abstractC1209dArr = e();
                    this.f17501a = abstractC1209dArr;
                } else if (this.f17502b >= abstractC1209dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC1209dArr, abstractC1209dArr.length * 2);
                    kotlin.jvm.internal.l.d(copyOf, "copyOf(this, newSize)");
                    this.f17501a = (AbstractC1209d[]) copyOf;
                    abstractC1209dArr = (AbstractC1209d[]) copyOf;
                }
                int i7 = this.f17503c;
                do {
                    abstractC1209d = abstractC1209dArr[i7];
                    if (abstractC1209d == null) {
                        abstractC1209d = d();
                        abstractC1209dArr[i7] = abstractC1209d;
                    }
                    i7++;
                    if (i7 >= abstractC1209dArr.length) {
                        i7 = 0;
                    }
                } while (!abstractC1209d.a(this));
                this.f17503c = i7;
                this.f17502b++;
                f4 = this.f17504d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f4 != null) {
            f4.v(1);
        }
        return abstractC1209d;
    }

    public abstract AbstractC1209d d();

    public abstract AbstractC1209d[] e();

    public final void f(AbstractC1209d abstractC1209d) {
        F f4;
        int i7;
        Hb.d[] b2;
        synchronized (this) {
            try {
                int i10 = this.f17502b - 1;
                this.f17502b = i10;
                f4 = this.f17504d;
                if (i10 == 0) {
                    this.f17503c = 0;
                }
                kotlin.jvm.internal.l.c(abstractC1209d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b2 = abstractC1209d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Hb.d dVar : b2) {
            if (dVar != null) {
                dVar.resumeWith(Db.q.f3365a);
            }
        }
        if (f4 != null) {
            f4.v(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fc.P, gc.F] */
    public final F g() {
        F f4;
        synchronized (this) {
            F f10 = this.f17504d;
            f4 = f10;
            if (f10 == null) {
                int i7 = this.f17502b;
                ?? p10 = new P(1, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 2);
                p10.p(Integer.valueOf(i7));
                this.f17504d = p10;
                f4 = p10;
            }
        }
        return f4;
    }
}
