package A9;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f3 extends AbstractC0117n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1197a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1198b;

    public f3() {
        this.f1197a = 1;
        this.f1198b = android.support.v4.media.session.b.z(new C0163z1(13));
        sa.e.f24219e.getClass();
    }

    public f3(AbstractC0113m2 abstractC0113m2) {
        this.f1197a = 0;
        this.f1198b = abstractC0113m2;
    }

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2 a(Object obj) {
        switch (this.f1197a) {
            case 0:
                return (AbstractC0113m2) this.f1198b;
            default:
                if (obj == null) {
                    throw new IllegalStateException("Null item");
                }
                Db.o oVar = (Db.o) this.f1198b;
                AbstractC0113m2 abstractC0113m2 = (AbstractC0113m2) ((Map) oVar.getValue()).get(obj.getClass().getName());
                if (abstractC0113m2 != null) {
                    return abstractC0113m2;
                }
                Da.b bVar = new Da.b();
                ((Map) oVar.getValue()).put(obj.getClass().getName(), bVar);
                return bVar;
        }
    }

    @Override // A9.AbstractC0117n2
    public AbstractC0113m2[] b() {
        switch (this.f1197a) {
            case 0:
                return new AbstractC0113m2[]{(AbstractC0113m2) this.f1198b};
            default:
                return super.b();
        }
    }
}
