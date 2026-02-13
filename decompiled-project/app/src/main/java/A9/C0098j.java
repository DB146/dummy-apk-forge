package A9;

import H2.AbstractC0303q;
import H2.C0299m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: A9.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0098j extends J1 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1233c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1234d;

    /* renamed from: e, reason: collision with root package name */
    public T f1235e;

    public C0098j() {
        this.f1233c = new ArrayList();
        this.f1234d = new ArrayList();
    }

    public C0098j(AbstractC0113m2 abstractC0113m2) {
        super(abstractC0113m2);
        this.f1233c = new ArrayList();
        this.f1234d = new ArrayList();
    }

    public C0098j(AbstractC0117n2 abstractC0117n2) {
        super(abstractC0117n2);
        this.f1233c = new ArrayList();
        this.f1234d = new ArrayList();
    }

    @Override // A9.J1
    public final Object a(int i7) {
        return this.f1233c.get(i7);
    }

    @Override // A9.J1
    public final int e() {
        return this.f1233c.size();
    }

    public final void f(int i7, Object obj) {
        this.f1233c.add(i7, obj);
        c(i7, 1);
    }

    public final void g(Object obj) {
        f(this.f1233c.size(), obj);
    }

    public final void h(int i7, Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return;
        }
        this.f1233c.addAll(i7, collection);
        c(i7, size);
    }

    public final void i() {
        ArrayList arrayList = this.f1233c;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        arrayList.clear();
        this.f851a.i(0, size);
    }

    public final void j(List list, O5.b bVar) {
        ArrayList arrayList = this.f1233c;
        if (bVar == null) {
            arrayList.clear();
            arrayList.addAll(list);
            b();
            return;
        }
        ArrayList arrayList2 = this.f1234d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        C0299m c10 = AbstractC0303q.c(new C0094i(this, list, bVar));
        arrayList.clear();
        arrayList.addAll(list);
        if (this.f1235e == null) {
            this.f1235e = new T(this);
        }
        c10.a(this.f1235e);
        arrayList2.clear();
    }
}
