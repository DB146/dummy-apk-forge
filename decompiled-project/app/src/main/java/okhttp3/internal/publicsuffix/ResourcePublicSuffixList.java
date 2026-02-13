package okhttp3.internal.publicsuffix;

import Y5.C0660y;
import kotlin.jvm.internal.l;
import rc.H;
import rc.o;
import rc.z;
import sc.e;

/* loaded from: classes2.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {

    /* renamed from: h, reason: collision with root package name */
    public static final z f22936h;

    /* renamed from: f, reason: collision with root package name */
    public final z f22937f;
    public final o g;

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
        String str = z.f24006b;
        f22936h = C0660y.a("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list", false);
    }

    public ResourcePublicSuffixList() {
        e fileSystem = o.f23981b;
        z path = f22936h;
        l.e(path, "path");
        l.e(fileSystem, "fileSystem");
        this.f22937f = path;
        this.g = fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final H b() {
        return this.g.K(this.f22937f);
    }
}
