package Z;

import Db.q;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f12067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f12069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object[] f12072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, m mVar, j jVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f12067a = bVar;
        this.f12068b = mVar;
        this.f12069c = jVar;
        this.f12070d = str;
        this.f12071e = obj;
        this.f12072f = objArr;
    }

    @Override // Rb.a
    public final Object invoke() {
        boolean z8;
        b bVar = this.f12067a;
        j jVar = bVar.f12074b;
        j jVar2 = this.f12069c;
        boolean z10 = true;
        if (jVar != jVar2) {
            bVar.f12074b = jVar2;
            z8 = true;
        } else {
            z8 = false;
        }
        String str = bVar.f12075c;
        String str2 = this.f12070d;
        if (kotlin.jvm.internal.l.a(str, str2)) {
            z10 = z8;
        } else {
            bVar.f12075c = str2;
        }
        bVar.f12073a = this.f12068b;
        bVar.f12076d = this.f12071e;
        bVar.f12077e = this.f12072f;
        i iVar = bVar.f12078f;
        if (iVar != null && z10) {
            ((Q7.h) iVar).X();
            bVar.f12078f = null;
            bVar.a();
        }
        return q.f3365a;
    }
}
