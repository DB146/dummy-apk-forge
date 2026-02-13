package Z9;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ca.C0918a;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.ChannelSourceConfig;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import com.kt.apps.core.utils.NetworkUtilsKt;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes2.dex */
public final class F implements Y9.a {

    /* renamed from: f, reason: collision with root package name */
    public static final Db.o f12239f;

    /* renamed from: a, reason: collision with root package name */
    public final RoomDataBase f12240a;

    /* renamed from: b, reason: collision with root package name */
    public final C0918a f12241b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12242c;

    /* renamed from: d, reason: collision with root package name */
    public final Db.o f12243d;

    /* renamed from: e, reason: collision with root package name */
    public final OkHttpClient f12244e;

    static {
        new Handler(Looper.getMainLooper());
        f12239f = android.support.v4.media.session.b.z(new S9.a(21));
    }

    public F(Context context, RoomDataBase dataBase, C0918a sharePreference, OkHttpClient okHttpClient) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(dataBase, "dataBase");
        kotlin.jvm.internal.l.e(sharePreference, "sharePreference");
        this.f12240a = dataBase;
        this.f12241b = sharePreference;
        this.f12243d = android.support.v4.media.session.b.z(new S9.a(22));
        this.f12242c = Eb.B.M(sharePreference.c(TVDataSourceFrom.VTV_BACKUP));
        OkHttpClient.Builder a9 = okHttpClient.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a9.a(600L, timeUnit);
        a9.f22412y = _UtilJvmKt.b(600L, timeUnit);
        a9.b(60L, timeUnit);
        a9.f22398i = false;
        a9.j = false;
        this.f12244e = new OkHttpClient(a9);
    }

    @Override // Y9.a
    public final gb.i a() {
        Db.o oVar = this.f12243d;
        String str = ac.g.o0(((ChannelSourceConfig) oVar.getValue()).getBaseUrl(), "/") + "/" + ((ChannelSourceConfig) oVar.getValue()).getMainPagePath();
        NetworkUtilsKt.trustEveryone();
        return new qb.m(new F8.a(12, str, this), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [H9.a, java.lang.Object] */
    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        NetworkUtilsKt.trustEveryone();
        String message = "getTvLinkFromDetail: " + tvChannel;
        kotlin.jvm.internal.l.e(message, "message");
        return new qb.m(new F8.a(13, this, tvChannel), 2).f(new Object());
    }
}
