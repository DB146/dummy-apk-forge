package a1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final m f12478a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f12479b;

    /* JADX WARN: Type inference failed for: r0v0, types: [a1.m, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f12478a = r02;
        f12479b = new m[]{r02};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f12479b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
