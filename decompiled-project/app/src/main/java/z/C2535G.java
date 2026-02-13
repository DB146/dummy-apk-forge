package z;

import java.util.concurrent.CancellationException;
import u0.EnumC2076f;

/* renamed from: z.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2535G extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public int f27865b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Hb.i f27867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Jb.h f27868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2535G(Hb.i iVar, Rb.e eVar, Hb.d dVar) {
        super(dVar);
        this.f27867d = iVar;
        this.f27868e = (Jb.h) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.h, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2535G c2535g = new C2535G(this.f27867d, this.f27868e, dVar);
        c2535g.f27866c = obj;
        return c2535g;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2535G) create((u0.v) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [u0.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [Jb.h, Rb.e] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0070 -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b2;
        u0.v vVar;
        u0.v vVar2;
        Ib.a aVar = Ib.a.f5345a;
        u0.v vVar3 = this.f27865b;
        Hb.i iVar = this.f27867d;
        try {
        } catch (CancellationException e2) {
            e = e2;
            if (cc.F.v(iVar)) {
            }
        }
        if (vVar3 == 0) {
            com.bumptech.glide.c.c0(obj);
            vVar = (u0.v) this.f27866c;
            if (cc.F.v(iVar)) {
            }
        } else if (vVar3 != 1) {
            if (vVar3 == 2) {
                u0.v vVar4 = (u0.v) this.f27866c;
                com.bumptech.glide.c.c0(obj);
                vVar2 = vVar4;
            } else {
                if (vVar3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u0.v vVar5 = (u0.v) this.f27866c;
                com.bumptech.glide.c.c0(obj);
                vVar2 = vVar5;
            }
            vVar = vVar2;
            if (cc.F.v(iVar)) {
                try {
                } catch (CancellationException e10) {
                    vVar3 = vVar;
                    e = e10;
                    if (cc.F.v(iVar)) {
                        throw e;
                    }
                    this.f27866c = vVar3;
                    this.f27865b = 3;
                    Object b10 = AbstractC2556g0.b(vVar3, EnumC2076f.f24759c, this);
                    vVar2 = vVar3;
                    if (b10 == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                    if (cc.F.v(iVar)) {
                    }
                }
                ?? r12 = this.f27868e;
                this.f27866c = vVar;
                this.f27865b = 1;
                if (r12.invoke(vVar, this) == aVar) {
                    return aVar;
                }
                vVar3 = vVar;
                this.f27866c = vVar3;
                this.f27865b = 2;
                b2 = AbstractC2556g0.b(vVar3, EnumC2076f.f24759c, this);
                vVar2 = vVar3;
                if (b2 == aVar) {
                    return aVar;
                }
                vVar = vVar2;
                if (cc.F.v(iVar)) {
                    return Db.q.f3365a;
                }
            }
        } else {
            u0.v vVar6 = (u0.v) this.f27866c;
            com.bumptech.glide.c.c0(obj);
            vVar3 = vVar6;
            this.f27866c = vVar3;
            this.f27865b = 2;
            b2 = AbstractC2556g0.b(vVar3, EnumC2076f.f24759c, this);
            vVar2 = vVar3;
            if (b2 == aVar) {
            }
            vVar = vVar2;
            if (cc.F.v(iVar)) {
            }
        }
    }
}
