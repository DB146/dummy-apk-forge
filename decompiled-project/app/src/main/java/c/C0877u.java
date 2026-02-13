package c;

import java.util.ListIterator;

/* renamed from: c.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877u extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0853A f14072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0877u(C0853A c0853a, int i7) {
        super(1);
        this.f14071a = i7;
        this.f14072b = c0853a;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f14071a) {
            case 0:
                C0857a backEvent = (C0857a) obj;
                kotlin.jvm.internal.l.e(backEvent, "backEvent");
                C0853A c0853a = this.f14072b;
                Eb.l lVar = c0853a.f14008b;
                ListIterator listIterator = lVar.listIterator(lVar.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((AbstractC0876t) obj2).f14068a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                AbstractC0876t abstractC0876t = (AbstractC0876t) obj2;
                if (c0853a.f14009c != null) {
                    c0853a.b();
                }
                c0853a.f14009c = abstractC0876t;
                if (abstractC0876t != null) {
                    abstractC0876t.d(backEvent);
                }
                return Db.q.f3365a;
            default:
                C0857a backEvent2 = (C0857a) obj;
                kotlin.jvm.internal.l.e(backEvent2, "backEvent");
                C0853A c0853a2 = this.f14072b;
                AbstractC0876t abstractC0876t2 = c0853a2.f14009c;
                if (abstractC0876t2 == null) {
                    Eb.l lVar2 = c0853a2.f14008b;
                    ListIterator listIterator2 = lVar2.listIterator(lVar2.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((AbstractC0876t) obj3).f14068a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    abstractC0876t2 = (AbstractC0876t) obj3;
                }
                if (abstractC0876t2 != null) {
                    abstractC0876t2.c(backEvent2);
                }
                return Db.q.f3365a;
        }
    }
}
