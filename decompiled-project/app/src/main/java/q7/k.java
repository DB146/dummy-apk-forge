package q7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final k f23543a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f23544b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f23545c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q7.k] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f23543a = r02;
        f23545c = new k[]{r02};
        f23544b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f23545c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f23544b.post(runnable);
    }
}
