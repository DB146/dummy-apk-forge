package com.google.firebase.crashlytics;

import B8.a;
import B8.d;
import Y6.i;
import android.util.Log;
import c7.InterfaceC0913b;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import f7.b;
import f7.c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import k8.e;
import m4.Y;
import mc.C1659d;
import p7.C1857a;
import p7.h;
import p7.p;
import r7.C1947c;
import r7.C1949e;
import x8.InterfaceC2270a;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15856d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p f15857a = new p(InterfaceC1142a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final p f15858b = new p(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final p f15859c = new p(c.class, ExecutorService.class);

    static {
        d dVar = d.f2229a;
        Map map = B8.c.f2228b;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new a(new C1659d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Y a9 = C1857a.a(C1949e.class);
        a9.f20191a = "fire-cls";
        a9.a(h.c(i.class));
        a9.a(h.c(e.class));
        a9.a(new h(this.f15857a, 1, 0));
        a9.a(new h(this.f15858b, 1, 0));
        a9.a(new h(this.f15859c, 1, 0));
        a9.a(h.a(s7.a.class));
        a9.a(h.a(InterfaceC0913b.class));
        a9.a(h.a(InterfaceC2270a.class));
        a9.f20196f = new C1947c(this, 0);
        a9.c(2);
        return Arrays.asList(a9.b(), Y6.b.j("fire-cls", "19.4.4"));
    }
}
