package E;

import java.util.List;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final q f3460b = new q(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final q f3461c = new q(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final q f3462d = new q(1, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3463a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i7, int i10) {
        super(i7);
        this.f3463a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f3463a) {
            case 0:
                return Db.q.f3365a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new A(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
