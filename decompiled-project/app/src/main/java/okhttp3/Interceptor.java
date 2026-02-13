package okhttp3;

/* loaded from: classes2.dex */
public interface Interceptor {

    /* loaded from: classes2.dex */
    public interface Chain {
        Response a(Request request);

        Request b();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    Response intercept(Chain chain);
}
