package z3;

import Db.q;
import cc.E;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587b extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28218a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f28220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2587b(c cVar, Hb.d dVar) {
        super(2, dVar);
        this.f28220c = cVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2587b c2587b = new C2587b(this.f28220c, dVar);
        c2587b.f28219b = obj;
        return c2587b;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2587b) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        E e2;
        ArrayList arrayList;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28218a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            E e10 = (E) this.f28219b;
            C2586a c2586a = (C2586a) this.f28220c.f28222b;
            this.f28219b = e10;
            this.f28218a = 1;
            Object o10 = c2586a.k.o(this);
            if (o10 == aVar) {
                return aVar;
            }
            e2 = e10;
            obj = o10;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e2 = (E) this.f28219b;
            com.bumptech.glide.c.c0(obj);
        }
        i iVar = (i) obj;
        c cVar = this.f28220c;
        synchronized (e2) {
            cVar.f28223c = iVar;
            arrayList = new ArrayList(cVar.f28226f);
            cVar.f28226f.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((S3.g) ((T3.h) it.next())).m(iVar.f28238a, iVar.f28239b);
        }
        return q.f3365a;
    }
}
