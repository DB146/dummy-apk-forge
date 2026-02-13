package okhttp3;

import Y5.C0658x;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.l;
import okhttp3.MediaType;
import rc.C1967k;
import rc.InterfaceC1965i;

/* loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22356a = 0;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public Builder() {
            String uuid = UUID.randomUUID().toString();
            l.d(uuid, "toString(...)");
            C1967k c1967k = C1967k.f23967d;
            C0658x.c(uuid);
            int i7 = MultipartBody.f22356a;
            new ArrayList();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Part {

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
        }
    }

    static {
        new Companion(0);
        MediaType.f22350e.getClass();
        MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        MediaType.Companion.a("multipart/form-data");
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final void d(InterfaceC1965i interfaceC1965i) {
        throw null;
    }
}
