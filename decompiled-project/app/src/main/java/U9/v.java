package U9;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f9916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W9.j f9917c;

    public /* synthetic */ v(w wVar, W9.j jVar, int i7) {
        this.f9915a = i7;
        this.f9916b = wVar;
        this.f9917c = jVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        T2.a _connection = (T2.a) obj;
        switch (this.f9915a) {
            case 0:
                kotlin.jvm.internal.l.e(_connection, "_connection");
                this.f9916b.f9919b.h(_connection, this.f9917c);
                return Db.q.f3365a;
            default:
                kotlin.jvm.internal.l.e(_connection, "_connection");
                w wVar = this.f9916b;
                wVar.f9921d.f(_connection, this.f9917c);
                return Db.q.f3365a;
        }
    }
}
