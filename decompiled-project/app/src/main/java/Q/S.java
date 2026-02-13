package Q;

/* loaded from: classes.dex */
public final class S implements Hb.h, H0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ S f8364b = new S(0);

    /* renamed from: c, reason: collision with root package name */
    public static final S f8365c = new S(1);

    /* renamed from: d, reason: collision with root package name */
    public static final S f8366d = new S(2);

    /* renamed from: e, reason: collision with root package name */
    public static final S f8367e = new S(3);

    /* renamed from: f, reason: collision with root package name */
    public static final S f8368f = new S(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8369a;

    public /* synthetic */ S(int i7) {
        this.f8369a = i7;
    }

    public static final void b(S s3) {
        fc.b0 b0Var;
        T.b bVar;
        W.b bVar2;
        fc.b0 b0Var2 = C0518u0.f8540x;
        do {
            b0Var = C0518u0.f8540x;
            bVar = (T.b) b0Var.getValue();
            bVar2 = (W.b) bVar;
            V.c cVar = bVar2.f10246c;
            W.a aVar = (W.a) cVar.get(s3);
            if (aVar != null) {
                int hashCode = s3 != null ? s3.hashCode() : 0;
                V.l lVar = cVar.f9940a;
                V.l v10 = lVar.v(hashCode, s3, 0);
                if (lVar != v10) {
                    cVar = v10 == null ? V.c.f9939c : new V.c(v10, cVar.f9941b - 1);
                }
                X.b bVar3 = X.b.f10901a;
                Object obj = aVar.f10241a;
                boolean z8 = obj != bVar3;
                Object obj2 = aVar.f10242b;
                if (z8) {
                    Object obj3 = cVar.get(obj);
                    kotlin.jvm.internal.l.b(obj3);
                    cVar = cVar.a(obj, new W.a(((W.a) obj3).f10241a, obj2));
                }
                if (obj2 != bVar3) {
                    Object obj4 = cVar.get(obj2);
                    kotlin.jvm.internal.l.b(obj4);
                    cVar = cVar.a(obj2, new W.a(obj, ((W.a) obj4).f10242b));
                }
                Object obj5 = obj != bVar3 ? bVar2.f10244a : obj2;
                if (obj2 != bVar3) {
                    obj = bVar2.f10245b;
                }
                bVar2 = new W.b(obj5, obj, cVar);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!b0Var.h(bVar, bVar2));
    }

    @Override // Q.H0
    public boolean a(Object obj, Object obj2) {
        switch (this.f8369a) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f8369a) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
