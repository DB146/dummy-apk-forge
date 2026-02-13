package O0;

import Db.q;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class e extends m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final e f7417b = new e(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f7418c = new e(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i10) {
        super(i7);
        this.f7419a = i10;
    }

    @Override // Rb.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f7419a) {
            case 0:
                return q.f3365a;
            default:
                throw null;
        }
    }
}
