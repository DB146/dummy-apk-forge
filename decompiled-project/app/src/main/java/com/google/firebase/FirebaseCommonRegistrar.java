package com.google.firebase;

import Y6.b;
import Y6.i;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import h8.C1262b;
import h8.d;
import h8.e;
import h8.f;
import h8.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m4.Y;
import p7.C1857a;
import p7.h;
import p7.p;
import r7.C1948d;
import t8.C2032a;
import t8.C2033b;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        Y a9 = C1857a.a(C2033b.class);
        a9.a(new h(2, 0, C2032a.class));
        a9.f20196f = new C1948d(7);
        arrayList.add(a9.b());
        p pVar = new p(InterfaceC1142a.class, Executor.class);
        Y y10 = new Y(d.class, new Class[]{f.class, g.class});
        y10.a(h.c(Context.class));
        y10.a(h.c(i.class));
        y10.a(new h(2, 0, e.class));
        y10.a(new h(1, 1, C2033b.class));
        y10.a(new h(pVar, 1, 0));
        y10.f20196f = new C1262b(pVar, 0);
        arrayList.add(y10.b());
        arrayList.add(b.j("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(b.j("fire-core", "21.0.0"));
        arrayList.add(b.j("device-name", a(Build.PRODUCT)));
        arrayList.add(b.j("device-model", a(Build.DEVICE)));
        arrayList.add(b.j("device-brand", a(Build.BRAND)));
        arrayList.add(b.l("android-target-sdk", new P4.Y(12)));
        arrayList.add(b.l("android-min-sdk", new P4.Y(13)));
        arrayList.add(b.l("android-platform", new P4.Y(14)));
        arrayList.add(b.l("android-installer", new P4.Y(15)));
        try {
            Db.f.f3350b.getClass();
            str = "2.2.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(b.j("kotlin", str));
        }
        return arrayList;
    }
}
