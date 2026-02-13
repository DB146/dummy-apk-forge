package xc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class r implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public q f26370a;

    /* renamed from: b, reason: collision with root package name */
    public q f26371b;

    /* renamed from: c, reason: collision with root package name */
    public q f26372c;

    /* renamed from: d, reason: collision with root package name */
    public q f26373d;

    /* renamed from: e, reason: collision with root package name */
    public q f26374e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f26375f;

    public r(q qVar, Class cls) {
        vc.i.D(qVar);
        this.f26375f = cls;
        if (cls.isInstance(qVar)) {
            this.f26371b = qVar;
        }
        this.f26372c = qVar;
        this.f26373d = qVar;
        this.f26370a = qVar;
        this.f26374e = qVar.T();
    }

    public final void a() {
        q qVar;
        if (this.f26371b != null) {
            return;
        }
        if (this.f26374e != null && this.f26372c.f26368a == null) {
            this.f26372c = this.f26373d;
        }
        q qVar2 = this.f26372c;
        loop0: while (true) {
            qVar = null;
            if (qVar2.C() > 0) {
                qVar2 = (q) qVar2.G().get(0);
            } else if (this.f26370a.equals(qVar2)) {
                qVar2 = null;
            } else {
                if (qVar2.M() != null) {
                    qVar2 = qVar2.M();
                }
                do {
                    qVar2 = qVar2.T();
                    if (qVar2 == null || this.f26370a.equals(qVar2)) {
                        break loop0;
                    }
                } while (qVar2.M() == null);
                qVar2 = qVar2.M();
            }
            if (qVar2 == null) {
                break;
            } else if (this.f26375f.isInstance(qVar2)) {
                qVar = qVar2;
                break;
            }
        }
        this.f26371b = qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f26371b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        q qVar = this.f26371b;
        if (qVar == null) {
            throw new NoSuchElementException();
        }
        this.f26373d = this.f26372c;
        this.f26372c = qVar;
        this.f26374e = qVar.T();
        this.f26371b = null;
        return qVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        q qVar = this.f26372c;
        l lVar = qVar.f26368a;
        if (lVar != null) {
            lVar.W(qVar);
        }
    }
}
