package hc;

import cc.X;
import cc.Y;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: hc.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1271A {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f17923b = AtomicIntegerFieldUpdater.newUpdater(C1271A.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public X[] f17924a;

    public final void a(X x2) {
        x2.f((Y) this);
        X[] xArr = this.f17924a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17923b;
        if (xArr == null) {
            xArr = new X[4];
            this.f17924a = xArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= xArr.length) {
            Object[] copyOf = Arrays.copyOf(xArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(this, newSize)");
            xArr = (X[]) copyOf;
            this.f17924a = xArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        xArr[i7] = x2;
        x2.f14509b = i7;
        c(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final X b(int i7) {
        Object[] objArr = this.f17924a;
        kotlin.jvm.internal.l.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17923b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            d(i7, atomicIntegerFieldUpdater.get(this));
            int i10 = (i7 - 1) / 2;
            if (i7 > 0) {
                X x2 = objArr[i7];
                kotlin.jvm.internal.l.b(x2);
                Object obj = objArr[i10];
                kotlin.jvm.internal.l.b(obj);
                if (x2.compareTo(obj) < 0) {
                    d(i7, i10);
                    c(i10);
                }
            }
            while (true) {
                int i11 = i7 * 2;
                int i12 = i11 + 1;
                if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f17924a;
                kotlin.jvm.internal.l.b(objArr2);
                int i13 = i11 + 2;
                if (i13 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i13];
                    kotlin.jvm.internal.l.b(comparable);
                    Object obj2 = objArr2[i12];
                    kotlin.jvm.internal.l.b(obj2);
                }
                i13 = i12;
                Comparable comparable2 = objArr2[i7];
                kotlin.jvm.internal.l.b(comparable2);
                Comparable comparable3 = objArr2[i13];
                kotlin.jvm.internal.l.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i7, i13);
                i7 = i13;
            }
        }
        X x10 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.l.b(x10);
        x10.f(null);
        x10.f14509b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return x10;
    }

    public final void c(int i7) {
        while (i7 > 0) {
            X[] xArr = this.f17924a;
            kotlin.jvm.internal.l.b(xArr);
            int i10 = (i7 - 1) / 2;
            X x2 = xArr[i10];
            kotlin.jvm.internal.l.b(x2);
            X x10 = xArr[i7];
            kotlin.jvm.internal.l.b(x10);
            if (x2.compareTo(x10) <= 0) {
                return;
            }
            d(i7, i10);
            i7 = i10;
        }
    }

    public final void d(int i7, int i10) {
        X[] xArr = this.f17924a;
        kotlin.jvm.internal.l.b(xArr);
        X x2 = xArr[i10];
        kotlin.jvm.internal.l.b(x2);
        X x10 = xArr[i7];
        kotlin.jvm.internal.l.b(x10);
        xArr[i7] = x2;
        xArr[i10] = x10;
        x2.f14509b = i7;
        x10.f14509b = i10;
    }
}
