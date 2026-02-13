package okhttp3.internal.http2;

/* loaded from: classes2.dex */
public interface PushObserver {

    /* renamed from: a, reason: collision with root package name */
    public static final PushObserver f22855a;

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f22856a = 0;

        /* loaded from: classes2.dex */
        public static final class PushObserverCancel implements PushObserver {
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i7 = Companion.f22856a;
        f22855a = new Companion.PushObserverCancel();
    }
}
