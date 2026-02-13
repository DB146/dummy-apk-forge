package M1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: M1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393h extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f6673a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6674b;

    /* renamed from: c, reason: collision with root package name */
    public int f6675c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f6677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0393h(List list, ArrayList arrayList, Hb.d dVar) {
        super(2, dVar);
        this.f6677e = list;
        this.f6678f = arrayList;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C0393h c0393h = new C0393h(this.f6677e, this.f6678f, dVar);
        c0393h.f6676d = obj;
        return c0393h;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0393h) create(obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6675c;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            obj = this.f6676d;
            it = this.f6677e.iterator();
            list = this.f6678f;
        } else if (i7 == 1) {
            Object obj2 = this.f6674b;
            Iterator it2 = this.f6673a;
            List list2 = (List) this.f6676d;
            com.bumptech.glide.c.c0(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new Jb.i(1, null));
                this.f6676d = list2;
                this.f6673a = it2;
                this.f6674b = null;
                this.f6675c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f6673a;
            list = (List) this.f6676d;
            com.bumptech.glide.c.c0(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f6676d = list;
        this.f6673a = it;
        this.f6674b = obj;
        this.f6675c = 1;
        throw null;
    }
}
