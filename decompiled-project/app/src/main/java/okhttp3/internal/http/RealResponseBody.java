package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import rc.C;
import rc.InterfaceC1966j;

/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: c, reason: collision with root package name */
    public final String f22688c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22689d;

    /* renamed from: e, reason: collision with root package name */
    public final C f22690e;

    public RealResponseBody(String str, long j, C c10) {
        this.f22688c = str;
        this.f22689d = j;
        this.f22690e = c10;
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC1966j F() {
        return this.f22690e;
    }

    @Override // okhttp3.ResponseBody
    public final long l() {
        return this.f22689d;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType n() {
        String str = this.f22688c;
        if (str == null) {
            return null;
        }
        MediaType.f22350e.getClass();
        try {
            return MediaType.Companion.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
