package Ga;

import C.F;
import Db.q;
import E.C0248c;
import Q.C0506o;
import com.kt.apps.core.tv.model.TVChannelLinkStream;

/* loaded from: classes2.dex */
public final class h implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TVChannelLinkStream f4425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f4426b;

    public h(TVChannelLinkStream tVChannelLinkStream, F f4) {
        this.f4425a = tVChannelLinkStream;
        this.f4426b = f4;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        C0248c item = (C0248c) obj;
        C0506o c0506o = (C0506o) obj2;
        int intValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.l.e(item, "$this$item");
        if ((intValue & 17) == 16 && c0506o.x()) {
            c0506o.N();
        } else {
            androidx.compose.animation.b.b(this.f4425a == null, null, null, null, null, Y.f.d(-1675055504, new g(this.f4426b), c0506o), c0506o, 1572864);
        }
        return q.f3365a;
    }
}
