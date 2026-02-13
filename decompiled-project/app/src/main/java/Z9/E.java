package Z9;

import ca.C0918a;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import java.util.LinkedHashMap;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class E implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0918a f12236a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12237b;

    /* renamed from: c, reason: collision with root package name */
    public final Db.o f12238c;

    public E(OkHttpClient okHttpClient, C0918a sharePreference) {
        kotlin.jvm.internal.l.e(sharePreference, "sharePreference");
        this.f12236a = sharePreference;
        this.f12238c = android.support.v4.media.session.b.z(new S9.a(20));
        this.f12237b = Eb.B.M(sharePreference.c(TVDataSourceFrom.VOV_BACKUP));
    }

    @Override // Y9.a
    public final gb.i a() {
        return new qb.m(new Q9.a(this, 7), 2);
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        return (this.f12237b.isEmpty() || z8) ? a().j(new q3.l(25, this, tvChannel, false), com.google.android.gms.common.api.f.API_PRIORITY_OTHER) : new qb.m(new F8.a(11, tvChannel, this), 2);
    }
}
