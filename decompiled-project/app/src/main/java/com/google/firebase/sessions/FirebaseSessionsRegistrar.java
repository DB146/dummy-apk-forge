package com.google.firebase.sessions;

import A8.AbstractC0055t;
import A8.AbstractC0058w;
import A8.C0045i;
import A8.C0049m;
import A8.C0052p;
import A8.C0059x;
import A8.C0060y;
import A8.InterfaceC0054s;
import A8.O;
import A8.X;
import A8.Z;
import D8.a;
import D8.c;
import Y3.f;
import Y6.i;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import cc.A;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import f7.b;
import j8.InterfaceC1387b;
import java.util.List;
import k8.e;
import kotlin.jvm.internal.l;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;
import p7.p;
import y7.u0;

@Keep
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    public static final String TAG = "FirebaseSessions";
    private static final C0059x Companion = new Object();
    private static final p appContext = p.a(Context.class);
    private static final p firebaseApp = p.a(i.class);
    private static final p firebaseInstallationsApi = p.a(e.class);
    private static final p backgroundDispatcher = new p(InterfaceC1142a.class, A.class);
    private static final p blockingDispatcher = new p(b.class, A.class);
    private static final p transportFactory = p.a(f.class);
    private static final p firebaseSessionsComponent = p.a(InterfaceC0054s.class);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, A8.x] */
    static {
        try {
            int i7 = AbstractC0058w.f721a;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    public static final C0052p getComponents$lambda$0(InterfaceC1858b interfaceC1858b) {
        return (C0052p) ((C0045i) ((InterfaceC0054s) interfaceC1858b.g(firebaseSessionsComponent))).f682i.get();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [A8.s, java.lang.Object, A8.i] */
    public static final InterfaceC0054s getComponents$lambda$1(InterfaceC1858b interfaceC1858b) {
        Object g = interfaceC1858b.g(appContext);
        l.d(g, "container[appContext]");
        Object g2 = interfaceC1858b.g(backgroundDispatcher);
        l.d(g2, "container[backgroundDispatcher]");
        Object g10 = interfaceC1858b.g(blockingDispatcher);
        l.d(g10, "container[blockingDispatcher]");
        Object g11 = interfaceC1858b.g(firebaseApp);
        l.d(g11, "container[firebaseApp]");
        Object g12 = interfaceC1858b.g(firebaseInstallationsApi);
        l.d(g12, "container[firebaseInstallationsApi]");
        InterfaceC1387b h10 = interfaceC1858b.h(transportFactory);
        l.d(h10, "container.getProvider(transportFactory)");
        ?? obj = new Object();
        obj.f675a = c.a((i) g11);
        c a9 = c.a((Context) g);
        obj.f676b = a9;
        obj.f677c = a.a(new C0049m(a9, 5));
        obj.f678d = c.a((Hb.i) g2);
        obj.f679e = c.a((e) g12);
        Cb.a a10 = a.a(new C0049m(obj.f675a, 1));
        obj.f680f = a10;
        obj.g = a.a(new O(a10, obj.f678d));
        obj.f681h = a.a(new Z(obj.f677c, a.a(new X(obj.f678d, obj.f679e, obj.f680f, obj.g, a.a(new C0049m(a.a(new C0049m(obj.f676b, 2)), 6)), 1)), 1));
        obj.f682i = a.a(new C0060y(obj.f675a, obj.f681h, obj.f678d, a.a(new C0049m(obj.f676b, 4))));
        obj.j = a.a(new O(obj.f678d, a.a(new C0049m(obj.f676b, 3))));
        obj.k = a.a(new X(obj.f675a, obj.f679e, obj.f681h, a.a(new C0049m(c.a(h10), 0)), obj.f678d, 0));
        obj.f683l = a.a(AbstractC0055t.f716a);
        obj.f684m = a.a(new Z(obj.f683l, a.a(AbstractC0055t.f717b), 0));
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(C0052p.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.d(firebaseSessionsComponent));
        a9.f20196f = new A4.p(3);
        a9.c(2);
        C1857a b2 = a9.b();
        Y a10 = C1857a.a(InterfaceC0054s.class);
        a10.f20191a = "fire-sessions-component";
        a10.a(h.d(appContext));
        a10.a(h.d(backgroundDispatcher));
        a10.a(h.d(blockingDispatcher));
        a10.a(h.d(firebaseApp));
        a10.a(h.d(firebaseInstallationsApi));
        a10.a(new h(transportFactory, 1, 1));
        a10.f20196f = new A4.p(4);
        return u0.y(b2, a10.b(), Y6.b.j(LIBRARY_NAME, "2.1.2"));
    }
}
