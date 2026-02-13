package X9;

import Db.j;
import Db.o;
import android.support.v4.media.session.b;
import com.bumptech.glide.c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kt.apps.core.tv.model.TVChannel;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f11017a = b.z(new S9.a(11));

    public static void a(TVChannel tVChannel, String str) {
        ((FirebaseAnalytics) f11017a.getValue()).a("ErrorGetLinkM3u8Video", c.f(new j("channel", tVChannel.getTvChannelName()), new j("sourceFrom", tVChannel.getSourceFrom()), new j("reason", str)));
    }
}
