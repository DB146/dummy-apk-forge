package N6;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class M extends AbstractC0420a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7239c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f7240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7241e;

    public M(D0 d02) {
        this.f7241e = d02;
        this.f7240d = ((L) d02.f7221c).iterator();
    }

    public M(Iterator it, M6.m mVar) {
        this.f7240d = it;
        this.f7241e = mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // N6.AbstractC0420a
    public final Object a() {
        Object next;
        Object next2;
        switch (this.f7239c) {
            case 0:
                do {
                    Iterator it = this.f7240d;
                    if (!it.hasNext()) {
                        this.f7267a = 3;
                        return null;
                    }
                    next = it.next();
                } while (!((M6.m) this.f7241e).apply(next));
                return next;
            default:
                do {
                    Iterator it2 = this.f7240d;
                    if (!it2.hasNext()) {
                        this.f7267a = 3;
                        return null;
                    }
                    next2 = it2.next();
                } while (!((L) ((D0) this.f7241e).f7222d).contains(next2));
                return next2;
        }
    }
}
