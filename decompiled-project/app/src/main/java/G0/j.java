package G0;

import Db.q;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f4273a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4274b;

    /* renamed from: c, reason: collision with root package name */
    public float f4275c;

    public j(int i7, e eVar) {
        this.f4273a = i7;
        this.f4274b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f4, Jb.c cVar) {
        i iVar;
        int i7;
        j jVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f4272d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f4272d = i10 - Integer.MIN_VALUE;
                Object obj = iVar.f4270b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = iVar.f4272d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    Float f10 = new Float(f4);
                    iVar.f4269a = this;
                    iVar.f4272d = 1;
                    obj = this.f4274b.invoke(f10, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f4269a;
                    com.bumptech.glide.c.c0(obj);
                }
                jVar.f4275c += ((Number) obj).floatValue();
                return q.f3365a;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f4270b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = iVar.f4272d;
        if (i7 != 0) {
        }
        jVar.f4275c += ((Number) obj2).floatValue();
        return q.f3365a;
    }
}
