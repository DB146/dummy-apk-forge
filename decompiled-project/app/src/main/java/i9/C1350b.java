package i9;

import P8.j;
import P8.p;

/* renamed from: i9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1350b {

    /* renamed from: a, reason: collision with root package name */
    public final V8.b f18464a;

    /* renamed from: b, reason: collision with root package name */
    public final p f18465b;

    /* renamed from: c, reason: collision with root package name */
    public final p f18466c;

    /* renamed from: d, reason: collision with root package name */
    public final p f18467d;

    /* renamed from: e, reason: collision with root package name */
    public final p f18468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18469f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18470h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18471i;

    public C1350b(V8.b bVar, p pVar, p pVar2, p pVar3, p pVar4) {
        boolean z8 = pVar == null || pVar2 == null;
        boolean z10 = pVar3 == null || pVar4 == null;
        if (z8 && z10) {
            throw j.a();
        }
        if (z8) {
            pVar = new p(0.0f, pVar3.f8250b);
            pVar2 = new p(0.0f, pVar4.f8250b);
        } else if (z10) {
            int i7 = bVar.f10194a;
            pVar3 = new p(i7 - 1, pVar.f8250b);
            pVar4 = new p(i7 - 1, pVar2.f8250b);
        }
        this.f18464a = bVar;
        this.f18465b = pVar;
        this.f18466c = pVar2;
        this.f18467d = pVar3;
        this.f18468e = pVar4;
        this.f18469f = (int) Math.min(pVar.f8249a, pVar2.f8249a);
        this.g = (int) Math.max(pVar3.f8249a, pVar4.f8249a);
        this.f18470h = (int) Math.min(pVar.f8250b, pVar3.f8250b);
        this.f18471i = (int) Math.max(pVar2.f8250b, pVar4.f8250b);
    }

    public C1350b(C1350b c1350b) {
        this.f18464a = c1350b.f18464a;
        this.f18465b = c1350b.f18465b;
        this.f18466c = c1350b.f18466c;
        this.f18467d = c1350b.f18467d;
        this.f18468e = c1350b.f18468e;
        this.f18469f = c1350b.f18469f;
        this.g = c1350b.g;
        this.f18470h = c1350b.f18470h;
        this.f18471i = c1350b.f18471i;
    }
}
