package n3;

import Hb.j;
import fc.C1156c;
import h3.C1243e;
import kotlin.jvm.internal.l;
import q3.p;

/* renamed from: n3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1698c implements InterfaceC1700e {

    /* renamed from: a, reason: collision with root package name */
    public final o3.e f21064a;

    public AbstractC1698c(o3.e tracker) {
        l.e(tracker, "tracker");
        this.f21064a = tracker;
    }

    @Override // n3.InterfaceC1700e
    public final C1156c a(C1243e constraints) {
        l.e(constraints, "constraints");
        return new C1156c(new C1697b(this, null), j.f4919a, -2, 1);
    }

    @Override // n3.InterfaceC1700e
    public final boolean c(p pVar) {
        return b(pVar) && e(this.f21064a.c());
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
