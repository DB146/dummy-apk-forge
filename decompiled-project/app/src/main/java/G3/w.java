package G3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4333a;

    /* renamed from: b, reason: collision with root package name */
    public final Q7.h f4334b;

    /* renamed from: c, reason: collision with root package name */
    public int f4335c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.g f4336d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f4337e;

    /* renamed from: f, reason: collision with root package name */
    public List f4338f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4339u;

    public w(ArrayList arrayList, Q7.h hVar) {
        this.f4334b = hVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f4333a = arrayList;
        this.f4335c = 0;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void a() {
        List list = this.f4338f;
        if (list != null) {
            this.f4334b.M(list);
        }
        this.f4338f = null;
        Iterator it = this.f4333a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).a();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return ((com.bumptech.glide.load.data.e) this.f4333a.get(0)).b();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        List list = this.f4338f;
        W3.g.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f4339u = true;
        Iterator it = this.f4333a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        return ((com.bumptech.glide.load.data.e) this.f4333a.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Object obj) {
        if (obj != null) {
            this.f4337e.e(obj);
        } else {
            g();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        this.f4336d = gVar;
        this.f4337e = dVar;
        this.f4338f = (List) this.f4334b.h();
        ((com.bumptech.glide.load.data.e) this.f4333a.get(this.f4335c)).f(gVar, this);
        if (this.f4339u) {
            cancel();
        }
    }

    public final void g() {
        if (this.f4339u) {
            return;
        }
        if (this.f4335c < this.f4333a.size() - 1) {
            this.f4335c++;
            f(this.f4336d, this.f4337e);
        } else {
            W3.g.b(this.f4338f);
            this.f4337e.c(new C3.v("Fetch failed", new ArrayList(this.f4338f)));
        }
    }
}
