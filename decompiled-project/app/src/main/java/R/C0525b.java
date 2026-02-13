package R;

import A0.C0032v;
import Q.AbstractC0508p;
import Q.C0506o;
import Q.U;
import Q.V;
import java.util.ArrayList;

/* renamed from: R.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525b {

    /* renamed from: a, reason: collision with root package name */
    public final C0506o f8746a;

    /* renamed from: b, reason: collision with root package name */
    public C0524a f8747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8748c;

    /* renamed from: f, reason: collision with root package name */
    public int f8751f;
    public int g;

    /* renamed from: l, reason: collision with root package name */
    public int f8754l;

    /* renamed from: d, reason: collision with root package name */
    public final C0032v f8749d = new C0032v();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8750e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8752h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f8753i = -1;
    public int j = -1;
    public int k = -1;

    public C0525b(C0506o c0506o, C0524a c0524a) {
        this.f8746a = c0506o;
        this.f8747b = c0524a;
    }

    public final void a(U u3, Q.r rVar, V v10, V v11) {
        C0524a c0524a = this.f8747b;
        c0524a.getClass();
        C0531h c0531h = C0531h.f8760d;
        I i7 = c0524a.f8745f;
        i7.N(c0531h);
        int i10 = i7.k - i7.f8742f[i7.g - 1].f8220c;
        Object[] objArr = i7.j;
        objArr[i10] = u3;
        objArr[i10 + 1] = rVar;
        objArr[i10 + 3] = v11;
        objArr[i10 + 2] = v10;
    }

    public final void b() {
        d();
        ArrayList arrayList = this.f8752h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void c() {
        int i7 = this.g;
        if (i7 > 0) {
            C0524a c0524a = this.f8747b;
            c0524a.getClass();
            G g = G.f8740d;
            I i10 = c0524a.f8745f;
            i10.N(g);
            i10.f8743h[i10.f8744i - i10.f8742f[i10.g - 1].f8219b] = i7;
            this.g = 0;
        }
        ArrayList arrayList = this.f8752h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0524a c0524a2 = this.f8747b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        c0524a2.getClass();
        if (size != 0) {
            k kVar = k.f8763d;
            I i12 = c0524a2.f8745f;
            i12.N(kVar);
            tc.b.I(i12, 0, objArr);
        }
        arrayList.clear();
    }

    public final void d() {
        int i7 = this.f8754l;
        if (i7 > 0) {
            int i10 = this.f8753i;
            if (i10 >= 0) {
                c();
                C0524a c0524a = this.f8747b;
                c0524a.getClass();
                y yVar = y.f8780d;
                I i11 = c0524a.f8745f;
                i11.N(yVar);
                int i12 = i11.f8744i - i11.f8742f[i11.g - 1].f8219b;
                int[] iArr = i11.f8743h;
                iArr[i12] = i10;
                iArr[i12 + 1] = i7;
                this.f8753i = -1;
            } else {
                int i13 = this.k;
                int i14 = this.j;
                c();
                C0524a c0524a2 = this.f8747b;
                c0524a2.getClass();
                v vVar = v.f8777d;
                I i15 = c0524a2.f8745f;
                i15.N(vVar);
                int i16 = i15.f8744i - i15.f8742f[i15.g - 1].f8219b;
                int[] iArr2 = i15.f8743h;
                iArr2[i16 + 1] = i13;
                iArr2[i16] = i14;
                iArr2[i16 + 2] = i7;
                this.j = -1;
                this.k = -1;
            }
            this.f8754l = 0;
        }
    }

    public final void e(boolean z8) {
        C0506o c0506o = this.f8746a;
        int i7 = z8 ? c0506o.f8440F.f8580i : c0506o.f8440F.g;
        int i10 = i7 - this.f8751f;
        if (i10 < 0) {
            AbstractC0508p.c("Tried to seek backward");
        }
        if (i10 > 0) {
            C0524a c0524a = this.f8747b;
            c0524a.getClass();
            C0527d c0527d = C0527d.f8756d;
            I i11 = c0524a.f8745f;
            i11.N(c0527d);
            i11.f8743h[i11.f8744i - i11.f8742f[i11.g - 1].f8219b] = i10;
            this.f8751f = i7;
        }
    }

    public final void f(int i7, int i10) {
        if (i10 > 0) {
            if (!(i7 >= 0)) {
                AbstractC0508p.c("Invalid remove index " + i7);
            }
            if (this.f8753i == i7) {
                this.f8754l += i10;
                return;
            }
            d();
            this.f8753i = i7;
            this.f8754l = i10;
        }
    }
}
