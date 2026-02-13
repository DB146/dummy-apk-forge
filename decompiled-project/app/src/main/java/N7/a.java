package N7;

import O7.k;
import Q7.f;
import T7.m;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7385a = false;

    public synchronized void a() {
        this.f7385a = false;
    }

    public synchronized boolean b() {
        if (this.f7385a) {
            return false;
        }
        this.f7385a = true;
        notifyAll();
        return true;
    }

    public Object c(Callable callable) {
        k.b("runInTransaction called when an existing transaction is already in progress.", !this.f7385a);
        this.f7385a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    public Q7.a d(f fVar) {
        return new Q7.a(new m(T7.k.f9348e, fVar.f8686b.f8684e), false, false);
    }

    public void e() {
        k.b("Transaction expected to already be in progress.", this.f7385a);
    }
}
