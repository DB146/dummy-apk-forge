package yc;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public E f27811a;

    /* renamed from: b, reason: collision with root package name */
    public C2480b f27812b;

    /* renamed from: c, reason: collision with root package name */
    public U f27813c;

    /* renamed from: d, reason: collision with root package name */
    public xc.g f27814d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f27815e;

    /* renamed from: f, reason: collision with root package name */
    public String f27816f;
    public S g;

    /* renamed from: h, reason: collision with root package name */
    public D f27817h;

    /* renamed from: i, reason: collision with root package name */
    public H f27818i;
    public O j;
    public final N k = new P(3, this);

    public abstract List a();

    public final xc.l b() {
        int size = this.f27815e.size();
        return size > 0 ? (xc.l) this.f27815e.get(size - 1) : this.f27814d;
    }

    public final boolean c(String str) {
        xc.l b2;
        if (this.f27815e.size() == 0 || (b2 = b()) == null) {
            return false;
        }
        F f4 = b2.f26349d;
        return f4.f27658c.equals(str) && f4.f27656a.equals("http://www.w3.org/1999/xhtml");
    }

    public String d() {
        return "http://www.w3.org/1999/xhtml";
    }

    public abstract D e();

    public H f() {
        return new H(H.f27661c);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [yc.O, yc.P, yc.S] */
    public void g(Reader reader, String str, E e2) {
        vc.i.E(str, "baseUri");
        vc.i.D(e2);
        m1 m1Var = e2.f27651a;
        xc.g gVar = new xc.g(m1Var.d(), str);
        this.f27814d = gVar;
        gVar.f26342y = e2;
        this.f27811a = e2;
        this.f27817h = e2.f27653c;
        C2480b c2480b = new C2480b(reader);
        this.f27812b = c2480b;
        e2.f27652b.getClass();
        c2480b.f27711x = null;
        e2.f27652b.getClass();
        this.f27813c = new U(this);
        this.f27815e = new ArrayList(32);
        if (e2.f27654d == null) {
            e2.f27654d = m1Var.f();
        }
        this.f27818i = e2.f27654d;
        ?? p10 = new P(2, this);
        this.j = p10;
        this.g = p10;
        this.f27816f = str;
    }

    public abstract void h();

    public abstract m1 i();

    public xc.l j() {
        return (xc.l) this.f27815e.remove(this.f27815e.size() - 1);
    }

    public abstract boolean k(S s3);

    public final boolean l(String str) {
        S s3 = this.g;
        N n6 = this.k;
        if (s3 == n6) {
            P p10 = new P(3, this);
            p10.k(str);
            return k(p10);
        }
        n6.g();
        n6.k(str);
        return k(n6);
    }

    public final void m(String str) {
        O o10 = this.j;
        if (this.g == o10) {
            P p10 = new P(2, this);
            p10.k(str);
            k(p10);
        } else {
            o10.g();
            o10.k(str);
            k(o10);
        }
    }

    public final void n() {
        while (true) {
            if (this.g.f27675a == 7) {
                ArrayList arrayList = this.f27815e;
                if (arrayList == null) {
                    break;
                } else if (arrayList.isEmpty()) {
                    this.f27815e = null;
                } else {
                    j();
                }
            } else {
                U u3 = this.f27813c;
                while (!u3.f27686e) {
                    u3.f27684c.f(u3, u3.f27682a);
                }
                J j = u3.k;
                boolean t5 = j.f27664d.t();
                S s3 = j;
                if (!t5) {
                    u3.f27686e = false;
                    s3 = u3.f27685d;
                }
                this.g = s3;
                k(s3);
                s3.g();
            }
        }
        C2480b c2480b = this.f27812b;
        if (c2480b == null) {
            return;
        }
        c2480b.close();
        this.f27812b = null;
        this.f27813c = null;
        this.f27815e = null;
    }

    public final F o(O o10) {
        return this.f27818i.d(o10.f27670d.L(), o10.f27671e, d(), this.f27817h.f27649a);
    }
}
