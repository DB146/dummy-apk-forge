package a3;

import java.util.ArrayList;

/* renamed from: a3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733j extends v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0735l f12547e;

    public C0733j(C0735l c0735l, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f12547e = c0735l;
        this.f12543a = obj;
        this.f12544b = arrayList;
        this.f12545c = obj2;
        this.f12546d = arrayList2;
    }

    @Override // a3.v, a3.s
    public final void d(u uVar) {
        uVar.B(this);
    }

    @Override // a3.v, a3.s
    public final void e(u uVar) {
        C0735l c0735l = this.f12547e;
        Object obj = this.f12543a;
        if (obj != null) {
            c0735l.z(obj, this.f12544b, null);
        }
        Object obj2 = this.f12545c;
        if (obj2 != null) {
            c0735l.z(obj2, this.f12546d, null);
        }
    }
}
