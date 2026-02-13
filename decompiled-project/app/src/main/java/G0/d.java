package G0;

import Db.q;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class d extends m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final d f4254b = new d(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f4255c = new d(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f4256d = new d(1, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i10) {
        super(i7);
        this.f4257a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f4257a) {
            case 0:
                ((Number) obj).longValue();
                return q.f3365a;
            case 1:
                return Integer.valueOf(((l) obj).f4277b);
            default:
                V0.j jVar = ((l) obj).f4278c;
                return Integer.valueOf(jVar.f9980d - jVar.f9978b);
        }
    }
}
