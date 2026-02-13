package Z9;

import ca.C0918a;
import com.kt.apps.core.tv.model.ChannelSourceConfig;
import com.kt.apps.core.tv.model.TVChannel;
import java.util.Map;
import okhttp3.OkHttpClient;
import sb.AbstractC2007a;
import sb.C2012f;

/* renamed from: Z9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0669f implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12270a;

    /* renamed from: b, reason: collision with root package name */
    public final C0918a f12271b;

    /* renamed from: c, reason: collision with root package name */
    public final Db.o f12272c;

    /* renamed from: d, reason: collision with root package name */
    public final Db.o f12273d;

    public C0669f(OkHttpClient okHttpClient, C0918a sharePreference) {
        kotlin.jvm.internal.l.e(sharePreference, "sharePreference");
        this.f12270a = okHttpClient;
        this.f12271b = sharePreference;
        this.f12272c = android.support.v4.media.session.b.z(new S9.a(12));
        this.f12273d = android.support.v4.media.session.b.z(new S9.a(13));
    }

    @Override // Y9.a
    public final gb.i a() {
        return new C2012f(new AbstractC2007a(new qb.m(new Q9.a(this, 5), 2)), C0668e.f12262c, lb.b.f19615d, lb.b.f19614c);
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        return (((Map) this.f12272c.getValue()).isEmpty() || this.f12271b.d("HTV_BACKUP").isEmpty() || z8) ? a().j(new q3.c(this, tvChannel, z8), com.google.android.gms.common.api.f.API_PRIORITY_OTHER) : new qb.m(new F8.a(6, tvChannel, this), 2);
    }

    public final ChannelSourceConfig c() {
        return (ChannelSourceConfig) this.f12273d.getValue();
    }
}
