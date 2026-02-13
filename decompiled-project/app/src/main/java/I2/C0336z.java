package I2;

import h3.C1235A;

/* renamed from: I2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336z extends C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5211a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5212b;

    public C0336z(Ba.o oVar) {
        this.f5212b = oVar;
    }

    public C0336z(C1235A clock) {
        kotlin.jvm.internal.l.e(clock, "clock");
        this.f5212b = clock;
    }

    @Override // I2.C
    public final void c(U2.a db2) {
        switch (this.f5211a) {
            case 0:
                kotlin.jvm.internal.l.e(db2, "db");
                ((Ba.o) this.f5212b).invoke(db2);
                return;
            default:
                kotlin.jvm.internal.l.e(db2, "db");
                db2.i();
                try {
                    StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((C1235A) this.f5212b).getClass();
                    sb2.append(System.currentTimeMillis() - i3.n.f18372a);
                    sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    db2.o(sb2.toString());
                    db2.C();
                    return;
                } finally {
                    db2.h();
                }
        }
    }
}
