package I2;

import B0.C0204u;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: I2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323l {

    /* renamed from: a, reason: collision with root package name */
    public final E f5168a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f5169b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f5170c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5171d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f5172e;

    /* renamed from: f, reason: collision with root package name */
    public final C0320i f5173f;
    public final C0320i g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f5174h;

    /* renamed from: i, reason: collision with root package name */
    public C0327p f5175i;
    public final Object j;

    public C0323l(E e2, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f5168a = e2;
        this.f5169b = strArr;
        c0 c0Var = new c0(e2, hashMap, hashMap2, strArr, e2.k, new C0204u(1, this, C0323l.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 2));
        this.f5170c = c0Var;
        this.f5171d = new LinkedHashMap();
        this.f5172e = new ReentrantLock();
        this.f5173f = new C0320i(this, 0);
        this.g = new C0320i(this, 1);
        kotlin.jvm.internal.l.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.j = new Object();
        c0Var.k = new C0320i(this, 2);
    }

    public final Object a(Jb.i iVar) {
        Object f4;
        E e2 = this.f5168a;
        boolean p10 = e2.p();
        Db.q qVar = Db.q.f3365a;
        return ((!p10 || e2.t()) && (f4 = this.f5170c.f(iVar)) == Ib.a.f5345a) ? f4 : qVar;
    }
}
