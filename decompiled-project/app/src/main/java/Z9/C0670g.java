package Z9;

import com.kt.apps.core.tv.model.TVChannel;
import okhttp3.OkHttpClient;

/* renamed from: Z9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0670g implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12274a;

    public C0670g(OkHttpClient okHttpClient) {
        this.f12274a = okHttpClient;
    }

    @Override // Y9.a
    public final gb.i a() {
        throw new IllegalStateException("Not implement in child datasource");
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        return new qb.m(new F8.a(7, this, tvChannel), 2).o(3L);
    }
}
