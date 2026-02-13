package B0;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import v2.C2133e;
import y1.AbstractC2352B;

/* renamed from: B0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168b0 implements Q.E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1859c;

    public /* synthetic */ C0168b0(int i7, Object obj, Object obj2) {
        this.f1857a = i7;
        this.f1858b = obj;
        this.f1859c = obj2;
    }

    @Override // Q.E
    public final void b() {
        Object obj = this.f1859c;
        Object obj2 = this.f1858b;
        switch (this.f1857a) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0172d0) obj);
                return;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0174e0) obj);
                return;
            case 2:
                C.P p10 = (C.P) obj2;
                int i7 = p10.f2385s - 1;
                p10.f2385s = i7;
                if (i7 == 0) {
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    View view = (View) obj;
                    AbstractC2352B.l(view, null);
                    y1.K.p(view, null);
                    view.removeOnAttachStateChangeListener(p10.f2386t);
                    return;
                }
                return;
            case 3:
                ((F.N) obj2).f3928c.j(obj);
                return;
            case 4:
                ((C2133e) obj2).f24973v.j.f((w2.m) obj);
                return;
            case 5:
                Iterator it = ((List) ((Q.R0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((w2.i) obj).b().c((C2133e) it.next());
                }
                return;
            case 6:
                ((x.i0) obj2).j.remove((x.i0) obj);
                return;
            default:
                x.i0 i0Var = (x.i0) obj2;
                i0Var.getClass();
                x.a0 a0Var = (x.a0) ((x.b0) obj).f26054b.getValue();
                if (a0Var != null) {
                    i0Var.f26106i.remove(a0Var.f26041a);
                    return;
                }
                return;
        }
    }
}
