package W1;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import e3.AbstractC1076a;
import e3.AbstractC1084i;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b0 extends AbstractC1076a {

    /* renamed from: c, reason: collision with root package name */
    public final U f10444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10445d;

    /* renamed from: e, reason: collision with root package name */
    public C0558a f10446e = null;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10447f = new ArrayList();
    public final ArrayList g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public C f10448h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10449i;

    public b0(U u3, int i7) {
        this.f10444c = u3;
        this.f10445d = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // e3.AbstractC1076a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i7, C c10) {
        ArrayList arrayList;
        B b2;
        C0558a c0558a = this.f10446e;
        U u3 = this.f10444c;
        if (c0558a == null) {
            u3.getClass();
            this.f10446e = new C0558a(u3);
        }
        while (true) {
            arrayList = this.f10447f;
            if (arrayList.size() > i7) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        if (c10.K()) {
            u3.getClass();
            a0 a0Var = (a0) ((HashMap) u3.f10357c.f23397c).get(c10.f10293f);
            if (a0Var != null) {
                C c11 = a0Var.f10427c;
                if (c11.equals(c10)) {
                    if (c11.f10283a > -1) {
                        b2 = new B(a0Var.o());
                        arrayList.set(i7, b2);
                        this.g.set(i7, null);
                        this.f10446e.i(c10);
                        if (c10.equals(this.f10448h)) {
                            return;
                        }
                        this.f10448h = null;
                        return;
                    }
                }
            }
            u3.g0(new IllegalStateException(A3.c.i("Fragment ", c10, " is not currently in the FragmentManager")));
            throw null;
        }
        b2 = null;
        arrayList.set(i7, b2);
        this.g.set(i7, null);
        this.f10446e.i(c10);
        if (c10.equals(this.f10448h)) {
        }
    }

    @Override // e3.AbstractC1076a
    public final void b() {
        C0558a c0558a = this.f10446e;
        if (c0558a != null) {
            if (!this.f10449i) {
                try {
                    this.f10449i = true;
                    if (c0558a.f10414i) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c0558a.j = false;
                    c0558a.f10422s.B(c0558a, true);
                } finally {
                    this.f10449i = false;
                }
            }
            this.f10446e = null;
        }
    }

    @Override // e3.AbstractC1076a
    public final void g(Parcelable parcelable, ClassLoader classLoader) {
        C d10;
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.f10447f;
            arrayList.clear();
            ArrayList arrayList2 = this.g;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((B) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    U u3 = this.f10444c;
                    u3.getClass();
                    String string = bundle.getString(str);
                    if (string == null) {
                        d10 = null;
                    } else {
                        d10 = u3.f10357c.d(string);
                        if (d10 == null) {
                            u3.g0(new IllegalStateException(A3.c.j("Fragment no longer exists for key ", str, ": unique id ", string)));
                            throw null;
                        }
                    }
                    if (d10 != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        if (d10.f10274R) {
                            d10.f10274R = false;
                        }
                        arrayList2.set(parseInt, d10);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // e3.AbstractC1076a
    public final void h(AbstractC1084i abstractC1084i) {
        if (abstractC1084i.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract C i(int i7);
}
