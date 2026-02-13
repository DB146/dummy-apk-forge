package N;

import Q.C0506o;

/* renamed from: N.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415e extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final C0415e f7034b = new C0415e(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0415e f7035c = new C0415e(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0415e f7036d = new C0415e(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0415e f7037e = new C0415e(2, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0415e(int i7, int i10) {
        super(i7);
        this.f7038a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7038a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o.x()) {
                    c0506o.N();
                }
                return Db.q.f3365a;
            case 1:
                C0506o c0506o2 = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o2.x()) {
                    c0506o2.N();
                }
                return Db.q.f3365a;
            case 2:
                C0506o c0506o3 = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o3.x()) {
                    c0506o3.N();
                }
                return Db.q.f3365a;
            default:
                C0506o c0506o4 = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o4.x()) {
                    c0506o4.N();
                }
                return Db.q.f3365a;
        }
    }
}
