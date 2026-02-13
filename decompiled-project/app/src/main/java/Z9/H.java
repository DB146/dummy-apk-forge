package Z9;

import ca.C0918a;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.ChannelSourceConfig;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import java.util.LinkedHashMap;
import java.util.Locale;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class H implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12248a;

    /* renamed from: b, reason: collision with root package name */
    public final C0918a f12249b;

    /* renamed from: c, reason: collision with root package name */
    public final RoomDataBase f12250c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f12251d;

    /* renamed from: e, reason: collision with root package name */
    public final Db.o f12252e;

    public H(OkHttpClient okHttpClient, C0918a sharePreference, RoomDataBase localDb) {
        kotlin.jvm.internal.l.e(sharePreference, "sharePreference");
        kotlin.jvm.internal.l.e(localDb, "localDb");
        this.f12248a = okHttpClient;
        this.f12249b = sharePreference;
        this.f12250c = localDb;
        this.f12252e = android.support.v4.media.session.b.z(new S9.a(23));
        this.f12251d = Eb.B.M(sharePreference.c(TVDataSourceFrom.VTC_BACKUP));
    }

    @Override // Y9.a
    public final gb.i a() {
        return new qb.m(new Q9.a(this, 8), 2);
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        String lowerCase = ac.n.W(ac.n.W(tvChannel.getTvChannelName(), "[^\\dA-Za-z ]", ""), "\\s+", "+").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        String obj = ac.g.v0(ac.g.o0(lowerCase, "hd")).toString();
        String message = "getTvLinkFromDetail: {tvChannel: " + tvChannel + "}";
        kotlin.jvm.internal.l.e(message, "message");
        return this.f12249b.d("VTC_BACKUP").isEmpty() ? a().j(new q3.c(26, this, obj, false), com.google.android.gms.common.api.f.API_PRIORITY_OTHER) : new qb.m(new M9.e(this, obj, tvChannel, 5), 2);
    }

    public final ChannelSourceConfig c() {
        return (ChannelSourceConfig) this.f12252e.getValue();
    }
}
