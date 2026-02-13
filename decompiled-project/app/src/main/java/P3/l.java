package P3;

import J3.w;
import W1.C;
import W1.G;
import W1.U;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import q3.s;
import u.C2052e;
import u.T;
import y6.C2399e;

/* loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final U9.j f7830e = new U9.j(12);

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.n f7831a;

    /* renamed from: c, reason: collision with root package name */
    public final f f7833c;

    /* renamed from: b, reason: collision with root package name */
    public final C2052e f7832b = new T(0);

    /* renamed from: d, reason: collision with root package name */
    public final s f7834d = new s(f7830e);

    /* JADX WARN: Type inference failed for: r0v0, types: [u.T, u.e] */
    public l() {
        this.f7833c = (w.f5500f && w.f5499e) ? new e() : new C2399e(11);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, C2052e c2052e) {
        View view;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C c10 = (C) it.next();
            if (c10 != null && (view = c10.f10277U) != null) {
                c2052e.put(view, c10);
                b(c10.B().f10357c.h(), c2052e);
            }
        }
    }

    public final com.bumptech.glide.n c(C c10) {
        W3.g.c(c10.C(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = W3.o.f10619a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return e(c10.C().getApplicationContext());
        }
        if (c10.A() != null) {
            this.f7833c.c(c10.A());
        }
        U B10 = c10.B();
        Context C2 = c10.C();
        return this.f7834d.r(C2, com.bumptech.glide.b.a(C2.getApplicationContext()), c10.f10288c0, B10, c10.N());
    }

    public final com.bumptech.glide.n d(G g) {
        char[] cArr = W3.o.f10619a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return e(g.getApplicationContext());
        }
        if (g.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f7833c.c(g);
        Activity a9 = a(g);
        return this.f7834d.r(g, com.bumptech.glide.b.a(g.getApplicationContext()), g.f18773a, g.j(), a9 == null || !a9.isFinishing());
    }

    public final com.bumptech.glide.n e(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = W3.o.f10619a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof G) {
                return d((G) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return e(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f7831a == null) {
            synchronized (this) {
                try {
                    if (this.f7831a == null) {
                        this.f7831a = new com.bumptech.glide.n(com.bumptech.glide.b.a(context.getApplicationContext()), new h8.e(11), new Hc.e(12), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f7831a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
