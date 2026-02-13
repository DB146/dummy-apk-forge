package sb;

import hb.InterfaceC1269b;
import ib.C1360b;
import jb.InterfaceC1390a;
import jb.InterfaceC1393d;
import kb.EnumC1437b;
import y7.u0;

/* renamed from: sb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2011e implements gb.l, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24257a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1393d f24258b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1393d f24259c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1390a f24260d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1269b f24261e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24262f;

    public C2011e(gb.l lVar, InterfaceC1393d interfaceC1393d, InterfaceC1393d interfaceC1393d2, InterfaceC1390a interfaceC1390a) {
        this.f24257a = lVar;
        this.f24258b = interfaceC1393d;
        this.f24259c = interfaceC1393d2;
        this.f24260d = interfaceC1390a;
    }

    @Override // gb.l
    public final void a() {
        if (this.f24262f) {
            return;
        }
        try {
            this.f24260d.run();
            this.f24262f = true;
            this.f24257a.a();
        } catch (Throwable th) {
            u0.L(th);
            onError(th);
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f24261e.b();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f24261e, interfaceC1269b)) {
            this.f24261e = interfaceC1269b;
            this.f24257a.c(this);
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (this.f24262f) {
            return;
        }
        try {
            this.f24258b.accept(obj);
            this.f24257a.e(obj);
        } catch (Throwable th) {
            u0.L(th);
            this.f24261e.b();
            onError(th);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24261e.g();
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f24262f) {
            com.bumptech.glide.d.t(th);
            return;
        }
        this.f24262f = true;
        try {
            this.f24259c.accept(th);
        } catch (Throwable th2) {
            u0.L(th2);
            th = new C1360b(th, th2);
        }
        this.f24257a.onError(th);
    }
}
