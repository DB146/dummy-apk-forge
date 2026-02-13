package m4;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import o4.InterfaceC1802p;
import p5.C1851b;

/* renamed from: m4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1577k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20415a;

    /* renamed from: b, reason: collision with root package name */
    public final U9.i f20416b = new U9.i(4);

    public C1577k(Context context) {
        this.f20415a = context;
    }

    public final AbstractC1565e[] a(Handler handler, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z2, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z3, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z4) {
        ArrayList arrayList = new ArrayList();
        U9.i iVar = this.f20416b;
        Context context = this.f20415a;
        arrayList.add(new o5.i(context, iVar, handler, surfaceHolderCallbackC1596z));
        r8.o oVar = new r8.o(context);
        if (((l2.X) oVar.f23859d) == null) {
            oVar.f23859d = new l2.X(new InterfaceC1802p[0]);
        }
        arrayList.add(new o4.L(this.f20415a, iVar, handler, surfaceHolderCallbackC1596z2, new o4.I(oVar)));
        arrayList.add(new a5.l(surfaceHolderCallbackC1596z3, handler.getLooper()));
        arrayList.add(new F4.f(surfaceHolderCallbackC1596z4, handler.getLooper()));
        arrayList.add(new C1851b());
        return (AbstractC1565e[]) arrayList.toArray(new AbstractC1565e[0]);
    }
}
