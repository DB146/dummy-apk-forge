package w2;

/* loaded from: classes.dex */
public final class j extends o3.e {

    /* renamed from: f, reason: collision with root package name */
    public final i f25682f;
    public final Y.e g;

    public j(i iVar, String str, Y.e eVar) {
        super(iVar, str);
        this.f25682f = iVar;
        this.g = eVar;
    }

    @Override // o3.e
    public final v2.q a() {
        return (h) super.a();
    }

    @Override // o3.e
    public final v2.q b() {
        return new h(this.f25682f, this.g);
    }
}
