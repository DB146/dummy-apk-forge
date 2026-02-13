package M1;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import mc.AbstractC1660e;
import mc.InterfaceC1656a;

/* renamed from: M1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398m extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6695a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f6696b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6697c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6698d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f6699e;

    /* renamed from: f, reason: collision with root package name */
    public int f6700f;

    /* renamed from: u, reason: collision with root package name */
    public int f6701u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Q f6702v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3.n f6703w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0398m(Q q10, q3.n nVar, Hb.d dVar) {
        super(1, dVar);
        this.f6702v = q10;
        this.f6703w = nVar;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new C0398m(this.f6702v, this.f6703w, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((C0398m) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.jvm.internal.v] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC1656a a9;
        ?? r92;
        kotlin.jvm.internal.r rVar;
        ?? r12;
        InterfaceC1656a interfaceC1656a;
        Iterator it;
        InterfaceC1656a interfaceC1656a2;
        kotlin.jvm.internal.r rVar2;
        kotlin.jvm.internal.v vVar;
        C0397l c0397l;
        kotlin.jvm.internal.r rVar3;
        kotlin.jvm.internal.v vVar2;
        kotlin.jvm.internal.r rVar4;
        Object obj2;
        Integer a10;
        int i7;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = this.f6701u;
        q3.n nVar = this.f6703w;
        Q q10 = this.f6702v;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            a9 = AbstractC1660e.a();
            ?? obj3 = new Object();
            Object obj4 = new Object();
            this.f6695a = a9;
            this.f6696b = obj3;
            this.f6697c = obj4;
            this.f6698d = obj4;
            this.f6701u = 1;
            obj = Q.f(q10, true, this);
            if (obj == aVar) {
                return aVar;
            }
            r92 = obj4;
            r12 = obj4;
            rVar = obj3;
        } else if (i10 == 1) {
            kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) this.f6698d;
            r92 = (kotlin.jvm.internal.v) this.f6697c;
            kotlin.jvm.internal.r rVar5 = (kotlin.jvm.internal.r) this.f6696b;
            a9 = (InterfaceC1656a) this.f6695a;
            com.bumptech.glide.c.c0(obj);
            r12 = vVar3;
            rVar = rVar5;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = this.f6700f;
                    obj2 = this.f6695a;
                    com.bumptech.glide.c.c0(obj);
                    return new C0389d(obj2, i7, ((Number) obj).intValue());
                }
                interfaceC1656a = (InterfaceC1656a) this.f6697c;
                vVar2 = (kotlin.jvm.internal.v) this.f6696b;
                rVar4 = (kotlin.jvm.internal.r) this.f6695a;
                com.bumptech.glide.c.c0(obj);
                try {
                    rVar4.f19130a = true;
                    interfaceC1656a.l(null);
                    obj2 = vVar2.f19134a;
                    int hashCode = obj2 == null ? obj2.hashCode() : 0;
                    a0 g = q10.g();
                    this.f6695a = obj2;
                    this.f6696b = null;
                    this.f6697c = null;
                    this.f6700f = hashCode;
                    this.f6701u = 4;
                    a10 = g.a();
                    if (a10 != aVar) {
                        return aVar;
                    }
                    i7 = hashCode;
                    obj = a10;
                    return new C0389d(obj2, i7, ((Number) obj).intValue());
                } catch (Throwable th) {
                    interfaceC1656a.l(null);
                    throw th;
                }
            }
            it = this.f6699e;
            c0397l = (C0397l) this.f6698d;
            vVar = (kotlin.jvm.internal.v) this.f6697c;
            rVar2 = (kotlin.jvm.internal.r) this.f6696b;
            interfaceC1656a2 = (InterfaceC1656a) this.f6695a;
            com.bumptech.glide.c.c0(obj);
            while (it.hasNext()) {
                Rb.e eVar = (Rb.e) it.next();
                this.f6695a = interfaceC1656a2;
                this.f6696b = rVar2;
                this.f6697c = vVar;
                this.f6698d = c0397l;
                this.f6699e = it;
                this.f6701u = 2;
                if (eVar.invoke(c0397l, this) == aVar) {
                    return aVar;
                }
            }
            r92 = vVar;
            rVar3 = rVar2;
            interfaceC1656a = interfaceC1656a2;
            nVar.f23398d = null;
            this.f6695a = rVar3;
            this.f6696b = r92;
            this.f6697c = interfaceC1656a;
            this.f6698d = null;
            this.f6699e = null;
            this.f6701u = 3;
            if (interfaceC1656a.n(this) == aVar) {
                return aVar;
            }
            vVar2 = r92;
            rVar4 = rVar3;
            rVar4.f19130a = true;
            interfaceC1656a.l(null);
            obj2 = vVar2.f19134a;
            if (obj2 == null) {
            }
            a0 g2 = q10.g();
            this.f6695a = obj2;
            this.f6696b = null;
            this.f6697c = null;
            this.f6700f = hashCode;
            this.f6701u = 4;
            a10 = g2.a();
            if (a10 != aVar) {
            }
        }
        r12.f19134a = ((C0389d) obj).f6660b;
        C0397l c0397l2 = new C0397l(a9, rVar, r92, q10);
        List list = (List) nVar.f23398d;
        if (list != null) {
            it = list.iterator();
            interfaceC1656a2 = a9;
            rVar2 = rVar;
            vVar = r92;
            c0397l = c0397l2;
            while (it.hasNext()) {
            }
            r92 = vVar;
            rVar3 = rVar2;
            interfaceC1656a = interfaceC1656a2;
            nVar.f23398d = null;
            this.f6695a = rVar3;
            this.f6696b = r92;
            this.f6697c = interfaceC1656a;
            this.f6698d = null;
            this.f6699e = null;
            this.f6701u = 3;
            if (interfaceC1656a.n(this) == aVar) {
            }
        } else {
            interfaceC1656a = a9;
            rVar3 = rVar;
            nVar.f23398d = null;
            this.f6695a = rVar3;
            this.f6696b = r92;
            this.f6697c = interfaceC1656a;
            this.f6698d = null;
            this.f6699e = null;
            this.f6701u = 3;
            if (interfaceC1656a.n(this) == aVar) {
            }
        }
    }
}
