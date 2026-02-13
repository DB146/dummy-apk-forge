package H2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import u1.AbstractC2096f;

/* renamed from: H2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0307v implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f4839e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0297k f4840f = new C0297k(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4841a;

    /* renamed from: b, reason: collision with root package name */
    public long f4842b;

    /* renamed from: c, reason: collision with root package name */
    public long f4843c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4844d;

    public static i0 c(RecyclerView recyclerView, int i7, long j) {
        int p10 = recyclerView.f13657f.p();
        for (int i10 = 0; i10 < p10; i10++) {
            i0 M3 = RecyclerView.M(recyclerView.f13657f.o(i10));
            if (M3.f4709c == i7 && !M3.i()) {
                return null;
            }
        }
        Y y10 = recyclerView.f13651c;
        try {
            recyclerView.U();
            i0 l10 = y10.l(i7, j);
            if (l10 != null) {
                if (!l10.h() || l10.i()) {
                    y10.a(l10, false);
                } else {
                    y10.i(l10.f4707a);
                }
            }
            recyclerView.V(false);
            return l10;
        } catch (Throwable th) {
            recyclerView.V(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i7, int i10) {
        if (recyclerView.f13625H) {
            if (RecyclerView.f13602O0 && !this.f4841a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f4842b == 0) {
                this.f4842b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0305t c0305t = recyclerView.f13674u0;
        c0305t.f4826b = i7;
        c0305t.f4827c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        C0306u c0306u;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0306u c0306u2;
        ArrayList arrayList = this.f4841a;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i10);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0305t c0305t = recyclerView3.f13674u0;
                c0305t.b(recyclerView3, false);
                i7 += c0305t.f4828d;
            }
        }
        ArrayList arrayList2 = this.f4844d;
        arrayList2.ensureCapacity(i7);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0305t c0305t2 = recyclerView4.f13674u0;
                int abs = Math.abs(c0305t2.f4827c) + Math.abs(c0305t2.f4826b);
                for (int i13 = 0; i13 < c0305t2.f4828d * 2; i13 += 2) {
                    if (i11 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c0306u2 = obj;
                    } else {
                        c0306u2 = (C0306u) arrayList2.get(i11);
                    }
                    int[] iArr = (int[]) c0305t2.f4829e;
                    int i14 = iArr[i13 + 1];
                    c0306u2.f4834a = i14 <= abs;
                    c0306u2.f4835b = abs;
                    c0306u2.f4836c = i14;
                    c0306u2.f4837d = recyclerView4;
                    c0306u2.f4838e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList2, f4840f);
        for (int i15 = 0; i15 < arrayList2.size() && (recyclerView = (c0306u = (C0306u) arrayList2.get(i15)).f4837d) != null; i15++) {
            i0 c10 = c(recyclerView, c0306u.f4838e, c0306u.f4834a ? Long.MAX_VALUE : j);
            if (c10 != null && c10.f4708b != null && c10.h() && !c10.i() && (recyclerView2 = (RecyclerView) c10.f4708b.get()) != null) {
                if (recyclerView2.f13641R && recyclerView2.f13657f.p() != 0) {
                    P p10 = recyclerView2.f13654d0;
                    if (p10 != null) {
                        p10.e();
                    }
                    androidx.recyclerview.widget.a aVar = recyclerView2.f13614B;
                    Y y10 = recyclerView2.f13651c;
                    if (aVar != null) {
                        aVar.z0(y10);
                        recyclerView2.f13614B.A0(y10);
                    }
                    y10.f4626a.clear();
                    y10.g();
                }
                C0305t c0305t3 = recyclerView2.f13674u0;
                c0305t3.b(recyclerView2, true);
                if (c0305t3.f4828d != 0) {
                    try {
                        int i16 = AbstractC2096f.f24827a;
                        Trace.beginSection("RV Nested Prefetch");
                        e0 e0Var = recyclerView2.f13676v0;
                        K k = recyclerView2.f13612A;
                        e0Var.f4667d = 1;
                        e0Var.f4668e = k.a();
                        e0Var.g = false;
                        e0Var.f4670h = false;
                        e0Var.f4671i = false;
                        for (int i17 = 0; i17 < c0305t3.f4828d * 2; i17 += 2) {
                            c(recyclerView2, ((int[]) c0305t3.f4829e)[i17], j);
                        }
                        Trace.endSection();
                        c0306u.f4834a = false;
                        c0306u.f4835b = 0;
                        c0306u.f4836c = 0;
                        c0306u.f4837d = null;
                        c0306u.f4838e = 0;
                    } catch (Throwable th) {
                        int i18 = AbstractC2096f.f24827a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0306u.f4834a = false;
            c0306u.f4835b = 0;
            c0306u.f4836c = 0;
            c0306u.f4837d = null;
            c0306u.f4838e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = AbstractC2096f.f24827a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f4841a;
            if (arrayList.isEmpty()) {
                this.f4842b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f4842b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.f4843c);
                this.f4842b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f4842b = 0L;
            int i11 = AbstractC2096f.f24827a;
            Trace.endSection();
            throw th;
        }
    }
}
