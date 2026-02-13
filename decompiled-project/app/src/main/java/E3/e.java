package E3;

import G3.C0280b;
import G3.InterfaceC0285g;
import G3.o;
import G3.s;
import G3.t;
import G3.y;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Process;
import b4.C0839j;
import b4.m;
import b4.q;
import c4.C0903e;
import c4.C0905g;
import d4.C1048a;
import g4.C1197b;
import h4.j;
import java.io.InputStream;
import kotlin.jvm.internal.l;
import tss.r.core.ads.ui.ProductDetailsActivity;

/* loaded from: classes.dex */
public final class e implements t, InterfaceC0285g, J6.h, Lc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3529a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3530b;

    public /* synthetic */ e(Context context, int i7) {
        this.f3529a = i7;
        this.f3530b = context;
    }

    @Override // J6.i
    public Object a() {
        return this.f3530b;
    }

    @Override // Lc.f
    public void a(Jc.a ad) {
        l.e(ad, "ad");
        int i7 = ProductDetailsActivity.f24545X;
        Context context = this.f3530b;
        context.startActivity(c2.i.k(context, ad));
    }

    @Override // G3.InterfaceC0285g
    public Class b() {
        return InputStream.class;
    }

    @Override // G3.InterfaceC0285g
    public Object c(int i7, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(i7);
    }

    @Override // G3.InterfaceC0285g
    public void d(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // Lc.f
    public void e(Jc.a ad) {
        l.e(ad, "ad");
        int i7 = ProductDetailsActivity.f24545X;
        Context context = this.f3530b;
        context.startActivity(c2.i.k(context, ad));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b4.j, java.lang.Object] */
    public C0839j f() {
        Context context = this.f3530b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        ?? obj = new Object();
        obj.f13862a = C1048a.a(b4.l.f13870a);
        C0903e c0903e = new C0903e(context, 3);
        obj.f13863b = c0903e;
        obj.f13864c = C1048a.a(new C0905g(c0903e, new C0903e(c0903e, 0), 0));
        C0903e c0903e2 = obj.f13863b;
        obj.f13865d = new C0903e(c0903e2, 2);
        Cb.a a9 = C1048a.a(new C0905g(obj.f13865d, C1048a.a(new C0903e(c0903e2, 1)), 1));
        obj.f13866e = a9;
        m mVar = new m(1);
        C0903e c0903e3 = obj.f13863b;
        q qVar = new q(c0903e3, a9, mVar, 1);
        Cb.a aVar = obj.f13862a;
        Cb.a aVar2 = obj.f13864c;
        obj.f13867f = C1048a.a(new q(new C1197b(aVar, aVar2, qVar, a9, a9), new j(c0903e3, aVar2, a9, qVar, aVar, a9, a9), new h4.l(aVar, a9, qVar, a9), 0));
        return obj;
    }

    public ApplicationInfo g(int i7, String str) {
        return this.f3530b.getPackageManager().getApplicationInfo(str, i7);
    }

    public PackageInfo h(int i7, String str) {
        return this.f3530b.getPackageManager().getPackageInfo(str, i7);
    }

    public boolean i() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f3530b;
        if (callingUid == myUid) {
            return O5.b.v(context);
        }
        if (!M5.c.f() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    @Override // G3.t
    public s m(y yVar) {
        switch (this.f3529a) {
            case 1:
                return new C0280b(this.f3530b, this);
            default:
                return new o(this.f3530b, 2);
        }
    }
}
