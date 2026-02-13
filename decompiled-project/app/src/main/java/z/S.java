package z;

/* loaded from: classes.dex */
public final class S extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public Object f27932b;

    /* renamed from: c, reason: collision with root package name */
    public int f27933c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0.J f27935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(A0.J j, Hb.d dVar) {
        super(dVar);
        this.f27935e = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        S s3 = new S(this.f27935e, dVar);
        s3.f27934d = obj;
        return s3;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:5:0x0038). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Zb.h hVar;
        Object invoke;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27933c;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            hVar = (Zb.h) this.f27934d;
            invoke = this.f27935e.invoke();
            if (invoke != null) {
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = this.f27932b;
            hVar = (Zb.h) this.f27934d;
            com.bumptech.glide.c.c0(obj);
            if (obj2 == null) {
                return Db.q.f3365a;
            }
            invoke = this.f27935e.invoke();
            if (invoke != null) {
                this.f27934d = hVar;
                this.f27932b = invoke;
                this.f27933c = 1;
                hVar.c(this, invoke);
                Ib.a aVar2 = Ib.a.f5345a;
                return aVar;
            }
            obj2 = null;
            if (obj2 == null) {
            }
            invoke = this.f27935e.invoke();
            if (invoke != null) {
            }
        }
    }
}
