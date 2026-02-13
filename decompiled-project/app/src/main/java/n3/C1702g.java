package n3;

import h3.z;
import kotlin.jvm.internal.l;
import q3.p;

/* renamed from: n3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1702g extends AbstractC1698c {

    /* renamed from: b, reason: collision with root package name */
    public final int f21069b;

    static {
        l.d(z.g("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702g(o3.e tracker) {
        super(tracker);
        l.e(tracker, "tracker");
        this.f21069b = 7;
    }

    @Override // n3.InterfaceC1700e
    public final boolean b(p workSpec) {
        l.e(workSpec, "workSpec");
        return workSpec.j.f17682a == 4;
    }

    @Override // n3.AbstractC1698c
    public final int d() {
        return this.f21069b;
    }

    @Override // n3.AbstractC1698c
    public final boolean e(Object obj) {
        m3.g value = (m3.g) obj;
        l.e(value, "value");
        return (value.f19787a && value.f19790d) ? false : true;
    }
}
