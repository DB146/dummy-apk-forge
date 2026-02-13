package com.bumptech.glide;

import P3.p;
import W3.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class m implements P3.a {

    /* renamed from: a, reason: collision with root package name */
    public final p f14693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f14694b;

    public m(n nVar, p pVar) {
        this.f14694b = nVar;
        this.f14693a = pVar;
    }

    @Override // P3.a
    public final void a(boolean z8) {
        if (z8) {
            synchronized (this.f14694b) {
                p pVar = this.f14693a;
                Iterator it = o.e((Set) pVar.f7842c).iterator();
                while (it.hasNext()) {
                    S3.c cVar = (S3.c) it.next();
                    if (!cVar.i() && !cVar.b()) {
                        cVar.clear();
                        if (pVar.f7841b) {
                            ((HashSet) pVar.f7843d).add(cVar);
                        } else {
                            cVar.e();
                        }
                    }
                }
            }
        }
    }
}
