package com.google.firebase.concurrent;

import c2.i;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import f7.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import m4.Y;
import n4.c;
import p7.C1857a;
import p7.d;
import p7.l;
import p7.p;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final l f15852a = new l(new d(2));

    /* renamed from: b, reason: collision with root package name */
    public static final l f15853b = new l(new d(3));

    /* renamed from: c, reason: collision with root package name */
    public static final l f15854c = new l(new d(4));

    /* renamed from: d, reason: collision with root package name */
    public static final l f15855d = new l(new d(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(InterfaceC1142a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(InterfaceC1142a.class, ExecutorService.class), new p(InterfaceC1142a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            i.e(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        C1857a c1857a = new C1857a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new c(24), hashSet3);
        p pVar3 = new p(b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(b.class, ExecutorService.class), new p(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            i.e(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        C1857a c1857a2 = new C1857a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new c(25), hashSet6);
        p pVar5 = new p(f7.c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(f7.c.class, ExecutorService.class), new p(f7.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            i.e(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        C1857a c1857a3 = new C1857a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new c(26), hashSet9);
        Y b2 = C1857a.b(new p(f7.d.class, Executor.class));
        b2.f20196f = new c(27);
        return Arrays.asList(c1857a, c1857a2, c1857a3, b2.b());
    }
}
