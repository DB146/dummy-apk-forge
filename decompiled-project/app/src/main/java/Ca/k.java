package Ca;

import A9.C0160y2;
import A9.O;
import A9.Q;
import W1.C;
import W1.U;
import com.kt.apps.core.tv.model.TVChannelGroup;

/* loaded from: classes2.dex */
public final class k extends a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f3117l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, U u3) {
        super(u3);
        this.f3117l = mVar;
    }

    @Override // Ca.a
    public final C j(int i7) {
        m mVar = this.f3117l;
        if (i7 == 0) {
            String filterGroup = (String) m().get(i7);
            Aa.l type = mVar.f3122S0;
            C0160y2 mMainFragmentAdapter = mVar.f757t0;
            kotlin.jvm.internal.l.d(mMainFragmentAdapter, "mMainFragmentAdapter");
            kotlin.jvm.internal.l.e(filterGroup, "filterGroup");
            kotlin.jvm.internal.l.e(type, "type");
            i iVar = new i();
            iVar.l0(com.bumptech.glide.c.f(new Db.j("extra:filter_group", filterGroup), new Db.j("extra:filter_type", type)));
            iVar.f757t0 = mMainFragmentAdapter;
            return iVar;
        }
        String filterGroup2 = (String) m().get(i7);
        Aa.l type2 = mVar.f3122S0;
        C0160y2 mMainFragmentAdapter2 = mVar.f757t0;
        kotlin.jvm.internal.l.d(mMainFragmentAdapter2, "mMainFragmentAdapter");
        kotlin.jvm.internal.l.e(filterGroup2, "filterGroup");
        kotlin.jvm.internal.l.e(type2, "type");
        r rVar = new r();
        rVar.l0(com.bumptech.glide.c.f(new Db.j("extra:filter_group", filterGroup2), new Db.j("extra:filter_type", type2)));
        Q p02 = rVar.p0();
        O o10 = mMainFragmentAdapter2.f937c;
        kotlin.jvm.internal.l.c(o10, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.BrowseSupportFragment.FragmentHostImpl");
        p02.f937c = o10;
        return rVar;
    }

    @Override // Ca.a
    public final CharSequence k(int i7) {
        return (CharSequence) m().get(i7);
    }

    @Override // Ca.a
    public final CharSequence l(int i7) {
        if (i7 == 0) {
            return (CharSequence) m().get(i7);
        }
        try {
            return TVChannelGroup.valueOf((String) m().get(i7)).getValue();
        } catch (Exception unused) {
            return (String) m().get(i7);
        }
    }
}
