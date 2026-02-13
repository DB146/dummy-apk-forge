package N6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f7210a;

    /* renamed from: b, reason: collision with root package name */
    public int f7211b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7212c;

    public B() {
        r.e(4, "initialCapacity");
        this.f7210a = new Object[4];
        this.f7211b = 0;
    }

    public static int f(int i7, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i7 + (i7 >> 1) + 1;
        if (i11 < i10) {
            i11 = Integer.highestOneBit(i10 - 1) << 1;
        }
        return i11 < 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i11;
    }

    public final void a(Object obj) {
        obj.getClass();
        g(this.f7211b + 1);
        Object[] objArr = this.f7210a;
        int i7 = this.f7211b;
        this.f7211b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        r.c(length, objArr);
        g(this.f7211b + length);
        System.arraycopy(objArr, 0, this.f7210a, this.f7211b, length);
        this.f7211b += length;
    }

    public abstract B c(Object obj);

    public void d(Object obj) {
        a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(List list) {
        if (list != 0) {
            g(list.size() + this.f7211b);
            if (list instanceof C) {
                this.f7211b = ((C) list).i(this.f7211b, this.f7210a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void g(int i7) {
        Object[] objArr = this.f7210a;
        if (objArr.length < i7) {
            this.f7210a = Arrays.copyOf(objArr, f(objArr.length, i7));
            this.f7212c = false;
        } else if (this.f7212c) {
            this.f7210a = (Object[]) objArr.clone();
            this.f7212c = false;
        }
    }
}
