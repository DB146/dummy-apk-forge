package K0;

import H2.C0297k;
import java.util.ArrayList;
import java.util.List;
import u.AbstractC2058k;
import u.C2069w;
import v.AbstractC2121a;

/* renamed from: K0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374d implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final List f5870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5871b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5872c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5873d;

    static {
        q3.s sVar = v.f5965a;
    }

    public /* synthetic */ C0374d(String str) {
        this(str, Eb.v.f3891a);
    }

    public C0374d(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        r2.a(r4.f5868c);
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0374d(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f5870a = list;
        this.f5871b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i7 = 0; i7 < size; i7++) {
                C0373c c0373c = (C0373c) list.get(i7);
                Object obj = c0373c.f5866a;
                if (obj instanceof x) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0373c);
                } else if (obj instanceof p) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0373c);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f5872c = arrayList;
        this.f5873d = arrayList2;
        List n02 = arrayList2 != null ? Eb.o.n0(new C0297k(3), arrayList2) : null;
        if (n02 == null || n02.isEmpty()) {
            return;
        }
        int i10 = ((C0373c) Eb.o.Y(n02)).f5868c;
        C2069w c2069w = AbstractC2058k.f24690a;
        C2069w c2069w2 = new C2069w(1);
        c2069w2.a(i10);
        int size2 = n02.size();
        int i11 = 1;
        while (i11 < size2) {
            C0373c c0373c2 = (C0373c) n02.get(i11);
            while (true) {
                int i12 = c2069w2.f24728b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    AbstractC2121a.e("IntList is empty.");
                    throw null;
                }
                int i13 = c2069w2.f24727a[i12 - 1];
                if (c0373c2.f5867b >= i13) {
                    c2069w2.c(i12 - 1);
                } else {
                    int i14 = c0373c2.f5868c;
                    if (i14 > i13) {
                        P0.a.a("Paragraph overlap not allowed, end " + i14 + " should be less than or equal to " + i13);
                    }
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f5871b.charAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0374d)) {
            return false;
        }
        C0374d c0374d = (C0374d) obj;
        return kotlin.jvm.internal.l.a(this.f5871b, c0374d.f5871b) && kotlin.jvm.internal.l.a(this.f5870a, c0374d.f5870a);
    }

    public final int hashCode() {
        int hashCode = this.f5871b.hashCode() * 31;
        List list = this.f5870a;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5871b.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        if (!(i7 <= i10)) {
            P0.a.a("start (" + i7 + ") should be less or equal to end (" + i10 + ')');
        }
        String str = this.f5871b;
        if (i7 == 0 && i10 == str.length()) {
            return this;
        }
        String substring = str.substring(i7, i10);
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        int i11 = AbstractC0375e.f5874a;
        if (i7 > i10) {
            P0.a.a("start (" + i7 + ") should be less than or equal to end (" + i10 + ')');
        }
        List list = this.f5870a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0373c c0373c = (C0373c) list.get(i12);
                int i13 = c0373c.f5867b;
                int i14 = c0373c.f5868c;
                if (AbstractC0375e.a(i7, i10, i13, i14)) {
                    arrayList2.add(new C0373c(c0373c.f5866a, Math.max(i7, c0373c.f5867b) - i7, Math.min(i10, i14) - i7, c0373c.f5869d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new C0374d(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5871b;
    }
}
