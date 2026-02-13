package N6;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class C0 extends AbstractC0420a {

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f7215c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f7216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D0 f7217e;

    public C0(D0 d02) {
        this.f7217e = d02;
        this.f7215c = d02.f7221c.iterator();
        this.f7216d = d02.f7222d.iterator();
    }

    @Override // N6.AbstractC0420a
    public final Object a() {
        Object next;
        Iterator it = this.f7215c;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.f7216d;
            if (!it2.hasNext()) {
                this.f7267a = 3;
                return null;
            }
            next = it2.next();
        } while (this.f7217e.f7221c.contains(next));
        return next;
    }
}
