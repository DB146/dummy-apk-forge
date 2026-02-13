package okhttp3.internal.publicsuffix;

import java.io.IOException;
import kotlin.jvm.internal.l;
import okhttp3.internal.platform.ContextAwarePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.PlatformRegistry;
import rc.H;

/* loaded from: classes2.dex */
public final class AssetPublicSuffixList extends BasePublicSuffixList {
    public static final String g;

    /* renamed from: f, reason: collision with root package name */
    public final String f22924f;

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
        g = "PublicSuffixDatabase.list";
    }

    public AssetPublicSuffixList() {
        this(0);
    }

    public AssetPublicSuffixList(int i7) {
        String path = g;
        l.e(path, "path");
        this.f22924f = path;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final H b() {
        PlatformRegistry.f22900a.getClass();
        Platform.f22897a.getClass();
        boolean z8 = Platform.f22898b instanceof ContextAwarePlatform;
        throw new IOException("Platform applicationContext not initialized");
    }
}
