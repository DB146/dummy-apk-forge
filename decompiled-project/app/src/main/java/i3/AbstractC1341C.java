package i3;

import B0.C0170c0;
import cc.C0944m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: i3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1341C {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18328a;

    static {
        String g = h3.z.g("WorkerWrapper");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"WorkerWrapper\")");
        f18328a = g;
    }

    public static final Object a(R6.a aVar, h3.y yVar, Jb.i iVar) {
        int i7 = 1;
        try {
            if (aVar.isDone()) {
                return b(aVar);
            }
            C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(iVar));
            c0944m.s();
            aVar.a(new a1.o(aVar, c0944m, i7), h3.n.f17701a);
            c0944m.u(new C0170c0(21, yVar, aVar));
            Object r10 = c0944m.r();
            Ib.a aVar2 = Ib.a.f5345a;
            return r10;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            kotlin.jvm.internal.l.b(cause);
            throw cause;
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
