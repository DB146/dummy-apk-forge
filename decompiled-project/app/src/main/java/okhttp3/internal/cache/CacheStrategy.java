package okhttp3.internal.cache;

import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class CacheStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final Request f22503a;

    /* renamed from: b, reason: collision with root package name */
    public final Response f22504b;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Factory {
    }

    static {
        new Companion(0);
    }

    public CacheStrategy(Request request, Response response) {
        this.f22503a = request;
        this.f22504b = response;
    }
}
