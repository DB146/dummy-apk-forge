package C3;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements h, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f2514a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2515b;

    /* renamed from: c, reason: collision with root package name */
    public final g f2516c;

    /* renamed from: d, reason: collision with root package name */
    public int f2517d = -1;

    /* renamed from: e, reason: collision with root package name */
    public A3.h f2518e;

    /* renamed from: f, reason: collision with root package name */
    public List f2519f;

    /* renamed from: u, reason: collision with root package name */
    public int f2520u;

    /* renamed from: v, reason: collision with root package name */
    public volatile G3.r f2521v;

    /* renamed from: w, reason: collision with root package name */
    public File f2522w;

    public e(List list, i iVar, g gVar) {
        this.f2514a = list;
        this.f2515b = iVar;
        this.f2516c = gVar;
    }

    @Override // C3.h
    public final boolean a() {
        while (true) {
            List list = this.f2519f;
            boolean z8 = false;
            if (list != null && this.f2520u < list.size()) {
                this.f2521v = null;
                while (!z8 && this.f2520u < this.f2519f.size()) {
                    List list2 = this.f2519f;
                    int i7 = this.f2520u;
                    this.f2520u = i7 + 1;
                    G3.s sVar = (G3.s) list2.get(i7);
                    File file = this.f2522w;
                    i iVar = this.f2515b;
                    this.f2521v = sVar.a(file, iVar.f2529e, iVar.f2530f, iVar.f2532i);
                    if (this.f2521v != null && this.f2515b.c(this.f2521v.f4329c.b()) != null) {
                        this.f2521v.f4329c.f(this.f2515b.f2536o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i10 = this.f2517d + 1;
            this.f2517d = i10;
            if (i10 >= this.f2514a.size()) {
                return false;
            }
            A3.h hVar = (A3.h) this.f2514a.get(this.f2517d);
            i iVar2 = this.f2515b;
            File e2 = iVar2.f2531h.a().e(new f(hVar, iVar2.f2535n));
            this.f2522w = e2;
            if (e2 != null) {
                this.f2518e = hVar;
                this.f2519f = this.f2515b.f2527c.a().f(e2);
                this.f2520u = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        this.f2516c.b(this.f2518e, exc, this.f2521v.f4329c, A3.a.f344c);
    }

    @Override // C3.h
    public final void cancel() {
        G3.r rVar = this.f2521v;
        if (rVar != null) {
            rVar.f4329c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Object obj) {
        this.f2516c.d(this.f2518e, obj, this.f2521v.f4329c, A3.a.f344c, this.f2518e);
    }
}
