package h3;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final n f17701a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n[] f17702b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h3.n] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f17701a = r02;
        f17702b = new n[]{r02};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f17702b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.l.e(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
