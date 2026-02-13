package B0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class J0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final J0 f1706b = new J0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final J0 f1707c = new J0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final J0 f1708d = new J0(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1709a;

    public /* synthetic */ J0(int i7) {
        this.f1709a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1709a) {
            case 0:
                i0.c f4 = ((H0.n) obj).f();
                i0.c f10 = ((H0.n) obj2).f();
                int compare = Float.compare(f4.f18174a, f10.f18174a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f4.f18175b, f10.f18175b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f4.f18177d, f10.f18177d);
                return compare3 != 0 ? compare3 : Float.compare(f4.f18176c, f10.f18176c);
            case 1:
                i0.c f11 = ((H0.n) obj).f();
                i0.c f12 = ((H0.n) obj2).f();
                int compare4 = Float.compare(f12.f18176c, f11.f18176c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f11.f18175b, f12.f18175b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f11.f18177d, f12.f18177d);
                return compare6 != 0 ? compare6 : Float.compare(f12.f18174a, f11.f18174a);
            default:
                Db.j jVar = (Db.j) obj;
                Db.j jVar2 = (Db.j) obj2;
                int compare7 = Float.compare(((i0.c) jVar.f3354a).f18175b, ((i0.c) jVar2.f3354a).f18175b);
                return compare7 != 0 ? compare7 : Float.compare(((i0.c) jVar.f3354a).f18177d, ((i0.c) jVar2.f3354a).f18177d);
        }
    }
}
