package b1;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13797a;

    /* renamed from: b, reason: collision with root package name */
    public int f13798b;

    public d() {
        this.f13797a = new Object[256];
    }

    public d(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f13797a = new Object[i7];
    }

    public Object a() {
        int i7 = this.f13798b;
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        Object[] objArr = this.f13797a;
        Object obj = objArr[i10];
        l.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f13798b--;
        return obj;
    }

    public void b(b bVar) {
        int i7 = this.f13798b;
        Object[] objArr = this.f13797a;
        if (i7 < objArr.length) {
            objArr[i7] = bVar;
            this.f13798b = i7 + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z8;
        l.e(instance, "instance");
        int i7 = this.f13798b;
        int i10 = 0;
        while (true) {
            objArr = this.f13797a;
            if (i10 >= i7) {
                z8 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z8 = true;
                break;
            }
            i10++;
        }
        if (z8) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f13798b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f13798b = i11 + 1;
        return true;
    }
}
