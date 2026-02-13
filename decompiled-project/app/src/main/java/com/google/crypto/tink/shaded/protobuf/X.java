package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: c, reason: collision with root package name */
    public static final X f15745c = new X();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f15747b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C1018l f15746a = new C1018l();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.crypto.tink.shaded.protobuf.S] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.S] */
    public final a0 a(Class cls) {
        Q y10;
        Q q10;
        Class cls2;
        A.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f15747b;
        a0 a0Var = (a0) concurrentHashMap.get(cls);
        if (a0Var != null) {
            return a0Var;
        }
        C1018l c1018l = this.f15746a;
        c1018l.getClass();
        Class cls3 = b0.f15756a;
        if (!AbstractC1028w.class.isAssignableFrom(cls) && (cls2 = b0.f15756a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        Z a9 = ((K) c1018l.f15795a).a(cls);
        if ((a9.f15754d & 2) == 2) {
            boolean isAssignableFrom = AbstractC1028w.class.isAssignableFrom(cls);
            AbstractC1007a abstractC1007a = a9.f15751a;
            if (isAssignableFrom) {
                q10 = new S(b0.f15759d, AbstractC1023q.f15809a, abstractC1007a);
            } else {
                d0 d0Var = b0.f15757b;
                C1022p c1022p = AbstractC1023q.f15810b;
                if (c1022p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                q10 = new S(d0Var, c1022p, abstractC1007a);
            }
            y10 = q10;
        } else if (AbstractC1028w.class.isAssignableFrom(cls)) {
            y10 = a9.d() == 1 ? Q.y(a9, U.f15744b, I.f15721b, b0.f15759d, AbstractC1023q.f15809a, N.f15726b) : Q.y(a9, U.f15744b, I.f15721b, b0.f15759d, null, N.f15726b);
        } else if (a9.d() == 1) {
            T t5 = U.f15743a;
            G g = I.f15720a;
            d0 d0Var2 = b0.f15757b;
            C1022p c1022p2 = AbstractC1023q.f15810b;
            if (c1022p2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            y10 = Q.y(a9, t5, g, d0Var2, c1022p2, N.f15725a);
        } else {
            y10 = Q.y(a9, U.f15743a, I.f15720a, b0.f15758c, null, N.f15725a);
        }
        a0 a0Var2 = (a0) concurrentHashMap.putIfAbsent(cls, y10);
        return a0Var2 != null ? a0Var2 : y10;
    }
}
