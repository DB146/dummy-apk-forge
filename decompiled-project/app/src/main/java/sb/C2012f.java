package sb;

import jb.InterfaceC1390a;
import jb.InterfaceC1393d;

/* renamed from: sb.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2012f extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1393d f24263b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1393d f24264c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1390a f24265d;

    public C2012f(gb.i iVar, InterfaceC1393d interfaceC1393d, InterfaceC1393d interfaceC1393d2, InterfaceC1390a interfaceC1390a) {
        super(iVar);
        this.f24263b = interfaceC1393d;
        this.f24264c = interfaceC1393d2;
        this.f24265d = interfaceC1390a;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        this.f24251a.b(new C2011e(lVar, this.f24263b, this.f24264c, this.f24265d));
    }
}
