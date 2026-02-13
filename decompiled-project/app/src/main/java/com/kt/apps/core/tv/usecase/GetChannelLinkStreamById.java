package com.kt.apps.core.tv.usecase;

import Db.j;
import Eb.B;
import H9.b;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.f;
import da.C1065c;
import da.C1066d;
import gb.i;
import java.util.Map;
import kotlin.jvm.internal.l;
import q3.s;

@Keep
/* loaded from: classes2.dex */
public final class GetChannelLinkStreamById extends b {
    private final C1066d getStreamLinkStreamFrom;
    private final C1065c getTvLinks;

    public GetChannelLinkStreamById(C1066d getStreamLinkStreamFrom, C1065c getTvLinks) {
        l.e(getStreamLinkStreamFrom, "getStreamLinkStreamFrom");
        l.e(getTvLinks, "getTvLinks");
        this.getStreamLinkStreamFrom = getStreamLinkStreamFrom;
        this.getTvLinks = getTvLinks;
    }

    public static final /* synthetic */ C1066d access$getGetStreamLinkStreamFrom$p(GetChannelLinkStreamById getChannelLinkStreamById) {
        return getChannelLinkStreamById.getStreamLinkStreamFrom;
    }

    public final i invoke(String channelId) {
        l.e(channelId, "channelId");
        return execute(B.G(new j("channelId", channelId)));
    }

    @Override // H9.b
    public i prepareExecute(Map<String, ? extends Object> params) {
        l.e(params, "params");
        Object obj = params.get("channelId");
        l.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        String message = "{channelId: " + str + "}";
        l.e(message, "message");
        return C1065c.b(this.getTvLinks, false, 3).o(2L).j(new s(28, this, str, false), f.API_PRIORITY_OTHER);
    }
}
