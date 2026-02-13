package A0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class r0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f304b = new r0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;

    public /* synthetic */ r0(int i7) {
        this.f305a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f305a) {
            case 0:
                L l10 = (L) obj;
                L l11 = (L) obj2;
                int f4 = kotlin.jvm.internal.l.f(l11.f46D, l10.f46D);
                return f4 != 0 ? f4 : kotlin.jvm.internal.l.f(l10.hashCode(), l11.hashCode());
            default:
                L l12 = (L) obj;
                L l13 = (L) obj2;
                int f10 = kotlin.jvm.internal.l.f(l12.f46D, l13.f46D);
                return f10 != 0 ? f10 : kotlin.jvm.internal.l.f(l12.hashCode(), l13.hashCode());
        }
    }
}
