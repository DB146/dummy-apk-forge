package U9;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f9858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M9.d f9859c;

    public /* synthetic */ e(h hVar, M9.d dVar, int i7) {
        this.f9857a = i7;
        this.f9858b = hVar;
        this.f9859c = dVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        T2.a _connection = (T2.a) obj;
        switch (this.f9857a) {
            case 0:
                kotlin.jvm.internal.l.e(_connection, "_connection");
                this.f9858b.f9865d.f(_connection, this.f9859c);
                return Db.q.f3365a;
            case 1:
                kotlin.jvm.internal.l.e(_connection, "_connection");
                this.f9858b.f9863b.h(_connection, this.f9859c);
                return Db.q.f3365a;
            default:
                kotlin.jvm.internal.l.e(_connection, "_connection");
                h hVar = this.f9858b;
                hVar.f9866e.f(_connection, this.f9859c);
                return Db.q.f3365a;
        }
    }
}
