package I2;

import A8.f0;
import android.content.Context;
import android.content.Intent;
import hc.C1277e;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: I2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327p {

    /* renamed from: a, reason: collision with root package name */
    public final String f5184a;

    /* renamed from: b, reason: collision with root package name */
    public final C0323l f5185b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5186c;

    /* renamed from: d, reason: collision with root package name */
    public final cc.E f5187d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5188e;

    /* renamed from: f, reason: collision with root package name */
    public int f5189f;
    public InterfaceC0319h g;

    /* renamed from: h, reason: collision with root package name */
    public final fc.P f5190h;

    /* renamed from: i, reason: collision with root package name */
    public final q3.c f5191i;
    public final BinderC0326o j;
    public final f0 k;

    public C0327p(Context context, String name, C0323l c0323l) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(name, "name");
        this.f5184a = name;
        this.f5185b = c0323l;
        this.f5186c = context.getApplicationContext();
        C1277e c1277e = c0323l.f5168a.f5026a;
        if (c1277e == null) {
            kotlin.jvm.internal.l.j("coroutineScope");
            throw null;
        }
        this.f5187d = c1277e;
        this.f5188e = new AtomicBoolean(true);
        this.f5190h = fc.Q.a(0, 0, 1);
        this.f5191i = new q3.c(10, this, c0323l.f5169b);
        this.j = new BinderC0326o(this);
        this.k = new f0(this, 2);
    }

    public final void a(Intent serviceIntent) {
        kotlin.jvm.internal.l.e(serviceIntent, "serviceIntent");
        if (this.f5188e.compareAndSet(true, false)) {
            this.f5186c.bindService(serviceIntent, this.k, 1);
            C0323l c0323l = this.f5185b;
            q3.c observer = this.f5191i;
            kotlin.jvm.internal.l.e(observer, "observer");
            String[] strArr = (String[]) observer.f23371b;
            c0 c0Var = c0323l.f5170c;
            Db.j g = c0Var.g(strArr);
            String[] strArr2 = (String[]) g.f3354a;
            int[] iArr = (int[]) g.f3355b;
            C0332v c0332v = new C0332v(observer, iArr, strArr2);
            ReentrantLock reentrantLock = c0323l.f5172e;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = c0323l.f5171d;
            try {
                C0332v c0332v2 = linkedHashMap.containsKey(observer) ? (C0332v) Eb.B.E(observer, linkedHashMap) : (C0332v) linkedHashMap.put(observer, c0332v);
                reentrantLock.unlock();
                if (c0332v2 == null) {
                    c0Var.f5157h.n(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
