package pb;

import a.AbstractC0672a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import yb.InterfaceC2472b;

/* loaded from: classes2.dex */
public final class d extends AtomicLong implements InterfaceC2472b, Ac.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f23274a;

    /* renamed from: b, reason: collision with root package name */
    public int f23275b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f23276c;

    /* renamed from: d, reason: collision with root package name */
    public final gb.e f23277d;

    public d(gb.e eVar, Object[] objArr) {
        this.f23274a = objArr;
        this.f23277d = eVar;
    }

    @Override // Ac.b
    public final void cancel() {
        this.f23276c = true;
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        this.f23275b = this.f23274a.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        r12.f23275b = r6;
        r13 = addAndGet(-r8);
     */
    @Override // Ac.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j) {
        if (wb.c.a(j) && AbstractC0672a.a(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                Object[] objArr = this.f23274a;
                int length = objArr.length;
                gb.e eVar = this.f23277d;
                for (int i7 = this.f23275b; i7 != length; i7++) {
                    if (this.f23276c) {
                        return;
                    }
                    Object obj = objArr[i7];
                    if (obj == null) {
                        eVar.onError(new NullPointerException(A3.c.f(i7, "The element at index ", " is null")));
                        return;
                    }
                    eVar.e(obj);
                }
                if (this.f23276c) {
                    return;
                }
                eVar.a();
                return;
            }
            Object[] objArr2 = this.f23274a;
            int length2 = objArr2.length;
            int i10 = this.f23275b;
            gb.e eVar2 = this.f23277d;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 != j && i10 != length2) {
                        if (this.f23276c) {
                            return;
                        }
                        Object obj2 = objArr2[i10];
                        if (obj2 == null) {
                            eVar2.onError(new NullPointerException(A3.c.f(i10, "The element at index ", " is null")));
                            return;
                        } else {
                            eVar2.e(obj2);
                            j10++;
                            i10++;
                        }
                    } else if (i10 != length2) {
                        j = get();
                        if (j10 == j) {
                            break;
                        }
                    } else {
                        if (this.f23276c) {
                            return;
                        }
                        eVar2.a();
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return this.f23275b == this.f23274a.length;
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        int i7 = this.f23275b;
        Object[] objArr = this.f23274a;
        if (i7 == objArr.length) {
            return null;
        }
        this.f23275b = i7 + 1;
        Object obj = objArr[i7];
        Objects.requireNonNull(obj, "array element is null");
        return obj;
    }
}
