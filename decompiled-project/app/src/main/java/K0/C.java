package K0;

import A9.O0;
import F.Q;
import java.util.ArrayList;
import y7.u0;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final B f5841a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f5842b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5843c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5844d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5845e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5846f;

    public C(B b2, Q q10, long j) {
        this.f5841a = b2;
        this.f5842b = q10;
        this.f5843c = j;
        ArrayList arrayList = (ArrayList) q10.f3940e;
        float f4 = 0.0f;
        this.f5844d = arrayList.isEmpty() ? 0.0f : ((m) arrayList.get(0)).f5916a.f5863d.c(0);
        if (!arrayList.isEmpty()) {
            m mVar = (m) Eb.o.e0(arrayList);
            f4 = mVar.f5916a.f5863d.c(r4.f6253f - 1) + mVar.f5921f;
        }
        this.f5845e = f4;
        this.f5846f = (ArrayList) q10.f3939d;
    }

    public final int a(int i7) {
        Q q10 = this.f5842b;
        int length = ((C0374d) ((O0) q10.f3938c).f922a).f5871b.length();
        ArrayList arrayList = (ArrayList) q10.f3940e;
        m mVar = (m) arrayList.get(i7 >= length ? u0.s(arrayList) : i7 < 0 ? 0 : vc.i.q(i7, arrayList));
        return mVar.f5916a.f5863d.f6252e.getLineForOffset(mVar.a(i7)) + mVar.f5919d;
    }

    public final int b(float f4) {
        ArrayList arrayList = (ArrayList) this.f5842b.f3940e;
        int i7 = 0;
        if (f4 > 0.0f) {
            if (f4 < ((m) Eb.o.e0(arrayList)).g) {
                int size = arrayList.size() - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > size) {
                        i7 = -(i10 + 1);
                        break;
                    }
                    int i11 = (i10 + size) >>> 1;
                    m mVar = (m) arrayList.get(i11);
                    char c10 = mVar.f5921f > f4 ? (char) 1 : mVar.g <= f4 ? (char) 65535 : (char) 0;
                    if (c10 >= 0) {
                        if (c10 <= 0) {
                            i7 = i11;
                            break;
                        }
                        size = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
            } else {
                i7 = u0.s(arrayList);
            }
        }
        m mVar2 = (m) arrayList.get(i7);
        int i12 = mVar2.f5918c - mVar2.f5917b;
        int i13 = mVar2.f5919d;
        if (i12 == 0) {
            return i13;
        }
        float f10 = f4 - mVar2.f5921f;
        L0.j jVar = mVar2.f5916a.f5863d;
        return i13 + jVar.f6252e.getLineForVertical(((int) f10) - jVar.g);
    }

    public final int c(int i7) {
        Q q10 = this.f5842b;
        q10.g(i7);
        ArrayList arrayList = (ArrayList) q10.f3940e;
        m mVar = (m) arrayList.get(vc.i.r(i7, arrayList));
        C0371a c0371a = mVar.f5916a;
        return c0371a.f5863d.f6252e.getLineStart(i7 - mVar.f5919d) + mVar.f5917b;
    }

    public final float d(int i7) {
        Q q10 = this.f5842b;
        q10.g(i7);
        ArrayList arrayList = (ArrayList) q10.f3940e;
        m mVar = (m) arrayList.get(vc.i.r(i7, arrayList));
        C0371a c0371a = mVar.f5916a;
        return c0371a.f5863d.f(i7 - mVar.f5919d) + mVar.f5921f;
    }

    public final U0.j e(int i7) {
        Q q10 = this.f5842b;
        boolean z8 = false;
        O0 o02 = (O0) q10.f3938c;
        if (i7 >= 0 && i7 <= ((C0374d) o02.f922a).f5871b.length()) {
            z8 = true;
        }
        if (!z8) {
            StringBuilder r10 = h3.o.r(i7, "offset(", ") is out of bounds [0, ");
            r10.append(((C0374d) o02.f922a).f5871b.length());
            r10.append(']');
            P0.a.a(r10.toString());
        }
        int length = ((C0374d) ((O0) q10.f3938c).f922a).f5871b.length();
        ArrayList arrayList = (ArrayList) q10.f3940e;
        m mVar = (m) arrayList.get(i7 == length ? u0.s(arrayList) : vc.i.q(i7, arrayList));
        C0371a c0371a = mVar.f5916a;
        int a9 = mVar.a(i7);
        L0.j jVar = c0371a.f5863d;
        return jVar.f6252e.getParagraphDirection(jVar.f6252e.getLineForOffset(a9)) == 1 ? U0.j.f9428a : U0.j.f9429b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return kotlin.jvm.internal.l.a(this.f5841a, c10.f5841a) && this.f5842b.equals(c10.f5842b) && V0.k.a(this.f5843c, c10.f5843c) && this.f5844d == c10.f5844d && this.f5845e == c10.f5845e && kotlin.jvm.internal.l.a(this.f5846f, c10.f5846f);
    }

    public final int hashCode() {
        return this.f5846f.hashCode() + h3.o.e(this.f5845e, h3.o.e(this.f5844d, h3.o.f((this.f5842b.hashCode() + (this.f5841a.hashCode() * 31)) * 31, 31, this.f5843c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f5841a + ", multiParagraph=" + this.f5842b + ", size=" + ((Object) V0.k.b(this.f5843c)) + ", firstBaseline=" + this.f5844d + ", lastBaseline=" + this.f5845e + ", placeholderRects=" + this.f5846f + ')';
    }
}
