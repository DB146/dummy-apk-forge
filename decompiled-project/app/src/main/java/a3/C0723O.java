package a3;

import ea.C1108c;
import m5.C1624v;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;

/* renamed from: a3.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723O implements InterfaceC1615l {

    /* renamed from: c, reason: collision with root package name */
    public boolean f12519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12520d;

    /* renamed from: f, reason: collision with root package name */
    public Object f12522f;

    /* renamed from: e, reason: collision with root package name */
    public Object f12521e = new C1108c(7);

    /* renamed from: a, reason: collision with root package name */
    public int f12517a = 8000;

    /* renamed from: b, reason: collision with root package name */
    public int f12518b = 8000;

    @Override // m5.InterfaceC1615l
    public InterfaceC1616m e() {
        return new C1624v((String) this.f12522f, this.f12517a, this.f12518b, this.f12519c, (C1108c) this.f12521e, this.f12520d);
    }
}
