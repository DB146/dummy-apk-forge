package Y0;

import A9.S2;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f11068b = new b(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f11069c = new b(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f11070d = new b(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f11071e = new b(1, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i10) {
        super(i7);
        this.f11072a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f11072a) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new S2(jVar.f11097E, 19));
                return Db.q.f3365a;
            case 1:
                return Db.q.f3365a;
            case 2:
                return Db.q.f3365a;
            default:
                return Db.q.f3365a;
        }
    }
}
