package okhttp3;

import kotlin.jvm.internal.l;
import rc.C1967k;
import rc.InterfaceC1965i;

/* loaded from: classes2.dex */
public abstract class RequestBody {

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
        final C1967k c1967k = C1967k.f23967d;
        l.e(c1967k, "<this>");
        new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
            @Override // okhttp3.RequestBody
            public final long a() {
                return C1967k.this.f();
            }

            @Override // okhttp3.RequestBody
            public final MediaType b() {
                return null;
            }

            @Override // okhttp3.RequestBody
            public final void d(InterfaceC1965i interfaceC1965i) {
                interfaceC1965i.I(C1967k.this);
            }
        };
    }

    public long a() {
        return -1L;
    }

    public abstract MediaType b();

    public boolean c() {
        return this instanceof RequestBody$Companion$toRequestBody$2;
    }

    public abstract void d(InterfaceC1965i interfaceC1965i);
}
