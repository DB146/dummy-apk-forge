package Da;

import A9.O;
import A9.Q;
import W1.C;
import W1.U;
import com.kt.apps.core.tv.model.TVChannelGroup;

/* loaded from: classes2.dex */
public final class d extends Ca.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f3311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, U u3) {
        super(u3);
        this.f3311l = fVar;
    }

    @Override // Ca.a
    public final C j(int i7) {
        String filterGroup = (String) m().get(i7);
        f fVar = this.f3311l;
        Aa.l type = fVar.f3316S0;
        Q h10 = fVar.h();
        kotlin.jvm.internal.l.d(h10, "getMainFragmentAdapter(...)");
        kotlin.jvm.internal.l.e(filterGroup, "filterGroup");
        kotlin.jvm.internal.l.e(type, "type");
        m mVar = new m();
        mVar.l0(com.bumptech.glide.c.f(new Db.j("extra:filter_group", filterGroup), new Db.j("extra:filter_type", type)));
        Q p02 = mVar.p0();
        O o10 = h10.f937c;
        kotlin.jvm.internal.l.c(o10, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.BrowseSupportFragment.FragmentHostImpl");
        p02.f937c = o10;
        return mVar;
    }

    @Override // Ca.a
    public final CharSequence k(int i7) {
        return (CharSequence) m().get(i7);
    }

    @Override // Ca.a
    public final CharSequence l(int i7) {
        try {
            return TVChannelGroup.valueOf((String) m().get(i7)).getValue();
        } catch (Exception unused) {
            return (CharSequence) m().get(i7);
        }
    }
}
