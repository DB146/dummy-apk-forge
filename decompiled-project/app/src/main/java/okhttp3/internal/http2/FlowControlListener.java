package okhttp3.internal.http2;

import kotlin.jvm.internal.l;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* loaded from: classes2.dex */
public interface FlowControlListener {

    /* loaded from: classes2.dex */
    public static final class None implements FlowControlListener {

        /* renamed from: a, reason: collision with root package name */
        public static final None f22730a = new None();

        private None() {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void a(WindowCounter windowCounter) {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void b(WindowCounter windowCounter) {
            l.e(windowCounter, "windowCounter");
        }
    }

    void a(WindowCounter windowCounter);

    void b(WindowCounter windowCounter);
}
