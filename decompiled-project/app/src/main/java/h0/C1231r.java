package h0;

import A0.AbstractC0017g;
import A0.L;
import java.util.Comparator;

/* renamed from: h0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231r implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final C1231r f17636a = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1229p c1229p = (C1229p) obj;
        C1229p c1229p2 = (C1229p) obj2;
        int i7 = 0;
        if (AbstractC1217d.s(c1229p) && AbstractC1217d.s(c1229p2)) {
            L t5 = AbstractC0017g.t(c1229p);
            L t10 = AbstractC0017g.t(c1229p2);
            if (!kotlin.jvm.internal.l.a(t5, t10)) {
                L[] lArr = new L[16];
                int i10 = 0;
                while (t5 != null) {
                    int i11 = i10 + 1;
                    if (lArr.length < i11) {
                        int length = lArr.length;
                        ?? r52 = new Object[Math.max(i11, length * 2)];
                        System.arraycopy(lArr, 0, r52, 0, length);
                        lArr = r52;
                    }
                    if (i10 != 0) {
                        System.arraycopy(lArr, 0, lArr, 0 + 1, i10 + 0);
                    }
                    lArr[0] = t5;
                    i10++;
                    t5 = t5.t();
                }
                L[] lArr2 = new L[16];
                int i12 = 0;
                while (t10 != null) {
                    int i13 = i12 + 1;
                    if (lArr2.length < i13) {
                        int length2 = lArr2.length;
                        ?? r53 = new Object[Math.max(i13, length2 * 2)];
                        System.arraycopy(lArr2, 0, r53, 0, length2);
                        lArr2 = r53;
                    }
                    if (i12 != 0) {
                        System.arraycopy(lArr2, 0, lArr2, 0 + 1, i12 + 0);
                    }
                    lArr2[0] = t10;
                    i12++;
                    t10 = t10.t();
                }
                int min = Math.min(i10 - 1, i12 - 1);
                if (min >= 0) {
                    while (kotlin.jvm.internal.l.a(lArr[i7], lArr2[i7])) {
                        if (i7 != min) {
                            i7++;
                        }
                    }
                    return kotlin.jvm.internal.l.f(lArr[i7].u(), lArr2[i7].u());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC1217d.s(c1229p)) {
                return -1;
            }
            if (AbstractC1217d.s(c1229p2)) {
                return 1;
            }
        }
        return 0;
    }
}
