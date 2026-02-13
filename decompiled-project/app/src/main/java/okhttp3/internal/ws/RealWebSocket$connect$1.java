package okhttp3.internal.ws;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.l;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class RealWebSocket$connect$1 implements Callback {
    @Override // okhttp3.Callback
    public final void g(Call call, Response response) {
        l.e(call, "call");
        throw null;
    }

    @Override // okhttp3.Callback
    public final void i(Call call, IOException iOException) {
        l.e(call, "call");
        List list = RealWebSocket.f22943a;
        throw null;
    }
}
